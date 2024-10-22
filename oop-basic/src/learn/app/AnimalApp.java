package learn.app;

import learn.data.Cat;

/*
 * untuk menerapkan interface di kelas java maka harus menggunakan kata kunci implemenst
 * kemudian jika ingin inheritence antar interface maka harus menggunakan extends
 * jika method yang ada di interface dikasi kata kunci awal default atau do TS dikasih tanda tanya maka itu boleh iya boleh nggak
*/

public class AnimalApp {
    public static void main(String[] args) {
        var cat=new Cat();
        cat.run("pussy");
    }
}
