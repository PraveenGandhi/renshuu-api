package com.renshuu.api.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name="users")
class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id
    String firstName
    String lastName
}
