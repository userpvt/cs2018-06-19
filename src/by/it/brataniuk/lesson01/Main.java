package by.it.brataniuk.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            String octal = Integer.toOctalString(i);
            if (octal.length() > 8) octal = octal.substring(octal.length() - 4);
            octal = String.format("%4s", octal).replace(" ", "0");
            String hex = Integer.toHexString(i);
            if (hex.length() > 8) hex = hex.substring(hex.length() - 2);
            hex = String.format("%2s", hex).replace(" ", "0");
            System.out.printf("%8s %4s %2s %2s %n", binary, octal, hex, i);
        }
    }
}
