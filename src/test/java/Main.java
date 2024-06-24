import icu.pymil_blog.terminal.Terminal;
import icu.pymil_blog.user.User;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User courrntUser = new User();
        Scanner scanner = new Scanner(System.in);
        Terminal terminal = new Terminal(courrntUser);
        boolean isExit = false;

        while (!isExit) {
            terminal.info();
            String input = scanner.nextLine().trim();
            // System.out.println(input);
            if (input.equals("exit")) {
                isExit = true;
            } else {
                // System.out.print("\n");
                System.out.println(terminal.input(input));
            }
        }
    }
}
