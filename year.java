import java.util.Scanner;
public class year {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter year");
        int a=sc.nextInt();
        if(a%4==0){
            System.out.println("its a leap year");
        }
        else{
            System.out.println("not a leap year");
        }
        sc.close();
    }

    
}
