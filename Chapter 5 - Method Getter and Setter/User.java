class User{

    private String username;
    private String password;

    //ini method setter
    public void setUsername(String username){
        this.username = username;
    }

    public void setPassword(String password){
        this.password = password;
    }

    //ini method getter
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }

    public static void main(String[] args) {
        User risky = new User();
        User diaphenia = new User();

        //method setter
        risky.setUsername("RiskyCool");
        risky.setPassword("pastiSukses123");
        diaphenia.setUsername("Bella123");
        diaphenia.setPassword("EsKrim123");

        //method getter
        System.out.println("\nUsername Risky : " + risky.getUsername());
        System.out.println("Password Risky : " + risky.getPassword());
        System.out.println("Username Bella : " + diaphenia.getUsername());
        System.out.println("Password Bella : " + diaphenia.getPassword() + "\n");
    }

}