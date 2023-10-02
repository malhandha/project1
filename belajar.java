import java.util.scanner
public class belajar{
    public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    int bilangan, counter;
    System.out.println("Program deret angka");
    System.out.println("Masukkan Angka = ");
    bilangan = s.nextInt();
    System.out.println("Deret Angka : ");
    counter = 1;
    while(counter <= bilangan){
        System.out.print(counter+" ")
        counter++;
    }   
    System.out.println("");
    }
}
