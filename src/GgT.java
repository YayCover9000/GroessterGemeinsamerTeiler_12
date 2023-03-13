import java.lang.Math;
public class GgT {
    public static void main (String [] args) {
        int [] Array = new int[6];
        int zwischenEins;
        int zwischenZwei = 0;
        for (int i = 0; i < Array.length; i++) {
            Array[i] = (int)(Math.random() * 100);
            System.out.println(Array[i]);
        }
        for (int j = 0; j < Array.length-1;) {
            zwischenEins = Array[j];
            j++;
            zwischenZwei = Array[j];
            System.out.println("Test: " + zwischenEins + "\t" + zwischenZwei);
        }

    }
}
