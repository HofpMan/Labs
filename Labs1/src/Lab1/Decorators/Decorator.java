package Lab1.Decorators;

import Lab1.AbstractImage;

public class Decorator extends AbstractImageDecorator{
    public Decorator(AbstractImage abstractImage) {
        super(abstractImage);
    }

    @Override
    public void show(){
        System.out.println("===Decorated===");
        super.show();
        System.out.println("Changed"+ abstractImage +" color and cize to\nColor: Red\nSize:18");
        System.out.println("===Decorated===");
    }
}
