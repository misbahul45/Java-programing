public class array_1 {
    public static void main(String[] args) {
        String[][] cars = new String[3][3];
        cars[2][1] = "hallo bro";

        for (int i = 0; i < cars.length; i++) {
            for(int j=0; j<cars[i].length; j++){
                if (cars[i][j] != null && cars[i][j].equals("hallo bro")) {
                    System.out.println("Mobil berada pada");
                    System.out.println("baris : "+i+"\ndan kolom : "+j);
                }       
            }   
        }

        for (String[] row : cars) {
            for (String car : row) {
                if (car != null && car.equals("hallo bro")) {
                    System.out.println(car);
                }
            }
        }


    }
}
