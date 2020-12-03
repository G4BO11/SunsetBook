package Inicio;

//import java.util.Scanner;



public class Principal  
{
    public static void main(String[] args) 
    {
       Admin ad = new Admin();
      Cliente  ab = new Cliente();
       
       ad.cambiar_nombre();
      
       
       ab.setCantLibros(15);
       ab.setNombre("temporal");
       ab.setNickname("temporal");
       ab.cambiar_nombre();
       ab.comprar_libros();       
       ab.cambiar_contraseña();
       ab.cambiar_nickname();
       
    

 }
}
