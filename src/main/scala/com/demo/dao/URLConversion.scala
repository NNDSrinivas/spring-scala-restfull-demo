package com.demo.dao

import javax.validation.Valid

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._
import org.springframework.stereotype.Service
import com.demo.service.UrlDAO

object UrlConversion {
  
   val allowedString:String = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789"
   val allowedCharacters:Array[Char] = allowedString.toCharArray()
   val base:Int = allowedCharacters.length
   
   def encode(input:Long):String={
     var encodedString = new StringBuilder
     var baseInp:Long=input;
     if(baseInp == 0) {
            return String.valueOf(allowedCharacters(0));
        }
        
        while (baseInp > 0) {
          println("baseInp : "+baseInp)
            encodedString.append(allowedCharacters((input % base).asInstanceOf[Int]));
            baseInp = (input / base).asInstanceOf[Int];
        }

        encodedString.reverse.toString();
   }
   
   def decode(input:String):Int={
     var characters = input.toCharArray()
        var length = characters.length
        var decodedId:Int = 0;
        println("inputis : "+input)
        var counter:Int = 0
        while(counter < input.length()) {
            println(characters(counter)+" allowedString.indexOf(characters(counter)).asInstanceOf[Int] : "+allowedString.indexOf(characters(counter)).asInstanceOf[Int])
            decodedId =decodedId + (allowedString.indexOf(characters(counter)).asInstanceOf[Int] * Math.pow(base, length - (counter+1))).asInstanceOf[Int]
            counter=counter+1
        }
        return decodedId;
   }
}
