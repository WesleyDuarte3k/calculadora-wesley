package org.example.BootCampWesley;

import java.util.List;

public class Calculadora {

	public Integer soma(List<Integer> numeros) {
		return numeros.stream().
			reduce(0, (acumulador, numero) -> (acumulador + numero));
	}
}
