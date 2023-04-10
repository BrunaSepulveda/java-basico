import java.util.Locale;
import java.util.Scanner;

import entities.NumbersList;

public class App {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        NumbersList numbersList = new NumbersList(sc.nextInt());
        for(int i = 0; i < numbersList.size(); i++){
            System.out.print("Digite um número: ");
            numbersList.setNumbers(sc.nextInt(), i);
        }
        System.out.println(numbersList.nativeNumbers());
        sc.close();
    }
}
