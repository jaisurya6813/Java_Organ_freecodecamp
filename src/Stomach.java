public class Stomach extends Organ{
    public Stomach(String name, String cond) {
        super(name, cond);
    }

    public void digest(int i)
    {
        if(i==1)
        {
            System.out.println("Digestion begins ...");
        }
    }
    @Override
    public void status() {
        super.status();
        System.out.println("Need to be fed");
    }
}
