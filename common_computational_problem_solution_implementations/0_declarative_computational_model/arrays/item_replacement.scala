def replace(value: Integer, new_value: Int, numbers: List[Int]): List[Int] = 
    numbers.map{ n => if n == value then new_value else n }

@main def main() = 
    val numbers = List(1, 1, 5, 6, 6, 1, 9, 6, 10)
    assert(replace(5,0, numbers) == List(1, 1, 0, 6, 6, 1, 9, 6, 10))
    print("completed successfully")