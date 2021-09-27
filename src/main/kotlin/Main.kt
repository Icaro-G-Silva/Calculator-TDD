fun main() {
    displayHeader()
    println("\n\n\tFor use the app, just write \"./gradlew test --info\" in terminal to run the tests.")
    displayFooter()
}

fun displayHeader() {
    displayLine(40)
    println("\nSoftware Engineering project")
    println("Using TDD to create a simple calculator")
    displayLine(40)
}

fun displayFooter() {
    println("\n-by Ícaro Silva - 202102074517")
}

fun displayLine(range: Int) {
    for (i in 1..range) { print("-") }
}
