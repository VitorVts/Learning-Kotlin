/**
 * Variáveis em Kotlin
 *
 * Kotlin possui 2 termos principais para declarar variáveis:
 * - `val`: variável imutável (somente leitura)
 * - `var`: variável mutável
 *
 * Além disso:
 * - `const val`: constantes definidas no nível do compilador, usadas para valores fixos em tempo de compilação.
 */

const val PI = 3.14159 // Constante global

fun main() {
    // Variáveis básicas
    val name: String = "John" // Imutável
    var age: Int = 25 // Mutável
    println("Name: $name, Age: $age")
    
    age = 26 // Alterando o valor de uma variável mutável
    println("Updated Age: $age")

    // Inferência de tipo
    val city = "New York" // Inferido como String
    var score = 95 // Inferido como Int
    println("City: $city, Score: $score")

    // Nullabilidade
    var nickname: String? = null // Pode armazenar um valor nulo
    println("Nickname: $nickname")
    
    nickname = "Johnny"
    println("Updated Nickname: $nickname")

    // Variáveis com números
    val integerNumber: Int = 100 // Inteiro
    val floatingPointNumber: Float = 10.5f // Ponto flutuante
    val doubleNumber: Double = 20.1234 // Double
    val longNumber: Long = 1_000_000_000L // Longo
    println("Numbers: $integerNumber, $floatingPointNumber, $doubleNumber, $longNumber")

    // Booleanos
    val isKotlinFun: Boolean = true
    val isJavaHard: Boolean = false
    println("Is Kotlin Fun? $isKotlinFun, Is Java Hard? $isJavaHard")

    // Caracteres e Strings
    val singleChar: Char = 'A'
    val greeting: String = "Hello, Kotlin!"
    println("Character: $singleChar, Greeting: $greeting")

    // Arrays
    val colors = arrayOf("Red", "Green", "Blue")
    println("Colors: ${colors.joinToString()}")

    // Listas e Mapas
    val immutableList = listOf("Apple", "Banana", "Cherry") // Imutável
    val mutableList = mutableListOf("Dog", "Cat", "Bird") // Mutável
    mutableList.add("Fish")
    println("Immutable List: $immutableList")
    println("Mutable List: $mutableList")

    val map = mapOf("Name" to "Alice", "Age" to 30) // Mapa imutável
    val mutableMap = mutableMapOf("Key1" to "Value1") // Mapa mutável
    mutableMap["Key2"] = "Value2"
    println("Map: $map")
    println("Mutable Map: $mutableMap")

    // Constantes
    println("PI: $PI")
}
