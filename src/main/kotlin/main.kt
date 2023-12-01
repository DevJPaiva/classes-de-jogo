class Heroi(private val nome: String, private val idade: Int, private var tipo: String) {

    fun atacar() {
        val ataque = when (tipo) {
            "mago" -> "magia"
            "guerreiro" -> "a espada"
            "monge" -> "artes marciais"
            "ninja" -> "o shuriken"
            else -> "Usou um ataque desconhecido"
        }
        println("O $tipo $nome de $idade anos, atacou usando $ataque")
    }
}


fun main() {
    val mago = Heroi ("Merlin", 10, "mago")
    val guerreiro = Heroi("Spartakus", 15, "guerreiro")
    val monge = Heroi("Sensei", 28, "monge")
    val ninja = Heroi("Shan", 24, "ninja")

    println()
    println(" Classe do herói")
    println()

    mago.atacar()
    guerreiro.atacar()
    monge.atacar()
    ninja.atacar()

}
