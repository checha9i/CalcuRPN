package Calculadora;

/**
 * Created by Cesar Solares  on 19/04/14.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import javax.swing.*;
import java.util.Vector;


public class Tabla extends JFrame{

    Vector columnas = new Vector();
    Vector filas = new Vector();
    JTable tabla = new JTable(filas,columnas);

    public Tabla(){

        this.setSize(800,350);

        columnas.add("Valor");
        columnas.add("Operacion");
        columnas.add("Estado de la pila");

        final JTable tabla = new JTable(filas,columnas);
        final JScrollPane panel = new JScrollPane(tabla);

        final JButton guardar = new JButton("Guardar");
        guardar.setBounds(30, 190, 100, 20);
        guardar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {


                File file = new File("salida.txt");

                if (!file.exists()) {

                    try {
                        if (file.createNewFile()) {
                            System.out.println("El fichero se ha creado correctamente");
                        } else {

                            System.out.println("No ha podido ser creado el fichero");
                        }
                    } catch (IOException t) {
                        t.printStackTrace();
                    }
                }


/*la clave de activar o no la sobreescritura esta en FileOutputStream(file, true) si le ponemos en true entonces agregas al final de la linea */

                BufferedWriter out = null;
                try {
                    out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF8"));
                } catch (UnsupportedEncodingException t) {
                    t.printStackTrace();
                } catch (FileNotFoundException t) {
                    t.printStackTrace();
                }

                assert out != null;

                String text = "";
                int i = 0, j = 0;
                for (i = 0; i < 20; i++) {

                    text = text + tabla.getValueAt(0, i).toString() + "	";

                    try {
                        out.write(text);
                        out.write("\n");
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }

                    try {
                        out.close();
                    } catch (IOException e1) {
                        e1.printStackTrace();
                    }



            }}
        });

        this.add(guardar);

        this.getContentPane().add(panel);
        this.setVisible(false);

    }

    public void addRow(String d1,String d2,String d3){
        Vector fila = new Vector();
        fila.add(d1);
        fila.add(d2);
        fila.add(d3);
        filas.add(fila);


    
  


    }

}