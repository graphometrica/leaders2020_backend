package ai.graphometrica.leaders2020_backend.web.controller.api.v1

import ai.graphometrica.leaders2020_backend.web.controller.DemoControllerApi
import org.springframework.web.bind.annotation.CrossOrigin
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@CrossOrigin
@RestController
@RequestMapping("/api/v1")
class DemoController : DemoControllerApi {

    @GetMapping("/hello")
    override fun getHelloWorld(@RequestParam(required = false) name : String?): String {
        return "Hello ${name?:"stranger"}"
    }
}