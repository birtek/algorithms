package othrerAlghoritms;

public class Fibbonacci {

    public static int fiboRecu(int a){
        if(a < 2){
            return a;
        }
        return fiboRecu(a-1) + fiboRecu(a-2);
    }

    public static int fibodynamic(int a){
        if(a < 2){
            return a;
        }

        int [] fibbo = new int[a];
        fibbo[0] = 1;
        fibbo[1] = 1;

        for (int i = 2; i < a; i++) {
            fibbo[i] = fibbo[i-1] + fibbo[i -2];
        }
        return fibbo[a-1];
    }

}
