package model;

public class Wallet {
    public static final int LIMITE_BILLETERA = 500000;

    private int saldo;
    private boolean tieneLimite;

    public Wallet (boolean limite) {
        super();
        saldo = 0;
        tieneLimite = limite;
    }
    public int getSalgo(){
        return saldo;
    }
    public String putSaldo(int valor){
        if(saldo + valor > LIMITE_BILLETERA && tieneLimite){
            return "no se puede superar el limite";
        }
        saldo += valor;
        return "Operacion exitosa, nuevo saldo " + saldo;
    }
}

