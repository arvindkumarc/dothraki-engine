// @SOURCE:/Users/admin/Public/Projects/justickets/spike/booking-engine/conf/routes
// @HASH:e0732671fb56a0b24103f7da6674b23b332fd65d
// @DATE:Wed Jun 04 22:17:08 GMT+05:30 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._


import Router.queryString


// @LINE:6
package controllers {

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def jsonFindAll(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:6
package controllers.javascript {

// @LINE:6
class ReverseApplication {
    

// @LINE:6
def jsonFindAll : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.jsonFindAll",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:6
package controllers.ref {


// @LINE:6
class ReverseApplication {
    

// @LINE:6
def jsonFindAll(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.jsonFindAll(), HandlerDef(this, "controllers.Application", "jsonFindAll", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    