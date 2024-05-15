public class Right_eye extends Organ{
    String clr;
    Boolean bool=true;
    public Right_eye(String name, String cond, String clr, Boolean bool) {
        super(name, cond);
        this.clr = clr;
        this.bool = bool;
    }

    public Boolean getBool() {
        return bool;
    }

    public void setBool(Boolean bool) {
        this.bool = bool;
    }

    public String getClr() {
        return clr;
    }

    public void setClr(String clr) {
        this.clr = clr;
    }
    public void isopen(int i)
    {
        if(i==1)
        {
            System.out.println("The right eye is closed\n\n");
            this.setBool(false);
        }
        else {this.setBool(true);}
    }
    @Override
    public void status() {
        super.status();
        System.out.println("Color : "+ this.getClr());

    }
}

