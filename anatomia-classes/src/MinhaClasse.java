public class MinhaClasse { 

    public static void main (String [] args) {
        String primeiroNome = "Marlon";
        String Sobrenome = "da Rocha";
        String nomeCompleto = nomeCompleto(primeiroNome, Sobrenome);
        System.out.println(nomeCompleto);   
    }
    public static String nomeCompleto (String primeiroNome, String Sobrenome) {
        return "Resultado do método " + primeiroNome + (" ") + (Sobrenome);
    }
}
