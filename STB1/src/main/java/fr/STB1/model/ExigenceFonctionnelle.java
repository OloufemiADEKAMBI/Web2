package fr.STB1.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

// @XmlType(name = "exigenceF")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
//@Table(name="ExigenceF")
public class ExigenceFonctionnelle implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	//@Column(name="IdE")
	private int IdExigence;
	
	//@Column(length=50)
	@XmlElement
    private String Identifiant;
     
	//@Column(length=50)
	@XmlElement
    private String Description;
     
	//@Column
	@XmlElement
    private int Priorite; 
    
    public ExigenceFonctionnelle(String cid, String cdesc, int cp)
    {
    	this.Identifiant = cid;
    	this.Description = cdesc;
    	this.Priorite = cp; 
    	
    }
    
    public ExigenceFonctionnelle() {}

	public String getIdentifiant() {
		return Identifiant;
	}

	public void setIdentifiant(String identifiant) {
		this.Identifiant = identifiant;
	}

	public String getDescription() {
		return Description;
	}

	public void setDescription(String description) {
		this.Description = description;
	}

	public int getPriorite() {
		return Priorite;
	}

	public void setPriorite(int priorite) {
		this.Priorite = priorite;
	}
    

}
