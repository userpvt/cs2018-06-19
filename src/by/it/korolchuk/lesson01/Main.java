package by.it.korolchuk.lesson01;

public class Main {
    public static void main(String[] args) {

        for (byte i = Byte.MIN_VALUE; i <= Byte.MAX_VALUE; i++) {

            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");

            String octal = Integer.toOctalString(i);
            if (octal.length() > 8) octal = octal.substring(octal.length() - 8);
            octal = String.format("%8s", octal).replace(" ", "0");

            String hex = Integer.toHexString(i);
            if (hex.length() > 8) hex = hex.substring(hex.length() - 8);
            hex = String.format("%8s", hex).replace(" ", "0");

            System.out.printf("%8s %n", binary + "\t" + octal + "\t" + hex + "\t" + i);


            if (i == Byte.MAX_VALUE) {
                break;
            }
        }

    }

}
