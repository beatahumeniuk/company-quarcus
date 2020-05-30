package beatahumeniuk.pl.repository

import beatahumeniuk.pl.model.Employee
import io.quarkus.hibernate.orm.panache.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
interface EmployeeRepository : PanacheRepository<Employee> {
}
