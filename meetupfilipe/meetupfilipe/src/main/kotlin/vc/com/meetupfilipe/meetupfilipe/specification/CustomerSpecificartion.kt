package vc.com.meetupfilipe.meetupfilipe.specification

import au.com.console.jpaspecificationdsl.*
import org.springframework.data.jpa.domain.Specification
import vc.com.meetupfilipe.meetupfilipe.entity.Car
import vc.com.meetupfilipe.meetupfilipe.entity.Customer
import vc.com.meetupfilipe.meetupfilipe.entity.Manufacturer

fun hasName(name: String?): Specification<Customer>? = name?.let {
    Customer::firstName.equal(name)
}

fun hasLastName(lastName: String?): Specification<Customer>? = lastName?.let {
    Customer::lastName.equal(lastName)
}

fun hasCarModel(carModel: String?): Specification<Customer>? = carModel?.let {
    where {
        equal(it.get(Customer::car).get(Car::model), carModel)
    }
}

fun hasCarManufacturer(manufacturer: String?): Specification<Customer>? = manufacturer?.let {
    where {
        equal(it.get(Customer::car).get(Car::manufacturer).get(Manufacturer::name), manufacturer)
    }
}

fun hasAgeIn(ageRange: List<Int>?): Specification<Customer>? = ageRange?.let {
    Customer::age.`in`(ageRange)
}