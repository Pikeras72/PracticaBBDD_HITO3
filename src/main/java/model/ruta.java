package model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table(name = "ruta")
public class ruta {
    @Id
    @Column(name = "ID_Ruta")
    private int ID_Ruta;

    @OneToMany(mappedBy = "ruta", cascade = CascadeType.ALL)
    private Set<reparto> repartos;
    public ruta(int ID_Ruta) {
        this.ID_Ruta = ID_Ruta;
    }

    public ruta() {
        //requerido
    }

    //getters y setters

    public int getID_Ruta() {
        return ID_Ruta;
    }

    public void setID_Ruta(int ID_Ruta) {
        this.ID_Ruta = ID_Ruta;
    }
}
