import kotlin.math.*

fun main()
{

    //1 задача
    val exercises: Int = 13;
    var exercisesSolved: Int = 0;
    exercisesSolved += 1;

    //2 задача
    val Age: Int = 18;

    //3 задача
    var averageAge: Double = 18.0
    averageAge = (averageAge + 30.0) / 2.0
    print(averageAge)

    //4 задача
    val testNumber: Int = 17
    val evenOdd: Int = testNumber % 2
    print(evenOdd)

    //5 задача
    var answer: Int = 0
    answer += (1 + 10) * 10 shr 3
    print(answer)

    //6 задача
    var age: Int = 16
    println(age)
    age = 30
    print(age)

    //7задача
    val a: Int = 46
    val b: Int = 10

    //1
    val answer1: Int = (a * 100) + b
    //2
    val answer2: Int = (a * 100) + (b * 100)
    //3
    val answer3: Int = (a * 100) + (b / 10)
    println(answer1)
    println(answer2)
    println(answer3)

    //8 задача
    (5 * 3) - ((4 / 2) * 2)

    //9 задача
    val a: Double = 6.0
    val b: Double = 17.0
    val average: Double = a + b / 2

    //10 задача
    val fahrenheit: Double = 10.0
    val celcius: Double = fahrenheit - 32.0 / 1.8
    print(celcius)

    //11задача
    val pozicion: Int = 36
    val row: Int = pozicion / 8
    val cul: Int = pozicion % 8
    println(pozicion)
    println(row)
    println(cul)

    //12задача
    val degrees:Double=40.0
    val radians:Double=PI*degrees/180.0
    println(radians)
    exercisesSolved += 1


    //13 задача
    val x1:Double=5.0
    val x2:Double=7.0
    val y1:Double=2.0
    val y2:Double=10.0
    val distance:Double=sqrt  ((x2-x1).pow(2))+((y2-y1).pow(2))
    println(distance)
    exercisesSolved += 1
    println(exercisesSolved)

}