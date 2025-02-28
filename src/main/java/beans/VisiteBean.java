/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package beans;

import jakarta.enterprise.context.SessionScoped;
import jakarta.faces.application.FacesMessage;
import jakarta.faces.context.FacesContext;
import jakarta.inject.Named;
import java.io.Serializable;
import java.util.Date;
import jakarta.faces.convert.DateTimeConverter;
import jakarta.faces.convert.FacesConverter;

/**
 *
 * @author Jenovic Mwambay
 */
@SessionScoped
@Named(value="formulaireVisiteBean")
public class VisiteBean implements Serializable {
    private Long idUtilisateur;
    private Long idLieu;
    private Date dateVisite;
    private int tempsPasse;
    private String observations;
    private double depenses;
    private boolean afficherFormulaireVisite;
public void afficherFormulaireVisite() {
    afficherFormulaireVisite = true;
}
public void sauvegarderVisite() {
    // Logique pour sauvegarder la visite
    FacesContext.getCurrentInstance().addMessage(null, new
    FacesMessage(FacesMessage.SEVERITY_INFO, "Visite enregistrée avec succès", null));
    afficherFormulaireVisite = false;
}
public boolean isAfficherFormulaireVisite() {
    return afficherFormulaireVisite;
}

    public Date getDateVisite() {
        return dateVisite;
    }

    public double getDepenses() {
        return depenses;
    }

    public Long getIdLieu() {
        return idLieu;
    }

    public int getTempsPasse() {
        return tempsPasse;
    }

    public Long getIdUtilisateur() {
        return idUtilisateur;
    }

    public void setDateVisite(Date dateVisite) {
        this.dateVisite = dateVisite;
    }

    public void setTempsPasse(int tempsPasse) {
        this.tempsPasse = tempsPasse;
    }

    public void setIdUtilisateur(Long idUtilisateur) {
        this.idUtilisateur = idUtilisateur;
    }

    public void setIdLieu(Long idLieu) {
        this.idLieu = idLieu;
    }

    public void setAfficherFormulaireVisite(boolean afficherFormulaireVisite) {
        this.afficherFormulaireVisite = afficherFormulaireVisite;
    }

    public void setDepenses(double depenses) {
        this.depenses = depenses;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    public String getObservations() {
        return observations;
    }


}
