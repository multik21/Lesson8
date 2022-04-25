public class Animal {
    public String name;
    public int run;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public void animalInfo() {
        System.out.println();

    }

    class Cat extends Animal {

        public run;
        public int sweem;


        public Cat(String name, int run, boolean sweem) {
            this.name = name;
            this.run = run;
            this.sweem = sweem;

        }

        public void catInfo() {
            System.out.println("Имя: " + name + " /Бег: " + run + " метров/" + " /Плавание:" + sweem);
        }

        class Dog extends Animal {

            public double run;
            public int sweem;


            public Dog(String name, int run, int sweem) {
                this.name = name;
                this.run = run;
                this.sweem = sweem;
            }

            public void dogInfo() {
                System.out.println("Имя: " + name + " /Бег: " + run + " метров/" + " /Sweem:" + sweem);
            }
        }

        public class Main {
            public static void main(String[] args) {

                Animal animal = new Animal("CatsCategory");
                Cat cat = new Cat("Musia", 200, false);
                animal.animalInfo();
                cat.animalInfo();
                cat.catInfo();

                Animal animal = new Animal("Dogs");
                Dog dog = new Dog("Barsik", 500, 10);
                animal.animalInfo();
                dog.animalInfo();
                dog.dogInfo();

            }
        }
    }
}