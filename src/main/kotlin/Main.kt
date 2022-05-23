fun main() {
/*
    //Exercicio 01
        //Dados do cliente
        val cliente1 = Cliente(
            "Pedro",
            "pedroantonio525@gmail.com",
            "605.065.520-04",
            1935850650)

        println(" ******Cadastro de usuário e senha *****")
        println("Digite o seu novo usuário?")
        cliente1.usuario = readln()
        println("Digite a sua nova senha?")
        cliente1.senha = readln()
        cliente1.cadastrar(cliente1.usuario, cliente1.senha)

        println("\n\n")

        println(" ******Logar com o usuáio e senha *****")
        println("Digite o seu usuário? ")
        val usuario = readln()
        println("Digite o seu usuário? ")
        var senha = readln()
        cliente1.logar(usuario, senha)

        println("Dados do cliente")
        println(cliente1)


*/
    //Exercicios 02
    val aviao = Aviao(
        2,
        2,
        "Branco",
        false,
        false
    )

    println("****Torre de comando****")
    println("Como está o clima hoje?\n" +
            "Digite: 1 - Ensolarado\n" +
            "Digite: 2 - Nublado\n" +
            "Digite: 3 - Chovendo\n" +
            "Digite: 4 - Tempestade")
    var clima = readln().toInt()


        if (clima in 1..4){

            when(clima){

                1 -> {
                    println("A manunteção do avião está em dia?")
                    aviao.manutencao = readln().toBoolean()
                    println("O avião está com combustivel?")
                    aviao.combustivel = readln().toBoolean()
                    println("O avião está ligado? ")
                    val estado = readln().toBoolean()
                    aviao.voar(aviao.combustivel, aviao.manutencao, "Ensolarado", estado)
                }
                2 -> {
                    println("A manunteção do avião está em dia?")
                    aviao.manutencao = readln().toBoolean()
                    println("O avião está com combustivel?")
                    aviao.combustivel = readln().toBoolean()
                    println("O avião está ligado? ")
                    val estado = readln().toBoolean()
                    aviao.voar(aviao.combustivel, aviao.manutencao, "Nublado" , estado)
                }
                3 -> {
                    println("A manunteção do avião está em dia?")
                    aviao.manutencao = readln().toBoolean()
                    println("O avião está com combustivel?")
                    aviao.combustivel = readln().toBoolean()
                    println("O avião está ligado? ")
                    val estado = readln().toBoolean()
                    aviao.voar(aviao.combustivel, aviao.manutencao, "Chovendo", estado)
                }
                4 -> {
                    println("A manunteção do avião está em dia?")
                    aviao.manutencao = readln().toBoolean()
                    println("O avião está com combustivel?")
                    aviao.combustivel = readln().toBoolean()
                    println("O avião está ligado? ")
                    val estado = readln().toBoolean()
                    aviao.voar(aviao.combustivel, aviao.manutencao, "Tempestade", estado)
                }
            }

            println("\n\n")

            println("****Pousar o avião****\n")
            println("A pista está livre?" +
                    "\n True - Sim\n" +
                    " False - Não")
            val pistaLivre = readln().toBoolean()
            println("Tem local para pouso?" +
                    "\n True - Sim\n" +
                    " False - Não")
            val localPouso = readln().toBoolean()
            aviao.pousar(pistaLivre, localPouso)

        }else{
            println("Valor digitado inválido")
        }


}