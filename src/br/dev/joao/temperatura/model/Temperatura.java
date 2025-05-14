package br.dev.joao.temperatura.model;

public class Temperatura {
	 // Atributo
    private double celsius;

    // Getter
    public double getCelsius() {
        return celsius;
    }

    // Setter
    public void setCelsius(double celsius) {
        this.celsius = celsius;
    }

    // Conversão para Kelvin
    public double converterParaKelvin() {
        return celsius + 273.15;
    }

    // Conversão para Fahrenheit
    public double converterParafahrenheit() {
        return (celsius * 9 / 5) + 32;
    }
}

