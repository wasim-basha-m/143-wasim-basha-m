package com.marticus.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "COACHING_CENTRE")
public class CoachingCentre {

private long CoachingId;
private String Name;
private String Subject;

public CoachingCentre() {
}

public CoachingCentre(String Name, String Subject) {
this.Name = Name;
this.Subject = Subject;
}

@Id
@GeneratedValue
@Column(name = "COACHING_ID")
public long getPhoneId() {
return this.CoachingId;
}

public void setPhoneId(long CoachingId) {
this.CoachingId = CoachingId;
}

@Column(name = "NAME", nullable = false)
public String getPhoneType() {
return this.Name;
}

public void setPhoneType(String name) {
this.Name = name;
}

@Column(name = "SUBJECT", nullable = false, length=15)
public String getPhoneNumber() {
return this.Subject;
}

public void setPhoneNumber(String Subject) {
this.Subject = Subject;
}

}