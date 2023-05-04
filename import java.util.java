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
      Divisao.dividir(dividendo, divisor);
    }catch(ArithmeticException e){
      System.out.println("Erro:"+ e.getMessage());
    }
  }
}