package com.maxescobar.scrollviewvistadedesplazamiento;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Metodo para
    public void Seleccion(View vista){

        //Estructura de control

        if (vista.getId() == R.id.ibBananas)
                Toast.makeText(this, "Son bananas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibCerezas)
                Toast.makeText(this,"Son Cerezas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() == R.id.ibFranguezas)
                Toast.makeText(this,"Son Franguezas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() == R.id.ibFresas)
                Toast.makeText(this,"Son Fresas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibKiwi)
                Toast.makeText(this,"Son Kiwi!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibMangos)
                Toast.makeText(this,"Son Mangos!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibManzanas)
                Toast.makeText(this,"Son Manzanas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() == R.id.ibMelon)
                Toast.makeText(this,"Son Melones!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibNaranjas)
                Toast.makeText(this,"Son Naranjas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibPeras)
                Toast.makeText(this,"Son Peras!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() == R.id.ibPinias)
                Toast.makeText(this,"Son Piñas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() == R.id.ibSandia)
                Toast.makeText(this,"Son Sandias!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibUvas)
                Toast.makeText(this,"Son Uvas!!", Toast.LENGTH_SHORT).show();
        if (vista.getId() ==  R.id.ibZarzamora)
                Toast.makeText(this,"Son Zarzamoras!!", Toast.LENGTH_SHORT).show();
    }
}