package controllers

import play.api.data.Form
import play.api.mvc._
import play.mvc.Controller._
import shared.SharedMessages
import play.api.mvc.Results._

class Application extends Controller {

  def index = Action { request =>
      Ok(views.html.index(SharedMessages.itWorks, Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def login = Action { request =>
    Ok(views.html.login(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def postLogin() = Action { request : Request[Any] =>
    Ok(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def register = Action { request =>
    Ok(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def postRegister() = Action { request =>
    Created(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def profile() = Action { request =>
    Ok(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def logout() = Action { request =>
    Ok(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request)))
  }
}
