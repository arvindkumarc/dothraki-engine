package models

import play.api.db.slick.Config.driver.simple._

case class Screen(id: Long, name: String, location: String)
case class Session(id: Long, name: String, screen_id: Long)
case class Seat(id: Long, name: String, session_id: Long)

/* Table mappings
 */
class Screens(tag: Tag) extends Table[Screen](tag, "screens") {

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name", O.NotNull)
  def location = column[String]("location", O.NotNull)

  def * = (id, name, location) <> (Screen.tupled, Screen.unapply _)
}

class Sessions(tag: Tag) extends Table[Session](tag, "sessions") {

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name", O.NotNull)
  def screen_id = column[Long]("screen_id")

  def * = (id, name, screen_id) <> (Session.tupled, Session.unapply _)
}

class Seats(tag: Tag) extends Table[Seat](tag, "seats") {

  def id = column[Long]("id", O.PrimaryKey, O.AutoInc)
  def name = column[String]("name", O.NotNull)
  def session_id = column[Long]("session_id")

  def * = (id, name, session_id) <> (Seat.tupled, Seat.unapply _)
}
