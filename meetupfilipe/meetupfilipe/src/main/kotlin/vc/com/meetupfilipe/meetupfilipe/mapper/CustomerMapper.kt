package vc.com.meetupfilipe.meetupfilipe.mapper

import vc.com.meetupfilipe.meetupfilipe.DTO.CarDTO
import vc.com.meetupfilipe.meetupfilipe.DTO.CustomerDTO
import vc.com.meetupfilipe.meetupfilipe.DTO.ManufacturerDTO
import vc.com.meetupfilipe.meetupfilipe.entity.Customer

fun Customer.toCustomerDTO(): CustomerDTO {
    return CustomerDTO(
        id = this.id,
        firstName = this.firstName,
        lastName = this.lastName,
        age = this.age,
        car = this.car?.let {car ->
            CarDTO(
                model = car.model,
                licensePlate = car.licensePlate,
                manufacturer = ManufacturerDTO(
                    name = car.manufacturer.name
                )
            )

        }
    )
}