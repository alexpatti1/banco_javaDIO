public class Main {
    public static void main(String[] args) {
        Clientes alex = new Clientes();
        alex.setNome("Alex");

        ContaCorrente cc = new ContaCorrente(alex);
        cc.depositar(100);

        ContaPoupanca poupanca = new ContaPoupanca(alex);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
