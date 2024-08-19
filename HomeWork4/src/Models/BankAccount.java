package Models;

/**
 * Модель банковского аккаунта
 */
public class BankAccount {
    private double balance;
    private long card;

    // Конструктор по умолчанию
    public BankAccount() {
        this.balance = 1000;
        this.card = 1234567890123456L; // Пример значения карты
    }

    // Конструктор с параметрами
    public BankAccount(double balance, long card) {
        this.balance = balance;
        this.card = card;
    }

    // Геттеры и сеттеры для balance
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Геттеры и сеттеры для card
    public long getCard() {
        return card;
    }

    public void setCard(long card) {
        this.card = card;
    }

    @Override
    public String toString() {
        return "BankAccount {" +
                " card= " + String.format("%016d", card) +
                ", balance= " + balance +
                " }";
    }
}