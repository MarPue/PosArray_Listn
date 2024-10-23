// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //   Uebung 1
        float[] fa = new float[5];
        fa[0] =10;  fa[2] =10;  fa[4] =10;
        PrintArray(fa);
        System.out.println();
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
        //------------------------------------------------
        // Uebung 4

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
