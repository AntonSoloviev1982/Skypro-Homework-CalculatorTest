package pro.sky.skyprohomeworkcalculatortest.handler;

import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


@RestControllerAdvice
public class CalculatorExceptionHandler {

    @ExceptionHandler(MissingServletRequestParameterException.class)
    public String handlerNoParameterInHttpRequestException() {
        return "В запросе отсутствуют один или оба параметра!";
    }

    @ExceptionHandler(IllegalArgumentException.class)
    public String handlerDivisionByZeroInMethodDivideException() {
        return "Ошибка: деление на ноль!";
    }
}
