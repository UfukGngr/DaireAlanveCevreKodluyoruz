import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int r;
        Double pi=3.14,alan,cevre;

        Scanner scan=new Scanner(System.in);
        System.out.print("Dairenin yarıçapını giriniz: ");
        r=scan.nextInt();

        alan=pi*r*r;
        cevre=2*pi*r;

        System.out.println("Dairenin alanı :"+ alan);
        System.out.println("Dairenin çevresi :"+ cevre);



    }
}