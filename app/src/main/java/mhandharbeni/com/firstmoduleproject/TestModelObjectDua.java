package mhandharbeni.com.firstmoduleproject;

import io.realm.RealmObject;

/**
 * Created by root on 15/07/17.
 */

public class TestModelObjectDua extends RealmObject {
    String id, ayah, ibu;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAyah() {
        return ayah;
    }

    public void setAyah(String ayah) {
        this.ayah = ayah;
    }

    public String getIbu() {
        return ibu;
    }

    public void setIbu(String ibu) {
        this.ibu = ibu;
    }
}
