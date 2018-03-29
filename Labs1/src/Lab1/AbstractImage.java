package Lab1;

public abstract class AbstractImage {
    protected String Color = "Grey";
    protected Integer Size  = 14;

    public void show(){
        System.out.println("In show " + this);
    }
}
