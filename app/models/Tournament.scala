package models

import java.util.Date
case class Tournament ( _id:String, name : String, place : String, date: Date,
                       teams : List[String], games : List[String])
