public class Terminal {
    public static void main(String[] args) {

        ContaCorrente conta1 = new ContaCorrente();
        System.out.println(conta1.ativa);
        conta1.cancelar("conta cancelada");
        System.out.println(conta1.ativa);
    }
}