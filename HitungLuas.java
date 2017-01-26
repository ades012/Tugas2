class HitungLuas {
        public int cariLuasPersegiPanjang (int panjang, int lebar) {
        return panjang * lebar;

                }
        public static void main(String args[]){

        }
}


import java.util.Scanner;
public class Luaslingkaran {
    public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    double phi=3.14;
    double jari,luas;
    System.out.print("Jari-jari lingkaran:");
    jari=input.nextDouble();

    luas = phi*jari*jari;

    System.out.println("Luas Lingkaran = " + (double)luas);

    }
}
