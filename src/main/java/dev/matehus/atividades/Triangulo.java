package dev.matehus.atividades;

/**
 * TRIANGULO EQUILATERO
 */
public class Triangulo implements FormaSuperClasse {
    public double lado;
    public double base;
    public double altura;

    public Triangulo(double base, double altura, double lado) {
        this.lado = lado;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calculaArea() {
        return lado * lado * Math.cbrt(3);
    }

    @Override
    public double calculaPerimetro() {
        return lado * 3;
    }
}
