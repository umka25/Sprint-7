package ru.sber.spring.boot.persistance

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id


@Entity
class Entity(
  @Id
  @GeneratedValue
  var id: Long? = null,

  @Column
  var name: String?
)