def birthday_cake_candles(n: Int, ar: Array[Int]): Int =
  val length = ar.length
  val max_height = if (length == 0) 0 else ar.reduceLeft(_ max _)
  ar.count(x => x == max_height)

@main
def main(): Unit =
  assert(birthday_cake_candles(4, Array(3, 2, 1, 3)) == 2)

  assert(
    birthday_cake_candles(
      15,
      Array(3, 2, 1, 3, 7, 7, 7, 1, 2, 5, 3, 3, 5, 2, 1)
    ) == 3
  )

  assert(
    birthday_cake_candles(4, Array(3, 2, 1)) == 1
  )

  assert(birthday_cake_candles(4, Array()) == 0)
  assert(birthday_cake_candles(1, Array(1)) == 1)
  assert(birthday_cake_candles(2, Array(1, 2)) == 1)

  println("completed successfully")
