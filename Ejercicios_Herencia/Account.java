package Practicas_Rodrigo.Ejercicios_Herencia;
// 8. Account tiene un saldo y métodos para deposit() y withdraw().
// SavingsAccount hereda y agrega un metodo addInterest().
public class Account {
    protected double balance;
    //setter
    public void setBalance(double balance) {
        this.balance = balance;
    }

    //metodos
    public void deposit(double amount){
            balance += amount;
            IO.println("saldo tras depósito: "+balance+ ".\nCantidad ingresada al balance: "+amount);
    }

    public void withdraw(double amount){
        balance -= amount;
        IO.println("Saldo tras retirada: "+balance+".\nCantidad retirada: "+amount);
    }
public static class SavingsAccount extends Account{
        //metodo addInterest
    public void addInterest (double anualInterest){
        double interest =  balance * anualInterest;
        balance +=interest;
        IO.println("Balance anual con interés al "+ anualInterest+": "+balance+"€");
    }
}
}
