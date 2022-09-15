import java.util.Scanner;
public class Baitapungdungdocsothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhập số cần đọc :");
        int number = scanner.nextInt();
        String docso ;
        switch (number){
            case 0 : docso = "zero"; break;
            case 1 : docso = "one"; break;
            case 2 : docso = "two"; break;
            case 3 : docso = "three"; break;
            case 4 : docso = "four"; break;
            case 5 : docso = "five"; break;
            case 6 : docso = "six"; break;
            case 7 : docso = "seven"; break;
            case 8 : docso = "eight"; break;
            case 9 : docso = "nine"; break;

            default:
                docso = "";
        }
        if (!docso.equals("")) System.out.printf("Số : "+ number+"đọc là : " + docso);
        else System.out.print("out of ability");    }
}
