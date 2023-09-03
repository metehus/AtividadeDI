package dev.matehus.atividades;


public class Figura {
    public FormaSuperClasse forma;

    public Figura(FormaSuperClasse forma) {
        this.forma = forma;
    }

    public String calcularDados() {

        return "Área: " + Math.round(forma.calculaArea()) + "; Perímetro: " + Math.round(forma.calculaPerimetro());
    }
}