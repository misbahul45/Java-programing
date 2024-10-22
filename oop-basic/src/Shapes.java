public class Shapes{
    int getCorner(){
        return 0;
    }
}

class Rectangle extends Shapes{
    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        //kata kunci super juga untuk memastikan bahwa kita mengambil data dari parent baik berupa method maupun berupa variable fields
        return super.getCorner();
    }
}
