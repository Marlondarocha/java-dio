public class SistemaMedida {
    public static void main(String[] args) throws Exception {
        String plano = "turbo";

        switch (plano) {
            case "turbo": {
                System.out.println("5GB no Youtube!!!");   
            }
            case "medio": {
                System.out.println("Whatsapp + Instagram grátis!!");
            }
            case "basico": {
                System.out.println("100 minutos de ligação!");    
            }
        }
    }
}
