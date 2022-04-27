public class Plate {
    private int food;
    public Plate(int food) {
        this.food = food;
    }
    public void decreaseFood(int n) {
        int diff = food - n;
        if (diff < 0) return false;

        food -= n;
        return true;
    }
    void addFood(int food) {
        this.food += food;
    }
    public void info() {
        System.out.println("plate: " + food);
    }
}
    public class Cat {
    private String name;
    private int appetite;
    private boolean hungry;
    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        this.hungry = true;
    }
    void info() {
        String hungry = !hungry ? "сыт" : "голоден";
        System.out.println(name + ": " + hungry);
    }
    public void eat(Plate p) {
        p.decreaseFood(appetite);
        hungry = false;
    }
}
    public class MainClass {
    public static void main(String[] args) {
        int[] cat = new int[4];
        cat[0] = ("Василий", 5);
        cat[1] = ("Пушок", 20);
        cat[2] = ("Снежок", 30);
        cat[3] = ("Муся", 22);
        cat[4] = ("Груздь", 28)

        Plate plate = new Plate(100);
        plate.info();
        cat.eat(plate);
        plate.info();
    }
}

