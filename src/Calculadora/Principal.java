package Calculadora;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
* @author Cesar Javier Solares Orozco 201313819
* */

public class Principal {
    JFrame contentPane = new JFrame("Calculadora RPN");

    Tabla tabla = new Tabla();



    JButton cero = new JButton("0");
    JButton uno = new JButton("1");
    JButton dos = new JButton("2");
    JButton tres = new JButton("3");
    JButton cuatro = new JButton("4");
    JButton cinco = new JButton("5");
    JButton seis = new JButton("6");
    JButton siete = new JButton("7");
    JButton ocho = new JButton("8");
    JButton nueve = new JButton("9");
    JButton mm = new JButton("+/-");
    JButton puntuar = new JButton(".");
    JButton suma = new JButton("+");
    JButton resta = new JButton("-");
    JButton mult = new JButton("*");
    JButton div = new JButton("/");
    JButton raiz = new JButton("√");
    JButton raizn = new JButton("n√");
    JButton cuadrado = new JButton("x^2");
    JButton expn = new JButton("x^n");
    JButton seno = new JButton("sin()");
    JButton cos = new JButton("cos()");
    JButton tan = new JButton("tan()");
    JButton ac = new JButton("AC");
    JButton del = new JButton("DEL");
    JButton log = new JButton("Log");
    JButton igual = new JButton("Enter");
    JTextField mostrar;
    String ver;
    double ve;
    double res;
    String result;
    Pila tks = new Pila();
    int i = 0;
    int punto = 0;
    String tempo;
    double temp;
    double aux;
    String borrar;

