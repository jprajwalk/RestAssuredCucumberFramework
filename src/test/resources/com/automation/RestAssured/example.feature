Feature: Details of the Per

        Scenario: Data Updation over the DB for the Pets
            Given Add a new pet
             When Updates a pet in the store with the form data
             Then Find Pets by status
              And Find Pets by tags
              And Find Pets by ID
              And Update an existing Pet
              And Delete the Pet
    
