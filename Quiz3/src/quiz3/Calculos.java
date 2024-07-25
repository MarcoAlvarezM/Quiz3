/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package quiz3;

import javax.swing.JOptionPane;

/**
 *
 * @author Marco
 */
public class Calculos {
    
    private Inventario inventario[]=new Inventario[6]; 
    
    Inventario inv = new Inventario();
    
    public void solicitarinfo(){
      int x;
      for(x=0;x<3;x++){
          inv.setSupermercado(JOptionPane.showInputDialog(null,"Ingrese el nombre del supermercado"));
          inv.setCodigo(JOptionPane.showInputDialog(null,"Digite el codigo del producto"));
          inv.setN_producto(JOptionPane.showInputDialog(null,"Ingrese el nombre del producto"));;
          inv.setN_empleado(JOptionPane.showInputDialog(null,"Ingrese el nombre del empleado"));
          inv.setC_empleado(JOptionPane.showInputDialog(null,"Digite la cedula del empleado:"));
          inv.setCantidad(Integer.parseInt(JOptionPane.showInputDialog(null,"Digite la cantidad del producto:")));
          inv.setPrecio(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio del producto:")));
          inv.setTipo(JOptionPane.showInputDialog(null,"Ingrese el tipo del producto:"));
          inv.setPrecio_bruto(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite el precio bruto del producto:")));
          inv.setGanancia(Double.parseDouble(JOptionPane.showInputDialog(null,"Digite la descripción del producto:")));
       
          inventario[x]=inv;
          
      }
      
    }
      
    public void calcularPrecios(){
        
        double alimentos=0;
        double bebidas=0; 
        double higiene=0;
        double limpieza=0;
        
        alimentos = alimentos + (0.20);
        bebidas = bebidas + (0.30);
        higiene = higiene + (0.25);
        limpieza = limpieza + (0.19 + limpieza * 0.4 + 1000) + limpieza;
        
        
    }
    
}
