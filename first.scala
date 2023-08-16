object first {
  val calculate_I: Double => Double = {
    case amount if amount <= 20000 => 0.02 * amount
    case amount if amount <= 200000 => 0.04 * amount
    case amount if amount <= 2000000 => 0.035 * amount
    case amount => 0.065 * amount
  }

  def main(args: Array[String]): Unit = {
    val d_1 = 15000
    val d_2 = 100000
    val d_3 = 500000
    val d_4 = 2500000

    val i_1 = calculate_I(d_1)
    val i_2 = calculate_I(d_2)
    val i_3 = calculate_I(d_3)
    val i_4 = calculate_I(d_4)

    println(s"Deposit: Rs. $d_1, Interest: Rs. $i_1")
    println(s"Deposit: Rs. $d_2, Interest: Rs. $i_2")
    println(s"Deposit: Rs. $d_3, Interest: Rs. $i_3")
    println(s"Deposit: Rs. $d_4, Interest: Rs. $i_4")
  }
}
