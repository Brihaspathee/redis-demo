# Redis Cache

## Demo
This is a demo application to cache the database data using redis. The demo application contains one entity **BOOK**
* Spring Data Redis is used to cache the data in Redis database
* Redis is installed locally as a Docker Container
* H2 Database is used as a relational database to store data
* Book Id is the key that is used to cache the records in Redis and retrieve from Redis cache if the same book id is used