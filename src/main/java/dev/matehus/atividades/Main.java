package dev.matehus.atividades;

public class Main {
    public static void main(String[] args) {
        Triangulo triangulo = new Triangulo(3, 5, 5);
        Circulo circulo = new Circulo(3);
        Quadrado quadrado = new Quadrado(8);

        Figura figuraT = new Figura(triangulo);
        Figura figuraC = new Figura(circulo);
        Figura figuraQ = new Figura(quadrado);

        System.out.println("Dados triângulo: " + figuraT.calcularDados());
        System.out.println("Dados círculo: " + figuraC.calcularDados());
        System.out.println("Dados quadrado: " + figuraQ.calcularDados());
    }
}