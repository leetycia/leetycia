package contamain;
public class ContaCorrente {
    private double saldo;
    
    // Crie um método para determinar a quantidade de dinheiro na sua conta atualmente; 
    public double getSaldo() {
        return this.saldo;
  }
    // Caso você naõ tenha nenhum dinheiro na sua conta, o seu saldo será igual a 0 (zero);
    public void setSaldo(double saldo) {
        if (saldo < 0.00) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
  }
    // crie um método para calcular a quantidade de dinheiro depositado na sua conta mais o valor que já existia nela;
    public void depositarDinheiro( double Deposito) {
        setSaldo(this.getSaldo() + Deposito);
}
  
  // Crie um método para calcular a taxa de operação;
  // Caso o cliente tenha um saldo menor do de R$10.000,00, pagará uma taxa de 0,5% do valor sacado;  
  // Caso o cliente tenha um saldo maior do que 10.000,00, pagará uma taxa de 0,1% do valor sacado; 
  
      
  }
