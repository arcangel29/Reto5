package reto5feber.Vista;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import reto5feber.Modelo.VO.*;

import java.awt.*;
import java.util.ArrayList;

public class Interfaz3 extends JFrame{
    JPanel panelg;
    JTable tabla;
    JScrollPane scpanel01;
    DefaultTableModel modelo;

    public Interfaz3(){
        setTitle("Tercer Informe");
        setSize(500,500);
        setResizable(false);
        
        panelg= new JPanel();
        panelg.setBackground(new Color(47,79,79));
        
        String[] columnas={"ID","Constructora","Banco"};
        ArrayList<String[]> d=Consulta3VO.valores();
        String[][] Datos= new String[d.size()][3];

        for (int i = 0; i < d.size(); i++) {
            int j=0;
            for (String s : d.get(i)) {
                Datos[i][j]=s;
                j++;
            }
            
        }
        
        //String[][] Datos={{"","","",""},{"","","",""}};
        modelo=new DefaultTableModel(Datos,columnas);
        tabla=new JTable(modelo);

        scpanel01=new JScrollPane(tabla);
        scpanel01.setBounds(20,20,440,300);
        add(scpanel01);


        add(panelg);
        setVisible(true);
    }
}
