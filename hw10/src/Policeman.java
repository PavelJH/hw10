public class Policeman extends PublicServant {
    @Override
    public void talk() {
        System.out.println("Policeman is talking");
    }

    @Override
    public void work() {
        System.out.println("Policeman is fighting crime");
    }

    @Override
    public void serve() {
        System.out.println("Policeman is enforcing the law");
    }
}
