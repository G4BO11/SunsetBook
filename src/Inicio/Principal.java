package Inicio;

public class Principal 
{
    public static void main(String[] args) 
    {
       
       Cliente ab = new Cliente();
       Admin ad = new Admin();
       
       
       ab.setCantLibros(15);
       ab.setNombre("Deisy");
       ab.setNickname("deisylaburrita");
       ab.comprar_libros();       
       ab.cambiar_contraseña();
       ab.cambiar_nickname();
        //System.out.println("El usuario "+a.getNombre()+" Ha cambiado su contraseña");
       
       
              
    }
    
}
