package Inner_Class;

class Outer{
    
    int x = 10;

    class Inner{
        int y = 20;
        public void innerDisplay(){
            System.out.println(x +" "+ y);
        }
    }

    public void outerDisplay(){
        Inner i = new Inner();
        i.innerDisplay();
        System.out.println(i.y);

    }
}

public class nestedClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.outerDisplay();

        Outer.Inner oi = new Outer().new Inner();   //- This is the method to access inner class in the outside class 
        oi.innerDisplay();
    }
}
