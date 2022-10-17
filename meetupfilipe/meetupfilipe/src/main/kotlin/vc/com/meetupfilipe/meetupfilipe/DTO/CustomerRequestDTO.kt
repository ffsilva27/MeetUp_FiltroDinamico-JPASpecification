package vc.com.meetupfilipe.meetupfilipe.DTO

import vc.com.meetupfilipe.meetupfilipe.queryObject.CustomerQueryObject

data class CustomerRequestDTO (
    val name: String? = null,
    val lastName: String? = null,
    val carModel: String? = null,
    val carManufacturer: String? = null,
    val minAge: Int? = null,
    val maxAge: Int? = null
)

fun CustomerRequestDTO.toCustomerQueryObject(ageRange: List<Int>?) = CustomerQueryObject(
    name = name,
    lastName = lastName,
    carModel = carModel,
    carManufacturer = carManufacturer,
    ageRange = ageRange
)