object second {
  def main(args: Array[String]): Unit = {
    println("Enter an integer:")
    val input = scala.io.StdIn.readInt()
    val msg = input match {
      case x if x <= 0 => "Negative/Zero"
      case x if x % 2 == 0 => "Even number"
      case x => "Odd number"
    }
    println(msg)
  }
}
