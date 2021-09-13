package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Niket","Mittal",22,12000,"Intern","Knoldus","niket.mittal@knoldus.com")
  val emp1 : Employee = Employee("gulshan","singh",22,12000,"Intern","Knoldus","gulshan@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}