package model;

public class User {
    //Atributos 
    private String userName;
    private String userPass;
    private String userCpf;

    //Método Construtor!
    public User(String user,String pass){
        this.userName=user;
        this.userPass=pass;  
    }
    
    //Getter & Setters
    public String getuserName(){
        return this.userName;
    }
    
    public void setUserName(String user){
        this.userName=user;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserCpf() {
        return userCpf;
    }

    public void setUserCpf(String userCpf) {
        this.userCpf = userCpf;
    }
    
    //toString=método para representação geral do objeto

    @Override
    public String toString() {
        return "Nome" +userName+"<br> userCPF"+ userCpf;
    }
    
    //Métodos Gerais
    public boolean isLogged(){
        return(this.userName.equals("donini")
                &&this.userPass.equals("senha1234"));
    }
}//Fim da Classe!