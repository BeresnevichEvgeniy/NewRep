import java.util.Scanner;

public class NewRep {
    public static void main(String[] args) {
        String John[] = {"And", "His", "Name", "John", "Cena"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введи номер 1-6");
        int k = scanner.nextInt();
        switch (k) {
            case 1:
                for (int i = 0; i < John.length; i++)
                    System.out.print(John[i] + " ");
                break;
            case 2:
                int i = 0;
                while (i < John.length){
                    System.out.print(John[i] + " ");
                i++;}
                break;
            case 3:
                i = 0;
                do {
                    System.out.print(John[i] + " ");
                    i++;
                }
                while (i<John.length);
                break;
            case 4:
                for(String string : John){
                    System.out.print(string + " ");
                }
                break;
            case 5:
                break;
            case 6:
                break;
            default:
                System.out.println("default");
                break;
        }
    }
}