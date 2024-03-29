package controllers

import models._
import play.api._
import play.api.db.slick._
import play.api.db.slick.Config.driver.simple._
import play.api.data._
import play.api.data.Forms._
import play.api.mvc._
import play.api.Play.current
import play.api.mvc.BodyParsers._
import play.api.libs.json.Json
import play.api.libs.json.Json._

object Application extends Controller{

  //create an instance of the table
  val screens = TableQuery[Screens]

  //JSON read/write macro
  implicit val screenJson = Json.format[Screen]

  def jsonFindAll = DBAction { implicit rs =>
    Ok(toJson(screens.list))
  }

}
