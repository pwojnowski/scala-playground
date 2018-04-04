package poligon

class MultiTable {

  def genRow(size: Int, num: Int) =
    for (i <- 1 to size) yield num * i

  def generate(size: Int = 10) =
    for (i <- 1 to size) yield genRow(size, i)
}
