import java.util.Scanner;

public class randomnumber {
    public static void main(String[] args) {
        // System.out.println("Enter Your Number: ");
        int mynumber = (int) (Math.random() * 100);
        
        Scanner sc = new Scanner(System.in);
        int inputnumber = 0;
        int count=1;
        do {
            
            System.out.print("Enter your number: ");
            inputnumber = sc.nextInt();
            if (inputnumber == mynumber) {
                System.out.println("Coolll...Correct Number ");
                break;
            } else if (inputnumber > mynumber) {
                System.out.println("the given number is big Please Enter small value: ");
            } else {
                System.out.println("the given number is small please enter bigger number: ");
            }
            count++;

        } while (count <= 5);
       // System.out.println("THE VALUE OF COUNT "+count);
        if(count==6){
            System.out.println("you got 5 attempts is over " );
        }

        System.out.println("the number was :" + mynumber);

    }
}