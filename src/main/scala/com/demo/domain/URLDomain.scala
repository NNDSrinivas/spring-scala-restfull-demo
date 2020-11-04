package com.demo.domain

import java.util.Date

import scala.beans.BeanProperty



import javax.persistence.Entity
import javax.persistence.Table
import javax.persistence.Id
import javax.persistence.GeneratedValue
import javax.persistence.Column

@Table(name="URLDomain")
@Entity
class URLDomain {
  @Id
  @GeneratedValue
  @BeanProperty
  var urlId=0
  @Column
  @BeanProperty
  var shortUrl=""
  @Column
  @BeanProperty
  var longUrl=""
  @Column
  @BeanProperty
  var expiresDate=new Date

}
