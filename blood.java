import java.util.Scanner;
public class blood{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter age of the person");
        int age=sc.nextInt();
        System.out.println("enter weight of the person");
        float weight=sc.nextFloat();
        if(age>=18){
            if(weight>=50){
                System.out.println("can donate blood");
            }
            else{
                System.out.println("cannot donate blood");
            }
            sc.close();
        }
    }
    
}
