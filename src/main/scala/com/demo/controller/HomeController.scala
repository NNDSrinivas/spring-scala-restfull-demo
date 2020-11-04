package com.demo.controller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseStatus
import org.springframework.web.bind.annotation.RestController

import com.demo.dao.UrlService
import com.demo.domain.URLDomain
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.http.MediaType

@RestController
class HomeController(@Autowired() urlService:UrlService ) {

  @RequestMapping(value = Array("/default"), method = Array(RequestMethod.GET))
  @ResponseStatus(HttpStatus.OK)
  def defaults():String = {
    "default page"
  }
  
  @RequestMapping(value = Array("/createShorthand"), method = Array(RequestMethod.POST),consumes=Array(MediaType.APPLICATION_JSON_VALUE))
  @ResponseStatus(HttpStatus.OK)
  def createShortHand(@RequestBody urlDomain:URLDomain):String = {
    "http://localhost:8080/"+urlService.saveSortUrl(urlDomain)
  }
  
  @RequestMapping(value = Array("/getOrignalUrl/{shortUrl}","/{shortUrl}"), method = Array(RequestMethod.GET))
  @ResponseStatus(HttpStatus.OK)
  def getLongUrl(@PathVariable shortUrl:String):String = {
    "http://localhost:8080"+urlService.findByShortUrl(shortUrl);
  }
  
  @RequestMapping(value = Array("/**"), method = Array(RequestMethod.GET))
  @ResponseStatus(HttpStatus.OK)
  def anyOther():String = {
    "any other url for redirection"
  }
  
}
