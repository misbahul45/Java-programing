package components;

public class Buku {
    private String judul;
    private String penulis;
    private int tahun;
    private String[] category;

    public Buku(String judul, String penulis, String[] category, int tahun) {
        this.judul = judul;
        this.penulis = penulis;
        this.tahun = tahun;
        this.category = category;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public int getTahun() {
        return tahun;
    }

    public void setTahun(int tahun) {
        this.tahun = tahun;
    }

    public String getCategory() {
        String categories = "";
        for (int i = 0; i < this.category.length; i++) {
            if (i == 0) {
                categories += this.category[i];
            } else if (i == this.category.length - 1) {
                categories += this.category[i] + ".";
            } else {
                categories += this.category[i] + ", ";
            }
        }
        return categories;
    }

    public void setCategory(String[] category) {
        this.category = category;
    }

    @Override
    public String toString() {
        StringBuilder categories = new StringBuilder();
        for (String category : this.category) {
            categories.append(category).append(", ");
        }
        return "{\n\t  Judul : " + this.judul + "\n\t  Penulis : " + this.penulis + "\n\t  Tahun : " + this.tahun
                + "\n\t  Category : "
                + categories.toString() + "\n}";
    }

}
