
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/conf/routes
// @DATE:Wed May 24 22:26:31 CEST 2017


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
