package br.com.squadra.bootcamp.interfaces;

public class TestandoCalculadoraICMS {
    public static void main(String[] args) {
        CalculadoraICMS calculadora=new CalculadoraICMSSaoPaulo();
        double valorImposto=calculadora.CalcularICMS(CalculadoraICMS.COMIDA, 10, 100);
        calculadora=new CalculadoraICMSRJ();
        System.out.println(valorImposto);
        valorImposto=calculadora.CalcularICMS(CalculadoraICMS.COMIDA, 10, 100);
        System.out.println(valorImposto);
    }
}
