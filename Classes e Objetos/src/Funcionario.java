public class Funcionario {

    public int idade;
    public String nome;
    public double salario;

    // Construtor
    // Colocam-se os elementos que serao obrigatorios para criar o objeto

    public Funcionario(String nome, int idade, double salario) {

        this.idade = idade;
        this.nome = nome;
        this.salario = salario;

    }

    //  Construtor padrão
    //  Construtor sem nada, só serve pra iniciar o objeto
    
    public Funcionario() {

    }

    // Propriedades (get/set)

    public double getSalario(){
        return salario;
    }

    public int getIdade() {
        return idade;
    }

    public String getNome() {
        return nome;
    }

    public void setSalario(double salario){

        if(salario < 0){
            System.out.println("Salario nao pode ser negativo");
        } else {
            this.salario = salario;
        }

    }

    public void setNome(String nome){

        if(nome.length() < 3){
            System.out.println("Nome deve ter mais de 3 caracteres");
        } else {
            this.nome = nome;
        }

    }

    public void setIdade(int idade){

        if (idade < 16) {
            System.out.println("Erro: Idade mínima para trabalhar é 16 anos.");
        } else {
            this.idade = idade;
        }

    }

    // Operações (métodos)

    public void promoverSalario(double percentual){

        salario = salario * (salario/100 * percentual);

    }

    public double calcularSalarioAnual(){

        return (salario * 12);

    }

    public void exibirDados(){

        System.out.println("Funcionario 1: ");
        System.out.println("Nome: " + getNome());
        System.out.println("Idade: " + getIdade());
        System.out.println("Salario: " + getSalario());

    }
    
}

// Atributos
// Construtores
// Propriedades (get/set)
// Operações (métodos)