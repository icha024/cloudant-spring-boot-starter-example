# Example for using Cloudant with Spring-Boot-Starter
[![Build Status](https://travis-ci.org/icha024/cloudant-spring-boot-starter-example.svg?branch=master)](https://travis-ci.org/icha024/cloudant-spring-boot-starter-example)

### Running with Cloudant
1. Place your Cloudant credential in the property file:
  ```
  src/main/resources/application.properties
  ```
2. Start Spring-boot as usual: 
  ```
  mvn spring-boot:run
  ```
3. Saving data to DB but hitting the URL:
  <http://localhost:8080/save>
4. Then check the data in your Cloudant account, it should save your pet data to a DB instance called 'myDB'

### Running with local CouchDB
You may want to use a local CouchDB instance instead, the easiest way to do this is to use Docker
```
docker run -ti --rm -p 5984:5984 klaemo/couchdb
```
(See [CouchDB Docker guide](https://hub.docker.com/r/klaemo/couchdb/))

1. Once you have CouchDB running locally, you can just fire up the 'local' SpringBoot profile:
  ```
  mvn spring-boot:run -Dspring.profiles.active=local
  ```
2. Saving data to DB by hitting the URL: 
  <http://localhost:8080/save>
3. Check your CouchDB instance for the saved data, this is available at:
  <http://localhost:5984/_utils/database.html?mydb>
