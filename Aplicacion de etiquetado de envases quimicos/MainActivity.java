package com.example.proyectoindividual;

import android.content.Intent;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;

import android.util.TypedValue;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;

import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.AppCompatAutoCompleteTextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatEditText;

import android.widget.EditText;
import android.widget.Spinner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import androidx.core.content.ContextCompat;



public class MainActivity extends AppCompatActivity {

    // Declaración del arreglo de fórmulas químicas
    String[] formulas = {
            "Cloruro de antimonio(V): SbCl5",
            "Acetonitrilo: CH3CN",
            "Sulfato de amonio: (NH4)2SO4",
            "Ácido acético: CH3COOH",
            "Nitrato de amonio: NH4NO3",
            "Acetaldehído: CH3CHO",
            "Ácido cítrico: C6H8O7",
            "Dicromato de amonio: (NH4)2Cr2O7",
            "Ácido cloroplatínico: H2PtCl6",
            "Carbonato de amonio: (NH4)2CO3",
            "Ácido clorhídrico: HCl",
            "Amoníaco: NH3",
            "Ácido hexafluorosilícico: H2SiF6",
            "Ácido butírico: C4H8O2",
            "Nitrato de aluminio: Al(NO3)3",
            "Ácido maleico: C4H4O4",
            "Acetato de plomo(IV): Pb(C2H3O2)4",
            "Ácido fosfórico: H3PO4",
            "Ácido láctico: C3H6O3",
            "Ácido perclórico: HClO4",
            "Sulfato de hierro(II) y amonio: (NH4)2Fe(SO4)2",
            "Ácido oxálico: H2C2O4",
            "Ácido yodhídrico: HI",
            "Acetato de sodio: NaC2H3O2",
            "Acetato de metilo: CH3COOCH3",
            "Ácido cianhídrico: HCN",
            "Ácido sulfuroso: H2SO3",
            "Cloruro de amonio: NH4Cl",
            "Ácido cloroacético: ClCH2COOH",
            "Acetato de amonio: CH3COONH4",
            "Ácido bromhídrico: HBr",
            "Sulfato de aluminio: Al2(SO4)3",
            "Ácido tetracloroáurico: HAuCl4",
            "Cloruro de aluminio: AlCl3",
            "Ácido fórmico: HCOOH",
            "Cloruro de antimonio(III): SbCl3",
            "Acetona: (CH3)2CO",
            "Oxalato de amonio: (NH4)2C2O4",
            "Acetamida: C2H5NO",
            "Ácido dicloroacético: CHCl2COOH",
            "Hidróxido de amonio: NH4OH",
            "Ácido yódico: HIO3",
            "Arseniato de sodio: Na3AsO4",
            "Ácido nítrico: HNO3",
            "Ácido fluorhídrico: HF",
            "Ácido malónico: C3H4O4",
            "Ácido sulfúrico: H2SO4",
            "Acetato de plomo(II): Pb(C2H3O2)2",
            "Ácido tricloroacético: CCl3COOH",
            "Ácido tartárico: H2C4H4O6",
            "Agua: H2O",
            "Fructosa: C6H12O6",
            "Formaldehído: HCHO",
            "Etanol: C2H5OH",
            "Disulfuro de carbono: CS2",
            "Piridina: C5H5N",
            "Maltosa: C12H22O11",
            "Propan-1-ol: CH3CH2CH2OH",
            "Tiosulfato de sodio: Na2S2O3",
            "Dihidrogenofosfato de potasio: KH2PO4",
            "Hidrogenofosfato de sodio: Na2HPO4",
            "Dihidrogenofosfato de sodio: NaH2PO4",
            "Carbonato de sodio: Na2CO3",
            "Tiourea: (NH2)2CS",
            "Uretano: C3H7NO2",
            "TRIS: (HOCH2)3CNH2",
            "Óxido de cromo(VI): CrO3",
            "Sulfato de calcio: CaSO4",
            "Butan-1-ol: C4H10O",
            "Éter etílico: (C2H5)2O",
            "Hidrogenocarbonato de sodio: NaHCO3",
            "Fenol: C6H5OH",
            "Isobutanol: C4H10O",
            "Citrato de sodio: Na3C6H5O7",
            "Pentan-1-ol: C5H11OH",
            "Sacarosa: C12H22O11",
            "Metanol: CH3OH",
            "Propan-2-ol: CH3CHOHCH3",
            "Tartrato de potasio: K2C4H4O6",
            "Sulfato de magnesio: MgSO4",
            "Urea: (NH2)2CO",
            "Hidrogenotartrato di sodio: NaHC4H4O6",
            "Carbonato de potasio: K2CO3"
    };
    private EditText editTextNombre;
    private EditText editTextFormula;
    private EditText editTextMasaMolar;
    private EditText editTextConcentracion;
    private EditText editTextFecha;
    private EditText editTextProposito;
    private EditText editTextPreparadoPor;

