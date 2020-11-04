package com.demo.dao

import javax.validation.Valid

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._
import org.springframework.stereotype.Service
import com.demo.service.UrlDAO
import com.demo.domain.URLDomain
import java.util.Date
import java.util.Calendar

@Service("urlService")
class UrlService(@Autowired urlDao:UrlDAO) {
  
  def findByShortUrl(sortUrl:String):String={
    var id=UrlConversion.decode(sortUrl);
    println("id used to fecth is : "+id);
    var url=urlDao.findById(id.asInstanceOf[Integer]).orElse(null)
    if(url!=null){
      return url.longUrl
    }
    return "not a valid short url.kindly try again."
  }
  
  def saveSortUrl(url:URLDomain):String={
    
    var savedUrl=urlDao.save(url)
    println(savedUrl.urlId+"long used to save is : "+url.longUrl);
    var sortUrl=UrlConversion.encode(savedUrl.urlId);
    savedUrl.setShortUrl(sortUrl);
    return sortUrl;
  }

}
