
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[String,Boolean,User,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(message: String, isLoggedIn: Boolean, user: User):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.52*/("""

"""),_display_(/*3.2*/main("Index", isLoggedIn, user)/*3.33*/ {_display_(Seq[Any](format.raw/*3.35*/("""
"""),format.raw/*4.1*/("""<h2>Hi welcome whatsupp</h2>
<ul>
  <li>Play shouts out: <em>"""),_display_(/*6.29*/message),format.raw/*6.36*/("""</em></li>
  <li>Scala.js shouts out: <em id="scalajsShoutOut"></em></li>
</ul>
""")))}),format.raw/*9.2*/("""
"""))
      }
    }
  }

  def render(message:String,isLoggedIn:Boolean,user:User): play.twirl.api.HtmlFormat.Appendable = apply(message,isLoggedIn,user)

  def f:((String,Boolean,User) => play.twirl.api.HtmlFormat.Appendable) = (message,isLoggedIn,user) => apply(message,isLoggedIn,user)

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue May 23 22:06:57 CEST 2017
                  SOURCE: C:/Users/antoi/Documents/scala_project/server/app/views/index.scala.html
                  HASH: 7db497dd99762b1971a6670c34d4f120e3b84032
                  MATRIX: 540->1|685->51|713->54|752->85|791->87|818->88|906->150|933->157|1043->238
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|30->6|30->6|33->9
                  -- GENERATED --
              */
          