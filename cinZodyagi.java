import java.util.Scanner;
public class cinZodyagi {
    public static void main(String[] args) {
        int year;
        Scanner inp = new Scanner(System.in);
        System.out.print("Do�dununz y�l� giriniz :");
        year = inp.nextInt();


        switch (year%12) {
            case 0:
                System.out.print("Maymun");
                break;
            case 1:
                System.out.print("Horoz");
                break;
            case 2:
                System.out.print("K�pek");
                break;
            case 3:
                System.out.print("Domuz");
                break;
            case 4:
                System.out.print("Fare");
                break;
            case 5:
                System.out.print("�k�z");
                break;
            case 6:
                System.out.print("Kaplan");
                break;
            case 7:
                System.out.print("Tav�an");
                break;
            case 8:
                System.out.print("Ejderha");
                break;
            case 9:
                System.out.print("Y�lan");
                break;
            case 10:
                System.out.print("At");
                break;
            case 11:
                System.out.print("Koyun");
                break;
        }
    }
}
