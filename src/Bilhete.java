import java.util.Random;

public class Bilhete {

    long codBilhete;
    double saldo;
    static final double tarifaBase = 5.20;
Usuario usuario;


public Bilhete(Usuario usuario){

    Random rd = new Random();
    this.codBilhete = rd.nextInt(1000, 10000);
    this.usuario = usuario;

}//bilhete

//metodo para carregar o bilhete
    public double carregarBilhete (double valor){
    saldo += valor;
    return saldo;
    }//metodo para carregar o bilhete


// metodo para consultar o saldo do bilhete
    public double consultar(){
    return saldo;
    } // metodo para consultar o saldo do bilhete


//metodo para simular a passagem na catraca
    public String simulacao(){
    double debito = tarifaBase/2;
    if (usuario.tipo.equalsIgnoreCase("comum")){
        debito = tarifaBase;
    }//if
    if (saldo >=debito){
        saldo -=debito;
        return "passagem liberada";
    }
    return "Saldo insuficiente";


    }//metodo para simular a passagem na catraca




}//class
