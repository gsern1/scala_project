
// @GENERATOR:play-routes-compiler
// @SOURCE:C:/Users/antoi/Documents/scala_project/server/conf/routes
// @DATE:Tue May 23 21:19:33 CEST 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
