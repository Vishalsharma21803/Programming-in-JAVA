import java.util.*;//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = new String[3];
        for (int i = 0; i < str.length; i++) {
            System.out.println("Enter the "+(i+1)+"st"+ " name: ");
            str[i] = input.next();
        }
        String sum = "";
        for (int j = 0; j<str.length; j++) {
            sum = sum + str[j];
        }
        System.out.println(sum);

    }

}