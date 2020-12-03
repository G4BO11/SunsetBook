package Inicio;

import java.io.InputStream;
import java.util.Scanner;

public class Cliente extends Usuario implements Configuracion 
{
     
    int CantLibros;

    public Cliente() 
    {
        super();
    }

    public Cliente(int id, String nombre, String nickname, String contraseña, String correo, String edad, String fnacimiento) {
        super(id, nombre, nickname, contraseña, correo, edad, fnacimiento);
    }

    public int getCantLibros() 
    {
        return CantLibros;
    }

    public void setCantLibros(int CantLibros) 
    {
        this.CantLibros = CantLibros;
    }

    @Override
    public String getContraseña() {
        return contraseña;
    }

    @Override
    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
    
    
    
    void comprar_libros()
    {
        System.out.println("El usuario "+nombre+" ha comprado la cantidad de "+CantLibros+" libros");
        
    }
    
    
    
    void comentariar()
    {
        
    }
    
    void buscar_libros()
    {
        
    }
    @Override
    public void cambiar_contraseña()
    {
        Scanner leer =new Scanner(System.in); 
         System.out.println("tu contraseña es  "+contraseña+"porfavor escibre por cual deseas cambiar");
       String name=leer.next();
        System.out.println("El Usuario "+nombre+" ha cambiado la contraseña");
         
    }
    @Override
    public void cambiar_nickname()
    {
        
         Scanner leer =new Scanner(System.in); 
         System.out.println("tu usuario es  "+nickname+"porfavor escibre por cual deseas cambiar");
       String name=leer.next();
        nickname= name;
        System.out.println("El usuario  ha cambiado su Nickname a: "+nickname);
    }
 @Override
     public void cambiar_nombre()
    {
        Scanner leer =new Scanner(System.in); 
         System.out.println("tu nombre  es  "+" "+nombre+" "+" porfavor escibre por cual deseas cambiar");
       String name=leer.next();
        nombre = name;
        System.out.println("El usuario  ha cambiado su nombre por : "+nombre);
    }
}
