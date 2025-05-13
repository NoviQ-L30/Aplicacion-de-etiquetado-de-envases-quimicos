package com.example.proyectoindividual;// Importa las bibliotecas necesarias
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.os.Bundle;
import android.os.Environment;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ImageView;



import androidx.appcompat.app.AppCompatActivity;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;

public class Nueva_ventana extends AppCompatActivity {

    private ImageView checkBox1Image, checkBox2Image, checkBox3Image , checkBox4Image, checkBox5Image, checkBox6Image, checkBox7Image, checkBox8Image, checkBox9Image;

    private Button buttonGenerarEtiqueta;
    private LinearLayout linearLayoutMarco;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.nueva_ventana); // Reemplaza con el nombre correcto de tu archivo XML
        // Obtener los datos de Intent extras
        Intent intent = getIntent();
        String formula = intent.getStringExtra("FORMULA");
        String nombre = intent.getStringExtra("NOMBRE");
        String masaMolar = intent.getStringExtra("MASA MOLAR");
        String concentracion = intent.getStringExtra("CONCENTRACION");
        String fecha = intent.getStringExtra("FECHA");
        String proposito = intent.getStringExtra("PROPOSITO");
        String preparadorPor = intent.getStringExtra("PREPARADO POR");

        // Crear dinámicamente vistas para representar los datos
        LinearLayout linearLayout = findViewById(R.id.linearLayoutN2); // Id del LinearLayout en tu layout de PrevisualizacionActivity

        // Crear TextView para la fórmula y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewFormula = new TextView(this);
        textViewFormula.setText("Fórmula: " + formula);
        LinearLayout.LayoutParams layoutParamsFormula = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsFormula.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewFormula.setLayoutParams(layoutParamsFormula);
        linearLayout.addView(textViewFormula);

        // Crear TextView para el nombre y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewNombre = new TextView(this);
        textViewNombre.setText("Nombre: " + nombre);
        LinearLayout.LayoutParams layoutParamsNombre = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsNombre.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewNombre.setLayoutParams(layoutParamsNombre);
        linearLayout.addView(textViewNombre);

        // Crear TextView para la masa molar y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewMasaMolar = new TextView(this);
        textViewMasaMolar.setText("Masa Molar: " + masaMolar);
        LinearLayout.LayoutParams layoutParamsMasaMolar = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsMasaMolar.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewMasaMolar.setLayoutParams(layoutParamsMasaMolar);
        linearLayout.addView(textViewMasaMolar);

        // Crear TextView para la concentración y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewConcentracion = new TextView(this);
        textViewConcentracion.setText("Concentración: " + concentracion);
        LinearLayout.LayoutParams layoutParamsConcentracion = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsConcentracion.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewConcentracion.setLayoutParams(layoutParamsConcentracion);
        linearLayout.addView(textViewConcentracion);

        // Crear TextView para la fecha y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewFecha = new TextView(this);
        textViewFecha.setText("Fecha: " + fecha);
        LinearLayout.LayoutParams layoutParamsFecha = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsFecha.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewFecha.setLayoutParams(layoutParamsFecha);
        linearLayout.addView(textViewFecha);

        // Crear TextView para el propósito y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewProposito = new TextView(this);
        textViewProposito.setText("Propósito: " + proposito);
        LinearLayout.LayoutParams layoutParamsProposito = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsProposito.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewProposito.setLayoutParams(layoutParamsProposito);
        linearLayout.addView(textViewProposito);

        // Crear TextView para el preparador y agregarlo al LinearLayout con margen en la parte inferior
        TextView textViewPreparadorPor = new TextView(this);
        textViewPreparadorPor.setText("Preparado por: " + preparadorPor);
        LinearLayout.LayoutParams layoutParamsPreparadorPor = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
        layoutParamsPreparadorPor.setMargins(0, 0, 0, 16); // 16dp de margen inferior
        textViewPreparadorPor.setLayoutParams(layoutParamsPreparadorPor);
        linearLayout.addView(textViewPreparadorPor);


        // Obtener los valores de las imagenes seleccionadas del Intent
        int imagen1 = getIntent().getIntExtra("IMAGEN1", 0);
        int imagen2 = getIntent().getIntExtra("IMAGEN2", 0);
        int imagen3 = getIntent().getIntExtra("IMAGEN3", 0);
        int imagen4 = getIntent().getIntExtra("IMAGEN4", 0);
        int imagen5 = getIntent().getIntExtra("IMAGEN5", 0);
        int imagen6 = getIntent().getIntExtra("IMAGEN6", 0);
        int imagen7 = getIntent().getIntExtra("IMAGEN7", 0);
        int imagen8 = getIntent().getIntExtra("IMAGEN8", 0);
        int imagen9 = getIntent().getIntExtra("IMAGEN9", 0);

