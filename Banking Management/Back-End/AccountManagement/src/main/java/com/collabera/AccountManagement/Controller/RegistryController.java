package com.collabera.AccountManagement.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.collabera.AccountManagement.Entity.BillerProvider;
import com.collabera.AccountManagement.Entity.BillerRegister;
import com.collabera.AccountManagement.Entity.BillerStatement;
import com.collabera.AccountManagement.Service.ProviderService;
import com.collabera.AccountManagement.Service.RegisterService;
import com.collabera.AccountManagement.Service.StatementService;

@CrossOrigin(origins = "http://localhost:3000/")
@RestController
@RequestMapping(path="/registry")
public class RegistryController {

	    @Autowired
	    ProviderService providerService;
	    
	    @Autowired
	    RegisterService registerService;
	    
	    @Autowired
	    StatementService statementService;
	    
	    //TO CREATE AN BILLER_REGISTER
	    @PostMapping("/register")  	   
	    public ResponseEntity<String> createNewRegister(@RequestBody BillerRegister billerRegister) {
	    	String strCreateStatus="Biller Registered Succesfully";
	    	registerService.createNewRegistry(billerRegister);
			return ResponseEntity.status(HttpStatus.CREATED).body(strCreateStatus);
	    }
	    
	    //TO FIND AN REGISTER BILLER BY ID
	    @GetMapping("/register/{id}")
	    public ResponseEntity<BillerRegister> readRegister(@PathVariable long id)
    	{
	    	BillerRegister billerRegister=registerService.findById(id);
    		return ResponseEntity.ok(billerRegister);
        } 
//	----------------------------------------------  //  
	    //TO CREATE AN BILLER_PROVIDER 
	    @PostMapping("/provider")  	   
	    public ResponseEntity<String> createNewProvider(@RequestBody BillerProvider billerProvider) {
	    	String strCreateStatus="Biller Provided Succesfully";
	    	providerService.createNewProvider(billerProvider);
			return ResponseEntity.status(HttpStatus.CREATED).body(strCreateStatus);
	    }
	    
	    //TO READ AN EXISTING PROVIDER BY ID   
        @GetMapping("/provider/{id}")      
        public ResponseEntity<BillerProvider> readProvider(@PathVariable long id)
        	{
        		BillerProvider billerProvider= providerService.findBillerProviderById(id);
        		return ResponseEntity.ok(billerProvider);
            }             
 //-------------------------------------------------//
      // TO LIST ALL STATEMENTS
      @GetMapping("/statement")
	   public ResponseEntity<List<BillerStatement>>listAllBillerStatement() 
	   
      {
   	   List<BillerStatement> billerStatement=statementService.listAllBillerStatement();
   	   return ResponseEntity.ok(billerStatement);
  
      }
               
}
