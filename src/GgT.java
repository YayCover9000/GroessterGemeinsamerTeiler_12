import java.lang.Math;
public class GgT {
    public static void main (String [] args) {
        int [] Array = new int[6];
        int zwischenEins;
        int zwischenZwei = 0;
        int zwischenZwischen;
        boolean notWhile = false;
        int einsWhile;
        int zweiWhile;
        int randomNumb;
        for (int i = 0; i < Array.length; i++) {
            randomNumb = (int)(Math.random() * 100);
            if (randomNumb == 0) {
                randomNumb =+1;
            } else if(randomNumb == 100) {
                randomNumb =-1;
            }
            Array[i] = randomNumb;
            System.out.println(Array[i]);
        }
        for (int j = 0; j < Array.length-1;) {
            zwischenEins = Array[j];
            j++;
            zwischenZwei = Array[j];
            // System.out.println("Test: " + zwischenEins + "\t" + zwischenZwei);
            einsWhile = zwischenEins;
            zweiWhile = zwischenZwei;
            // GGT Rechner
            while (!notWhile) {
                zwischenZwischen = einsWhile % zweiWhile;
                einsWhile = zweiWhile;
                zweiWhile = zwischenZwischen;
                // System.out.println("zwischenZwischen: " + zwischenZwischen);
                if (zwischenZwischen == 0) {
                    notWhile = true;
                    System.out.println("GgT von: " + zwischenEins + " und " + zwischenZwei + " ist: " + zwischenZwischen);
                }
            }
            notWhile = false;
        }

    }
}
