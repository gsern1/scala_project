
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object profile_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class profile extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template2[Boolean,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.35*/("""

  """),_display_(/*3.4*/main("Profile", isLoggedIn, user)/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
    """),format.raw/*4.5*/("""<div class="row">
      <div class="col-md-12">
        <h2>My profile</h2>
        <p>Username: """),_display_(/*7.23*/user/*7.27*/.username),format.raw/*7.36*/("""</p>
      </div>
    </div>
  """)))}),format.raw/*10.4*/("""
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
object profile extends profile_Scope0.profile
              /*
                  -- GENERATED --
                  DATE: Sun May 28 00:48:23 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/profile.scala.html
                  HASH: 982bb78381545ea990119eb8a58e0e2a3b2b06e9
                  MATRIX: 537->1|665->34|697->41|738->74|777->76|809->82|936->183|948->187|977->196|1042->231
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|31->7|31->7|31->7|34->10
                  -- GENERATED --
              */
          