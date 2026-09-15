//write a java pogram to check give number is positive, negative and nutral.
import java.util.Scanner;

class file{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your num: ");
        int num = scanner.nextInt();

        // if(num>0){
        //     System.out.println("positive.");
        // }
        // else if(num<0){
        //     System.out.println("negative.");
        

        // }
        // else{
        //     System.out.println("neutral.");
        // }

        switch(num){
            case 1:
                System.out.println("addtion" +(num+num));
                break;
            case 2:
                System.out.println("subtration: "+(num--));
                break;
            case 3:
                System.out.println("multiple: "+(num*num));
                break;
            case 5:
                System.out.println("divide: "+(num/num));
                break;
            default :
                System.out.println("invalid number");
        }
    }
}