    private Spinner spinnerNombres;

    private ImageView checkBox1Image, checkBox2Image, checkBox3Image , checkBox4Image, checkBox5Image, checkBox6Image, checkBox7Image, checkBox8Image, checkBox9Image;
    private boolean checkBox1State = false; // Estado inicial: false
    private boolean checkBox2State = false; // Estado inicial: false
    private boolean checkBox3State = false; // Estado inicial: false
    private boolean checkBox4State = false; // Estado inicial: false
    private boolean checkBox5State = false; // Estado inicial: false
    private boolean checkBox6State = false; // Estado inicial: false
    private boolean checkBox7State = false; // Estado inicial: false
    private boolean checkBox8State = false; // Estado inicial: false
    private boolean checkBox9State = false; // Estado inicial: false
    int checkBox1Value;
    int checkBox2Value;
    int checkBox3Value;
    int checkBox4Value;
    int checkBox5Value;
    int checkBox6Value;
    int checkBox7Value;
    int checkBox8Value;
    int checkBox9Value;

    // Definir el tamaño del array según la cantidad de imágenes
    int numImagenes = 9; // Por ejemplo, 9 imágenes en total
    int[] imagenesSeleccionadas = new int[numImagenes];

    int imagen1;
    int imagen2;
    int imagen3;
    int imagen4;
    int imagen5;
    int imagen6;
    int imagen7;
    int imagen8;
    int imagen9;

    int Blanco= 0;
    int Gris= 0;
    int Rojo= 0;
    int Amarillo= 0;
    int Verde= 0;
    int Celeste= 0;
    int Azul= 0;
    int Morado= 0;
    int Negro= 0;

