plugins {
    id("it.unibo.lss.greetings") version File("version").readText().takeWhile {it != "-"}
}