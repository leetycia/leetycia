package principal;
public class NovoFat {
    // O atributo num é o número que será calculado o seu fatorial;
    public int num;
    
    // O fatorial de um número inteiro positivo é igual a multiplicação de todos seus antecessores até o número um;
    // FÓRMULA: n! = n.(n-1).(n-2).(n-3)...;
    // Ex: 3! = 3.2.1 = 6;
    // Ex: 5! = 5.4.3.2.1 = 120;
    // Ex: 10! = 10.9.8.7.6.5.4.3.2.1 = 3628800;
    
    // O método factorialResult() implementará o fatorial do atributo num passado pelo construtor;
    // Ex: Dado o valor de num = 10, a saída deverá ser 3.628.800;
    // Observação01: Se num for igual a 0, o seu fatorial será 1;
    // Ex: 0! = 1;
    // Observação02: Com exeção do número 0, todo número inteiro positivo terá como fatorial(num!), a sua multiplicação pelo num! de seu antecessor;
    // Formúla: num * num!(num-1);
    
  public int factorialResult(int num) {
    if (num == 0)
      return 1;
        
    else return num * factorialResult(num - 1);
  }
}
   
