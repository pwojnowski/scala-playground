package poligon

class MultiTable {

  private def genRow(size: Int, num: Int) =
    for (i <- 1 to size) yield num * i

  def generate(size: Int = 10) =
    for (i <- 1 to size) yield genRow(size, i)

  def printTable(size: Int = 10): Unit = {
    val table = generate(size)

    for (row <- table) {
      for (col <- row) {
        printf("%4d", col)
      }
      println("")
    }
  }
}
