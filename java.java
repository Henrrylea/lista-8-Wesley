import java.util.Scanner;

public class Main{
  public static void main(string[]args){
    Scanner input = new    
Scanner(System.in);

    System.out.print("Digite o dividendo:"
  );
    int dividendo = input.nextInt();

    System.out.ptint("Digite o divisor");
    int divisor = input.nextInt();

    try{
      int resultado=dividendo / divisor;
      System.out.println("Resultado:"+ resultado);
    }catch(ArithmeticException e){
      System.out.println("Não é possível dividir por zero.");
    }
  }
}