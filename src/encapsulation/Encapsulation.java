/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

/**
 *
 * @author Marcin
 */
public class Encapsulation {
    public static void main(String[] args) {
        
        BankAccount myAccount = new BankAccount();
        System.out.println(myAccount.getBalance());
        myAccount.deposit(1000);
        
        if (myAccount.withdraw(800))
            System.out.println("Wypłacono");
        else
            System.out.println("Niewystarczająca ilość środków na koncie");
    }
}

class BankAccount {
    private int balance;
    
    public BankAccount() {
        balance = 0;
    }

    int getBalance() {
        return balance;
    }
    
    private boolean setBalance(int balance) {
        this.balance = balance;
        return true;
    }
    
    boolean withdraw(int amount) {
        if (balance < amount)
            return false;
        else
            setBalance(balance - amount);
        return true;
    }
    
    boolean deposit(int amount) {
        setBalance(balance + amount);
        return true;
    }
}