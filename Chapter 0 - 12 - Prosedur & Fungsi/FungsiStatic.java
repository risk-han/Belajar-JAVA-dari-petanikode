public class FungsiStatic {
    public static void main(String[] args) {
        //pemanggilan fungsi static
        minum(
            "Es Alpukat"
        );

        //kata kunci - Static harus instansiasi objek
        //terlebih dahulu, lalu bisa dieksekusi

        //membuat instansiasi objek bernama Risky dari class
        //Fungsi static

        FungsiStatic risky = new FungsiStatic();
        risky.makan("Nasi Goreng");
        risky.makan("Ayam Goreng");
    }

    //fungsi non-static
    void makan(String makanan){
        System.out.println("Saya sedang makan " + makanan);
    }

    //fungsi static
    static void minum(String minuman){
        System.out.println("Saya sedang minum " + minuman);
    }

}
