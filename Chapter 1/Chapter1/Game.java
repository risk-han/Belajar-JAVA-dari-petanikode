package Chapter1;

public class Game {
    public static void main(String[] args) {
        // membuat objek player

        Player petani = new Player();

        // mengisi atribut player
        petani.name = "Risky Saputra";
        petani.speed = 78;
        petani.healthPoin = 0;
        
        //menjalankan method
        petani.run();

        if(petani.isDead()){
            System.out.println("Game Over!");
        }

    }
}
