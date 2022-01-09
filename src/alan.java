import java.util.Scanner;


public class alan {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("yarı çapı girinz=");
        float yarıçap=input.nextFloat();
        System.out.print("derece giriniz =");
        int derece=input.nextInt();
        double alan=((3.14*(yarıçap*yarıçap)*derece)/360);
        System.out.println("Alan ="+alan);

    }


}
