package controllers

import models.UserDB
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

  def postLogin() = Action { request =>
    val username = request.body.asFormUrlEncoded.get("username")(0)
    val password = request.body.asFormUrlEncoded.get("password")(0)
    val user = UserDB.getUser(username);
    if(user != null && user.password == password){
      Ok(views.html.profile(true, UserDB.getUser(username))).withSession(
        request.session + ("username" -> username))
    } else{
      Unauthorized(views.html.login(Secured.isLoggedIn(request), Secured.getUser(request), "Wrong username/password"))
    }
  }

  def register = Action { request =>
    Ok(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def postRegister() = Action { request =>
    val username = request.body.asFormUrlEncoded.get("username")(0)
    val password = request.body.asFormUrlEncoded.get("password")(0)
    if (username.isEmpty) {
      BadRequest(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request), "Username can't be empty"))
    } else if (UserDB.isUser(username)) {
      BadRequest(views.html.register(Secured.isLoggedIn(request), Secured.getUser(request), "Username already in use"))
    } else {
      UserDB.addUser(username, password)
      Created(views.html.profile(true, UserDB.getUser(username))).withSession(
        request.session + ("username" -> username))
    }
  }

  def profile() = Action { request =>
    Ok(views.html.profile(Secured.isLoggedIn(request), Secured.getUser(request)))
  }

  def logout() = Action { request =>
    Ok(views.html.login(false, null)).withSession(
      request.session - "username")
  }
}
