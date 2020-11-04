# spring-boot-scala

## pre-requsit

Maven
oracle jdk 8
git

### spring-boot-scala rest api server


#### maven 

git clone https://github.com/NNDSrinivas/spring-scala-restfull-demo.git
cd spring-boot-scala
mvn spring-boot:run

#### test
### TRY to execute post method test cases first to get expected result. 

```
- post
```

#### curl demo test data

```
- shorturltoken => return sorturl from below method.
```

curl --header "Content-Type:application/json" --request POST --data "{\"longUrl\":\"/type?longurl=123p_P_id=klsdsacadsfkbasdjv_czmnbvfjshfbjhsdp_p_mode=view\"}"  http://localhost:8080/createShorthand

```


```
- get
```

curl http://localhost:8080/getOrignalUrl/{shorturltoken}
curl http://localhost:8080/{shorturltoken}  

Example

curl http://localhost:8080/getOrignalUrl/b
curl http://localhost:8080/b  






