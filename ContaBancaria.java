package aula5.teste;

public class ContaBancaria {
    private String titular;
    private int numerdoConta;
    private double saldo;

    
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria("Guilherme", 1234, 50);
        //conta1.depositar(50);
        conta1.levantamento(51);//como não tenho 51€ vai dar a mensagem e vai passar 
        conta1.depositar(50);// tenho 50 e deposito mais 50 fico com 100
        conta1.exibirInformacoes();
        
        ContaBancaria conta2 = new ContaBancaria("Gustavo", 4321, 100);
        conta2.levantamento(50);//tenho 100 levanto 50 fico com 50 
        conta2.depositar(100);//tenho 50 ao depositar 100 fico com 150
        conta2.exibirInformacoes();

        ContaBancaria conta3 = new ContaBancaria("Roberto", 1111, 10);
        conta3.levantamento(50); //tenho 10 dá me erro ao tirar 50 
        conta3.depositar(10);//deposito mais 10 ficando com 20
        conta3.exibirInformacoes();
    }

    public ContaBancaria(String titular, int numerdoConta, double saldo){
        this.titular = titular;
        this.numerdoConta = numerdoConta;
        this.saldo = saldo;
    }

    public String getTitular(){
        return titular;
    }
    public int getNumerdoConta(){
        return numerdoConta;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setTitular(String titular){
        this.titular = titular;
    }
    public void setNumerdoConta(int numerdoConta){
        this.numerdoConta = numerdoConta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        this.saldo += valor; 
    } 

    public void levantamento(double valor){
       if(saldo < valor){
        System.out.println("\nImpossivel fazer levantamento" + " " + titular + "\n");
       }else{
        this.saldo -= valor;
       }
    }

    public void exibirInformacoes(){
        System.out.println("O número da conta é: " + numerdoConta + " sendo o titular: " + titular + "\nSaldo atual: " + saldo);
    }

}
