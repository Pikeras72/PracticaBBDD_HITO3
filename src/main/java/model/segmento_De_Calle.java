package model;

import javax.persistence.*;

@Entity
@Table(name = "segmento_De_Calle")
public class segmento_De_Calle {

    @Id
    @GeneratedValue
    @Column(name = "Num_Segm")
    private long Num_Segm;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Calle")
    private calle Nombre_Calle;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Nombre_Municipio")
    private municipio Nombre_Municipio;

    @Column(name = "Num_Inicio")//, nullable = false)
    private int Num_Inicio;

    @Column(name = "Num_Final")//, nullable = false)
    private int Num_Final;

    public segmento_De_Calle(){
        // requerido por Hibernate
    }

    public segmento_De_Calle(int num_Segm, calle nombre_Calle, municipio nombre_Municipio, int num_Inicio, int num_Final) {
        Num_Segm = num_Segm;
        Nombre_Calle = nombre_Calle;
        Nombre_Municipio = nombre_Municipio;
        Num_Inicio = num_Inicio;
        Num_Final = num_Final;
    }

    //getters y setters

    public long getNum_Segm() {
        return Num_Segm;
    }

    public void setNum_Segm(int num_Segm) {
        Num_Segm = num_Segm;
    }

    public calle getNombre_Calle() {
        return Nombre_Calle;
    }

    public void setNombre_Calle(calle nombre_Calle) {
        Nombre_Calle = nombre_Calle;
    }

    public municipio getNombre_Municipio() {
        return Nombre_Municipio;
    }

    public void setNombre_Municipio(municipio nombre_Municipio) {
        Nombre_Municipio = nombre_Municipio;
    }

    public int getNum_Inicio() {
        return Num_Inicio;
    }

    public void setNum_Inicio(int num_Inicio) {
        Num_Inicio = num_Inicio;
    }

    public int getNum_Final() {
        return Num_Final;
    }

    public void setNum_Final(int num_Final) {
        Num_Final = num_Final;
    }
}
