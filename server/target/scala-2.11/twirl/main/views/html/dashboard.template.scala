
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object dashboard_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

class dashboard extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template3[Boolean,User,String,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(isLoggedIn: Boolean, user: User, error: String = ""):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.55*/("""

"""),_display_(/*3.2*/main("Dashboard", isLoggedIn, user)/*3.37*/ {_display_(Seq[Any](format.raw/*3.39*/("""
  """),format.raw/*4.3*/("""<div class="row">
    <div class="col-md-6">
      <h2>Coming events</h2>
      <ul class="list-group">
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://yeah.paleo.ch/sites/default/files/wysiwyg_upload/images/2017/affiche_paleo_2017-1400.jpg" alt="Scott Stevens" class="img-responsive" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Paleo</a></span><br/>
            <span class="description">Festival in Nyon</span><br/>
            <span class="date">16.06.2017 14:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://www.events-gallery.ch/Images/Photos/Events/Clubbing/2013/20130503_051_19095/flyer_front_19095.png" alt="Seth Frazier" class="img-responsive" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Balelec</a></span><br/>
            <span class="description">Festival in Ecublens</span><br/>
            <span class="date">16.06.2017 14:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://api.randomuser.me/portraits/women/90.jpg" alt="Jean Myers" class="img-responsive img-circle" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Chubli</a></span><br/>
            <span class="description">Birthday party at Jean's house</span><br/>
            <span class="date">11.09.2017 14:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://api.randomuser.me/portraits/men/24.jpg" alt="Todd Shelton" class="img-responsive img-circle" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Moe's birthday</a></span><br/>
            <span class="description">Birthday party at Moe's house</span><br/>
            <span class="date">01.02.2017 3:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://api.randomuser.me/portraits/women/34.jpg" alt="Rosemary Porter" class="img-responsive img-circle" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Chubli</a></span><br/>
            <span class="description">Birthday party at Jean's house</span><br/>
            <span class="date">11.09.2017 14:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://api.randomuser.me/portraits/women/56.jpg" alt="Debbie Schmidt" class="img-responsive img-circle" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Chubli</a></span><br/>
            <span class="description">Birthday party at Jean's house</span><br/>
            <span class="date">11.09.2017 14:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
        <li class="list-group-item">
          <div class="col-xs-12 col-sm-3">
            <img src="http://api.randomuser.me/portraits/women/76.jpg" alt="Glenda Patterson" class="img-responsive img-circle" />
          </div>
          <div class="col-xs-12 col-sm-9">
            <span class="name"><a href="#">Chubli</a></span><br/>
            <span class="description">Birthday party at Jean's house</span><br/>
            <span class="date">11.09.2017 14:00</span>
          </div>
          <div class="clearfix"></div>
        </li>
      </ul>
    </div>
    <div class="col-md-6">
      <!--<div id="map-canvas"></div>
      <script type="text/javascript" src="https://maps.googleapis.com/maps/api/js?key=AIzaSyC21yXALCMFSiYnYFrLbq2orXwEiH7-y20"></script>
      <script language="JavaScript">
              GoogleMaps().main()
      </script>-->
    </div>
  </div>
""")))}),format.raw/*95.2*/("""
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
object dashboard extends dashboard_Scope0.dashboard
              /*
                  -- GENERATED --
                  DATE: Sun May 28 01:46:26 CEST 2017
                  SOURCE: D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/app/views/dashboard.scala.html
                  HASH: 229f15ad6f0fd6b56651e1964eaad53f93e2a958
                  MATRIX: 548->1|696->54|726->59|769->94|808->96|838->100|5243->4475
                  LINES: 20->1|25->1|27->3|27->3|27->3|28->4|119->95
                  -- GENERATED --
              */
          