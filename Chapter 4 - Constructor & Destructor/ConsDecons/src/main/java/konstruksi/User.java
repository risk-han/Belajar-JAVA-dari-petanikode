/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruksi;

/**
 *
 * @author acer
 */
public class User {
    public String username;
    public String password;
    
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
}

class Demo{
    public static void main(String[] args){
        User risky = new User("Risky Saputra Siahaan", "pastisukses");
        System.out.println("Username: " + risky.username);
        System.out.println("Password: " + risky.password);
    }
}
