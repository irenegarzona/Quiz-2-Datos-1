package cr.ac.tec.design.prototype;

public class Deportivo extends Car{
    public int nitro;

    public Deportivo(){

    }
    public Deportivo(Deportivo target){
        super(target);
        if (target != null){
            this.nitro = this.nitro;
        }
    }
    @Override
    public Car clone(){
        return new Deportivo(this);
    }
    @Override
    public boolean equals(Object object2){
        if(!(object2 instanceof Circle) || !super.equals(object2)) return false;
        Deportivo car2 = (Car) car2;
        return car2.nitro == nitro;
    }
}
