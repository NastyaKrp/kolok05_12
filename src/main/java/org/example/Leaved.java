package org.example;

public class Leaved extends State {

    Leaved(Shop shop) {
        super(shop);
        shop.setShopping(false);
    }

    @Override
    public String onLeave() {
        return "You have leaved the shop";
    }

    @Override
    public String onBuy() {
        return "You have leaved the shop";
    }

    @Override
    public String onNext() {
        return "Locked...";
    }

    @Override
    public String onPrevious() {
        return "Locked...";
    }

    @Override
    public String onTake() {
        return "Locked...";
    }

    @Override
    public String onPut() { return "Locked...";}
}
