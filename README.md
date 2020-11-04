# spring-boot-scala

#### pre-requsit

maven
oracle jdk 8
git
curl

####Explanantion

This demo project convert the long url into short URL and as of now as it is demo this can be accessable from command prompt
and from PostMan, Rest Client API (third party api tool.)

UrlConversion.encode : this method is used to encode the long url by using base conversion technique to sort url and save into in memory data base which is h2.


UrlConversion.decode : this method is used to decode the short url to long url based upon short token passed.



### spring-boot-scala rest api server


#### maven 

git clone https://github.com/NNDSrinivas/spring-scala-restfull-demo.git
cd spring-boot-scala
mvn spring-boot:run

### test
#### TRY to execute post method test cases first to get expected result. 

```
- post
```

#### curl demo test data

```
- shorturltoken => return sorturl from below method.


curl --header "Content-Type:application/json" --request POST --data "{\"longUrl\":\"/type?longurl=123p_P_id=klsdsacadsfkbasdjv_czmnbvfjshfbjhsdp_p_mode=view\"}"  http://localhost:8080/createShorthand

```

```


```
- get


curl http://localhost:8080/getOrignalUrl/{shorturltoken}
curl http://localhost:8080/{shorturltoken}  

Example

curl http://localhost:8080/getOrignalUrl/b
curl http://localhost:8080/b  
```