package Lab1.Decorators;

import Lab1.AbstractImage;

public class AbstractImageDecorator extends AbstractImage{
    AbstractImage abstractImage;
    AbstractImageDecorator(AbstractImage abstractImage){
        this.abstractImage = abstractImage;
    }
}
