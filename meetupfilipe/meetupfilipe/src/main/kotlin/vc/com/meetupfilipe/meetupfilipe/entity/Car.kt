package vc.com.meetupfilipe.meetupfilipe.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Car (

    @Id
    @Column(name = "id")
    @GeneratedValue
    val id: Int,

    @Column(name = "model")
    val model: String,

    @Column(name = "license_plate")
    val licensePlate: String,

    @ManyToOne
    @JoinColumn(name = "manufacturer_id")
    val manufacturer: Manufacturer

)
