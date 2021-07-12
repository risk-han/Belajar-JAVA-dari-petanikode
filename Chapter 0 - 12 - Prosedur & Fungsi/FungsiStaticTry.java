import java.util.*;

public class FungsiStaticTry {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan judul anime");
        String anime = input.nextLine();

        System.out.println("Masukkan nama Game");
        String game = input.nextLine();

        FungsiStaticTry risky = new FungsiStaticTry();
        risky.nontonAnime(anime);

        mainGame(game);
    }

    void nontonAnime(String anime){
        System.out.println("Saya sedang menonton anime " + anime);
    }

    static void mainGame(String game){
        System.out.println("Saya sedang bermain game " + game);
    }

}
