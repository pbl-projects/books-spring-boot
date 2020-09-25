# Books Example
## A CRUD example with Spring Boot
Maintains a list of Book Titles. The user can view the list of boks, 
add a new book, edit and change a book's title, or delete a book.

## Instructions

1. Clone the provided solution from GitHub into any directory you want: 
```
https://github.com/pbl-projects/books-spring-boot.git
```

2. Open the newly created folder with IntelliJ IDEA(*). Maven will build the project adding any dependencies.

3. Create a MySQL database and grand permissions on this database to a user. (Default DB: example_books, user: test, password: test). No need to create a table in the database, Spring Boot will take care of this.

4. Adjust the lines 2,3,4 in the ```/src/main/resources/application.properties``` file, if your database, user, or password is different:

```
spring.datasource.url=jdbc:mysql://localhost:3306/example_books?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC
spring.datasource.username=test
spring.datasource.password=test
```

5. Run the application.

***
(*) You may use another IDE if you want. *SpringToolsSuite 4* or *Eclipse* are recommended as alternatives.