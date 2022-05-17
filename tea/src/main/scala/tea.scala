package tea

case class Tea(drink: milk.MilkType)

object Tea {
  val default = Tea(milk.MilkType.FullFat)
}
