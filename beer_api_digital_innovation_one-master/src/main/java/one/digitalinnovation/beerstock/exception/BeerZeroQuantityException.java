package one.digitalinnovation.beerstock.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class BeerZeroQuantityException extends Exception {

    public BeerZeroQuantityException(int quantity) {
        super(String.format("The quantity %d is forbidden, please choose another one", quantity));
    }
}
