package Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class ProductException extends RuntimeException {

    public ProductException(String message) {
        super(message);
    }
}