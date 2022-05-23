import javax.swing.text.StyledEditorKit.BoldAction

/*2) Crie uma classe avião e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto avião, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/

data class Aviao(
    var turbina: Int,
    var asas: Int,
    var cor: String,
    var tremPouso: Boolean,
    var manutencao: Boolean) {

    var combustivel = false
    var clima = ""
    var estado = false

    constructor(turbina: Int, asas: Int, cor: String, tremPouso: Boolean, manutencao: Boolean,
             combustivel: Boolean, clima:String)
            :this(turbina, asas, cor, tremPouso, manutencao){

        this.combustivel = combustivel
        this.clima = clima
    }



    fun voar(manutencao: Boolean, combustivel: Boolean, clima: String, estado: Boolean){
        if (estado){
                this.estado = false
                println("O avião está ligado")
        }else{
                this.estado = true
                println("O avião está desligado")
        }

        if (manutencao && combustivel && estado && clima !=""){
            //Verificação do clima para o avião vooar
                if (clima == "Ensolarado"){
                    println("Autorizado voo, pois o clima está perfeito")
                }else if(clima == "Nublado"){
                    println("Autorizado voo, mas fique em alerta, pois pode vir uma chuva pela frente")
                }else if(clima == "Chovendo"){
                    println("Autorizado voo, mas fique em alerta, pois pode vir uma tempesdade pela frente")
                }else{
                    println("Voo não autorizado, pois está ocorrendo uma tempestade.")
                }

        }else if(!manutencao){
            println("Voo não autorizado, pois o avião está sem MANUNTEÇÃO!")
        }else if(!combustivel){
            println("Voo não autorizado, pois o avião está sem COMBUSTÍVEL!")
        }else if (!estado) {
            println("Voo não autorizado, pois o avião está desligado")
        }else {
            println("Voo não autorizado, pois ele não na vistoria para voar")
        }
    }


    fun pousar(pistaPouso: Boolean, caminhoLivre: Boolean){
        if (pistaPouso && caminhoLivre){
            println("Pouso autorizado e pista checada e liberada")
        }else if (!pistaPouso){
            println("Pouso não autorizado, pois não tem uma pista")
        }else if (!caminhoLivre){
            println("Pouso não autorizado, pois tem objetos | pedrestres na pista")

        }else{
            println("Pouso não autorizado, pois a torre de comando não responde!")

        }
    }
}
