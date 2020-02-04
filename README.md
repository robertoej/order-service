# Package by Component Example
Based on this [project](https://github.com/ttulka/blog-code-samples/tree/master/myshop), I implement here a simple example of how to implement the Package by Component architecture as presented by Simon Brown in the Clean Architecture book by Uncle Bob.
## Build
```
mvn clean package
```
## Run
```
cd spring
mvn spring-boot:run
```
## Modules
* `domain`: business domain
* `spring`: Spring Rest Controller and Spring Beans