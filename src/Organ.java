public class Organ {
    String name;
    String cond;

    public Organ(String name, String cond) {
        this.name = name;
        this.cond = cond;
    }

    public void status() {
        System.out.println("Name : " + this.name);
        System.out.println("Medical condition: " +this.cond );
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCond() {
        return cond;
    }

    public void setCond(String cond) {
        this.cond = cond;
    }

}
