import java.util.Scanner;

public class Heart extends Organ{
    int heart_rate ;

    public Heart(String name, String cond, int heart_rate) {
        super(name, cond);
        this.heart_rate = heart_rate;
    }

    public int getHeart_rate() {
        return heart_rate;
    }

    public void setHeart_rate(int heart_rate) {
        this.heart_rate = heart_rate;
    }

    public void change_HR(int HR)
    {
        if(HR==1)
        {
            System.out.println("Enter new heart rate ");
            Scanner sc =new Scanner(System.in);
            int new_HR=sc.nextInt();
            System.out.println("Heart rate changed to: "+ new_HR+"\n");
        }
    }

    @Override
    public void status() {
        super.status();
        System.out.println("Heart rate : "+this.getHeart_rate());
        }
    }

