/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package www.fioreser.com.pe.infrastructure.entity;
import jakarta.persistence.*;

/**
 *
 * @author Fabricio
 */
@Entity
@Table(name="Category")
public class CategoryEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idCa;
    private String nombreCa;
    @Enumerated(EnumType.STRING)
    @JoinColumn(name = "StatusType")
    private StatusType status;

    public CategoryEntity() {
    }

    public CategoryEntity(Integer idCa, String nombreCa, StatusType status) {
        this.idCa = idCa;
        this.nombreCa = nombreCa;
        this.status = status;
    }

    public Integer getIdCa() {
        return idCa;
    }

    public void setIdCa(Integer idCa) {
        this.idCa = idCa;
    }

    public String getNombreCa() {
        return nombreCa;
    }

    public void setNombreCa(String nombreCa) {
        this.nombreCa = nombreCa;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CategoryEntity{" + "idCa=" + idCa + ", nombreCa=" + nombreCa + ", status=" + status + '}';
    }

    
    
}
