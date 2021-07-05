package view;

import model.Wallet;

public class Vista {
    public static void main(String[] args) {
        Wallet wallet1 = new Wallet(true);
        Wallet wallet2 = new Wallet(false);
        wallet1.putSaldo(600000);
        System.out.println(wallet1.getSalgo());
        wallet2.putSaldo(600000);
        System.out.println(wallet2.getSalgo());

    }
}
