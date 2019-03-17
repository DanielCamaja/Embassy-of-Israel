package directorio.com.directorio;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }

    public void formulario_para_pasaporte(View view) {
        Intent intent = new Intent(this, Main3Activity.class);
        startActivity(intent);

    }

    public void informacion_general(View view) {
        Intent intent1 = new Intent(this, Main4Activity.class);
        startActivity(intent1);
    }

    public void informacion_comercial(View view) {
        Intent intent2 = new Intent(this, Main5Activity.class);
        startActivity(intent2);
    }

    public void tranporte(View view) {
        Intent intent3 = new Intent(this, Main6Activity.class);
        startActivity(intent3);
    }

    public void descuentos(View view) {
        Intent intent4 = new Intent(this, Main7Activity.class);
        startActivity(intent4);
    }

    public void emergencias(View view) {
        Intent intent5 = new Intent(this, Main8Activity.class);
        startActivity(intent5);
    }
}
