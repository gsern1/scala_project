
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
  def apply/*1.2*/(page: String, isLoggedIn: Boolean, user: User)(content: Html):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.64*/("""

"""),format.raw/*3.1*/("""<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(/*7.17*/page),format.raw/*7.21*/("""</title>
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
                        """),format.raw/*25.25*/("""<li><a class=""""),_display_(/*25.40*/("active".when(page == "Profile"))),format.raw/*25.74*/("""" href=""""),_display_(/*25.83*/routes/*25.89*/.Application.profile()),format.raw/*25.111*/("""">Profile</a></li>
                    """)))}),format.raw/*26.22*/("""
                    """),format.raw/*27.21*/("""</ul>
                    <ul class="nav navbar-nav navbar-right">
                    """),_display_(/*29.22*/if(isLoggedIn)/*29.36*/ {_display_(Seq[Any](format.raw/*29.38*/("""
                        """),format.raw/*30.25*/("""<li><a class=""""),_display_(/*30.40*/("active".when(page == "Home"))),format.raw/*30.71*/("""" href=""""),_display_(/*30.80*/routes/*30.86*/.Application.index()),format.raw/*30.106*/("""">Home</a></li>
                        <li><a class=""""),_display_(/*31.40*/("active".when(page == "Dashboard"))),format.raw/*31.76*/("""" href=""""),_display_(/*31.85*/routes/*31.91*/.Application.dashboard()),format.raw/*31.115*/("""">Dashboard</a></li>
                        <li><a href=""""),_display_(/*32.39*/routes/*32.45*/.Application.logout()),format.raw/*32.66*/("""">Logout</a></li>
                    """)))}/*33.23*/else/*33.28*/{_display_(Seq[Any](format.raw/*33.29*/("""
                        """),format.raw/*34.25*/("""<li><a class=""""),_display_(/*34.40*/("active".when(page == "Home"))),format.raw/*34.71*/("""" href=""""),_display_(/*34.80*/routes/*34.86*/.Application.index()),format.raw/*34.106*/("""">Home</a></li>
                        <li><a class=""""),_display_(/*35.40*/("active".when(page == "Login"))),format.raw/*35.72*/("""" href=""""),_display_(/*35.81*/routes/*35.87*/.Application.login()),format.raw/*35.107*/("""">Login</a></li>
                        <li><a class=""""),_display_(/*36.40*/("active".when(page == "Register"))),format.raw/*36.75*/("""" href=""""),_display_(/*36.84*/routes/*36.90*/.Application.register()),format.raw/*36.113*/("""">Register</a></li>
                    """)))}),format.raw/*37.22*/("""
                    """),format.raw/*38.21*/("""</ul>
                </div>
            </div>
        </div>
        <div class="container">
            """),_display_(/*43.14*/content),format.raw/*43.21*/("""
            """),_display_(/*44.14*/scalajs/*44.21*/.html.scripts("client", routes.Assets.versioned(_).toString, name => getClass.getResource(s"/public/$name") != null)),format.raw/*44.137*/("""
        """),format.raw/*45.9*/("""</div>
    </body>
</html>
"""))
      }
    }
  }

  def render(page:String,isLoggedIn:Boolean,user:User,content:Html): play.twirl.api.HtmlFormat.Appendable = apply(page,isLoggedIn,user)(content)

  def f:((String,Boolean,User) => (Html) => play.twirl.api.HtmlFormat.Appendable) = (page,isLoggedIn,user) => (content) => apply(page,isLoggedIn,user)(content)

  def ref: this.type = this

}


}

/**/
object main extends main_Scope0.main
              /*
                  -- GENERATED --
                  DATE: Sun May 28 01:46:26 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/main.scala.html
                  HASH: eb7e59ef3410b7630f98b49cff01881a6ed63f82
                  MATRIX: 543->1|700->63|730->67|811->122|835->126|924->189|938->195|1000->236|1088->298|1102->304|1162->343|1231->385|1246->391|1319->443|2132->1229|2155->1243|2195->1245|2249->1271|2291->1286|2346->1320|2382->1329|2397->1335|2441->1357|2513->1398|2563->1420|2680->1510|2703->1524|2743->1526|2797->1552|2839->1567|2891->1598|2927->1607|2942->1613|2984->1633|3067->1689|3124->1725|3160->1734|3175->1740|3221->1764|3308->1824|3323->1830|3365->1851|3424->1892|3437->1897|3476->1898|3530->1924|3572->1939|3624->1970|3660->1979|3675->1985|3717->2005|3800->2061|3853->2093|3889->2102|3904->2108|3946->2128|4030->2185|4086->2220|4122->2229|4137->2235|4182->2258|4255->2300|4305->2322|4445->2435|4473->2442|4515->2457|4531->2464|4669->2580|4706->2590
                  LINES: 20->1|25->1|27->3|31->7|31->7|32->8|32->8|32->8|33->9|33->9|33->9|34->10|34->10|34->10|48->24|48->24|48->24|49->25|49->25|49->25|49->25|49->25|49->25|50->26|51->27|53->29|53->29|53->29|54->30|54->30|54->30|54->30|54->30|54->30|55->31|55->31|55->31|55->31|55->31|56->32|56->32|56->32|57->33|57->33|57->33|58->34|58->34|58->34|58->34|58->34|58->34|59->35|59->35|59->35|59->35|59->35|60->36|60->36|60->36|60->36|60->36|61->37|62->38|67->43|67->43|68->44|68->44|68->44|69->45
                  -- GENERATED --
              */
          