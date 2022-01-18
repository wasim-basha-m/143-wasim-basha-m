package com.javatpoint.mypackage;  
import javax.persistence.*;  
@Entity 
//@Table(name = "Account")
@DiscriminatorValue("SavingAccount")

@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),
    @AttributeOverride(name="AccountId", column=@Column(name="AccountId")), 
    @AttributeOverride(name="name", column=@Column(name="name")),  
   
})  
public class Savings extends Account{  
      
    public float getInterest() {
		return Interest;
	}

	public void setInterest(float interest) {
		Interest = interest;
	}

	@Column(name="Interest")  
    private float Interest; 
    
   
}  