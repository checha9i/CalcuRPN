package Calculadora;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by HP on 16/04/14.
 */
public class Principal extends JFrame {
String ver=" ";
    double ve=0;
    public static void main(String[] args) throws IOException {
        Principal frame = new Principal();
        frame.setVisible(true);
        frame.setTitle("Calculadora RPN");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
}
    private static double evalrpn(Stack<String> tok) throws Exception  {
        String tk = tok.pop();
        double x,y;
        try  {x = Double.parseDouble(tk);}
        catch (Exception e)  {
            y = evalrpn(tok);  x = evalrpn(tok);



            if      (tk.equals("+"))  x += y;
            else if (tk.equals("-"))  x -= y;
            else if (tk.equals("*"))  x *= y;
            else if (tk.equals("/"))  x /= y;
            else if(tk.equals("^")) {

                double temp= Math.pow(x, y);
                x=temp;
            }
        else if(tk.equals("^2"))  {
y=2;
                double temp= Math.pow(x, y);
                x=temp;

            }
            else if(tk.equals("Sen")){
                double temp = Math.toRadians(x);
               x= Math.sin (temp);


            }
            else if(tk.equals("Cos")){
                double temp = Math.toRadians(x);
                x= Math.cos(temp);
            }
            else if(tk.equals("Tan")){
                double temp = Math.toRadians(x);
                x= Math.tan(temp);
            }
            else if(tk.equals("2√")){

                y= Math.sqrt(x);
                        x=y;
            }
            else if(tk.equals("√")){
double pot=1/y;
                double temp= Math.pow(x, pot);
                x=temp;
            }
            else if(tk.equals("Log")){

                y= Math.log(x);
                x=y;
            }


            else throw new Exception();
        }
        return x;
    }
   public Principal()throws IOException {

        //Panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 310);
       JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"201313819"));
        setContentPane(contentPane);

        contentPane.setLayout(null);

        //botones
        //numeros

       JButton cero = new JButton("0");
       cero.setBounds(5, 175, 50, 20);
       contentPane.add(cero);



        JButton uno = new JButton("1");
       uno.setBounds(5, 195, 50, 20);
        contentPane.add(uno);

       JButton dos = new JButton("2");
       dos.setBounds(55, 195, 50, 20);
       contentPane.add(dos);

       JButton tres = new JButton("3");
       tres.setBounds(105, 195, 50, 20);
       contentPane.add(tres);

       JButton cuatro = new JButton("4");
       cuatro.setBounds(5, 215, 50, 20);
       contentPane.add(cuatro);

       JButton cinco = new JButton("5");
       cinco.setBounds(55, 215, 50, 20);
       contentPane.add(cinco);

       JButton seis = new JButton("6");
       seis.setBounds(105, 215, 50, 20);
       contentPane.add(seis);

       JButton siete = new JButton("7");
       siete.setBounds(5, 235, 50, 20);
       contentPane.add(siete);
        JButton espacio = new JButton("Espacio");
       espacio.setBounds(5, 255, 250, 15);
       contentPane.add(espacio);

       JButton ocho = new JButton("8");
       ocho.setBounds(55, 235, 50, 20);
       contentPane.add(ocho);

       JButton nueve = new JButton("9");
       nueve.setBounds(105, 235, 50, 20);
       contentPane.add(nueve);

       //Espacio para mostrar
       final TextField mostrar = new TextField();
       mostrar.setBounds(5,15,250,100);
       contentPane.add(mostrar);

       //operadores
       JButton mas = new JButton("+");
       mas.setBounds(155, 215, 50, 20);
       contentPane.add(mas);

       JButton mult = new JButton("*");
       mult.setBounds(155, 235, 50, 20);
       contentPane.add(mult);

       JButton menos = new JButton("-");
       menos.setBounds(205, 215, 50, 20);
       contentPane.add(menos);

       JButton div = new JButton("/");
       div.setBounds(205, 235, 50, 20);
       contentPane.add(div);

       JButton igual = new JButton("=");
       igual.setBounds(155, 195, 55, 20);
       contentPane.add(igual);

       JButton ac = new JButton("AC");
       ac.setBounds(210, 174, 50, 40);
       contentPane.add(ac);

       JButton mm = new JButton("+-");
       mm.setBounds(55, 175, 50, 20);
       contentPane.add(mm);

       JButton cuadrado = new JButton("x^2");
       cuadrado.setBounds(105, 175, 55, 20);
       contentPane.add(cuadrado);

       JButton expn = new JButton("x^n");
       expn.setBounds(155, 175, 55, 20);
       contentPane.add(expn);

       JButton raiz = new JButton("√");
       raiz.setBounds(5, 155, 50, 20);
       contentPane.add(raiz);


       JButton raizn = new JButton("n√");
       raizn.setBounds(55, 155, 55, 20);
       contentPane.add(raizn);

       JButton punto = new JButton(".");
       punto.setBounds(109, 155, 50, 20);
       contentPane.add(punto);


       JButton seno = new JButton("Sen");
       seno.setBounds(159, 155, 60, 20);
       contentPane.add(seno);


       JButton cos = new JButton("Cos");
       cos.setBounds(219, 155, 60, 20);
       contentPane.add(cos);


       JButton tan = new JButton("Tan");
       tan.setBounds(5, 135, 60, 20);
       contentPane.add(tan);

       JButton log = new JButton("Ln");
       log.setBounds(65, 135, 60, 20);
       contentPane.add(log);

        //Accion botones
        uno.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"1";
