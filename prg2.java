//Smallest of three numbers
import java.util.Scanner;
public class prg2 {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);

        System.out.println("enter first number");
        int firstNo=sc.nextInt();

        System.out.println("enter Second number");
        int secondNo =sc.nextInt();

        System.out.println("enter third number");
        int thirdNo =sc.nextInt();

        if(firstNo<secondNo && firstNo<thirdNo){

            System.out.println(firstNo);

        }
        if(secondNo<firstNo && secondNo<thirdNo){
            System.out.println(secondNo);
        }

        if(thirdNo<firstNo && thirdNo<secondNo){
            System.out.println(thirdNo);
        }




    }
}
