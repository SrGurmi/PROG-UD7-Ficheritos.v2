package com.salesianos.actividad4;

import java.io.Serial;
import java.io.Serializable;

public class Mesa implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;
    private final String color;
    private final int numeroDePatas;

    public Mesa(String color, int numeroDePatas) {
        this.color = color;
        this.numeroDePatas = numeroDePatas;
    }

    @Override
    public String toString() {
        return "Mesa{color='" + color + "', numeroDePatas=" + numeroDePatas + "}";
    }
}
