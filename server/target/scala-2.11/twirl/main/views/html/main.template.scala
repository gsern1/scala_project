
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object main_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class main extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template4[String,Boolean,User,Html,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(title: String, isLoggedIn: Boolean, user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.65*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/title),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(/*8.54*/routes/*8.60*/.Assets.versioned("stylesheets/main.css")),format.raw/*8.101*/("""">
        <link rel="shortcut icon" type="image/png" href=""""),_display_(/*9.59*/routes/*9.65*/.Assets.versioned("images/favicon.png")),format.raw/*9.104*/("""">
        <link rel='stylesheet' href=""""),_display_(/*10.39*/routes/*10.45*/.Assets.versioned("lib/bootstrap/css/bootstrap.css")),format.raw/*10.97*/("""">
    </head>
    <body>
        <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <div class="container">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
                            <!--  Display three horizontal lines when navbar collapsed. -->
                        <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="/">PlayVent</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                    """),_display_(/*24.22*/if(isLoggedIn)/*24.36*/ {_display_(Seq[Any](format.raw/*24.38*/("""
                        """),format.raw/*25.25*/("""<li><a href=""""),_display_(/*25.39*/routes/*25.45*/.Application.profile()),format.raw/*25.67*/("""">Profile</a></li>
                    """)))}),format.raw/*26.22*/("""
                    """),format.raw/*27.21*/("""</ul>
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*29.22*/if(isLoggedIn)/*29.36*/ {_display_(Seq[Any](format.raw/*29.38*/("""
                        """),format.raw/*30.25*/("""<li><p class="navbar-text">"""),_display_(/*30.53*/user/*30.57*/.username),format.raw/*30.66*/("""</p></li>
                        <li><a href=""""),_display_(/*31.39*/routes/*31.45*/.Application.logout()),format.raw/*31.66*/("""">Logout</a></li>
                    """)))}/*32.23*/else/*32.28*/{_display_(Seq[Any](format.raw/*32.29*/("""
                        """),format.raw/*33.25*/("""<li><a href=""""),_display_(/*33.39*/routes/*33.45*/.Application.login()),format.raw/*33.65*/("""">Login</a></li>
                        <li><a href=""""),_display_(/*34.39*/routes/*34.45*/.Application.register()),format.raw/*34.68*/("""">Register</a></li>
                    """)))}),format.raw/*35.22*/("""
                    """),format.raw/*36.21*/("""</ul>
                </div>
            </div>
        </div>
        <div class="container">
            """),_display_(/*41.14*/content),format.raw/*41.21*/("""
            """),_display_(/*42.14*/scalajs/*42.21*/.html.scripts("client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*42.137*/("""
        """),format.raw/*43.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(title:String,isLoggedIn:Boolean,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(title,isLoggedIn,user)(content)

  def f:((String,Boolean,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (title,isLoggedIn,user) => (content) => apply(title,isLoggedIn,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Thu May 25 00:41:23 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/main.scala.html
                  HASH: 8e318ac1982f4d29ef892762617d85e59c5fce44
                  MATRIX: 543->1|701->64|731->68|812->123|837->128|926->191|940->197|1002->238|1090->300|1104->306|1164->345|1233->387|1248->393|1321->445|2130->1227|2153->1241|2193->1243|2247->1269|2288->1283|2303->1289|2346->1311|2418->1352|2468->1374|2585->1464|2608->1478|2648->1480|2702->1506|2757->1534|2770->1538|2800->1547|2876->1596|2891->1602|2933->1623|2992->1664|3005->1669|3044->1670|3098->1696|3139->1710|3154->1716|3195->1736|3278->1792|3293->1798|3337->1821|3410->1863|3460->1885|3600->1998|3628->2005|3670->2020|3686->2027|3824->2143|3861->2153
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|48->24|48->24|48->24|49->25|49->25|49->25|49->25|50->26|51->27|53->29|53->29|53->29|54->30|54->30|54->30|54->30|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|57->33|58->34|58->34|58->34|59->35|60->36|65->41|65->41|66->42|66->42|66->42|67->43
                  -- GENERATED --
              */
          