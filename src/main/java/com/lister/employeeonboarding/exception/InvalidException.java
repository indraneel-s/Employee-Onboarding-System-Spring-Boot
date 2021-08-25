package com.lister.employeeonboarding.exception;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Component;


/**
 *
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Component
public class InvalidException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    private String errorMessage;
}
