package com.javatpoint.mypackage;  
import javax.persistence.*;  
  
@Entity  
@Table(name = "Account")  
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)  
@DiscriminatorColumn(name="type",discriminatorType=DiscriminatorType.STRING)  
@DiscriminatorValue(value="account")   
public class Account {  
@Id  
@GeneratedValue(strategy=GenerationType.AUTO)  
      
@Column(name = "id")  
private int id;  
  
@Column(name = "AccountId")  
private String AccountId;

@Column(name = "name")  
private String name;

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getAccountId() {
	return AccountId;
}

public void setAccountId(String accountId) {
	AccountId = accountId;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}


}  