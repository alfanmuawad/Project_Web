import java.util.Scanner;

public class latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("masukan nilai_1 = ");
        int nilai_1 = input.nextInt();
        System.out.print("masukan nilai_2 = ");
        int nilai_2 = input.nextInt();

        int jumlah = nilai_1 + nilai_2;
        System.out.println("jumlah = " + jumlah);
    }
}
