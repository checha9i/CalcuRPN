package Calculadora;

/**
 * Created by Cesar Solares on 19/04/14.
 */
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Pila {

    final JPanel panel = new JPanel();
    int tope = 0;
    double pila[] = new double[10000];
    double aux1 = 0;
    JPanel error = new JPanel();
    String actual,actual1;

    public void push (double dato){
        tope++;
        pila[tope] = dato;
        aux1 = tope;

    }

    public double pop(){

        double aux = 0;
        aux = pila[tope];
        tope--;
        aux1 = tope;
        return aux;
    }

    public void clear(){
        tope = 0;
    }
    public void error(){
        JOptionPane.showMessageDialog(error,"Ingresar Operandos","ERROR",JOptionPane.ERROR_MESSAGE);
    }

    public String getText(){
        return actual;
    }

    public void setText(String actual1){
        actual = "";
        String aux;
        for(int j=1;j<=tope;j++){
            if(j == 1)
                actual = String.valueOf(pila[1]);
            else
                actual = actual + ", " + String.valueOf(pila[j]);
        }
        actual1 = actual;

    }



}