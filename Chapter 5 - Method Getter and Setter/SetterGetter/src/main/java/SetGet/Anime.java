/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SetGet;

/**
 *
 * @author acer
 */
class Anime {
    private String title;
    private String genre;
    private String mangaWriter;
    private String year;
    private String studio;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getMangaWriter() {
        return mangaWriter;
    }

    public void setMangaWriter(String mangaWriter) {
        this.mangaWriter = mangaWriter;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getStudio() {
        return studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }
    
    public static void main(String[] args){
        Anime kimet = new Anime();
        
        //method setter
        kimet.setTitle("Kimetsu no Yaiba");
        kimet.setGenre("Shonen, slice of life, Fictional");
        kimet.setMangaWriter("Koyaharu Gotoge");
        kimet.setStudio("Ufotable");
        kimet.setYear("2019");
        
        //method getter
        System.out.println("\nTitle : " + kimet.getTitle());
        System.out.println("Genre : " + kimet.getGenre());
        System.out.println("Mangaka : " + kimet.getMangaWriter());
        System.out.println("Studio : " + kimet.getStudio());
        System.out.println("Year : " + kimet.getYear());
        System.out.println("cek : " + kimet.genre);
    }
    
}
