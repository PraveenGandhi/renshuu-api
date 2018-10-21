package com.renshuu.api

import com.renshuu.api.entity.User
import org.springframework.data.repository.CrudRepository

interface UserRepository extends CrudRepository<User,Long>{
}
