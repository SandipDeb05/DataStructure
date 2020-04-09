package Lists;
public class Pair<A, B>{
    A X;
    B Y;
    public Pair(A X, B Y){
        this.X = X;
        this.Y = Y;
    }
    public void getDescription(){
        System.out.println(X+", "+Y);
    }
}

