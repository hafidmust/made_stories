package com.hafidmust.core.data.remote.response

import com.google.gson.annotations.SerializedName

data class ListStoryItem(

	@field:SerializedName("photoUrl")
	val photoUrl: String,

	@field:SerializedName("createdAt")
	val createdAt: String,

	@field:SerializedName("name")
	val name: String,

	@field:SerializedName("description")
	val description: String,

	@field:SerializedName("lon")
	val lon: Float,

	@field:SerializedName("id")
	val id: String,

	@field:SerializedName("lat")
	val lat: Float
)