package com.demo.service

import javax.validation.Valid

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.data.domain.Pageable
import org.springframework.http.HttpStatus
import org.springframework.validation.BindingResult
import org.springframework.web.bind.annotation._
import org.springframework.stereotype.Service
import org.springframework.stereotype.Repository
import org.springframework.data.repository.CrudRepository
import com.demo.domain.URLDomain

@Repository("urlDao")
trait UrlDAO extends CrudRepository[URLDomain,Integer]{

  def findByShortUrl(shortUrl:String):URLDomain;
}
