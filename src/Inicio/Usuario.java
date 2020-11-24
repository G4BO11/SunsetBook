package Inicio;

public abstract class  Usuario 
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
     
    
    public void cambiar_contraseña()
    {
        System.out.println("El Usuario "+nombre+" ha cambiado la contraseña");
    }
    void cambiar_nickname()
    {
        System.out.println("El usuario "+nombre+" ha cambiado su Nickname a: "+nickname);
    }
   
    
}
