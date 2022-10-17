package vc.com.meetupfilipe.meetupfilipe.service

import vc.com.meetupfilipe.meetupfilipe.mapper.toCustomerDTO
import org.springframework.data.domain.Pageable
import org.springframework.stereotype.Service
import vc.com.meetupfilipe.meetupfilipe.DTO.CustomerResponse
import vc.com.meetupfilipe.meetupfilipe.entity.Customer
import vc.com.meetupfilipe.meetupfilipe.queryObject.CustomerQueryObject
import vc.com.meetupfilipe.meetupfilipe.queryObject.toSpecification
import vc.com.meetupfilipe.meetupfilipe.repository.ICustomerRepository

@Service
class CustomerService(
    private val customerRepository: ICustomerRepository
) {

    fun getCustomers(customerQueryObject: CustomerQueryObject, pageable: Pageable): CustomerResponse {
        val customers = customerRepository.findAll(customerQueryObject.toSpecification(), pageable)
            .map(Customer::toCustomerDTO)

        return CustomerResponse(
            totalElements = customers.totalElements,
            totalPages = customers.totalPages,
            customers = customers.content
        )
    }

}
