
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/Cours HEIG 2016-2017 S2/Scala/scala_project/server/conf/routes
// @DATE:Sun May 28 00:31:28 CEST 2017


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
