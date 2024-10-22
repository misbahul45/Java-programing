import java.util.Random;
import java.util.Scanner;

public class java_bro_code {
    public static void main(String[] args) {
        // String message;
        // JOptionPane.showMessageDialog(null,"Welcome to My App");
        //
        // String name=JOptionPane.showInputDialog("Input your name");
        // int age=Integer.parseInt(JOptionPane.showInputDialog("Enter your age"));
        //
        // if(age>20){
        // message="Hello "+name+", nice to meet you.\nAre you still maba";
        // }else{
        // message="Hello "+name+", nice to meet you.\nAre you still can very serious
        // with your life";
        // }
        // JOptionPane.showMessageDialog(null, message);

        Scanner scanner = new Scanner(System.in);
        Random random = new Random(6);

        String[] Gunting_Batu_Kertas = { "Gunting", "Batu", "Kertas" };

        System.out.println("Play Game");
        while (true) {
            System.out.println("Menu");
            System.out.println("1. Play");
            System.out.println("2. Out");
            System.out.print("Select Menu : ");
            int selectMenu = scanner.nextInt();

            switch (selectMenu){
                case 1 ->{
                    for (int i = 0; i<Gunting_Batu_Kertas.length; i++){
                        System.out.println((i+1)+". "+Gunting_Batu_Kertas[i]);
                    }
                    System.out.print("Select Item : ");
                    int userSelect=scanner.nextInt();

                    if(userSelect>3){
                        System.out.println("please select correct number");
                    }else {
                        String userItem = Gunting_Batu_Kertas[userSelect - 1];
                        int randomNumber = random.nextInt(3);
                        String botItem = Gunting_Batu_Kertas[randomNumber];
                        if (userItem.equals(botItem)) {
                            System.out.println("Draw");
                        } else if ((userItem.equals("Gunting") && botItem.equals("Batu")) ||
                                (userItem.equals("Batu") && botItem.equals("Kertas")) ||
                                (userItem.equals("Kertas") && botItem.equals("Gunting"))) {
                            System.out.println("User Lose game");
                        } else {
                            System.out.println("User Win game");
                        }
                    }
                }
                case 2 ->{
                    return;
                }
                default -> {
                    System.out.println("Please select correct number");
                }
            }
        }
        
    }
}
