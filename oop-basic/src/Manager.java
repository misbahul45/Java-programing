public class Manager extends Emplooye{
    public Manager(String name) {
        super(name);   
    }

    
    void SayHello(String name){
        System.out.println("Hello, "+name+". My name is Manager "+this.name);
    }
}
