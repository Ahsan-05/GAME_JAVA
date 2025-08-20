public class Thor {
   private int  Lighting;
    public Thor(){
       Lighting=1000 ;
    }
    public int getincreased(){
        Lighting +=100;
        return Lighting;
    }
    public int getdecreased(){
        Lighting -=100;
        return Lighting;
    }
    public String toString(){
       return "Lighting = "+ Lighting;
    }
}

