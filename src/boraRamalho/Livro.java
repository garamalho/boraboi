
package boraRamalho;

public class Livro {
    private String titulo;
    private String autor;
    private String ispn;
    private int numDePaginas;
    private int ano;
    private String editora;
    private double valor;
    
    public void setTitulo (String titulo){
        this.titulo=titulo;
    }

    public String getTitulo (String titulo){
        return this.titulo;
    }
    public void setAutor (String autor){
        this.autor=autor;
    }

    public String getAutor (String autor){
        return this.autor;
    }
    public void setIspn (String ispn){
        this.ispn=ispn;
    }

    public String getIspn (String ispn){
        return this.ispn;
    }
    public void setNumDePaginas (int numDePaginas ){
        this.numDePaginas=numDePaginas;
    }

    public int getNumDePaginas (int numDePaginas){
        return this.numDePaginas;
    }
    public void setAno (int ano){
        this.ano=ano;
    }

    public int getAno (int ano){
        return this.ano;
    }
    public void setEditora (String editora){
        this.editora=editora;
    }

    public String getEditora (String editora){
        return this.editora;
    }
    public void setValor (double valor){
        this.valor=valor;
    }

    public double getValor (double valor) {
        return this.valor;
    }
}
