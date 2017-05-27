
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object register_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Boolean,User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, user: User, error: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

  """),_display_(/*3.4*/main("Register", isLoggedIn, user)/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""
    """),format.raw/*4.5*/("""<div class="row">
      <div class="col-sm-6 col-md-4 col-md-offset-4">
        <h2>Register</h2>
        <p><strong> Sign up to continue</strong></p>
        """),_display_(/*8.10*/if(!error.isEmpty)/*8.28*/ {_display_(Seq[Any](format.raw/*8.30*/("""
          """),format.raw/*9.11*/("""<div class="alert alert-danger">
            <strong>Error!</strong> """),_display_(/*10.38*/error),format.raw/*10.43*/("""
          """),format.raw/*11.11*/("""</div>
        """)))}),format.raw/*12.10*/("""
        """),format.raw/*13.9*/("""<form role="form" action="/register" method="POST">
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
            <div class="input-group">
              <span class="input-group-addon">
                <i class="glyphicon glyphicon-lock"></i>
              </span>
              <input class="form-control" placeholder="Server password" name="server_password" type="password" value="">
            </div>
          </div>
          <div class="form-group">
            <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign up">
          </div>
        </form>
        <p>Already have an account! <a href="/login"> Sign In Here </a></p>
      </div>
    </div>
  """)))}),format.raw/*45.4*/("""
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Sun May 28 01:09:40 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/register.scala.html
                  HASH: 6f2c3d7a1b515444c8f1ff1f96b6b9faac5ced90
                  MATRIX: 546->1|694->54|726->61|768->95|807->97|839->103|1029->267|1055->285|1094->287|1133->299|1231->370|1257->375|1297->387|1345->404|1382->414|2795->1797
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|32->8|32->8|32->8|33->9|34->10|34->10|35->11|36->12|37->13|69->45
                  -- GENERATED --
              */
          