    public void init () {
        //AQUI SE CREA LA VENTANA PRINCIPAL
        contentPane.setSize(475, 350);
        contentPane.setLocationRelativeTo(null);
        contentPane.setDefaultCloseOperation(contentPane.EXIT_ON_CLOSE);
        contentPane.setVisible(true);
        contentPane.setResizable(false);
        contentPane.setLayout(null);


        tabla.setVisible(false);



        mostrar = new JTextField();
        mostrar.setBounds(30,20,400,30);
        contentPane.add(mostrar);

        igual.setBounds(30,270,130,25);
        contentPane.add(igual);

        log.setBounds(205,270,130,25);
        contentPane.add(log);

        del.setBounds(370,270,60,25);
        contentPane.add(del);

        // version
        JLabel version=new JLabel("Version 1.0");
               version.setBounds(20,300,100,20);
        contentPane.add(version);

        JLabel nombre=new JLabel("Cesar Javier Solares Orozco 201313819");
        nombre.setBounds(200,300,1000,20);
        contentPane.add(nombre);

        mm.setBounds(30,230,50,20);
        contentPane.add(mm);

        cero.setBounds(90,230,50,20);
        contentPane.add(cero);

        puntuar.setBounds(160,230,50,20);
        contentPane.add(puntuar);

        cuadrado.setBounds(230,230,60,20);
        contentPane.add(cuadrado);

        expn.setBounds(300,230,60,20);
        contentPane.add(expn);

        ac.setBounds(370,230,60,20);
        contentPane.add(ac);

        uno.setBounds(30,190,50,20);
        contentPane.add(uno);

        dos.setBounds(90,190,50,20);
        contentPane.add(dos);

        tres.setBounds(160,190,50,20);
        contentPane.add(tres);

        raiz.setBounds(230,190,60,20);
        contentPane.add(raiz);

        raizn.setBounds(300,190,60,20);
        contentPane.add(raizn);

        tan.setBounds(370,190,60,20);
        contentPane.add(tan);

        cuatro.setBounds(30,150,50,20);
        contentPane.add(cuatro);

        cinco.setBounds(90,150,50,20);
        contentPane.add(cinco);

        seis.setBounds(160,150,50,20);
        contentPane.add(seis);

        suma.setBounds(230,150,60,20);
        contentPane.add(suma);

        resta.setBounds(300,150,60,20);
        contentPane.add(resta);

        cos.setBounds(370,150,63,20);
        contentPane.add(cos);

        siete.setBounds(30,110,50,20);
        contentPane.add(siete);

        ocho.setBounds(90,110,50,20);
        contentPane.add(ocho);

        nueve.setBounds(160,110,50,20);
        contentPane.add(nueve);

        mult.setBounds(230,110,60,20);
        contentPane.add(mult);

        div.setBounds(300,110,60,20);
        contentPane.add(div);

        seno.setBounds(370,110,60,20);
        contentPane.add(seno);



        cero.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "0");
            }
        });
        uno.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "1");
            }
        });
        dos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "2");
            }
        });
        tres.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "3");
            }
        });
        cuatro.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "4");
            }
        });
        cinco.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "5");
            }
        });
        seis.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "6");
            }
        });
        siete.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "7");
            }
        });
        ocho.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "8");
            }
        });
        nueve.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                mostrar.setText(mostrar.getText() + "9");
            }
        });
        mm.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                temp = Double.parseDouble(mostrar.getText());
                if(temp != 0){
                    temp = tks.pop() * -1;
                    tks.push(temp);
                    tks.setText(tks.actual1);
                    tabla.addRow("+/-", "Cambio de signo", tks.getText());
                    i = 1;
                    tempo = String.valueOf(temp);
                    mostrar.setText(tempo);
                }
            }
        });
        puntuar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(i == 1){
                    mostrar.setText("");
                    i = 0;
                }
                if(punto == 0)
                    mostrar.setText(mostrar.getText() + ".");
                punto = 1;
            }
        });
        suma.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 >1){
                    res = tks.pop() + tks.pop();
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("+", "Suma", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        resta.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 >1){
                    res = - tks.pop() + tks.pop();
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("-", "Resta", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        mult.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 1){
                    res = tks.pop() * tks.pop();
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("*", "Multiplicacion", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        div.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 1){
                    res = tks.pop() / tks.pop();
                    tks.setText(tks.actual1);
                    tabla.addRow("/", "Division", tks.getText());
                    tks.push(res);
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        raiz.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 0){
                    res = Math.sqrt(tks.pop());
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("√", "Raiz cuadrada", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        raizn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 1){
                    res = tks.pop();
                    res = Math.pow(tks.pop(),1/res);
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("n√", "Raiz n", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        cuadrado.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 0){
                    res = Math.pow(tks.pop(),2);
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("x^2", "cuadrado", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                    i = 1;
                }
                else
                    tks.error();
            }
        });
        expn.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 1){
                    res = tks.pop();
                    res = Math.pow(tks.pop(),res);
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("x^n", "potencia n", tks.getText());
                    mostrar.setText("");
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        seno.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 0){
                    res = Math.sin(tks.pop() * (Math.PI/180));
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("sin()", "Seno", tks.getText());
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        cos.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 0){
                    res = Math.cos(tks.pop() * (Math.PI/180));
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("cos()", "Coseno", tks.getText());
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        tan.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(tks.aux1 > 0){
                    res = Math.tan(tks.pop() * (Math.PI/180));
                    tks.push(res);
                    tks.setText(tks.actual1);
                    tabla.addRow("tan()", "Tangente", tks.getText());
                    result = String.valueOf(res);
                    mostrar.setText(result);
                }
                else
                    tks.error();
                i = 1;
            }
        });
        ac.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tks.clear();
                mostrar.setText("");
            }
        });
        del.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
              tks.pop();

            }
        });
        log.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                tabla.setVisible(true);
            }
        });
        igual.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                borrar = mostrar.getText();
                if(borrar.length() > 0){
                    ver = mostrar.getText();
                    ve = Double.parseDouble(ver);
                    tks.push(ve);
                    i=1;
                    punto = 0;
                    tks.setText(tks.actual1);
                    tabla.addRow(ver,"Push",tks.getText());

                }
            }
        });



    }
    public static void main(String[] args) {
        new Principal (). init();


    }

}