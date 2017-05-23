
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Boolean,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

"""),_display_(/*3.2*/main("Login", isLoggedIn, user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
  """),format.raw/*4.3*/("""<div class="row">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
      <h2>Login</h2>
      <p><strong> Sign in to continue</strong></p>
      <form role="form" action="" method="POST">
        <div class="form-group">
          <div class="input-group">
            <span class="input-group-addon">
              <i class="glyphicon glyphicon-user"></i>
            </span>
            <input class="form-control" placeholder="Username" name="loginname" type="text" autofocus>
          </div>
        </div>
        <div class="form-group">
          <div class="input-group">
            <span class="input-group-addon">
              <i class="glyphicon glyphicon-lock"></i>
            </span>
            <input class="form-control" placeholder="Password" name="password" type="password" value="">
          </div>
        </div>
        <div class="form-group">
          <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign in">
        </div>
      </form>
      <p>Don't have an account! <a href="/register"> Sign Up Here </a></p>
    </div>
  </div>
""")))}),format.raw/*32.2*/("""
"""))
      }
    }
  }

  def render(isLoggedIn:Boolean,user:User): play.twirl.api.HtmlFormat.Appendable = apply(isLoggedIn,user)

  def f:((Boolean,User) => play.twirl.api.HtmlFormat.Appendable) = (isLoggedIn,user) => apply(isLoggedIn,user)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Tue May 23 22:30:25 CEST 2017
                  SOURCE: C:/Users/antoi/Documents/scala_project/server/app/views/login.scala.html
                  HASH: f126d0b0ef93869799b930ef2cb3715e8464e134
                  MATRIX: 533->1|661->34|689->37|728->68|767->70|796->73|1914->1161
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|56->32
                  -- GENERATED --
              */
          