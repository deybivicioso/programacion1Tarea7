import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;

public class calculadora extends JFrame {
    panelPrincipal as = new panelPrincipal();

    public calculadora() {
        setVisible(true);
        setTitle("calculadora");
        setSize(755, 575);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(as);
    }
}

class panelPrincipal extends JPanel implements ActionListener {
    // instancias (variables)............
    // instancia de la calculadora
    JInternalFrame calculadora = new JInternalFrame();// sumar dos numeros
    JInternalFrame calculadora2 = new JInternalFrame();// sumar tres numeros
    JInternalFrame calculadora3 = new JInternalFrame();// multiplicar dos numeros
    JInternalFrame calculadora4 = new JInternalFrame();// multiplicar tres nuemros
    JInternalFrame calculadora5 = new JInternalFrame();// restar dos numeros
    JInternalFrame calculadora6 = new JInternalFrame();// resta tres numeros
    // opciones principales del menu
    JMenuBar barra = new JMenuBar();// soperte de la barra de menu
    JMenu opcion1 = new JMenu("calcular>suma");// primera opcion del menu
    JMenu opcion2 = new JMenu("calcular>multiplicar");// seguna opcion
    JMenu opcion3 = new JMenu("calcular>restar");// tercera opcion
    JMenu opcion4 = new JMenu("tabla>resultados");// cuarta opcion
    // intems de las opciones
    JMenuItem item1 = new JMenuItem("sumar dos numeros");
    JMenuItem item1_1 = new JMenuItem("sumar tres numeros");
    JMenuItem item2 = new JMenuItem("multiplicar dos numeros");
    JMenuItem item2_1 = new JMenuItem("multiplicar tres numeros");
    JMenuItem item3 = new JMenuItem("restar dos numeros");
    JMenuItem item3_1 = new JMenuItem("restar tres numeros");
    JMenuItem item4 = new JMenuItem("historial de resultados");
    // base para los frames internos
    JDesktopPane base = new JDesktopPane();
    // componentes de la calculadora
    JLabel instruciones = new JLabel("Realice operaciones de 1 a 3 valores (opcional)");
    JLabel label1 = new JLabel("valor1");
    JLabel label2 = new JLabel("valor2");
    JLabel label3 = new JLabel("valor3");
    JSpinner valor1 = new JSpinner();
    JSpinner valor2 = new JSpinner();
    JSpinner valor3 = new JSpinner();
    JButton resultado1 = new JButton("sumar");
    JButton resultado1_1 = new JButton("sumar");// boton para sumar tres valores
    JButton resultado2 = new JButton("multiplicar");
    JButton resultado2_1 = new JButton("multiplicar");// boton para multiplicar tres valores
    JButton resultado3 = new JButton("restar");
    JButton resultado3_1 = new JButton("restar");// boton para restar tres valores
    JTextField prueba1 = new JTextField(); // se peude borrar mas adelante
    JTextField prueba2 = new JTextField();
    JTextField prueba3 = new JTextField();
    JTextField prueba4 = new JTextField();
    JTextField prueba5 = new JTextField();
    JTextField prueba6 = new JTextField();
    // instancia de la tabla
    JTable registro = new JTable();
    // instancia del jpanel
    JPanel lamina1 = new JPanel();

