package contamain;
    
public class ContaMain {

  public static void main(String[] args) {
    // criar uma conta-corrente;
    // depositar dinheiro;
    // sacar dinheiro;
    // obter o saldo da conta;
    ContaCorrente c = new ContaCorrente();
    c.setSaldo(800.00);
    System.out.println("O saldo na sua conta é de R$"+c.getSaldo());
    c.depositarDinheiro(300.00);
    System.out.println("O saldo na sua conta após o deposito é de R$" + c.getSaldo());
            
  }

}
