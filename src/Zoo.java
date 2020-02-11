public class Zoo {
    public int animalPopulation;
    public static void main(String[] args) {
        Bear pooh = new Bear ("Pooh");
        Tiger tigger = new Tiger("Tigger");
        Unicorn rarity = new Unicorn("Rarity");
        Giraffe gemma=new Giraffe("Gemma");
        Bee stinger = new Bee("Stinger");
        Zookeeper zoebot= new Zookeeper("Zoebot");
       Animal[] animals = {tigger,pooh,rarity,gemma,stinger};
        zoebot.feedAnimals("meat", animals);
    }
//    public void eat(String name, String food){
//        System.out.println(name+" eats "+food);
//        if(favoriteFood.equals(food)){
//            System.out.println("Yum!! "+ name+ " wants more "+food);
//        } else{
//            sleep(name);
//        }
//    }
//    public void sleep(String name) {
//        System.out.println(name + " sleeps for 8 hours");
//    }
//    private String favoriteFood ="bacon";
}
