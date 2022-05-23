/*1) Crie uma classe cliente e apresente os atributos e métodos referentes
esta classe, em seguida crie um objeto cliente, defina as instancias deste
objeto e apresente as informações deste objeto no console.*/


data class Cliente(var nome:String, var email:String, val cpf: String, var telefone: Int){

    var usuario = ""
    var senha = ""


constructor(nome: String, email: String, cpf: String, telefone: Int,
            usuario: String, senha: String)
            :this (nome,email,cpf, telefone){
            this.usuario = usuario
            this.senha = senha
            }

    fun cadastrar(usuario: String, senha: String){

        if (usuario != senha && usuario != "" && senha != ""){
            println("Seus dados de logins são:\n" +
                    "Usuário: $usuario\n" +
                    "Senha: $senha\n" +
                    "Criados com sucesso")
        }else{
            println("Usuário ou senha inválidos")
        }
    }

    fun logar(usuario: String, senha: String){
        if (usuario == this.usuario && senha == this.senha){
            println("Usuário logado com sucesso.")
        }else{
            println("Usuário ou Senha inválida")
        }
    }


}


