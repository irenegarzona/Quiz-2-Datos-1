package cr.ac.tec.design.prototype;

import java.util.Objects;

public abstract class Car{
    public String size;
    public String Color;
    public String marca;
}
public Car(){
}
public Cars(Circles target){
    if (target != null){
        this.size = targe.size;
        this.Color = target.Color;
        this.type = target.marca;
    }
}
public abstract shape clone();

@Override
public boolean equals(Object object2){
    if(!(object2 instanceof Car))return false;
    Car Cars2 = (Car) Car2;
}
}
