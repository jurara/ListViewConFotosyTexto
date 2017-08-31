package com.example.jurara.fotos;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private String lenguajeProgramacion[]=new String[]{"GALINDO DELGADO DONADONY DONAJI","CARO LOPEZ LUIS RICARDO","RAMIREZ GARCIA JUAN RAMON","ESPINO SERRANO CESAR RAMSES","FREGOSO CORONA JESÚS EDUARDO","HERNANDEZ SANDOVAL ABRIL YARELI","SANCHEZ JIMENEZ ANA PATRICIA","TEJEDA MORA CESAR","JIMENEZ ORTIZ JUAN DANIEL","RODRIGUEZ ADAME OLIVER GIOVANNY"};
    private String nc_c[]=new String[]{"13400408 - ISC","13400395 - ISC","13400478 - ISC","13400402 - ISC","13400405- ISC","13400430 - ISC","13400491 - ISC","13401105 - ITIC","13400436 - ISC","13400507 - ISC"};
    private Integer[] imgid={
            R.drawable.chi1,
            R.drawable.chi2,
            R.drawable.chi3,
            R.drawable.chi4,
            R.drawable.chi5,
            R.drawable.chi6,
            R.drawable.chi7,
            R.drawable.chi8,
            R.drawable.chi9,
            R.drawable.chi10
    };

    private ListView lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LenguajeListAdapter adapter=new LenguajeListAdapter(this,lenguajeProgramacion,imgid);
        lista=(ListView)findViewById(R.id.mi_lista);
        lista.setAdapter(adapter);
        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String Slecteditem= lenguajeProgramacion[+position];
                Toast.makeText(getApplicationContext(), Slecteditem, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
