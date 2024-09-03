import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
  Scanner sc = new Scanner(System.int);

    double altura = sc.nextDouble();
    double massa = sc.nextDouble();
    double imc = massa / (altura * altura);

    System.out.printf("o seu IMC é de %.2f kg/m %n" , imc);

    if( 25 < imc && imc < 29.9) {
      
    
  if( 30 < imc) {
  System.out.println("Você apresenta Obesidade de Grau 1");
  sc.close();
  }

}
