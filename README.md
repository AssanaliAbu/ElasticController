# ElasticOneLab
Person.java creates an entity Person and a Document with indexName = "mylord"

Created Interface PersonRepository where I added @Query type queries for the corresponding functions (findByName, findOlderThan, findByAge)

In the file PersonController I used @RestController to send request to http://localhost:8080/persons

Added 5 instances of Person entities via post request to http://localhost:8080/persons/add with name and age parameters and saved them in PersonRepository via save() function

I checked all the Documents in index mylord via http://localhost:9200/mylord/_search?pretty=true&q=*:*

Created Get requests to search for Documents according to the parameters passed by @RequestParam. (findByName, findOlderThan, findByAge queries used)
