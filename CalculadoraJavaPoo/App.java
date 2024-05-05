import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char operacao = '0';
        double numeroUm = 0, numeroDois = 0;

        Calculadora calculadora = new Calculadora(numeroUm, numeroDois, operacao);
        
        while (true) {
            
        //aqui quero mostrar o menu
        calculadora.menu();

        operacao = scanner.nextLine().toLowerCase().charAt(0);

        if (operacao == 'q'){
            calculadora.encerrar();
            break;
        }

        if (operacao == '+' || operacao == '-' || operacao == '*' || 
            operacao == '/' || operacao == 'p' || operacao == 'r'){
        System.out.println("Digite o primeiro número: ");
        numeroUm = scanner.nextDouble();
        scanner.nextLine();
        }

        if (operacao != 'r' && (operacao == '+' || operacao == '-' || operacao == '*' || 
                                operacao == '/' || operacao == 'p' )){
        System.out.println("Digite o segundo número: ");
        numeroDois = scanner.nextDouble();
        scanner.nextLine();
        }

        switch (operacao) {
            case '+':
                calculadora.somar(numeroUm, numeroDois);
                break;
            
            case '-':
                calculadora.subtrair(numeroUm, numeroDois);
                break;

            case '*':
                calculadora.multiplicar(numeroUm, numeroDois);
                break;

            case '/':
                calculadora.dividir(numeroUm, numeroDois);
                break;

            case 'p':
                calculadora.potenciacao(numeroUm, numeroDois);
                break;

            case 'r':
                calculadora.calculaRaiz(numeroUm);
                break;

            default:
                System.out.println("Insira apenas um dos caracteres informados no menu!");
                break;
        }
    }

    scanner.close();
    }
}
