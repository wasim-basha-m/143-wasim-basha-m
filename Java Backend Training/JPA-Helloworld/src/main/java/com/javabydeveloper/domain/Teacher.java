package com.javabydeveloper.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Table(name="Teacher")
@Entity(name = "Tea")
public class Teacher {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 
	@Column(name = "ID")
	private Long TeacherId;

	@Column(name = "NAME")
	private String Name;
	
	@Column(name = "PHYSICS")
	private String Physics;
	
	@Column(name = "MSC")
	private String Msc ;

	public Long getTeacherId() {
		return TeacherId;
	}

	public void setTeacherId(Long teacherId) {
		TeacherId = teacherId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}


	public String getPhysics() {
		return Physics;
	}

	public void setPhysics(String physics) {
		Physics = physics;
	}

	public String getMsc() {
		return Msc;
	}

	public void setMsc(String msc) {
		Msc = msc;
	}

	@Override
	public String toString() {
		return "Teacher [teacherId=" + TeacherId + ", name=" + Name + ", Physics=" + Physics + ", Msc=" + Msc + "]";
	}
	
}
