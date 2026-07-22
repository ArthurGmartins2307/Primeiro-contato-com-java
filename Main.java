class Pessoa{
    String nome;

    public Pessoa(String nome){
        this.nome = nome;
    }
    void apresentar(){
        System.out.println("Olá! Meu nome é " + nome);
    };
}

public class Main{
    public static void main(String[] args){
        Pessoa arthur = new Pessoa("Arthur");
        arthur.apresentar();
    };
}