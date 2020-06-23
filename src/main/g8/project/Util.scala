import scala.util._
object Util {

  def styled(in: Any): String = {
    scala.Console.CYAN + in + scala.Console.RESET
  }
}
