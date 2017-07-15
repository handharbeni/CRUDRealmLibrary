package mhandharbeni.com.firstmoduleproject;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import io.realm.RealmResults;
import mhandharbeni.com.crudrealmmodule.CRUDRealm;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = MainActivity.class.getSimpleName();
    CRUDRealm crudRealm;
    CRUDRealm crudeRealm2;

    TestModelObject testModelObject;
    TestModelObjectDua testModelObjectDua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        testModelObject = new TestModelObject();
        testModelObjectDua = new TestModelObjectDua();
        crudRealm = new CRUDRealm(getApplicationContext(), testModelObject);
        crudeRealm2 =new CRUDRealm(getApplicationContext(), testModelObjectDua);
        setContentView(R.layout.activity_main);
        initData();
        getData();
    }
    public void initData(){
        testModelObject = new TestModelObject();
        testModelObject.setId("1");
        testModelObject.setNama("Muhammad Handarbeni");
        testModelObject.setAlamat("Malang");
        crudRealm.create(testModelObject);

        testModelObjectDua = new TestModelObjectDua();
        testModelObjectDua.setId("1");
        testModelObjectDua.setAyah("ZEIN");
        testModelObjectDua.setIbu("ZEIN");
        crudeRealm2.create(testModelObjectDua);
    }
    public void getData(){
        TextView txtHello = (TextView) findViewById(R.id.txtHello);
        String nama = "";
        RealmResults resultRealm = crudRealm.read("id", "1");
        if (resultRealm.size() > 0){
            for (int i=0;i<resultRealm.size();i++){
                testModelObject = (TestModelObject) resultRealm.get(i);
                nama += testModelObject.getNama();
            }
        }
        RealmResults resultRealm2 = crudeRealm2.read("id", "1");
        if (resultRealm2.size() > 0){
            for (int i=0;i<resultRealm2.size();i++){
                testModelObjectDua = (TestModelObjectDua) resultRealm2.get(i);
                nama += testModelObjectDua.getAyah();
            }
        }
        txtHello.setText(nama);
    }
}
