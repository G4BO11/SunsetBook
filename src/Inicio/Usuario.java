package Inicio;

public class Usuario 
{
    int id;
    String nombre;
    String nickname;
    String contraseña;
    String correo;
    String edad;
    String fnacimiento;

    public Usuario() 
    {
        
    }

    public Usuario(int id, String nombre, String nickname, String contraseña, String correo, String edad, String fnacimiento) {
        this.id = id;
        this.nombre = nombre;
        this.nickname = nickname;
        this.contraseña = contraseña;
        this.correo = correo;
        this.edad = edad;
        this.fnacimiento = fnacimiento;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getFnacimiento() {
        return fnacimiento;
    }

    public void setFnacimiento(String fnacimiento) {
        this.fnacimiento = fnacimiento;
    }
     
    void buscar_libros()
    {
        
    }
    
    void cambiar_nickname()
    {
        
    }
    void cambiar_contraseña()
    {
        
    }
    
    
}
