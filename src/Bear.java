public class Bear extends Animal{




    public Bear(String name) {
        super(name , "fish");

    }

    public void sleep() {
        System.out.println(this.name + " hibernates for 4 months");

    }

    public static void main(String[] args) {
        Bear pooh = new Bear ("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");

    }

}

