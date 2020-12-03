package Inicio;


import java.util.Scanner;

public class Admin extends Usuario implements Configuracion
{
    

    public Admin() {
    }

    public Admin(int id, String nombre, String nickname, String contraseña, String correo, String edad, String fnacimiento) {
        super(id, nombre, nickname, contraseña, correo, edad, fnacimiento);
    }
    
    void bannear()
    {
        
    }
    void sacar_libro()
    {
        
    }
    void introducir_libro()
    {
        
    }
    @Override
    public void cambiar_contraseña()
    {
        System.out.println("El Usuario "+nombre+" ha cambiado la contraseña");
        
    }
    @Override
    public void cambiar_nickname()
    {
        System.out.println("El usuario "+nombre+" ha cambiado su Nickname a: "+nickname);
    }
        
    @Override
     public void cambiar_nombre(){
    
        Scanner leer =new Scanner(System.in); 
         System.out.println("tu nombre  es  "+" "+nombre+" "+"porfavor escibre por cual deseas cambiar");
       String name=leer.next();
       nombre = name;
        System.out.println("El usuario  ha cambiado su nombre por : "+nombre);
    }
 }  

