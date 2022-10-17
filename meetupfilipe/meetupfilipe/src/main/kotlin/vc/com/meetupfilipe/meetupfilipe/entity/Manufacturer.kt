package vc.com.meetupfilipe.meetupfilipe.entity

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

@Entity
class Manufacturer (

    @Id
    @Column(name = "id")
    @GeneratedValue
    val id: Int,

    @Column(name = "name")
    val name: String

)
