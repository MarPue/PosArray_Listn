import java.awt.*;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import  java.math.RoundingMode;

import static java.lang.Math.round;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //   Uebung 1
        float[] fa = new float[5];
        fa[0] =10;  fa[2] =10;  fa[4] =10;
        PrintArray(fa);
        System.out.println("\n");
        //------------------------------------------------
        //   Uebung 2
        int[] a = new int[] {0,8,15};
        PrintArrayInline(a);
        //------------------------------------------------
        // Uebung 3
        int[] foo = new int[] {5, 45 , -10,20 };
        int aFoo = foo[0] + foo[1];
        int bFoo = foo[2] + foo[3];
        System.out.print("\n" + aFoo + "\n" + bFoo );
        System.out.println("\n");
        //------------------------------------------------
        // Uebung 4
        int [] bar = new int[] {2,4,6};
        bar[2] = bar[0] * bar[1];
        for (int i = 0; i < bar.length; i++){
            System.out.print(bar[i]+"\t");
        }
        System.out.println("\n");
        //------------------------------------------------
        // Uebung 5 -> Mittelwert berechnen
        int [] ganzZahlen1 = new int[] {2,3,7,1,4,7};
        int [] ganzZahlen2 = new int[] {2,3,7,1,4,8};
        Mittelwert(ganzZahlen1, ganzZahlen2);
        System.out.println("\n");
        //------------------------------------------------
        // Uebung 6 -> Array umkehren
        int[] arrayUmkheren = new int[] {2,5,1,8,6};
        ArrayUmkehren(arrayUmkheren);
        System.out.println("\n");
        //------------------------------------------------
        // Uebung 7 -> Elemente verdoppeln
        int[] arrayMulti1 = new int[] {1,3,5};
        int[] arrayMulti2 = new int[] {2,5,7};
        int[] arrayMulti3 = new int[] {-3,4,8};
        int[] arrayMulti4 = new int[] {1,2,3,4,5};
        MultiplyArray(arrayMulti1,arrayMulti2,arrayMulti3,arrayMulti4);
        System.out.println("\n");
        //------------------------------------------------
        // Uebung 8 -> One-Hot-Encoding als Array

        //------------------------------------------------
        // Uebung 9 -> Befüllen

        //------------------------------------------------
        // Uebung 10 ->  Befüllen von zwei Arrays
    }
    static void MultiplyArray(int[]arrayMulti1,int[]arrayMulti2,int[]arrayMulti3,int[]arrayMulti4){
        System.out.print("Array 1 = ");
        for (int i = 0; i < arrayMulti1.length ; i++){
            System.out.print(arrayMulti1[i] +" ");
        }
        System.out.print("\tFaktor = 2\t->  ");
        for (int i = 0; i < arrayMulti1.length ; i++){
            System.out.print(arrayMulti1[i] * 2 +" ");
        }
        System.out.println();
        System.out.print("Array 2 = ");
        for (int i = 0; i < arrayMulti2.length ; i++){
            System.out.print(arrayMulti2[i] +" ");
        }
        System.out.print("\tFaktor = 10\t-> ");
        for (int i = 0; i < arrayMulti2.length ; i++){
            System.out.print(arrayMulti2[i] * 10 +" ");
        }
        System.out.println();
        System.out.print("Array 3 = ");
        for (int i = 0; i < arrayMulti3.length ; i++){
            System.out.print(arrayMulti3[i] +" ");
        }
        System.out.print("\tFaktor = 1\t-> ");
        for (int i = 0; i < arrayMulti3.length ; i++){
            System.out.print(arrayMulti3[i] * 1 +" ");
        }
        System.out.println();
        System.out.print("Array 4 = ");
        for (int i = 0; i < arrayMulti4.length ; i++){
            System.out.print(arrayMulti4[i] +" ");
        }
        System.out.print("\tFaktor = 0\t-> ");
        for (int i = 0; i < arrayMulti4.length ; i++){
            System.out.print(arrayMulti4[i] * 0 +" ");
        }
    }
    static  void ArrayUmkehren(int[] arrayUmkheren){
        for(int i = 0; i < arrayUmkheren.length; i++){
            System.out.print(arrayUmkheren[i]+ " ");
        }
        System.out.println("\n");
        for(int i = arrayUmkheren.length; i <= arrayUmkheren.length ; i--){
            if(i > 0)
                System.out.print(arrayUmkheren[i -1]+ " ");
        }
    }
    static void Mittelwert(int[] ganzZahlen1, int[] ganzZahlen2){
        int mittelWert1 = 0;
        double mittelWert2 = 0;
        for (int i = 0; i < ganzZahlen1.length; i++){
            mittelWert1 += ganzZahlen1[i];
            System.out.print(ganzZahlen1[i]+" ");
        }
        System.out.println("\nMittelwert = " + mittelWert1 / ganzZahlen1.length +"\n");

        // --------------------------------
        for (int i = 0; i < ganzZahlen2.length; i++){
            mittelWert2 += ganzZahlen2[i];
            System.out.print(ganzZahlen2[i] +" ");
        }
        mittelWert2 = mittelWert2 / ganzZahlen2.length;
        DecimalFormat df = new DecimalFormat("#.#####");
        System.out.println("\nMittelwert = " + df.format(mittelWert2)+"\n");
    }
    static void PrintArray( float[] fa){
        for (int i = 0; i < fa.length ; i++){
            System.out.print(fa[i]+"\t ");
        }
    }
    static void PrintArrayInline(int[] a){
        for (int i = 0; i < a.length; i++){
            System.out.print(a[i]+"\t");
        }
    }
}
