

 // 3. Crea una clase BankAccount con el atributo privado balance. Implementa los métodos 
 // deposit(double amount) y withdraw(double amount) que validen las cantidades correctamente.

public class BankAccount {
    private double balance;

    //Getter & Setter
    public void setBalance(double balance){
        this.balance = balance;
    }

    public double getBalance (){
        return balance;
    }
        //metodo depositar
        public void deposit(double amount){
            setBalance(balance += amount);
    }
        //metodo retirar
        public void withdraw(double amount){
            setBalance(balance -= amount);
        }
    //main
    public void main (){
        var cuenta1 = new BankAccount();
        cuenta1.setBalance(1050.45);

        cuenta1.deposit(450);
        IO.println ("Saldo: " + cuenta1.getBalance());

        cuenta1.withdraw(450);
        IO.println ("Saldo: " + cuenta1.getBalance());
    }

}
