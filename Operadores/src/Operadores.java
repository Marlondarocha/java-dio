public class Operadores {
    public static void main(String[] args) throws Exception {
        boolean condicao1 = true;
        boolean condicao2 = true;

        if (condicao1 && condicao2){
            System.out.println("São verdadeiras!");
        }

        if (condicao1 || condicao2){
            System.out.println("Uma das condições é verdadeira.");
        }
        System.out.println("Fim.");
    }
}

// Para OBJETOS e TEXTOS usa-se .EQUALS()
// String nomeUm = "Douglas"; 
// String nomeDois = new String("Douglas");

// System.out.println(nomeUm.equals(nomeDois));

// NÚMEROS

// int n1 = 17;
// int n2 = 8;

// boolean simNao = n1 == n2;

// if (n1 > n2) {
//     System.out.println("Condição verdadeira!");
// }

// .out.println("Número 1 é igual ao número 2? " + simNao);

// simNao = n1 != n2;

// System.out.println("Número 1 é diferente do número 2? " + simNao);

// simNao = n1 > n2;

// System.out.println("Número 1 é maior do número 2? " + simNao); 