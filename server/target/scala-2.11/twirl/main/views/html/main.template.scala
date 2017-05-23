
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
                    <a class="navbar-brand" href="/">play-example-login</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-left">
                        <li><a href=""""),_display_(/*24.39*/routes/*24.45*/.Application.profile()),format.raw/*24.67*/("""">Profile</a></li>
                    </ul>
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*27.22*/if(isLoggedIn)/*27.36*/ {_display_(Seq[Any](format.raw/*27.38*/("""
                        """),format.raw/*28.25*/("""<li><p class="navbar-text">"""),_display_(/*28.53*/user/*28.57*/.email),format.raw/*28.63*/("""</p></li>
                        <li><a href=""""),_display_(/*29.39*/routes/*29.45*/.Application.logout()),format.raw/*29.66*/("""">Logout</a></li>
                    """)))}/*30.23*/else/*30.28*/{_display_(Seq[Any](format.raw/*30.29*/("""
                        """),format.raw/*31.25*/("""<li><a href=""""),_display_(/*31.39*/routes/*31.45*/.Application.login()),format.raw/*31.65*/("""">Login</a></li>
                    """)))}),format.raw/*32.22*/("""

                    """),format.raw/*34.21*/("""</ul>
                </div>
            </div>
        </div>
        <div class="container">
            """),_display_(/*39.14*/content),format.raw/*39.21*/("""
            """),_display_(/*40.14*/scalajs/*40.21*/.html.scripts("client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*40.137*/("""
        """),format.raw/*41.9*/("""</div>
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
                  DATE: Tue May 23 22:19:06 CEST 2017
                  SOURCE: C:/Users/antoi/Documents/scala_project/server/app/views/main.scala.html
                  HASH: e03342cd5ff032835ad7fcd577387eb8c047101b
                  MATRIX: 543->1|701->64|729->66|806->117|831->122|919->184|933->190|995->231|1082->292|1096->298|1156->337|1224->378|1239->384|1312->436|2134->1231|2149->1237|2192->1259|2346->1386|2369->1400|2409->1402|2462->1427|2517->1455|2530->1459|2557->1465|2632->1513|2647->1519|2689->1540|2747->1580|2760->1585|2799->1586|2852->1611|2893->1625|2908->1631|2949->1651|3018->1689|3068->1711|3203->1819|3231->1826|3272->1840|3288->1847|3426->1963|3462->1972
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|48->24|48->24|48->24|51->27|51->27|51->27|52->28|52->28|52->28|52->28|53->29|53->29|53->29|54->30|54->30|54->30|55->31|55->31|55->31|55->31|56->32|58->34|63->39|63->39|64->40|64->40|64->40|65->41
                  -- GENERATED --
              */
          