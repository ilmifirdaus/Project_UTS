package id.ac.polinema.dapurku.model;

import java.io.Serializable;

public class ModelResep implements Serializable {

    Integer viewType;
    String judul, konten;

    public Integer getViewType() {
        return viewType;
    }

    public void setViewType(Integer viewType) {
        this.viewType = viewType;
    }

    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getKonten() {
        return konten;
    }
    public void setKonten(String konten) {
        this.konten= konten;
    }
}
