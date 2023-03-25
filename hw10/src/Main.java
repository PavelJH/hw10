public class Main {
    public static void main(String[] args) {
        Herbivore cow = new Cow();
        Carnivore tiger = new Tiger();
        PublicServant firefighter = new Firefighter();

        cow.eat();
        tiger.eat();
        firefighter.talk();
        firefighter.serve();
        firefighter.work();
    }
    /*Cow is eating grass
    Tiger is eating meat
    Firefighter is talking
    Firefighter is saving lives
    Firefighter is fighting fires
    
     */

}
