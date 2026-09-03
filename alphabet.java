import java.util.Scanner;
public class alphabet{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter an alphabet");
        char ch=sc.next().charAt(0);
        if(ch>='a'&&ch<='z'){
            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                System.out.println("the alphabet is vowel");
            }
            else{
                System.out.println("it is consonant");
            }
          }
        sc.close();
        
    }
}                                                          