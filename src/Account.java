import com.sun.jdi.request.StepRequest;

import java.util.Scanner;

public class Account extends Thread{
    int total;
    String name;


    public Account(int total, String name) {
        this.total = total;
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("THREAD IS RUNNING!"+name);
        withdraw(20);
        deposit(10);
    }

    public void withdraw(int amount) {
        System.out.print(name);
        if (this.total - amount >= 0) {
            System.out.println("Total cash: " + this.total + "  || Withdraw: " + amount);
            this.total = this.total - amount;
        } else {
            System.out.println("No funds");
        }
    }

    public void deposit(int amount) {
        System.out.print(name);
        System.out.println("Total cash: " + total + "(+" + amount + "€)");
        this.total = this.total + amount;
        System.out.println("Updated cash: " + total);
        System.out.println("OLAAAA");
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }
}
