class Animal {
    String favoriteFood;
    String name;
    static int population;
    public Animal(String name, String favoriteFood) {
        this.name = name;
        this.favoriteFood = favoriteFood;
       population++;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");

    }

    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (this.favoriteFood.equals(food)) {
            System.out.println("Yum!! " + this.name + " wants more " + food);
        } else {
            this.sleep();

        }
    }
}

