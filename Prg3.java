import java.util.Scanner;
public class Prg3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("First Number");
        int firstNo=sc.nextInt();

        System.out.println("Second Number");
        int secondNo=sc.nextInt();

        int temp=0;
        temp=firstNo;
        firstNo=secondNo;
        secondNo=temp;

        System.out.println("First Number "+firstNo);
        System.out.println("Second Number "+secondNo);



    }
}