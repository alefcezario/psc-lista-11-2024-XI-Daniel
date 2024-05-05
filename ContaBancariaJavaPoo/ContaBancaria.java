public class ContaBancaria {

    private String nomePessoa;
    private int numeroConta;
    private double saldoConta;
 


    public ContaBancaria(String nomePessoa, int numeroConta, double saldoConta) {
        this.nomePessoa = nomePessoa;
        this.numeroConta = numeroConta;
        this.saldoConta = saldoConta;

    }

    public String getNomePessoa() {
        return nomePessoa;
    }
    public void setNomePessoa(String nomePessoa) {
        this.nomePessoa = nomePessoa;
    }
    public int getNumeroConta() {
        return numeroConta;
    }
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    public double getSaldoConta() {
        return saldoConta;
    }
    public void setSaldoConta(double saldoConta) {
        this.saldoConta = saldoConta;
    }

    public void menuBanco(String nomeCliente){
        System.out.println("\nQual operação desejar realizar senhor " + nomeCliente + " ?");
        System.out.println("Digite 1 para depositar: ");
        System.out.println("Digite 2 para sacar: ");
        System.out.println("Digite 3 para consultar o saldo atual: ");
        System.out.println("Digite 4 para finalizar o atendimento: ");
    }

    public void depositar(double valorDeposito){
        double novoSaldo = getSaldoConta() + valorDeposito;
        setSaldoConta(novoSaldo);
    }

    public void sacar(double valorSaque){
        double novoSaldo = getSaldoConta() - valorSaque;
        setSaldoConta(novoSaldo);
    }

    public boolean confirmarSaque(double valorSaque){
        if (valorSaque > getSaldoConta()){
        return false;
        } else {
        return true;
        }
    }


}