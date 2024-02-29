import me.dio.credit.application.system.entity.Customer
class ICustomerService {

    fun save(customer: Customer): Customer

    fun findById(Id: Long): ICustomerService

    fun delete(Id: Long): Customer
}