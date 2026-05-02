import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);

        while (true) {
            System.out.println("\n=== Calculadora ===");

            // Pedir Números ao Usuario
            System.out.print("Digite o Primeiro Número: ");
            double num1 = leia.nextDouble();

            System.out.print("Digite o segundo número: ");
            double num2 = leia.nextDouble();

            //Pedir o operador
            System.out.print("Digite o operador (+, -, *, /): ");
            char operador = leia.next().charAt(0);

            //Calcular com o switch
            double resultado = 0;
            boolean valido = true;

            switch (operador) {
                case '+':
                    resultado = num1 + num2;
                    break;
                case '-':
                    resultado = num1 - num2;
                    break;
                case '*':
                    resultado = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Erro: Divisão por zero!");
                        valido = false;
                    } else {
                        resultado = num1 / num2;
                    }
                    break;
                default:
                    System.out.println("Operador Invalido!");
                    valido = false;
            }
            if (valido) {
                System.out.print("Resultado: " + num1 + " " + operador + " " + num2 + " = " + resultado);
            }
            //Perguntar se quer continuar
            System.out.print("\nDeseja Calcular novamente? (s/n): ");
            char reposta = leia.next().charAt(0);

            if (reposta == 'n' || reposta == 'N') {
                System.out.println("Encerrando... Até mais!");
                break; //sai do loop
            }

        }
        leia.close();
    }
}
