package ai.graphometrica.leaders2020_backend

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import springfox.documentation.swagger2.annotations.EnableSwagger2

@SpringBootApplication
class Leaders2020BackendApplication

fun main(args: Array<String>) {
    runApplication<Leaders2020BackendApplication>(*args)
}
