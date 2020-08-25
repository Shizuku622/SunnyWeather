package com.sunnyweather.android.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.sunnyweather.android.logic.model.Place
import com.sunnyweather.android.logic.Repository

class PlaceViewModel :ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData){query ->
        Repository.searchPlaces(query)
    }
    fun searchPlaces(query:String){ //调用这个方法就触发上面的switchmap的转换函数
        searchLiveData.value = query
    }

    fun savePlace(place:Place) = Repository.savePlace(place)
    fun getsavedPlace() = Repository.getSsavedPlace()
    fun isPlaceSaved() = Repository.isPlaceSaved()

}