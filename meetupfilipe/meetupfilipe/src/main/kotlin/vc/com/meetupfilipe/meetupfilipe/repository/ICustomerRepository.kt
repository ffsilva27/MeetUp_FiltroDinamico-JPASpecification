package vc.com.meetupfilipe.meetupfilipe.repository

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.data.jpa.repository.JpaSpecificationExecutor
import org.springframework.stereotype.Repository
import vc.com.meetupfilipe.meetupfilipe.entity.Customer

@Repository
interface ICustomerRepository : JpaRepository<Customer, Int>, JpaSpecificationExecutor<Customer> {
}