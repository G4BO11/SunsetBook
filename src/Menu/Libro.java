package Menu;

public class Libro
{
    int IDLibro;
    String Titulo;
    String autor;
    String editorial;
    int numpag;
    String tamano;

    public Libro() 
    {
        super();
    }

    public Libro(int IDLibro, String Titulo, String autor, String editorial) {
        this.IDLibro = IDLibro;
        this.Titulo = Titulo;
        this.autor = autor;
        this.editorial = editorial;
    }
    
    

    public int getIDLibro() {
        return IDLibro;
    }

    public void setIDLibro(int IDLibro) {
        this.IDLibro = IDLibro;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getNumpag() {
        return numpag;
    }

    public void setNumpag(int numpag) {
        this.numpag = numpag;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamaño(String tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Libro{" + "IDLibro=" + IDLibro + ", Titulo=" + Titulo + ", autor=" + autor + ", editorial=" + editorial + ", numpag=" + numpag + ", tama\u00f1o=" + tamano + '}';
    }
    
    
    
}
