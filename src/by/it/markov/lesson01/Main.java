package by.it.markov.lesson01;

public class Main {
    public static void main(String[] args) {
        for (byte i= -128; i!= 127; i++) {
            String binary = Integer.toBinaryString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            if (i < 0) {
                String hex = Integer.toHexString(i * (-1));
                String octal = Integer.toOctalString(i * (-1));
                System.out.printf("%8s %8d %8s %8s %n", binary, i, "-" + hex, "-" + octal);
            } else {
                String hex = Integer.toHexString(i);
                String octal = Integer.toOctalString(i);
                System.out.printf("%8s %8d %8s %8s %n", binary, i, hex, octal);
            }
        }
    }
}