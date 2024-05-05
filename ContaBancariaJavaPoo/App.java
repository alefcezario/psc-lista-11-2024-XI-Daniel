import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Para criar sua conta bancária, insira os dados abaixo: ");
        System.out.println("Nome completo: ");
        String nomeCompleto = scanner.nextLine();
        System.out.println("Numero de sua conta: ");
        int numeroConta = scanner.nextInt();
        System.out.println("Saldo inicial que irá depositar: ");
        double saldoInicial = scanner.nextDouble();

        System.out.println("Conta bancária criada com sucesso!");

        ContaBancaria contaBancaria = new ContaBancaria(nomeCompleto, numeroConta, saldoInicial);

        char continua = 's';

        do {

        contaBancaria.menuBanco(nomeCompleto);

        int escolha = scanner.nextInt();

        switch (escolha) {
            case 1:
                System.out.println("Digite o valor que irá depositar: ");
                double valorDeposito = scanner.nextDouble();
                System.out.println("Depósito de R$" + valorDeposito + " realizado com sucesso na conta " + contaBancaria.getNumeroConta() + " !");
                contaBancaria.depositar(valorDeposito);
                break;
        
            case 2:
                System.out.println("Digite o valor que irá sacar: ");
                double valorSaque = scanner.nextDouble();

                if (contaBancaria.confirmarSaque(valorSaque) && valorSaque <=5000) {
                System.out.println("Saque de R$" + valorSaque + " realizado com sucesso na conta " + contaBancaria.getNumeroConta() + " !");
                contaBancaria.sacar(valorSaque);
                } else {
                    if (contaBancaria.confirmarSaque(valorSaque) && valorSaque > 5000) {
                        System.out.println("Valor do saque acima do permitido!");
                    } else {
                    System.out.println("Saldo insuficiente para realizar a operação!");
                    }
                }
                break;

            case 3:
            System.out.println("Seu saldo em conta atual é R$: " + contaBancaria.getSaldoConta());        
                break;

            case 4: 
            System.out.println("Atendimento finalizado! \n Obrigado por utilizar nossos serviços!");
            continua = 'n';
            break;

            default:
                break;
        }   
        } while (continua == 's');

        scanner.close();
    }
}
