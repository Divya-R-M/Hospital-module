package com.cg.jpa_healthassist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
/*author: Charushi and Divya
desc:Bed Model
*/ 
@Entity
public class Bed {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int bedId;
	private String bedType;

	public Bed(String bedType) {
		super();
		this.bedType = bedType;
	}

	public Bed() {
		super();
	}


	public int getBedId() {
		return bedId;
	}

	public void setBedId(int bedId) {
		this.bedId = bedId;
	}

	public String getBedType() {
		return bedType;
	}

	public void setBedType(String bedType) {
		this.bedType = bedType;
	}

	@Override
	public String toString() {
		return "Bed [bedId=" + bedId + ", bedType=" + bedType + "]";
	}
	
}
