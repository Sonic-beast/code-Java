import java.util.Scanner;

public class bankAccount {
    private int accountNumber;
    private int balance;
    public bankAccount(int accountNumber,int balance){
        this.accountNumber=accountNumber;
        this.balance=balance;

    }
    public void deposit(double x){
        balance+=x;
    }
    public void withdraw(double x){
        if(balance<=0){
            System.out.println("Insufficient Balance Please Deposit!!!");
        }
        balance-=x;
    }
    public void getBalance(){
        System.out.println(balance);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter you current details");
        System.out.println("Enter account number: ");
        int a=sc.nextInt();
        System.out.println("Enter your balance");
        int b=sc.nextInt();
        bankAccount b1=new bankAccount(a,b);
        System.out.println("choose operations you want to perform by entering following number: \n 1. Deposit Amount \n 2. Withdraw Amount \n 3. Current Balance \n 4. EXIT \n Selection:");
        while(true){
        int v=sc.nextInt();
        if(v==1){
            System.out.println("Enter Deposit Amount: ");
            double k1=sc.nextDouble();
            b1.deposit(k1);
        } else if (v==2) {
            System.out.println("Enter Withdraw Amount");
            double k2=sc.nextDouble();
            b1.withdraw(k2);
        } else if (v==3) {
            System.out.println("Your current balance is: ");
            b1.getBalance();
        } else if (v==4) {
            System.out.println("Process Exiting!!!!");
            break;
        } else{
            System.out.println("INVALID SELECTION!!!!!\n Try Again...");
        }
        }
    }

}
