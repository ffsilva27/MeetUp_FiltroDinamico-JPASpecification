package vc.com.meetupfilipe.meetupfilipe.controller

import org.springframework.data.domain.Pageable
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import vc.com.meetupfilipe.meetupfilipe.DTO.CustomerRequestDTO
import vc.com.meetupfilipe.meetupfilipe.DTO.CustomerResponse
import vc.com.meetupfilipe.meetupfilipe.DTO.toCustomerQueryObject
import vc.com.meetupfilipe.meetupfilipe.exception.InvalidAgeRangeException
import vc.com.meetupfilipe.meetupfilipe.service.CustomerService


@RestController
@RequestMapping("/customer")
class CustomerController (
    private val customerService: CustomerService
){

    @GetMapping
    fun getCustomers(
        @RequestParam(value = "name", required = false) name: String?,
        @RequestParam(value = "lastName", required = false) lastName: String?,
        @RequestParam(value = "carModel", required = false) carModel: String?,
        @RequestParam(value = "carManufacturer", required = false) carManufacturer: String?,
        @RequestParam(value = "minAge", required = false) minAge: Int?,
        @RequestParam(value = "maxAge", required = false) maxAge: Int?,
        pageable: Pageable
    ) : CustomerResponse{

        var ageRange: List<Int>? = emptyList()
        if(minAge != null && maxAge != null){
            if(minAge > maxAge) throw InvalidAgeRangeException("Idade mínima deve ser maior que a máxima!")

            ageRange = (minAge..maxAge).toList()
        }

        val customerRequestDTO = CustomerRequestDTO(
            name = name,
            lastName = lastName,
            carModel = carModel,
            carManufacturer = carManufacturer,
            minAge = minAge,
            maxAge = maxAge
        )

        return customerService.getCustomers(customerRequestDTO.toCustomerQueryObject(ageRange), pageable)
    }

}