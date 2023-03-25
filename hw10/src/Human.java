public abstract class Human {
    public abstract void talk();
}

public abstract class Worker extends Human {
    public abstract void work();
}

public abstract class PublicServant extends Worker {
    public abstract void serve();
}

public class Firefighter extends PublicServant {
    @Override
    public void talk() {
        System.out.println("Firefighter is talking");
    }

    @Override
    public void work() {
        System.out.println("Firefighter is fighting fires");
    }

    @Override
    public void serve() {
        System.out.println("Firefighter is saving lives");
    }
}

public class Doctor extends Worker {
    @Override
    public void talk() {
        System.out.println("Doctor is talking");
    }

    @Override
    public void work() {
        System.out.println("Doctor is treating patients");
    }
}
