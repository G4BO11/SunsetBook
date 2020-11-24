package Inicio;

public class Cliente extends Usuario
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
    
    
}
