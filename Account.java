/*A Simple Banking Application in Java is an ideal project
for coding beginners. It covers fundamental concepts
like the Scanner class for input, strings, loops, methods,
and conditional statements. This project involves basic
banking operations such as deposits, withdrawals,
checking balances, and exiting the program */
public class Account {
    private String acntNo;
    private String pin;
    private int balance;
    public Account(String acntNo, String pin, int balance){
       this.acntNo = acntNo;
       this.pin = pin;
       this.balance = balance;
    }
    public int getBalance(){
       return balance;
    }
    public String getAcntNo(){
       return acntNo;
    }
    public String getPin(){
       return pin;
    }
    public void deposit(int amnt){
       System.out.println("Balance before depositing : "+balance);
       balance += amnt;
       System.out.println("Current balance : "+balance);
    }
    public void withdraw(int amnt){
       if(amnt > balance){
          System.out.println("Insufficient balance");
          return;
       }
       System.out.println(amnt + " withdraw is successful");
       balance -= amnt;
       System.out.println("current balance : "+balance);
 
    }
 }