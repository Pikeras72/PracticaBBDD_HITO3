package model;

import javax.persistence.*;

@Entity
@Table(name = "area_Envio")
public class area_Envio {

    @Id
    @Column(name = "ID_Area_Envio")
    private String ID_Area_Envio;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "Cod_Oficina")
    private oficina Cod_Oficina;

    public area_Envio () {
        // requerido por Hibernate
    }

    public area_Envio(String ID_Area_Envio, oficina cod_Oficina) {
        this.ID_Area_Envio = ID_Area_Envio;
        this.Cod_Oficina = cod_Oficina;
    }

    //getters y setters

    public String getID_Area_Envio() {
        return ID_Area_Envio;
    }

    public void setID_Area_Envio(String ID_Area_Envio) {
        this.ID_Area_Envio = ID_Area_Envio;
    }

    public oficina getCod_Oficina() {
        return Cod_Oficina;
    }

    public void setCod_Oficina(oficina cod_Oficina) {
        Cod_Oficina = cod_Oficina;
    }
}
