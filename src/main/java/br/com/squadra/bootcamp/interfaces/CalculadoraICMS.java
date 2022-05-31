package br.com.squadra.bootcamp.interfaces;

public interface CalculadoraICMS {
       public static final int ENERGIA=1;//Sempre será public static final
       public final int GASOLINA=2;
       public final int DIESEL=3;
       public final int COMIDA=4;
       public final int HARDWARE=5;
    public abstract double CalcularICMS(int tipoProduto,int quantidade,double valorUnitario);
    
}
