public class Tiger extends Animal {

    public Tiger(String name) {
        super(name,"meat");

    }
    public static void main(String[] args) {
        //make and run a main method
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");

    }

}
