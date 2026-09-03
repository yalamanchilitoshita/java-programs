import java.util.Scanner;

public class lights {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter traffic light color : ");//red,green,yellow
        String color = sc.next(); // normalize input

        if (color.equals("red")) {
            System.out.println("stop the vehicle");
        } else if (color.equals("yellow")) {
            System.out.println("wait for green light");
        } else if (color.equals("green")) {
            System.out.println("lets set goooo");
        } 
        else{
            System.out.println("invalid color");

        }
        sc.close();
    }
}
