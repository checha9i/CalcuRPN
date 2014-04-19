package Calculadora;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;

/**
 * Created by HP on 16/04/14.
 */
public class Principal extends JFrame {
String ver=" ";
    public static void main(String[] args) throws IOException {
        Principal frame = new Principal();
        frame.setVisible(true);
        frame.setTitle("Calculadora RPN");
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
/*
        BufferedReader in =
                new BufferedReader(new InputStreamReader(System.in));
        for (;;)  {
            String s = in.readLine();
            if (s==null)  break;
            Stack<String> tks = new Stack<String>();
            tks.addAll(Arrays.asList(s.trim().split("[ \t]+")));
            if (tks.peek().equals(""))  continue;
            try  {
                double r = evalrpn(tks);
                if (!tks.empty())  throw new Exception();
                System.out.println(r);
            }
            catch (Exception e)  {System.out.println("error");}
        }
    */}
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
            else throw new Exception();
        }
        return x;
    }
   public Principal()throws IOException {

        //Panel
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 300, 300);
       JPanel contentPane = new JPanel();
        contentPane.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(),"201313819"));
        setContentPane(contentPane);

        contentPane.setLayout(null);

        //botones
        //numeros

       JButton cero = new JButton("0");
       cero.setBounds(5, 175, 50, 20);
       contentPane.add(cero);

       JButton mm = new JButton("+-");
       mm.setBounds(55, 175, 50, 20);
       contentPane.add(mm);

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

       JButton ocho = new JButton("8");
       ocho.setBounds(55, 235, 50, 20);
       contentPane.add(ocho);

       JButton nueve = new JButton("9");
       nueve.setBounds(105, 235, 50, 20);
       contentPane.add(nueve);

       //Espacio para mostrar
       final TextField mostrar = new TextField();
       mostrar.setBounds(5,15,250,150);
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
       igual.setBounds(155, 195, 50, 20);
       contentPane.add(igual);

       JButton ac = new JButton("AC");
       ac.setBounds(205, 195, 50, 20);
       contentPane.add(ac);

        //Accion botones
        uno.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"1 ";
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
       igual.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               for (;;)  {
                   if (ver==null)  break;
                   Stack<String> tok = new Stack<String>();
                   tok.addAll(Arrays.asList(ver.trim().split("[ \t]+")));
                   if (tok.peek().equals(""))  continue;
                   try  {
                       double r = evalrpn(tok);
                       if (!tok.empty())  throw new Exception();

                       mostrar.setText(ver);
                   }
                   catch (Exception e)  {
                       mostrar.setText("error");}
               }

           }


       });
       cero.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
               ver=ver+"0 ";
               mostrar.setText(ver);
           } });
       mm.addActionListener(new ActionListener() {

           @Override
           public void actionPerformed(ActionEvent actionEvent) {
              int ve=Integer.parseInt(ver);
              if (ve>0){
              ver="-"+ver;
               }
               else if (ve<0){
                      ver="+"+ver;
              }
               mostrar.setText(ver);
           }

           });




   }}