import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class FungsiProsedurArray {
    static ArrayList listBuah = new ArrayList();
    static boolean isRunning = true;
    static InputStreamReader inputStreamReader = new InputStreamReader(System.in);
    static BufferedReader input = new BufferedReader(inputStreamReader);
    /**
     * Variabel listBuah adalah variabel global
     *  untuk menyimpan nama-nama buah.
        Variabel isRunning adalah variabel 
        global untuk membuat loop.
        Kemudian inputStreamReader dan
        input adalah objek yang kita butuhkan untuk mengambil input dari keyboard.
     */

     static void showMenu() throws IOException {
        System.out.println("========= MENU ========");
        System.out.println("[1] Show All Buah");
        System.out.println("[2] Insert Buah");
        System.out.println("[3] Edit Buah");
        System.out.println("[4] Delete Buah");
        System.out.println("[5] Exit");
        System.out.print("PILIH MENU> ");

        int selectedMenu = Integer.valueOf(input.readLine());

        switch(selectedMenu){
            case 1:
                showAllBuah();
                break;
            case 2:
                insertBuah();
                break;
            case 3:
                editBuah();
                break;
            case 4:
                deleteBuah();
                break;
            case 5:
                System.exit(0);
                break;
            default:
                System.out.println("Pilihan salah!");
        }
     }

    static void showAllBuah(){
        if(listBuah.isEmpty()){
            System.out.println("Belum ada Buah");
        }else{
            //tampilkan semua buah
            for(int i = 0; i < listBuah.size(); i++){
                System.out.println(String.format("[%d] %s", i, listBuah.get(i)));
            }
        }
    }

    static void insertBuah() throws IOException{
        System.out.println("Nama Buah: ");
        String namaBuah = input.readLine();
        listBuah.add(namaBuah);
    }

    static void editBuah() throws IOException{
        showAllBuah();
        System.out.print("Pilih nomor buah: ");
        int indexBuah = Integer.valueOf(input.readLine());

        System.out.print("Nama Baru: ");
        String namaBaru = input.readLine();

        //ibah nama buah
        listBuah.set(indexBuah, namaBaru);
    }

    static void deleteBuah() throws IOException{
        showAllBuah();
        System.out.println("Pillih nomor buah: ");
        int indexBuah = Integer.valueOf(input.readLine());
        //hapus buah
        listBuah.remove(indexBuah);
    }

    public static void main(String[] args) throws IOException {
        do{
            showMenu();
        }while (isRunning);
    }

}
