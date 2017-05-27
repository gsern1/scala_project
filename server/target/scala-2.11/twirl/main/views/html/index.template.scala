
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

"""),_display_(/*3.2*/main("Home", isLoggedIn, user)/*3.32*/ {_display_(Seq[Any](format.raw/*3.34*/("""
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
                  DATE: Sun May 28 00:48:23 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/index.scala.html
                  HASH: 62f45fca85d8310fff22c459d150494ab69ec0d5
                  MATRIX: 540->1|685->51|715->56|753->86|792->88|820->90|910->154|937->161|1050->245
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|30->6|30->6|33->9
                  -- GENERATED --
              */
          