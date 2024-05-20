
import com.desafio.banco.cliente.Cliente;
import com.desafio.banco.conta.Conta;
import com.desafio.banco.conta.ContaCorrente;
import com.desafio.banco.conta.ContaPoupanca;

public class App {

    public static void main(String[] args) {

        Cliente joao = new Cliente();
        joao.setNome("João");

        ContaCorrente contaCorrente = new ContaCorrente(2, 101, 0, joao);
        ContaPoupanca contaPoupanca = new ContaPoupanca(2, 123, 0, joao);

        contaCorrente.depositar(100);

        contaCorrente.transferir(25, contaPoupanca);

        contaCorrente.imprimirExtrato();
        contaPoupanca.imprimirExtrato();
        
    }
    
}
