public class Test {
public static void main(String[] a){
    Shape ab[] =new Shape[2];
    ab[0]= new Rectangle(2, 3, 4);
    ab[1] = new Circle(3, 5.54);
for(int i=0; i<ab.length; i++){
    ((Draw)ab[i]).start();
    ab[i].display();
    ((Draw)ab[i]).stop();
    System.out.println();
    System.out.println();
}

    /* 
    ((Draw)ab[0]).start();
    ab[0].display();
    ((Draw)ab[0]).stop();
    System.out.println();

    ((Draw)ab[1]).start();
    ab[1].display();
    ((Draw)ab[1]).stop();*/ 
}
}
