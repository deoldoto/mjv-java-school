import java.time.LocalDate;
import java.util.Date;
import java.util.List;

public class ContaCorrente {

    Cliente cliente;
    double saldo;
    int numeroConta;
    int numeroAgencia;
    boolean ativa = true;
    List consultarExtrato(LocalDate dataInicio, LocalDate dataFim){

        return null;
    }
    void sacar(double valor){

    }
    void transferir(ContaCorrente conteDestino, double valor){

    }

    void cancelar(String justificativa){
        this.ativa = false;

    }

    double consutlarSaldo(){
        return this.saldo;
    }


}
