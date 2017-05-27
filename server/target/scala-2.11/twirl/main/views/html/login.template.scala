
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

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Boolean,User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, user: User, error: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Login", isLoggedIn, user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
  """),format.raw/*4.3*/("""<div class="row">
    <div class="col-sm-6 col-md-4 col-md-offset-4">
      <h2>Login</h2>
      <p><strong> Sign in to continue</strong></p>
      """),_display_(/*8.8*/if(!error.isEmpty)/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""
        """),format.raw/*9.9*/("""<div class="alert alert-danger">
          <strong>Error!</strong> """),_display_(/*10.36*/error),format.raw/*10.41*/("""
        """),format.raw/*11.9*/("""</div>
      """)))}),format.raw/*12.8*/("""
      """),format.raw/*13.7*/("""<form role="form" action="/login" method="POST">
        <div class="form-group">
          <div class="input-group">
            <span class="input-group-addon">
              <i class="glyphicon glyphicon-user"></i>
            </span>
            <input class="form-control" placeholder="Username" name="username" type="text" autofocus>
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
""")))}),format.raw/*37.2*/("""
"""))
      }
    }
  }

  def render(isLoggedIn:Boolean,user:User,error:String): play.twirl.api.HtmlFormat.Appendable = apply(isLoggedIn,user,error)

  def f:((Boolean,User,String) => play.twirl.api.HtmlFormat.Appendable) = (isLoggedIn,user,error) => apply(isLoggedIn,user,error)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Sun May 28 01:09:40 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/login.scala.html
                  HASH: 4b78512a7c5fe2dadde28971c46fc68fda369584
                  MATRIX: 540->1|688->54|718->59|757->90|796->92|826->96|1004->249|1030->267|1069->269|1105->279|1201->348|1227->353|1264->363|1309->378|1344->386|2343->1355
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|32->8|32->8|32->8|33->9|34->10|34->10|35->11|36->12|37->13|61->37
                  -- GENERATED --
              */
          