# 12 Größter gemeinsamer Teiler

Verfügbar von: Donnerstag, 1. Dezember 2022, 14:54

Maximale Anzahl an Dateien: 1

Arbeitstyp: Einzelarbeit

## Schreiben Sie ein Programm mit folgenden Komponenten:
> #### main-Methode*
>Klassenbezeichnung GgT

#### Aufgabe
1. Initialisieren Sie ein Array für n ganze, zufällige Zahlen im Wertebereich von 0
   bis 100 (ausschließlich). 

    Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math.

2. Rufen Sie für jedes aufeinander folgende Paar des Arrays 

   (1. Element und 2. Element, 2. Element
   und 3. Element, 3. Element und 4. Element usw.)  
   die Methode zum Berechnen des größten gemeinsamen Teilers auf.
3. Geben Sie jeweils das Paar und den größten gemeinsamen Teiler dabei aus.
   Methode zum Berechnen des größten gemeinsamen Teilers
   >#### Methodenkopf: 
   > public static int berechneGgt(int zahl1, int zahl2)

### Aufgabe:

Berechnung des größten gemeinsamen Teilers von 2 Zahlen rekursiv
(vgl. Algorithmus in den Folien der Vorlesung).
>#### Ausgabeformat
>Der ggt fuer X1 und Y1 lautet: Z1
> 
>Der ggt fuer X2 und Y2 lautet: Z2
> 
>Der ggt fuer X3 und Y3 lautet: Z3
 

>Weitere Hinweise
Hinweis
Bitte achten Sie auf die genaue Schreibweise der vorgegebenen Klassen- und
Methodennamen.

>Hinweis
Sollten Sie mit der Scanner-Klasse arbeiten,
instanziieren Sie Ihren Scanner bitte ganz zu Beginn Ihrer Methode.
> 
>Das Ausführen der Methode darf nicht zu einem Programmabsturz führen, wenn keine Zahlen
erzeugt werden (also die Eingabe "0" lautet)