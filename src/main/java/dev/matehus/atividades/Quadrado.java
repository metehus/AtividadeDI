package dev.matehus.atividades;

public class Quadrado implements FormaSuperClasse {
    public double lado;

    public Quadrado(double lado) {
        this.lado = lado;
    }

    @Override
    public double calculaArea() {
        return lado * lado;
    }

    @Override
    public double calculaPerimetro() {
        return lado * 4;
    }
}
