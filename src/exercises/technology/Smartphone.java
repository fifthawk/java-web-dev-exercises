package exercises.technology;

public class Smartphone extends Computer {

    private int selfies;

    public Smartphone(int storage, int ram, boolean keyboard, int selfies) {
        super(storage, ram, keyboard);
        this.selfies = selfies;
    }

    public void takeSelfie() {
        this.selfies = this.selfies + 1;
    }

    public int getNumberOfSelfies() {
        return this.selfies;
    }
}
