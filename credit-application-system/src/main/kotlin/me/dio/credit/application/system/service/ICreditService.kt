package me.dio.credit.application.system.service

import java.util.UUID
import me.dio.credit.application.system.entity.Credit

class ICreditService {
    fun save(credit: Credit): Credit

    fun findAllByCustomer(CustomerId: Long): List<Credit>

    fun creditByCreditCode(customerId: Long,creditCode: UUID): Credit

}