public abstract class Animal {
    public abstract void eat();
}

public abstract class Herbivore extends Animal {
    public abstract void eatPlants();
}

public abstract class Carnivore extends Animal {
    public abstract void eatMeat();
}

public class Cow extends Herbivore {
    @Override
    public void eat() {
        System.out.println("Cow is eating grass");
    }

    @Override
    public void eatPlants() {
        System.out.println("Cow is eating grass");
    }
}

public class Goat extends Herbivore {
    @Override
    public void eat() {
        System.out.println("Goat is eating grass");
    }

    @Override
    public void eatPlants() {
        System.out.println("Goat is eating grass");
    }
}

public class Tiger extends Carnivore {
    @Override
    public void eat() {
        System.out.println("Tiger is eating meat");
    }

    @Override
    public void eatMeat() {
        System.out.println("Tiger is eating meat");
    }
}
