package CoBo.Chatbotfile.Controller.ExceptionHandler

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import java.io.IOException

@RestControllerAdvice()
class FileAuthExceptionHandler {

    @ExceptionHandler(IOException::class)
    fun fileIOExceptionHandler(): ResponseEntity<String> {
        return ResponseEntity("파일을 업로드하는 과정에서 에러가 발생했습니다.", HttpStatus.SERVICE_UNAVAILABLE)
    }
}