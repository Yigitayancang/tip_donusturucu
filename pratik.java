import java.util.Scanner;
public class pratik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir tam sayı girin: ");
        int tamSayi = scanner.nextInt();     
        System.out.print("Bir ondalıklı sayı girin: ");
        double ondalikliSayi = scanner.nextDouble();  
        double tamSayiOndalikli = (double) tamSayi;
        System.out.println("Tam sayıyı ondalıklı sayıya dönüştürdüğümüzde: " + tamSayiOndalikli);
        int ondalikliSayiTam = (int) ondalikliSayi;
        System.out.println("Ondalıklı sayıyı tam sayıya dönüştürdüğümüzde: " + ondalikliSayiTam);
        scanner.close();
    }
}
