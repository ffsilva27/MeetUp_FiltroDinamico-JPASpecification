package vc.com.meetupfilipe.meetupfilipe.queryObject

import au.com.console.jpaspecificationdsl.and
import au.com.console.jpaspecificationdsl.or
import org.springframework.data.jpa.domain.Specification
import vc.com.meetupfilipe.meetupfilipe.entity.Customer
import vc.com.meetupfilipe.meetupfilipe.specification.*

class CustomerQueryObject(
    val name: String? = null,
    val lastName: String? = null,
    val carModel: String? = null,
    val carManufacturer: String? = null,
    val ageRange: List<Int>? = null

)

fun CustomerQueryObject.toSpecification(): Specification<Customer> = and(
    hasName(name),
    hasLastName(lastName),
    hasCarModel(carModel),
    hasCarManufacturer(carManufacturer),
    hasAgeIn(ageRange)
)