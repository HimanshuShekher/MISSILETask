package com.example.rocketapplication.view

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.room.Room
import com.example.rocketapplication.R
import com.example.rocketapplication.Resource
import com.example.rocketapplication.adapter.RocketAdapter
import com.example.rocketapplication.databinding.FragmentListBinding
import com.example.rocketapplication.model.local.FavorateDatabase
import com.example.rocketapplication.view_model.RocketViewModel


class ListFragment : Fragment() {
    private val rocketViewModel: RocketViewModel by activityViewModels()
    lateinit var rocketAdapter: RocketAdapter
    lateinit var binding: FragmentListBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding=FragmentListBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        rocketViewModel.getAllRocketList()

        val database = Room.databaseBuilder(requireContext(),FavorateDatabase::class.java, "contactDB")
            .allowMainThreadQueries()
            .build()


        rocketViewModel.rocketList.observe(viewLifecycleOwner, Observer { data ->
            when (data) {
                is Resource.Success -> {

                    val favoritedata=database.userDao().getAll()

                    Log.d("FavoriteData",favoritedata.toString())
                    rocketAdapter = RocketAdapter(data.data,database,favoritedata) { data ->
                        rocketViewModel.detailsdata=data
                        findNavController().navigate(R.id.action_listFragment_to_detailsFragment)
                    }
                    binding.apply {
                        recyclerView.adapter = rocketAdapter
                        myContent.visibility = View.VISIBLE
                        progressCircular.visibility = View.GONE
                    }



                   binding. searchView.addTextChangedListener(object : TextWatcher {
                        override fun afterTextChanged(s: Editable?) {
                            rocketAdapter.filter(s.toString().trim())
                        }

                        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

                        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}
                    })



                }

                is Resource.Error -> {
                    Log.d("MyData", "Error")
                }

                is Resource.Failure -> {
                    Log.d("MyData", "Failure")
                }

                Resource.Loading -> {
                    Log.d("MyData", "Loading")
                }
            }
        })
    }

}