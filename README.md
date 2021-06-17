# ElasticOneLab
Person.java creates an entity Person and a Document with indexName = "mylord"

Created Interface PersonRepository where I added @Query type queries for the corresponding functions (findByName, findOlderThan, findByAge)

In the file PersonController I used @RestController to send requests to http://localhost:8080/persons

Added 5 instances of Person entities via Post request to http://localhost:8080/persons/add with name and age parameters and saved them in PersonRepository via save() function

Checked if all the field (name and age) are there via http://localhost:9200/mylord/_mappings

We can see all the Documents in index mylord via http://localhost:9200/mylord/_search?pretty=true&q=*:* (Showed that 5 people with names and ages are present)

Created Get requests to search for Documents according to the parameters passed by @RequestParam. (findByName, findOlderThan, findByAge queries used)

Created also Get request to http://localhost:8080/persons/getall to see all added instances. Used personRepository.findAll(). 

Updated the repository for microservices task (commit message = "d")
