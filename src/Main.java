import java.lang.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
import java.util.Scanner;
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {
    public static void main(String[] args) {//TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your name and age");
        System.out.println("Name : " + sc.nextLine());
        System.out.println("Age : " + sc.nextLine());
        System.out.println("Choose an organ");
        List list = new List();
        while (true){
        list.list();
        int chose= sc.nextInt();

        switch (chose) {
            case 1:
                LeftEye le = new LeftEye("lefteye", "Shortsighted", "Blue", true);
                le.status();
                System.out.println("\t 1.Close your eyes ");
                le.isopen(sc.nextInt());
                break;

            case 2:
                Right_eye Re = new Right_eye("Righteye", "Normal", "Blue", true);
                Re.status();
                System.out.println("\t 1.Close your eyes ");
                Re.isopen(sc.nextInt());
                break;


            case 3:
                Heart he = new Heart("Heart", "Normal", 65);
                he.status();
                System.out.println("\t 1.Change the heart rate ");
                he.change_HR(sc.nextInt());
                break;


            case 4:
                Stomach se = new Stomach("Stomach", "PUD");
                se.status();
                System.out.println("\t 1.Digest ");
                se.digest(sc.nextInt());
                break;

                case 5:
                Organ og = new Organ("Skin","Burnt");
                og.status();
                System.out.println("\n\n");
                break;

            case 6:
                System.exit(1);

        }



    }
        }}
