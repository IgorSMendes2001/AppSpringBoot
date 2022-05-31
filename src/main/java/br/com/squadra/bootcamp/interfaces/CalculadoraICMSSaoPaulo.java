package br.com.squadra.bootcamp.interfaces;

public class CalculadoraICMSSaoPaulo implements CalculadoraICMS{

    @Override
    public double CalcularICMS(int tipoProduto, int quantidade, double valorUnitario) {
       double aliquota = 0.0d;
       if(tipoProduto==ENERGIA){
           aliquota=0.30;
       }else if(tipoProduto==GASOLINA){
           aliquota=0.22;
       }else if(tipoProduto==DIESEL){
           aliquota=0.28;
       }else if(tipoProduto==COMIDA){
           aliquota=0.35;
       }else if(tipoProduto==HARDWARE){
           aliquota=0.45;
       }

        return 0;
    }

   
    
}
