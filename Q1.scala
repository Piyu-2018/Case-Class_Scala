object Q1 extends App{
  val p1 = point(5,7)
  val p2 = point(3,10)

  print("Add method for adding P1 and P2 - ")
  print("P1 + P2 = ")
  println(p1+p2)

  println()
  print("Move method for moving P1 point by a given distance - ")
  val p3 = p1.move(3,5)
  println(p3)

  println()
  print("Distance method for distance between P1 and P2 - ")
  val p4 = p1.distance(p2)
  println(p4)

  println()
  print("Invert method for switch the x , y coordinates of P2 - ")
  val p5 = p2.invert()
  println(p5)

}

case class point(x:Int,y:Int){
  //Question 1 - Adding two given points.
  def +(that:point)=point(this.x+that.x,this.y+that.y)

  //Question 2 - Moving a point by a given distance.
  def move(dx:Int,dy:Int):point = point(this.x+dx,this.y+dy)

  //Question 3 - Distance between two given points.
  def distance(that:point) : Double = {
    var Xdist:Int = this.x - that.x
    var Ydist:Int = this.y - that.y
    var dist: Int = Xdist*Xdist + Ydist*Ydist
    scala.math.sqrt(dist)
  }

  //Question 4-Switch the x and y coordinates
  def invert() = point(this.y,this.x)

}


