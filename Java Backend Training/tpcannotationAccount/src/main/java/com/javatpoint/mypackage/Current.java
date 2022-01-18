package com.javatpoint.mypackage;  
import javax.persistence.*;  
  
@Entity  
//@Table(name = "Account")
@DiscriminatorValue("CurrentAccount")  
@AttributeOverrides({  
    @AttributeOverride(name="id", column=@Column(name="id")),
    @AttributeOverride(name="AccountId", column=@Column(name="AccountId")), 
    @AttributeOverride(name="name", column=@Column(name="name"))  
})  
public class Current extends Account{  
      
@Column(name="OverDraftAmount")    
private float OverDraftAmount;

public float getOverDraftAmount() {
	return OverDraftAmount;
}

public void setOverDraftAmount(float overDraftAmount) {
	OverDraftAmount = overDraftAmount;
}  
  

}  