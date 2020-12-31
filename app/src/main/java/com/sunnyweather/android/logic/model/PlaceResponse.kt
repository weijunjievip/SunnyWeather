package com.sunnyweather.android.logic.model

import com.google.gson.annotations.SerializedName

data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val location: Location, val name: String, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)