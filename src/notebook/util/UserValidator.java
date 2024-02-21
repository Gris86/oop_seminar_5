package notebook.util;
import java.util.Scanner;

public class UserValidator {

    public String validate(String msg) {
        System.out.print(msg);
        Scanner in = new Scanner(System.in);
        String field = in.next();
        if (field.isEmpty()) {
            in.close();
            throw new IllegalArgumentException("Введены не корректные данные");
        }
        field = field.replaceAll(" ", "").trim();
        in.close();
        return field;
    }
}
