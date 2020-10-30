package ai.graphometrica.leaders2020_backend.web.controller

import io.swagger.annotations.Api
import io.swagger.annotations.ApiOperation
import io.swagger.annotations.ApiParam
import org.springframework.web.bind.annotation.RequestParam


@Api(
        value = "DemoControllerApi",
        description = "Demo api with swagger description"
)
interface DemoControllerApi {
    @ApiOperation(
            httpMethod = "GET",
            value = "Return greetings for entered name or stranger",
            response = String::class
    )
    fun getHelloWorld(
            @ApiParam(required = false, value = "name")
            @RequestParam name : String?): String
}