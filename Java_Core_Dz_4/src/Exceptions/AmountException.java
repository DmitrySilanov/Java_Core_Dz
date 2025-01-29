package Exceptions;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
public class AmountException extends RuntimeException {

    public AmountException(String message) {
        super(message);
    }
}

