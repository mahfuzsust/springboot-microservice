# springboot-microservice

## Project setup
```
git clone git@github.com:mahfuzsust/springboot-microservice.git
cd springboot-microservice
```

## Run Application

### Eureka server
```
cd eureka-server && ./gradlew build && cd ..
nohup java -jar eureka-server/build/libs/eureka-server-0.0.1-SNAPSHOT.jar &
```
### Book service
```
cd book-service && ./gradlew build && cd ..
nohup java -jar book-service/build/libs/book-service-0.0.1-SNAPSHOT.jar &
```
### Rating service
```
cd rating-service && ./gradlew build && cd ..
nohup java -jar rating-service/build/libs/rating-service-0.0.1-SNAPSHOT.jar &
```
### User service
```
cd user-service && ./gradlew build && cd ..
nohup java -jar user-service/build/libs/user-service-0.0.1-SNAPSHOT.jar &
```
### Zuul server
```
cd zuul-server && ./gradlew build && cd ..
nohup java -jar zuul-server/build/libs/zuul-server-0.0.1-SNAPSHOT.jar &
```

## Eureka dashboard
<p>Default eureka port: 8761</p>
Open a browser to go to [http://localhost:8761](http://localhost:8761) 

## Zuul proxy

Get all the books with the ratings for the user 2 (Test 2)
```
curl http://localhost:9999/api/rating-server/rating/get/user/2
```


![alt text][diagram]

[diagram]: Spring%20Boot%20Microservice%20Diagram.png "Service Diagram"