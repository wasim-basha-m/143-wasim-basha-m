package com.marticus.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "EX3STUDENT")
public class Ex3Student {

private long studentId;
private String studentName;
private Set<CoachingCentre> coachingcentre = new HashSet<CoachingCentre>(0);

public Ex3Student() {
}

public Ex3Student(String studentName, Set<CoachingCentre> coachingcentre) {
this.studentName = studentName;
this.coachingcentre = coachingcentre;
}

@Id
@GeneratedValue
@Column(name = "STUDENT_ID")
public long getStudentId() {
return this.studentId;
}

public void setStudentId(long studentId) {
this.studentId = studentId;
}

@Column(name = "STUDENT_NAME", nullable = false, length = 100)
public String getStudentName() {
return this.studentName;
}

public void setStudentName(String studentName) {
this.studentName = studentName;
}

@OneToMany(cascade = CascadeType.ALL)
@JoinTable(name = "STUDENT_CENTRE", joinColumns = { @JoinColumn(name = "STUDENT_ID") }, inverseJoinColumns = { @JoinColumn(name = "COACHING_ID") })
public Set<CoachingCentre> getCoachingCentre() {
return this.coachingcentre;
}

public void setCoachingCentre(Set<CoachingCentre> coachingcentre) {
this.coachingcentre = coachingcentre;
}

}