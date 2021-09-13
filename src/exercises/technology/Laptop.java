package exercises.technology;

public class Laptop extends Computer {
    private double weight;

    public Laptop(int ram, int storage, boolean keyboard, double weight) {
    super(ram, storage, keyboard);
    this.weight = weight;
}

    public boolean heavy(){
        if(weight > 5.0){
            return true;
        } else {
            return false;
        }
    }
    }
