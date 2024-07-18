package com.example.rocketapplication.view

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.activityViewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import com.example.rocketapplication.R
import com.example.rocketapplication.Resource
import com.example.rocketapplication.adapter.RocketAdapter
import com.example.rocketapplication.databinding.FragmentDetailsBinding
import com.example.rocketapplication.view_model.RocketViewModel


class DetailsFragment : Fragment() {

    private val rocketViewModel: RocketViewModel by activityViewModels()
    lateinit var binding: FragmentDetailsBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding=FragmentDetailsBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.d("RocketResponse",rocketViewModel.detailsdata.toString())

        val details=rocketViewModel.detailsdata
        binding.apply {
            missionName.text=details.missionName
            launchDate.text=details.launchYear
            nationality.text=details.rocket.secondStage.payloads[0].nationality
            manufacturer.text=details.rocket.secondStage.payloads[0].manufacturer
            payloadType.text=details.rocket.secondStage.payloads[0].payloadType
            payloadMassKg.text= details.rocket.secondStage.payloads[0].payloadMassKg.toString()
        }

    }


}