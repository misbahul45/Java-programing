
public class App {
    public static void main(String[] args) throws Exception {
        // Person person1=new Person("Muttaqin","sidayu");
        // person1.SayHello("joko");
        // person1.SayHello("joko","jakarta");

        // Manager manager=new Manager("taqin");
        // manager.SayHello("budi");

        // var vp=new VicePresident("budi");
        // vp.SayHello("bagogo");

        // Shapes shape=new Shapes();
        // System.out.println(shape.getCorner());

        // Rectangle rectangle=new Rectangle();
        // System.out.println(rectangle.getCorner());

        // System.out.println(rectangle.getParentCorner());

        //kode polymorphism
        Emplooye emplooye=new Emplooye("Misbahul Muttaqin");
        emplooye.SayHello("budi");

        emplooye=new Manager("Xninetzy");
        emplooye.SayHello("budiono siregar");

        emplooye=new VicePresident("Knixxen");
        emplooye.SayHello("Adudu");

        //method polymorphism cukup parentnya doang yang menjadi paramater
        Perkenalan(new Emplooye("Misbahul Muttaqin"));
        Perkenalan(new Manager("Knixx"));
        Perkenalan(new VicePresident("Nudi"));
    }

    static void Perkenalan(Emplooye emplooye){
        System.out.println("Perkenalkan saya"+ emplooye.name);
    }
}
