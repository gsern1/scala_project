
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

class register extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Boolean,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

  """),_display_(/*3.4*/main("Register", isLoggedIn, user)/*3.38*/ {_display_(Seq[Any](format.raw/*3.40*/("""
    """),format.raw/*4.5*/("""<div class="row">
      <div class="col-sm-6 col-md-4 col-md-offset-4">
        <h2>Register</h2>
        <p><strong> Sign up to continue</strong></p>
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
            <input type="submit" class="btn btn-lg btn-primary btn-block" value="Sign up">
          </div>
        </form>
        <p>Already have an account! <a href="/login"> Sign In Here </a></p>
      </div>
    </div>
  """)))}),format.raw/*32.4*/("""
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
object register extends register_Scope0.register
              /*
                  -- GENERATED --
                  DATE: Tue May 23 22:59:40 CEST 2017
                  SOURCE: C:/Users/antoi/Documents/scala_project/server/app/views/register.scala.html
                  HASH: 2c172de98d933119fdcf19fd58e539b61360707e
                  MATRIX: 539->1|667->34|697->39|739->73|778->75|809->80|1985->1226
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|56->32
                  -- GENERATED --
              */
          