// Ahora puedes utilizar las variables imagen1, imagen2, ..., imagen9 en tu actividad Nueva_ventana


        checkBox1Image = findViewById(R.id.imageView1);
        checkBox2Image = findViewById(R.id.imageView2);
        checkBox3Image = findViewById(R.id.imageView3);
        checkBox4Image = findViewById(R.id.imageView4);
        checkBox5Image = findViewById(R.id.imageView5);
        checkBox6Image = findViewById(R.id.imageView6);
        checkBox7Image = findViewById(R.id.imageView7);
        checkBox8Image = findViewById(R.id.imageView8);
        checkBox9Image = findViewById(R.id.imageView9);

        // Revisa si la primera posición del array imagenesSeleccionadas es 1
        if (imagen1 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox1Image.setImageResource(R.drawable.inflamable);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox1Image.setImageResource(R.drawable.defaults);
        }

        if (imagen2 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox2Image.setImageResource(R.drawable.explosion);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox2Image.setImageResource(R.drawable.defaults);
        }

        if (imagen3 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox3Image.setImageResource(R.drawable.incendio_peor);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox3Image.setImageResource(R.drawable.defaults);
        }

        if (imagen4 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox4Image.setImageResource(R.drawable.caliente_explosion);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox4Image.setImageResource(R.drawable.defaults);
        }

        if (imagen5 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox5Image.setImageResource(R.drawable.quemadura);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox5Image.setImageResource(R.drawable.defaults);
        }

        if (imagen6 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox6Image.setImageResource(R.drawable.mortal);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox6Image.setImageResource(R.drawable.defaults);
        }

        if (imagen7 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox7Image.setImageResource(R.drawable.irritacion);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox7Image.setImageResource(R.drawable.defaults);
        }

        if (imagen8 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox8Image.setImageResource(R.drawable.efectos);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox8Image.setImageResource(R.drawable.defaults);
        }

        if (imagen9 == 1) {
            // Si es 1, asigna la imagen correspondiente a tu ImageView
            checkBox9Image.setImageResource(R.drawable.toxico);
        } else {
            // Si no es 1, asigna la imagen por defecto o haz lo que necesites
            checkBox9Image.setImageResource(R.drawable.defaults);
        }

        //Traemos los colores tambièn
        int Blanco = getIntent().getIntExtra("COLOR_BLANCO", 0);
        int Gris = getIntent().getIntExtra("COLOR_GRIS", 0);
        int Rojo = getIntent().getIntExtra("COLOR_ROJO", 0);
        int Amarillo = getIntent().getIntExtra("COLOR_AMARILLO", 0);
        int Verde = getIntent().getIntExtra("COLOR_VERDE", 0);
        int Celeste = getIntent().getIntExtra("COLOR_CELESTE", 0);
        int Azul = getIntent().getIntExtra("COLOR_AZUL", 0);
        int Morado = getIntent().getIntExtra("COLOR_MORADO", 0);
        int Negro = getIntent().getIntExtra("COLOR_NEGRO", 0);


        linearLayoutMarco = findViewById(R.id.linearLayoutMarco);

        if (Blanco == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.blanco));
        }

        if (Gris == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.gris));
        }

        if (Rojo == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.rojo));
        }

        if (Amarillo == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.amarillo));
        }

        if (Verde == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.verde));
        }

        if (Celeste == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.celeste));
        }

        if (Azul == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.azul));
        }

        if (Morado == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.morado));
        }

        if (Negro == 1) {
            linearLayoutMarco.setBackgroundColor(getResources().getColor(R.color.negro));
        }

        buttonGenerarEtiqueta = findViewById(R.id.buttonGenerarEtiqueta);
        buttonGenerarEtiqueta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Genera el bitmap de la vista
                Bitmap bitmap = viewToBitmap(linearLayoutMarco);

                // Guarda el bitmap como un archivo PNG
                saveBitmap(bitmap, "etiqueta.png");

                // Notifica al usuario que se ha guardado la etiqueta
                Toast.makeText(Nueva_ventana.this, "Etiqueta generada y guardada como etiqueta.png", Toast.LENGTH_SHORT).show();
            }
        });

    }
    private Bitmap viewToBitmap(View view) {
        Bitmap bitmap = Bitmap.createBitmap(view.getWidth(), view.getHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(bitmap);
        view.draw(canvas);
        return bitmap;
    }

    private void saveBitmap(Bitmap bitmap, String fileName) {
        // Obtener el directorio "Download" del almacenamiento interno
        File directory = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);

        // Crear un archivo en el directorio "Download" con el nombre "etiqueta.png"
        File file = new File(directory, "etiqueta.png");

        try {
            // Código para guardar la imagen en el archivo "etiqueta.png"
            FileOutputStream outputStream = new FileOutputStream(file);
            // bitmap es tu imagen en formato Bitmap
            bitmap.compress(Bitmap.CompressFormat.PNG, 100, outputStream);
            outputStream.flush();
            outputStream.close();
            // Notificar al usuario que la imagen se ha guardado correctamente
            Toast.makeText(Nueva_ventana.this, "Imagen guardada en la carpeta Download", Toast.LENGTH_SHORT).show();
        } catch (IOException e) {
            e.printStackTrace();
            // Manejar cualquier error que pueda ocurrir durante el proceso de guardado
            Toast.makeText(Nueva_ventana.this, "Error al guardar la imagen", Toast.LENGTH_SHORT).show();
        }
    }
}
