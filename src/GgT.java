import java.lang.Math;
public class GgT {
    public static void main (String [] args) {
        int [] Array = new int[6];
        int zwischenEins;
        int zwischenZwei;
        int zwischenZwischen = 0;
        int einsWhile;
        int zweiWhile;
        int randomNumb;
        for (int i = 0; i < Array.length; i++) {
            randomNumb = (int)(Math.random() * 100);
            if (randomNumb == 0) {
                randomNumb = 1;
            } else if(randomNumb == 100) {
                randomNumb =- 1;
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
            while (zweiWhile != 0) {
                if (einsWhile > zweiWhile) {
                    einsWhile = einsWhile - zweiWhile;
                } else {
                    zweiWhile = zweiWhile - einsWhile;
                }
                zwischenZwischen = einsWhile;
            }
            System.out.println("GgT von: " + zwischenEins + " und " + zwischenZwei + " ist: " + zwischenZwischen);

        }

            /* diese Methode gibt nicht den GgT zurück
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
            notWhile = false; */

    }
}
