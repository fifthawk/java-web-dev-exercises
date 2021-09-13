package exercises.technology;



public class Computer {

    private int ram;
    private int storage;
    private boolean keyboard;

    public Computer(int storage, int ram, boolean keyboard) {
        super();
        this.ram = ram;
        this.storage = storage;
        this.keyboard = keyboard;
    }

    public void increaseRAM (int n) {
        this.ram = this.ram + n;
    }

    public void increaseStorage (int x) {
        this.storage = this.storage + x;
    }
}