mostrar.setText(ver);
           }
       });
       dos.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
              ver=ver+"2";
               mostrar.setText(ver);
           }
       });
       tres.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"3";
               mostrar.setText(ver);
           }
       });
       cuatro.addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"4";
               mostrar.setText(ver);
           }
       });
       cinco.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"5";
               mostrar.setText(ver);
           }
       });
       seis.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"6";
               mostrar.setText(ver);
           }
       });
       siete.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"7";
               mostrar.setText(ver);
           }
       });
       ocho.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"8";
               mostrar.setText(ver);
           }
       });
       nueve.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"9";
               mostrar.setText(ver);
           }
       });
       mas.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"+";
               mostrar.setText(ver);
           }
       });
       menos.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"-";
               mostrar.setText(ver);
           }
       });
       ac.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver="";
               mostrar.setText(ver);
           }
       });
       mult.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"*";
               mostrar.setText(ver);
           }
       });
       div.addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"/";
               mostrar.setText(ver);
           }
       });

       cuadrado.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "^2";
               mostrar.setText(ver);
           }
       });

       expn.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "^";
               mostrar.setText(ver);
           }
       });

       raiz.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "2√";
               mostrar.setText(ver);
           }
       });

       raizn.addActionListener(new ActionListener(){

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"√";
               mostrar.setText(ver);
             }});
       punto.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + ".";
               mostrar.setText(ver);
           }
       });
       seno.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "Sen";
               mostrar.setText(ver);
           }
       });
       cos.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "Cos";
               mostrar.setText(ver);
           }
       });
       tan.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "Tan";
               mostrar.setText(ver);
           }
       });
       espacio.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + " ";
               mostrar.setText(ver);
           }
       });
       log.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver = ver + "Log";
               mostrar.setText(ver);
           }
       });
        

     final  Stack<String> tok = new Stack<String>();
       igual.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {


                   tok.addAll(Arrays.asList(ver.trim().split("[ \t]+")));

                 if (tok.peek().equals("")){tok.pop();}
                       try  {
                       double r = evalrpn(tok);
                       if (!tok.empty())  throw new Exception();

                       mostrar.setText(String.valueOf(r));
                           ve=r;
                           ver=String.valueOf(ve);
                   }
                   catch (Exception e)  {
                       mostrar.setText("error");}
               File file = new File("salida.txt");

               if (!file.exists()) {

                   try {
                       if (file.createNewFile()) {
                           System.out.println("El fichero se ha creado correctamente");
                       } else {

                           System.out.println("No ha podido ser creado el fichero");
                       }
                   } catch (IOException e) {
                       e.printStackTrace();
                   }
               }


/*la clave de activar o no la sobreescritura esta en FileOutputStream(file, true) si le ponemos en true entonces agregas al final de la linea */

               BufferedWriter out = null;
               try {
                   out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), "UTF8"));
               } catch (UnsupportedEncodingException e) {
                   e.printStackTrace();
               } catch (FileNotFoundException e) {
                   e.printStackTrace();
               }

               assert out != null;
               try {
                   out.write(ver);
               } catch (IOException e) {
                   e.printStackTrace();
               }
               try {
                   out.write("\n");
               } catch (IOException e) {
                   e.printStackTrace();
               }
               try {
                   out.close();
               } catch (IOException e) {
                   e.printStackTrace();
               }

           }
       });
       cero.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"0";
               mostrar.setText(ver);
           } });
       mm.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
         ve=Double.parseDouble(ver);
              if (ve>0){
              ver="-"+ver;
               }
               else if (ve<0){
                      ver="+"+ver;
              }
               mostrar.setText(ver);


           }});




   }
}