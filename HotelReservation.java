import java.util.Scanner;
/*Build a hotel reservation system where users can
search for available rooms, make reservations, and view
booking details. Include features like room
categorization and payment processing */

public class HotelReservation {
    static String name;
    static int roomNo;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        boolean[] rooms = {true, false, true, true, false, true, false, false, true, false,
            false, true, true, false, false, true, false, true, true, true,
            false, true, true, false, false, false, true, true, false, false,
            true, true, true, false, true, false, false, true, false, true,
            false, true, false, true, true, false, false, true, true, false};
        int i;
        System.out.println("Welcome");
        System.out.print("Please enter your name : ");
        name = sc.nextLine();
        System.out.println("Categories of rooms : \nStandard : 1 - 20 -> Charges per day : 1000\nDeluxe : 21 - 40 -> Charges per day : 5000\nSuite : 41 - 50 -> Charges per day : 10000\n");
        System.out.println("Please enter your choice\n1.Standard\n2.Deluxe\n3.Suite");
        char ch = ' ';
        ch = sc.next().charAt(0);
        switch(ch){
            case '1' : System.out.println("Available rooms : ");
                       for(i = 0; i < 20; i++){
                            if(!rooms[i]){
                                System.out.print(i+1+" ");
                            }
                       }
                       System.out.println();
                       System.out.println("Please select the room no from the available rooms");
                       roomNo = sc.nextInt();
                       System.out.println("Please wait while the payment is being processed");
                       try{
                            Thread.sleep(5000);
                       }
                       catch(Exception e){
                            e.printStackTrace();
                       }
                       System.out.println("Booking is confirmed");
                       rooms[roomNo - 1] = true;
                       break;
            case '2' : System.out.println("Available rooms : ");
                       for(i = 20; i < 40; i++){
                            if(!rooms[i]){
                                System.out.print(i+1+" ");
                            }
                       }
                       System.out.println();
                       System.out.println("Please select the room no from the available rooms");
                       roomNo = sc.nextInt();
                       System.out.println("Please wait while the payment is being processed");
                       try{
                            Thread.sleep(5000);
                       }
                       catch(Exception e){
                            e.printStackTrace();
                       }
                       System.out.println("Booking is confirmed");
                       rooms[roomNo - 1] = true;
                       break;
            case '3' : System.out.println("Available rooms : ");
                       for(i = 40; i < 50; i++){
                            if(!rooms[i]){
                                System.out.print(i+1+" ");
                            }
                       }
                       System.out.println();
                       System.out.println("Please select the room no from the available rooms");
                       roomNo = sc.nextInt();
                       System.out.println("Please wait while the payment is being processed");
                       try{
                            Thread.sleep(5000);
                       }
                       catch(Exception e){
                            e.printStackTrace();
                       }
                       System.out.println("Booking is confirmed");
                       rooms[roomNo - 1] = true;
                       break;
            default : System.out.println("Irrelevant choice");
                   
        }
        try{
            Thread.sleep(2000);
       }
       catch(Exception e){
            e.printStackTrace();
       }
        System.out.println();
        viewDetails();
        System.out.println("Thank You.Have a nice stay");
    }
    public static void viewDetails(){
        System.out.println("Booking Details : ");
        System.out.println("Booking id : "+(int)(Math.random()*50)+1);
        System.out.println("Name : "+name);
        System.out.println("Room Number : "+roomNo);
        if(roomNo >= 1 && roomNo <= 20){
            System.out.println("Room category : Standard");
        }
        else if(roomNo >= 21 && roomNo <= 40){
            System.out.println("Room category : Deluxe");
        }
        else if(roomNo >= 41 && roomNo <= 50){
            System.out.println("Room category : Suite");
        }
        System.out.println();

    }
}