    private LinearLayout linearLayoutN2;
    private LinearLayout linearLayoutN3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spinner = findViewById(R.id.spinnerUnidadMedida);
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this, R.array.unidades_medida, android.R.layout.simple_spinner_item);
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter3);


        editTextNombre = findViewById(R.id.editTextNombre);
        spinnerNombres = findViewById(R.id.spinnerNombres);

        // Lista de nombres disponibles
        List<String> nombresDisponibles = new ArrayList<>();
        nombresDisponibles.add("Antimony(V) chloride");
        nombresDisponibles.add("Antimony pentachloride");
        nombresDisponibles.add("Antimonic Chloride");
        nombresDisponibles.add("Pentachloroantimony");

        // Adaptador para el Spinner
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, nombresDisponibles);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerNombres.setAdapter(adapter2);

        // Manejar la selección del Spinner
        spinnerNombres.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View selectedItemView, int position, long id) {
                // Obtener el nombre seleccionado y establecerlo en el EditText
                String selectedNombre = (String) parentView.getItemAtPosition(position);
                editTextNombre.setText(selectedNombre);
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                // No se necesita implementar en este caso
            }
        });

        checkBox1Image = findViewById(R.id.checkBox1Image);
        checkBox2Image = findViewById(R.id.checkBox2Image);
        checkBox3Image = findViewById(R.id.checkBox3Image);
        checkBox4Image = findViewById(R.id.checkBox4Image);
        checkBox5Image = findViewById(R.id.checkBox5Image);
        checkBox6Image = findViewById(R.id.checkBox6Image);
        checkBox7Image = findViewById(R.id.checkBox7Image);
        checkBox8Image = findViewById(R.id.checkBox8Image);
        checkBox9Image = findViewById(R.id.checkBox9Image);

        // Inicializar todas las posiciones del array como 0 (ninguna imagen seleccionada)
        Arrays.fill(imagenesSeleccionadas, 0);

        checkBox1Image.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                if (checkBox1State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox1Image.setImageResource(R.drawable.inflamable);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox1Image.setImageResource(R.drawable.inflamable2);
                }
                checkBox1State = !checkBox1State; // Cambiar el estado
                showSelectionStatus(checkBox1State);
            }
        });

        checkBox2Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (checkBox2State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox2Image.setImageResource(R.drawable.explosion);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox2Image.setImageResource(R.drawable.explosion2);
                }
                checkBox2State = !checkBox2State; // Cambiar el estado
                showSelectionStatus(checkBox2State);
            }
        });


        checkBox3Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            if (checkBox3State) {
                // Cambiar a la imagen "true" si está en "false"
                checkBox3Image.setImageResource(R.drawable.incendio_peor);
            } else {
                // Cambiar a la imagen "false" si está en "true"
                checkBox3Image.setImageResource(R.drawable.incendio_peor2);
            }
                checkBox3State = !checkBox3State; // Cambiar el estado
                showSelectionStatus(checkBox3State);
        }
    });

        checkBox4Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox4State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox4Image.setImageResource(R.drawable.caliente_explosion);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox4Image.setImageResource(R.drawable.caliente_explosion2);
                }
                checkBox4State = !checkBox4State; // Cambiar el estado
                showSelectionStatus(checkBox4State);
            }
        });

        checkBox5Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox5State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox5Image.setImageResource(R.drawable.quemadura);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox5Image.setImageResource(R.drawable.quemadura2);
                }
                checkBox5State = !checkBox5State; // Cambiar el estado
                showSelectionStatus(checkBox5State);
            }
        });

        checkBox6Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox6State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox6Image.setImageResource(R.drawable.mortal);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox6Image.setImageResource(R.drawable.mortal2);
                }
                checkBox6State = !checkBox6State; // Cambiar el estado
                showSelectionStatus(checkBox6State);
            }
        });

        checkBox7Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox7State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox7Image.setImageResource(R.drawable.irritacion);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox7Image.setImageResource(R.drawable.irritacion2);
                }
                checkBox7State = !checkBox7State; // Cambiar el estado
                showSelectionStatus(checkBox7State);
            }
        });

        checkBox8Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox8State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox8Image.setImageResource(R.drawable.efectos);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox8Image.setImageResource(R.drawable.efectos2);
                }
                checkBox8State = !checkBox8State; // Cambiar el estado
                showSelectionStatus(checkBox8State);
            }
        });

        checkBox9Image.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (checkBox9State) {
                    // Cambiar a la imagen "true" si está en "false"
                    checkBox9Image.setImageResource(R.drawable.toxico);
                } else {
                    // Cambiar a la imagen "false" si está en "true"
                    checkBox9Image.setImageResource(R.drawable.toxico2);
                }
                checkBox9State = !checkBox9State; // Cambiar el estado
                showSelectionStatus(checkBox9State);
            }
        });

        //Muestra las sugerencias de las formulas
        AppCompatAutoCompleteTextView editTextFormula = findViewById(R.id.editTextFormula);
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_dropdown_item_1line, formulas);
        editTextFormula.setAdapter(adapter);
        editTextFormula.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedFormula = (String) parent.getItemAtPosition(position);
                editTextFormula.setText(selectedFormula);
            }
        });

        Button botonGenerarPrevisualizacion = findViewById(R.id.buttonGeneratePreview);

        botonGenerarPrevisualizacion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Actualizar checkBox1Value e imagenesSeleccionadas[0] antes de los Toasts

                checkBox1Value = checkBox1State ? 1 : 0;
                imagen1 = checkBox1Value;

                checkBox2Value = checkBox2State ? 1 : 0;
                imagen2 = checkBox2Value;

                checkBox3Value = checkBox3State ? 1 : 0;
                imagen3 = checkBox3Value;

                checkBox4Value = checkBox4State ? 1 : 0;
                imagen4 = checkBox4Value;

                checkBox5Value = checkBox5State ? 1 : 0;
                imagen5 = checkBox5Value;

                checkBox6Value = checkBox6State ? 1 : 0;
                imagen6 = checkBox6Value;

                checkBox7Value = checkBox7State ? 1 : 0;
                imagen7 = checkBox7Value;

                checkBox8Value = checkBox8State ? 1 : 0;
                imagen8 = checkBox8Value;

                checkBox9Value = checkBox9State ? 1 : 0;
                imagen9 = checkBox9Value;


                // Llamar a la función para generar la previsualización
                generarPrevisualizacion();

            }
        });

        Button buttonReset = findViewById(R.id.buttonReset);
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Restablece el texto del TextView a su valor predeterminado
                TextView textViewColorSeleccionado = findViewById(R.id.seleccionaColor);
                textViewColorSeleccionado.setText("Selecciona el color del marco");

                // Restablece el contenido de los EditText y AutoCompleteTextView
                AppCompatAutoCompleteTextView editTextFormula = findViewById(R.id.editTextFormula);
                editTextFormula.setText("");

                AppCompatEditText editTextNombre = findViewById(R.id.editTextNombre);
                editTextNombre.setText("");

                EditText editTextMasaMolar = findViewById(R.id.editTextMasaMolar);
                editTextMasaMolar.setText("");

                EditText editTextNumero = findViewById(R.id.editTextNumero);
                editTextNumero.setText("");

                EditText editTextFecha = findViewById(R.id.editTextFecha);
                editTextFecha.setText("");

                EditText editTextProposito = findViewById(R.id.editTextProposito);
                editTextProposito.setText("");

                EditText editTextPreparadoPor = findViewById(R.id.editTextPreparadoPor);
                editTextPreparadoPor.setText("");

                // Restablece las imágenes de los ImageView a sus valores predeterminados
                ImageView checkBox1Image = findViewById(R.id.checkBox1Image);
                checkBox1Image.setImageResource(R.drawable.inflamable);

                ImageView checkBox2Image = findViewById(R.id.checkBox2Image);
                checkBox2Image.setImageResource(R.drawable.explosion);

                ImageView checkBox3Image = findViewById(R.id.checkBox3Image);
                checkBox3Image.setImageResource(R.drawable.incendio_peor);

                ImageView checkBox4Image = findViewById(R.id.checkBox4Image);
                checkBox4Image.setImageResource(R.drawable.caliente_explosion);

                ImageView checkBox5Image = findViewById(R.id.checkBox5Image);
                checkBox5Image.setImageResource(R.drawable.quemadura);

                ImageView checkBox6Image = findViewById(R.id.checkBox6Image);
                checkBox6Image.setImageResource(R.drawable.mortal);

                ImageView checkBox7Image = findViewById(R.id.checkBox7Image);
                checkBox7Image.setImageResource(R.drawable.irritacion);

                ImageView checkBox8Image = findViewById(R.id.checkBox8Image);
                checkBox8Image.setImageResource(R.drawable.efectos);

                ImageView checkBox9Image = findViewById(R.id.checkBox9Image);
                checkBox9Image.setImageResource(R.drawable.toxico);
            }
        });


        // Encuentra los botones por su ID
        Button buttonBlanco = findViewById(R.id.buttonBlanco);
        Button buttonGris = findViewById(R.id.buttonGris);
        Button buttonRojo = findViewById(R.id.buttonRojo);
        Button buttonAmarillo = findViewById(R.id.buttonAmarillo);
        Button buttonVerde = findViewById(R.id.buttonVerde);
        Button buttonCeleste = findViewById(R.id.buttonCeleste);
        Button buttonAzul = findViewById(R.id.buttonAzul);
        Button buttonMorado = findViewById(R.id.buttonMorado);
        Button buttonNegro = findViewById(R.id.buttonNegro);

        // Inflar otro_layout.xml para acceder a los LinearLayouts
        View nueva_ventana = getLayoutInflater().inflate(R.layout.nueva_ventana, null);

        // Inicializa las variables con los LinearLayouts correspondientes
        linearLayoutN2 = nueva_ventana.findViewById(R.id.linearLayoutN2);
        linearLayoutN3 = nueva_ventana.findViewById(R.id.linearLayoutN3);

        // Configura OnClickListener para cada botón
        buttonBlanco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Blanco");
                Blanco= 1;
                Gris= 0;
                Rojo= 0;
                Amarillo= 0;
                Verde= 0;
                Celeste= 0;
                Azul= 0;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonRojo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Rojo");
                Blanco= 0;
                Gris= 0;
                Rojo= 1;
                Amarillo= 0;
                Verde= 0;
                Celeste= 0;
                Azul= 0;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonGris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Gris");
                Blanco= 0;
                Gris= 1;
                Rojo= 0;
                Amarillo= 0;
                Verde= 0;
                Celeste= 0;
                Azul= 0;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonAmarillo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Amarillo");
                Blanco= 0;
                Gris= 0;
                Rojo= 0;
                Amarillo= 1;
                Verde= 0;
                Celeste= 0;
                Azul= 0;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonVerde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Verde");
                Blanco= 0;
                Gris= 0;
                Rojo= 0;
                Amarillo= 0;
                Verde= 1;
                Celeste= 0;
                Azul= 0;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonCeleste.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Celeste");
                Blanco= 0;
                Gris= 0;
                Rojo= 0;
                Amarillo= 0;
                Verde= 0;
                Celeste= 1;
                Azul= 0;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonAzul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Azul");
                Blanco= 0;
                Gris= 0;
                Rojo= 0;
                Amarillo= 0;
                Verde= 0;
                Celeste= 0;
                Azul= 1;
                Morado= 0;
                Negro= 0;
            }
        });

        buttonMorado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Morado");
                Blanco= 0;
                Gris= 0;
                Rojo= 0;
                Amarillo= 0;
                Verde= 0;
                Celeste= 0;
                Azul= 0;
                Morado= 1;
                Negro= 0;
            }
        });

        buttonNegro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mostrarColorSeleccionado("Negro");
                Blanco= 0;
                Gris= 0;
                Rojo= 0;
                Amarillo= 0;
                Verde= 0;
                Celeste= 0;
                Azul= 0;
                Morado= 0;
                Negro= 1;
            }
        });
    }

    // Método para mostrar el color seleccionado en un TextView
    private void mostrarColorSeleccionado(String color) {
        // Encuentra el TextView por su ID
        TextView textViewColorSeleccionado = findViewById(R.id.seleccionaColor);
        // Establece el texto del TextView con el color seleccionado
        textViewColorSeleccionado.setText("Color seleccionado: " + color);
    }


    private void generarPrevisualizacion() {

        editTextFormula = findViewById(R.id.editTextFormula);
        editTextNombre = findViewById(R.id.editTextNombre);
        editTextMasaMolar = findViewById(R.id.editTextMasaMolar);
        editTextConcentracion = findViewById(R.id.editTextNumero);
        editTextFecha = findViewById(R.id.editTextFecha);
        editTextProposito = findViewById(R.id.editTextProposito);
        editTextPreparadoPor = findViewById(R.id.editTextPreparadoPor);

        // Obtener datos de los EditText y otros elementos
        String formula = editTextFormula.getText().toString();
        String nombre = editTextNombre.getText().toString();
        String masa_molar= editTextMasaMolar.getText().toString();
        String concentracion = editTextConcentracion.getText().toString();
        String fecha = editTextFecha.getText().toString();
        String proposito = editTextProposito.getText().toString();
        String preparador_por = editTextPreparadoPor.getText().toString();

        // Obtén otros datos de los elementos según sea necesario
        // Crear un Intent para iniciar la actividad de previsualización
        Intent intent = new Intent(MainActivity.this, Nueva_ventana.class);
        // Pasar los datos a la actividad de previsualización usando Intent extras
        intent.putExtra("FORMULA", formula);
        intent.putExtra("NOMBRE", nombre);
        intent.putExtra("MASA MOLAR", masa_molar);
        intent.putExtra("CONCENTRACION", concentracion);
        intent.putExtra("FECHA", fecha);
        intent.putExtra("PROPOSITO", proposito);
        intent.putExtra("PREPARADO POR", preparador_por);

        //--------------------------------IMAGENES-----------------------------------------

        // Agregar las variables individuales al Intent
        intent.putExtra("IMAGEN1", imagen1);
        intent.putExtra("IMAGEN2", imagen2);
        intent.putExtra("IMAGEN3", imagen3);
        intent.putExtra("IMAGEN4", imagen4);
        intent.putExtra("IMAGEN5", imagen5);
        intent.putExtra("IMAGEN6", imagen6);
        intent.putExtra("IMAGEN7", imagen7);
        intent.putExtra("IMAGEN8", imagen8);
        intent.putExtra("IMAGEN9", imagen9);

        intent.putExtra("COLOR_BLANCO", Blanco);
        intent.putExtra("COLOR_GRIS", Gris);
        intent.putExtra("COLOR_ROJO", Rojo);
        intent.putExtra("COLOR_AMARILLO", Amarillo);
        intent.putExtra("COLOR_VERDE", Verde);
        intent.putExtra("COLOR_CELESTE", Celeste);
        intent.putExtra("COLOR_AZUL", Azul);
        intent.putExtra("COLOR_MORADO", Morado);
        intent.putExtra("COLOR_NEGRO", Negro);

        // Iniciar la actividad de previsualización
        startActivity(intent);

    }

    private void showSelectionStatus(boolean selected) {
        String message = "La imagen está en estado: " + (selected ? "true" : "false");
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}
