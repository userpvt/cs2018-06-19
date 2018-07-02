package by.it.tumilovich.lesson1;

public class TaskC1 {
    public static void main(String[] args) {
        for (byte i = 0; i != -1; i++) {
            String binary = Integer.toBinaryString(i);
            String oct = Integer.toOctalString(i);
            String hex = Integer.toHexString(i);
            if (binary.length() > 8) binary = binary.substring(binary.length() - 8);
            binary = String.format("%8s", binary).replace(" ", "0");
            System.out.printf("%8s %4d %12s %12s %n", binary, i, oct, hex);
        }
    }
}