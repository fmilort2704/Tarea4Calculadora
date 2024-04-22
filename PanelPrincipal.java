/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package daw;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextArea;


/**
 *
 * @author francisco
 */
public class PanelPrincipal extends JPanel{
    // Atributos de la clase (privados)
	private BotonesCalculadora botonera;
	private JTextArea areaTexto;
	private int tipoOperacion;
    
	// Constructor
	public PanelPrincipal(){
    		initComponents();
    		tipoOperacion = -1; // No hay operaciones en la calculadora
	}
    
	// Se inicializan los componentes gráficos y se colocan en el panel
	private void initComponents(){
    		// Creamos el panel de botones
    		botonera = new BotonesCalculadora();
    		// Creamos el área de texto
    		areaTexto = new JTextArea(10,50);
    		areaTexto.setEditable(false);
    		areaTexto.setBackground(Color.white);
   
    		//Establecemos layout del panel principal
    		this.setLayout(new BorderLayout());
    		// Colocamos la botonera y el área texto
    		this.add(areaTexto, BorderLayout.NORTH);
    		this.add(botonera, BorderLayout.SOUTH);
	 
	}
}
