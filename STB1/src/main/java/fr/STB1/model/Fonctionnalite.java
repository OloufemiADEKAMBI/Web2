package fr.STB1.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.annotations.ManyToAny;

@XmlAccessorType(XmlAccessType.NONE)
@Entity
//@Table(name="fonctionnalite")
public class Fonctionnalite implements Serializable {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name="IdF")
	private int IdFonctionnalite;
	
	//@Column(length=50)
	@XmlElement(name="Description")
    private String DescriptionF;
    
	//@Column
    @XmlAttribute
    private int Priorite;
   
	@OneToMany(cascade = {CascadeType.PERSIST})
	@XmlElement(name="exigenceF")
    private List<ExigenceFonctionnelle> Ef = new ArrayList<>();;

    public Fonctionnalite(int id,String cdesc, int priorite, List<ExigenceFonctionnelle> exigences)
    {
    	this.IdFonctionnalite=id;
    	this.Ef = new ArrayList<>();
    	this.DescriptionF = cdesc;
    	this.Priorite = priorite;
    	this.Ef = exigences; 
    	
    }
    
    public Fonctionnalite() {}

	public String getDescription() {
		return DescriptionF;
	}

	public void setDescription(String description) {
		this.DescriptionF = description;
	}

	public int getPriorite() {
		return Priorite;
	}

	public void setPriorite(int priorite) {
		this.Priorite = priorite;
	}

	public List<ExigenceFonctionnelle> getEF() {
		return Ef;
	}

	public void setEF(ArrayList<ExigenceFonctionnelle> eF) {
		this.Ef = eF;
	}

	public int getIdFonctionnalite() {
		return IdFonctionnalite;
	}

	public void setIdFonctionnalite(int idFonctionnalite) {
		IdFonctionnalite = idFonctionnalite;
	}

	
	public String getDescriptionF() {
		return DescriptionF;
	}

	public void setDescriptionF(String descriptionF) {
		DescriptionF = descriptionF;
	}

	public List<ExigenceFonctionnelle> getEf() {
		return Ef;
	}

	public void setEf(List<ExigenceFonctionnelle> ef) {
		Ef = ef;
	}
    
    
}
