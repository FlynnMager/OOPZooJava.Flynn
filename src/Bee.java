public class Bee extends Animal{
    public Bee(String name){
        super(name, "pollen");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if (this.favoriteFood.equals(food)) {
            System.out.println("Yum!! " + this.name + " wants more " + food);
            this.sleep();
        } else {
            System.out.println("YUCK!! " + this.name + " only eats pollen. ");

        }
    }
    public void sleep() {
        System.out.println(this.name + " doesn't sleep");

    }
}
