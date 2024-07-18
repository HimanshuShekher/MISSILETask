package com.example.rocketapplication.view_model
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.rocketapplication.Resource
import com.example.rocketapplication.model.data_class.RocketListResponse
import com.example.rocketapplication.model.network.RetrofitObject
import kotlinx.coroutines.launch

class RocketViewModel:ViewModel() {
    private var _rocketList=MutableLiveData<Resource<RocketListResponse>>()
    val rocketList : LiveData<Resource<RocketListResponse>> get() = _rocketList

   lateinit var detailsdata: RocketListResponse.RocketListResponseItem

    var name="rr"
    fun getAllRocketList(){
       _rocketList.postValue(Resource.Loading)
        viewModelScope.launch {
            try {
                val response = RetrofitObject.api.getAllRocket()
                if (response.isSuccessful){

                    _rocketList.postValue(Resource.Success(response.body()!!))
                }
                else{
                    _rocketList.postValue(Resource.Error("No Network"))
                }
            }catch (e:Exception){
                _rocketList.postValue(Resource.Failure(e))
            }
        }
    }
}
