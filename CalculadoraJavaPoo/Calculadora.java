public class Calculadora {

    private double numeroUm;
    private double numeroDois;
    private char operacao;

    public Calculadora(double numeroUm, double numeroDois, char operacao) {
        this.numeroUm = numeroUm;
        this.numeroDois = numeroDois;
        this.operacao = operacao;
    }

    public double getNumeroUm() {
        return numeroUm;
    }

    public void setNumeroUm(double numeroUm) {
        this.numeroUm = numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroDois(double numeroDois) {
        this.numeroDois = numeroDois;
    }

    public char getOperacao() {
        return operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public void menu(){
        System.out.println("\n CALCULADORA JAVA POO");
        System.out.println("Escolha a operação que deseja realizar abaixo: ");
        System.out.println("Insira (+) para adição; ");
        System.out.println("Insira (-) para multiplicação; ");
        System.out.println("Insira (*) para multiplicação; ");
        System.out.println("Insira (/) para divisao; ");
        System.out.println("Insira (p) para potencia; ");
        System.out.println("Insira (r) para Raiz; ");
        System.out.println("Insira (Q) para sair do programa: ");
        
    }

    public void somar(double numeroUm, double numeroDois){

        if (numeroUm % 1 == 0 && numeroDois % 1 == 0 ){
        int resultadoInteiro = (int) (numeroUm + numeroDois);
        System.out.println("O resultado da adição dos dois números é : "+ resultadoInteiro);
        } else {
        double resultado = numeroUm + numeroDois;
        System.out.println("O resultado da adição dos dois números é : "+ resultado);
        }

    }

    public void subtrair(double numeroUm, double numeroDois){
        if (numeroUm % 1 == 0 && numeroDois % 1 == 0 ){
        int resultadoInteiro = (int) (numeroUm - numeroDois);
        System.out.println("O resultado da subtração dos dois números é : "+ resultadoInteiro);
        } else {
        double resultado = numeroUm - numeroDois;
        System.out.println("O resultado da subtração dos dois números é : "+ resultado);
        }
    }

    public void multiplicar(double numeroUm, double numeroDois){
        if (numeroUm % 1 == 0 && numeroDois % 1 == 0 ){
        int resultadoInteiro = (int) (numeroUm * numeroDois);
        System.out.println("O resultado da multiplicação dos dois números é : "+ resultadoInteiro);
        } else {    
        double resultado = numeroUm * numeroDois;
        System.out.println("O resultado da multiplicação dos dois números é : "+ resultado);
        }
    }

    public void dividir(double numeroUm, double numeroDois){
        if (numeroDois == 0){
            System.out.println("Impossível realizar uma divisão por zero!");
        } else {
            if (numeroUm % 1 == 0 && numeroDois % 1 == 0 ){
            int resultadoInteiro = (int) (numeroUm / numeroDois);
            System.out.println("O resultado da divisão dos dois números é : "+ resultadoInteiro);
             } else {   
            double resultado = numeroUm / numeroDois;
            System.out.println("O resultado da divisão dos dois números é : "+ resultado);
            }
        }
    }

    public void potenciacao(double numeroUm, double numeroDois){
        if (numeroUm % 1 == 0 && numeroDois % 1 == 0 ){
        int resultadoInteiro = (int) Math.pow(numeroUm, numeroDois);
        System.out.println("O resultado da potenciação dos dois números é : "+ resultadoInteiro);
        } else {      
        double resultado = Math.pow(numeroUm, numeroDois);
        System.out.println("O resultado da potenciação dos dois números é " + resultado);
        }
    }

    public void calculaRaiz(double numeroUm){
        if (numeroUm < 0) {
            System.out.println("Não existe raiz de número negativo!");
        } else {
            double resultado = Math.sqrt(numeroUm);
            if (resultado % 1 == 0){
                 int resultadoInteiro = (int) resultado;
                System.out.println("A raiz quadrada do numero inserido é : "+ resultadoInteiro);
                } else {  
                 System.out.println("A raiz quadrada do numero inserido é " + resultado);
                }
        }
    }

    public void encerrar(){
        System.out.println("Programa encerrado!");
    }

    
}