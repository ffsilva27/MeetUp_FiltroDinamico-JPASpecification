package vc.com.meetupfilipe.meetupfilipe.exception

import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.context.request.WebRequest

@ControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(InvalidAgeRangeException::class)
    fun handlerException(ex: InvalidAgeRangeException, request: WebRequest) : ResponseEntity<Any>{
        return ResponseEntity.badRequest().body(ex.message)
    }

}