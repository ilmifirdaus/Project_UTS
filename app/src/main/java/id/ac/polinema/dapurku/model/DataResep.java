package id.ac.polinema.dapurku.model;

public class DataResep {
    String judul, konten, image;

    public DataResep(String judul, String image) {
        this.judul = judul;
        this.image = image;
    }

    public DataResep(String judul, String konten, String image) {
        this.judul = judul;
        this.konten = konten;
        this.image = image;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getJudul() {
        return judul;
    }

    public String getKonten() {
        return konten;
    }

    public void setKonten(String konten) {
        this.konten = konten;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }
}
