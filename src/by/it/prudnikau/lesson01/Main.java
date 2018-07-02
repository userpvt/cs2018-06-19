

import java.util.Formatter;

/*
 * Доработайте ее так, чтобы кроме этих двух представлений были еще 8-
 * ричные и 16-ричные числа для типа данных byte, а вывод был от -128 до
 * 127). Для этого найдите аналоги метода Integer.toBinaryString
 */
public class Main {

    public static void main(String[] args) {
        Formatter f = new Formatter();
        for (byte i = -128; i != 127; i++) {
            String binary = Integer.toBinaryString(i);
            f.format("Hex: %x, Octal: %o", i, i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.print(binary + " ");
            System.out.print(f);
            System.out.print(" " + i + "\n");
            f = new Formatter();

        }

    }
}
