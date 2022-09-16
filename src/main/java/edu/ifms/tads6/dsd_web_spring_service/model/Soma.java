package edu.ifms.tads6.dsd_web_spring_service.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Soma {
    private int numberOne;
    private int numberTwo;

    public int getResult() {
        return numberOne + numberTwo;
    }
}
