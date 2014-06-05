// @SOURCE:/Users/admin/Public/Projects/justickets/spike/booking-engine/conf/routes
// @HASH:e0732671fb56a0b24103f7da6674b23b332fd65d
// @DATE:Wed Jun 04 22:17:08 GMT+05:30 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_jsonFindAll0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.jsonFindAll""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_jsonFindAll0(params) => {
   call { 
        invokeHandler(controllers.Application.jsonFindAll, HandlerDef(this, "controllers.Application", "jsonFindAll", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        
}

}
     