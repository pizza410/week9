package java_17_to_20;

public class Carpet {
    double cost;

    public Carpet(double cost){
        if(cost<0){
            this.cost=0;
        }
        else{
            this.cost=cost;
        }
    }
    public double getCost(){
        return cost;
    }
}