    public panelPrincipal() {
        setLayout(null);
        menu();
        descktopP();
        panel1();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Object itemSelect = e.getSource();
        if (itemSelect == item1) {// primera calculadora, sumar dos digitios
            // creacion de la calculadora
            calculadora.setBounds(0, 0, 695, 425);
            calculadora.setTitle("Calculadora");
            calculadora.setVisible(true);
            calculadora.setResizable(true);
            calculadora.setMaximizable(false);
            calculadora.setClosable(true);
            calculadora.setIconifiable(true);
            calculadora.setLayout(null);
            // creacccion de los componentes de la calculadora
            instruciones.setBounds(10, 10, 280, 20);
            calculadora.add(instruciones);
            label1.setBounds(10, 50, 50, 20);
            calculadora.add(label1);
            valor1.setBounds(50, 50, 100, 20);
            calculadora.add(valor1);
            label2.setBounds(10, 80, 50, 20);
            calculadora.add(label2);
            valor2.setBounds(50, 80, 100, 20);
            calculadora.add(valor2);
            resultado1.setBounds(100, 175, 100, 20);
            resultado1.addActionListener(this);
            calculadora.add(resultado1);
            prueba1.setBounds(10, 200, 100, 20); // borrar tras terminar
            calculadora.add(prueba1);// borrar al terminar
            base.removeAll();
            base.add(calculadora);
            base.revalidate();
            base.repaint();
        }

        if (itemSelect == item1_1) {// segunda calculadora, sumar tres digitos
            // creacion de la calculadora
            calculadora2.setBounds(0, 0, 695, 425);
            calculadora2.setTitle("Calculadora");
            calculadora2.setVisible(true);
            calculadora2.setResizable(true);
            calculadora2.setMaximizable(false);
            calculadora2.setClosable(true);
            calculadora2.setIconifiable(true);
            calculadora2.setLayout(null);
            // creacccion de los componentes de la calculadora
            instruciones.setBounds(10, 10, 280, 20);
            calculadora2.add(instruciones);
            label1.setBounds(10, 50, 50, 20);
            calculadora2.add(label1);
            valor1.setBounds(50, 50, 100, 20);
            calculadora2.add(valor1);
            label2.setBounds(10, 80, 50, 20);
            calculadora2.add(label2);
            valor2.setBounds(50, 80, 100, 20);
            calculadora2.add(valor2);
            label3.setBounds(10, 120, 50, 20);
            calculadora2.add(label3);
            valor3.setBounds(50, 120, 100, 20);
            calculadora2.add(valor3);
            resultado1.setBounds(100, 175, 100, 20);
            resultado1_1.setBounds(100, 175, 100, 20);
            resultado1_1.addActionListener(this);
            calculadora2.add(resultado1_1);
            prueba1.setBounds(10, 200, 100, 20); // borrar tras terminar
            calculadora2.add(prueba1);// borrar al terminar
            base.removeAll();
            base.add(calculadora2);
            base.revalidate();
            base.repaint();
        }

        if (itemSelect == item2) {// tercera calculadora, multiplicar dos numros
            // creacion de la calculadora
            calculadora3.setBounds(0, 0, 695, 425);
            calculadora3.setTitle("Calculadora");
            calculadora3.setVisible(true);
            calculadora3.setResizable(true);
            calculadora3.setMaximizable(false);
            calculadora3.setClosable(true);
            calculadora3.setIconifiable(true);
            calculadora3.setLayout(null);
            // creacccion de los componentes de la calculadora
            instruciones.setBounds(10, 10, 280, 20);
            calculadora3.add(instruciones);
            label1.setBounds(10, 50, 50, 20);
            calculadora3.add(label1);
            valor1.setBounds(50, 50, 100, 20);
            calculadora3.add(valor1);
            label2.setBounds(10, 80, 50, 20);
            calculadora3.add(label2);
            valor2.setBounds(50, 80, 100, 20);
            calculadora3.add(valor2);
            resultado2.setBounds(100, 175, 100, 20);
            resultado2.addActionListener(this);
            calculadora3.add(resultado2);
            prueba1.setBounds(10, 200, 100, 20); // borrar tras terminar
            calculadora3.add(prueba1);// borrar al terminar
            base.removeAll();
            base.add(calculadora3);
            base.revalidate();
            base.repaint();
        }
        if (itemSelect == item2_1) {// cuarta calculadora, multiplicar tres numeros
            // creacion de la calculadora
            calculadora4.setBounds(0, 0, 695, 425);
            calculadora4.setTitle("Calculadora");
            calculadora4.setVisible(true);
            calculadora4.setResizable(true);
            calculadora4.setMaximizable(false);
            calculadora4.setClosable(true);
            calculadora4.setIconifiable(true);
            calculadora4.setLayout(null);
            // creacccion de los componentes de la calculadora
            instruciones.setBounds(10, 10, 280, 20);
            calculadora4.add(instruciones);
            label1.setBounds(10, 50, 50, 20);
            calculadora4.add(label1);
            valor1.setBounds(50, 50, 100, 20);
            calculadora4.add(valor1);
            label2.setBounds(10, 80, 50, 20);
            calculadora4.add(label2);
            valor2.setBounds(50, 80, 100, 20);
            calculadora4.add(valor2);
            label3.setBounds(10, 120, 50, 20);
            calculadora4.add(label3);
            valor3.setBounds(50, 120, 100, 20);
            calculadora4.add(valor3);
            resultado2_1.setBounds(100, 175, 100, 20);
            resultado2_1.addActionListener(this);
            calculadora4.add(resultado2_1);
            prueba1.setBounds(10, 200, 100, 20); // borrar tras terminar
            calculadora4.add(prueba1);// borrar al terminar
            base.removeAll();
            base.add(calculadora4);
            base.revalidate();
            base.repaint();
        }
        if (itemSelect == item3) {// quinta calculadora, restar dos numeros
            // creacion de la calculadora
            calculadora5.setBounds(0, 0, 695, 425);
            calculadora5.setTitle("Calculadora");
            calculadora5.setVisible(true);
            calculadora5.setResizable(true);
            calculadora5.setMaximizable(false);
            calculadora5.setClosable(true);
            calculadora5.setIconifiable(true);
            calculadora5.setLayout(null);
            // creacccion de los componentes de la calculadora
            instruciones.setBounds(10, 10, 280, 20);
            calculadora5.add(instruciones);
            label1.setBounds(10, 50, 50, 20);
            calculadora5.add(label1);
            valor1.setBounds(50, 50, 100, 20);
            calculadora5.add(valor1);
            label2.setBounds(10, 80, 50, 20);
            calculadora5.add(label2);
            valor2.setBounds(50, 80, 100, 20);
            calculadora5.add(valor2);
            resultado3.setBounds(100, 175, 100, 20);
            resultado3.addActionListener(this);
            calculadora5.add(resultado3);
            prueba1.setBounds(10, 200, 100, 20); // borrar tras terminar
            calculadora5.add(prueba1);// borrar al terminar
            base.removeAll();
            base.add(calculadora5);
            base.revalidate();
            base.repaint();
        }
        if (itemSelect == item3_1) {// sexta calculaora resta 3 valores
            // creacion de la calculadora
            calculadora6.setBounds(0, 0, 695, 425);
            calculadora6.setTitle("Calculadora");
            calculadora6.setVisible(true);
            calculadora6.setResizable(true);
            calculadora6.setMaximizable(false);
            calculadora6.setClosable(true);
            calculadora4.setIconifiable(true);
            calculadora6.setLayout(null);
            // creacccion de los componentes de la calculadora
            instruciones.setBounds(10, 10, 280, 20);
            calculadora6.add(instruciones);
            label1.setBounds(10, 50, 50, 20);
            calculadora6.add(label1);
            valor1.setBounds(50, 50, 100, 20);
            calculadora6.add(valor1);
            label2.setBounds(10, 80, 50, 20);
            calculadora6.add(label2);
            valor2.setBounds(50, 80, 100, 20);
            calculadora6.add(valor2);
            label3.setBounds(10, 120, 50, 20);
            calculadora6.add(label3);
            valor3.setBounds(50, 120, 100, 20);
            calculadora6.add(valor3);
            resultado3_1.setBounds(100, 175, 100, 20);
            resultado3_1.addActionListener(this);
            calculadora6.add(resultado3_1);
            prueba1.setBounds(10, 200, 100, 20); // borrar tras terminar
            calculadora6.add(prueba1);// borrar al terminar
            base.removeAll();
            base.add(calculadora6);
            base.revalidate();
            base.repaint();
        }
        Object operacion = e.getSource();
        if (operacion == resultado1) {
            int suma1 = (int) valor1.getValue();
            suma1 += (int) valor2.getValue();
            prueba1.setText("" + suma1);
        }
        if (operacion == resultado1_1) {
            int suma2 = (int) valor1.getValue();
            suma2 += (int) valor2.getValue();
            suma2 += (int) valor3.getValue();
            prueba1.setText("" + suma2);
        }
        if (operacion == resultado2) {
            int suma3 = (int) valor1.getValue();
            suma3 *= (int) valor2.getValue();
            prueba1.setText("" + suma3);
        }
        if (operacion == resultado2_1) {
            int suma4 = (int) valor1.getValue();
            suma4 *= (int) valor2.getValue();
            suma4 *= (int) valor3.getValue();
            prueba1.setText("" + suma4);
        }
        if (operacion == resultado3) {
            int suma5 = (int) valor1.getValue();
            suma5 -= (int) valor2.getValue();
            prueba1.setText("" + suma5);
        }
        if (operacion == resultado3_1) {
            int suma6 = (int) valor1.getValue();
            suma6 -= (int) valor2.getValue();
            suma6 -= (int) valor3.getValue();
            prueba1.setText("" + suma6);
        }
        if (itemSelect == item4) {
            String[] columnas = { "suma 2 N","suma 3","multiplicacion 2","multiplicacion 3",
        "resta 2", "resta 3" };
            Object[][] filas = {
                    { prueba1.getText(), "suma 3 N","resta 2N","","",""},
                    {"EJEMPLO1","EJEMPLO2","EJEMPLO3","","",""}
            };
            registro = new JTable(filas, columnas);
            JScrollPane sp=new JScrollPane(registro);
            sp.setVisible(true);
            sp.setBounds(0, 10, 695, 415);           
            base.removeAll();
            base.add(sp);
            base.revalidate();
            base.repaint();

        }

    }

    public void menu() {
        barra.setBounds(5, 5, 432, 20);
        barra.add(opcion1);
        barra.add(opcion2);
        barra.add(opcion3);
        barra.add(opcion4);
        // items de las opciones
        opcion1.add(item1);
        item1.addActionListener(this);
        opcion1.add(item1_1);
        item1_1.addActionListener(this);
        opcion2.add(item2);
        item2.addActionListener(this);
        opcion2.add(item2_1);
        item2_1.addActionListener(this);
        opcion3.add(item3);
        item3.addActionListener(this);
        opcion3.add(item3_1);
        item3_1.addActionListener(this);
        opcion4.add(item4);
        item4.addActionListener(this);
    }

    public void descktopP() {
        base.setBounds(10, 50, 695, 425);
        base.setBackground(new Color(9, 229, 217));
    }

    public void panel1() {// creacion del layout principal
        lamina1.setLayout(null);
        lamina1.setBounds(10, 10, 715, 515);
        lamina1.setBorder(BorderFactory.createEtchedBorder());
        lamina1.add(barra);
        lamina1.add(base);
        add(lamina1);
    }
}
