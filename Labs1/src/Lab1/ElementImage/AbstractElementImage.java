package Lab1.ElementImage;

import Lab1.AbstractImage;

public abstract class AbstractElementImage extends AbstractImage{
    protected String Shape;

    @Override
    public void show(){
        super.show();
        System.out.println(Shape + " image \ncolor: " + Color + ";\nsize : " + Size + ";");
    }
}
