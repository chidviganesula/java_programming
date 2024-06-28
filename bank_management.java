import java.util.Scanner;
import java.io.*;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        bank_Account chidvi = new bank_Account();
        chidvi.setAccount_no(113341);
        chidvi.setAccount_balance(100000);
        chidvi.setName("Chidvilasini");
        chidvi.setEmail("chidviganesula");
        chidvi.setPhone_no(944008);
        System.out.println("Customer Name:" + chidvi.getName() + "\nAccount No:" + chidvi.getAccount_no()
                + "\nAccount balance:" + chidvi.getAccount_balance() + "\nEmail id:" + chidvi.getEmail() + "\nPhone no:"
                + chidvi.getPhone_no());
        System.out.println("You want to deposit amount?\n");
        Boolean bool = sc.nextBoolean();
        if (bool == true) {
            System.out.println("Enter amount to be deposited\n ");
            int deposit_amount = sc.nextInt();
            chidvi.deposit(deposit_amount);
        }
        System.out.println("You want to withdrawl amount?");
        Boolean bool1 = sc.nextBoolean();
        if (bool1 == true) {
            System.out.println("Enter amount to be withdrawn ");
            int withdrawal_amount = sc.nextInt();
            chidvi.withdrawl(withdrawal_amount);
        }
    }
}

class bank_Account {

    private int account_number;
    private int account_balance;
    private String customer_name;
    private String email_id;
    private int phone_number;

    // setter methods
    public void setAccount_no(int account_number) {
        this.account_number = account_number;
    }

    public void setAccount_balance(int account_balance) {
        this.account_balance = account_balance;
    }

    public void setName(String customer_name) {
        this.customer_name = customer_name;
    }

    public void setEmail(String email_id) {
        this.email_id = email_id;
    }

    public void setPhone_no(int phone_number) {
        this.phone_number = phone_number;
    }

    // getter methods
    public int getAccount_no() {
        return account_number;
    }

    public int getAccount_balance() {
        return account_balance;
    }

    public String getName() {
        return customer_name;
    }

    public String getEmail() {
        return email_id;
    }

    public int getPhone_no() {
        return phone_number;
    }

    public void deposit(int deposit_amount) {
        account_balance = account_balance + deposit_amount;
        System.out.println(
                "The deposited amount is " + deposit_amount + " and the updated balance is " + account_balance);
    }

    public void withdrawl(int withdrawal_amount) {
        account_balance = account_balance - withdrawal_amount;
        System.out.println(
                "The withdrawn amount is" + withdrawal_amount + "and the updated balance is " + account_balance);
    }

}
