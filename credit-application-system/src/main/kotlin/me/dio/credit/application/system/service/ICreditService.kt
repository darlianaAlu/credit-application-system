package me.dio.credit.application.system.service

import java.util.UUID

class ICreditService {
    fun save(credit: Credit): Credit

    fun findAllByCustomer(CustomerId: Long): List<Credit>

    fun creditByCreditCode(creditCode: UUID): Credit

}