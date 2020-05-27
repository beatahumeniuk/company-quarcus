package beatahumeniuk.pl

import beatahumeniuk.pl.dto.Employee
import javax.ws.rs.GET
import javax.ws.rs.Path
import javax.ws.rs.Produces
import javax.ws.rs.core.MediaType

@Path("/hello")
class ExampleResource {

    var employees: List<Employee> = emptyList();


    @GET
    @Produces(MediaType.TEXT_PLAIN)
    fun hello() = "hello"
}