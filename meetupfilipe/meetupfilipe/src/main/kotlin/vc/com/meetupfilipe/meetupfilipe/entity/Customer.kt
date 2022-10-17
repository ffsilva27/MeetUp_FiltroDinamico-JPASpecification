package vc.com.meetupfilipe.meetupfilipe.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.OneToOne

@Entity
class Customer(

    @Id
    @Column(name = "id")
    @GeneratedValue
    val id: Int,

    @Column(name = "first_name")
    val firstName: String,

    @Column(name = "last_name")
    val lastName: String,

    @Column(name = "age")
    val age: Int,

    @OneToOne
    @JoinColumn(name = "car_id")
    val car: Car?

)