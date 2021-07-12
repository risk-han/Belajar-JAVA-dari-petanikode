import java.util.*;

public class BangunRuang {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Masukkan sisi");

        int s = inp.nextInt();

        int luasPersegi = luasPersegi(s);

        int luasKubus = luasKubus(s);

        System.out.println("Luas Persegi dengan sisi " + s + " Adalah " + luasPersegi +
                            "\nLuas kubus dengan sisi " + s + " Adalah " + luasKubus + "\n");

    }


    static int luasPersegi(int sisi){
        return sisi * sisi;
    }

    static int luasKubus(int sisi){
        return 6 * luasPersegi(sisi);
    }

}

