trait fibonacci_divide {

  def fib(n : Int): Int = if(n<2) 1 else fib(n-1) + fib(n-2)
  def divide(num: Int, denominator: Int): Int
}
