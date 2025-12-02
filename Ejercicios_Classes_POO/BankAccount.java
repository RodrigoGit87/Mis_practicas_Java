package Practicas_Rodrigo.Ejercicios_Classes_POO;
// 6. Crea una clase BankAccount con atributo balance y un método deposit() que sume el saldo.
public class BankAccount {
    double balance;

    //metodo deposit
    public void saldoTotal(double balance){
        this.balance = balance;
        double saldo= 3000.00;
        double saldoTotal = saldo + balance;
        IO.print(saldoTotal);
    }
    static void main(){
        var cuentaUsuario1 = new BankAccount();
        cuentaUsuario1.saldoTotal(500.99);
    }

}
