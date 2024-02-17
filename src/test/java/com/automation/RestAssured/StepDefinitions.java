package com.automation.RestAssured;

import java.io.IOException;

import functions.Pet;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinitions 
{

    @Given("Add a new pet")
    public void Addanewpet() throws IOException 
    {
    	Pet.Addanewpetpet();
    }

  
    @When("Updates a pet in the store with the form data")
    public void Updatesapetinthestorewiththeformdata() throws IOException 
    {
    	Pet.Updatesapetinthestorewiththeformdata();
    }
    
    
    @Then("Find Pets by status")
    public void FindPetsbystatus() throws IOException 
    {
    	Pet.FindPetsbystatus();
    }
    
    @And("Find Pets by tags")
    public void FindPetsbytags() throws IOException 
    {
    	Pet.FindPetsbytags();
    }
    
    @And("Find Pets by ID")
    public void FindPetsbyID() throws IOException 
    {
    	Pet.FindPetsbyID();
    }
    
    @And("Update an existing Pet")
    public void UpdateanexistingPet() throws IOException 
    {
    	Pet.Updateanexistingpet();
    }
    
    @And("Delete the Pet")
    public void DeletethePet() throws IOException 
    {
    	Pet.DeletethePet();
    }
    
    
    

}
