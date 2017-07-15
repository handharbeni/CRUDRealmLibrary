package mhandharbeni.com.firstmoduleproject;

import io.realm.RealmObject;

/**
 * Created by root on 14/07/17.
 */

public class TestModelObject extends RealmObject {
    String id, nama, alamat;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }
}
