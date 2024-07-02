package Ex2;

public class ContaCorrente extends Conta{

    public ContaCorrente(double saldo, double limite){
        super(saldo, limite);
    }

    @Override
    public void depositar(double valor) throws SaldoInsuficienteException{
        if(valor<=0) {
            throw new SaldoInsuficienteException("Impossível depositar 0 ou valor negativo");
        }
        saldo+=valor;
    }

    @Override
    public void sacar(double valor) throws SaldoInsuficienteException {

        if(valor>(saldo+limite)) {
            throw new SaldoInsuficienteException("Saldo insuficiente");
        } else if (valor<=0) {
            throw new SaldoInsuficienteException("Impossível realizar um saque de valor 0 ou negativo");
        }
        saldo-=valor;
    }
}
