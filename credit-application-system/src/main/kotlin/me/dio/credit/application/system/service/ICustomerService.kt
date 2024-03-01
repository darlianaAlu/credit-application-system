package me.dio.credit.application.system.service

import me.dio.credit.application.system.entity.Customer


class ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(Id: Long): Customer

    fun delete(Id: Long): Customer
}