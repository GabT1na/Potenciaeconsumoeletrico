public class Main {
  public static void main(String[] args) {
    System.out.println("Programa criado para calcular a Potência e o Consumo Elétrico");
    System.out.println();
    System.out.println("Uma Tv de 200Watts, fica ligada aproximadamente 5 horas diárias. Determine o consumo elétrico mensal da Tv.");
    System.out.println ();
    double potencia = 200;
    double tempo = 5;
    double dias = 30;
    double consumo =(potencia * tempo * dias);
    System.out.println("O resultado da primeira multiplicação é de:");
    System.out.println(consumo);
    System.out.println();
    double consumo2 = (consumo / 1000);
    System.out.println("O consumo mensal foi de:");
    System.out.println(consumo2);
  }
}