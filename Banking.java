import java.util.Scanner;

public class Banking{
    public static void main(String[] args) {
        Account[] acnt = new Account[3];
        acnt[0] = new Account("45675", "2654", 4000);
        acnt[1] = new Account("45676", "1536", 0);
        acnt[2] = new Account("45677", "5986", 80000);
        String acntNo = null, pin = null;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your account number : ");
        acntNo = sc.nextLine();
        int i = 0, j = 0, amnt = 0;
        char ch = ' ';
        for(i = 0; i < acnt.length; i++){
            if(acntNo.equals(acnt[i].getAcntNo())){
                break;
            }
        }
        if(i == acnt.length){
            System.out.println("Incorrect Account Number");
        }
        else{
            for(j = 0; j < 3; j++){
                System.out.println("You have "+(3 - j)+" chances left");
                System.out.print("Enter pin : ");
                pin = sc.nextLine();
                if(pin.equals(acnt[i].getPin())){
                    break;
                }
            }
            if(j == 3){
                System.out.println("Sorry.Please check your credentials");
            }
            else{
                while(true){
                    System.out.println("Enter your choice\n1.Check balance\n2.Deposit\n3.Withdraw\n4.Exit");
                    ch = sc.next().charAt(0);
                    if(ch == '4'){
                        System.out.println("Thank You");
                        break;
                    }
                    switch (ch) {
                        case '1' : System.out.println("current balance : "+acnt[i].getBalance());
                                   break;
                        case '2' : System.out.println("Enter the amount you want to deposit : ");
                                   amnt = sc.nextInt();
                                   acnt[i].deposit(amnt);
                                   break;
                        case '3' : System.out.println("Enter the amount you want to withdraw : ");
                                   amnt = sc.nextInt();
                                   acnt[i].withdraw(amnt);
                                   break;
                        default : System.out.println("Please select the correct choice");
                    }
                }
            }
        }
        sc.close();
     }
}