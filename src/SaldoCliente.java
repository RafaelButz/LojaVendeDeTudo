import org.w3c.dom.ls.LSOutput;

import java.util.Collection;

public class SaldoCliente extends ProdutosEPrecos {
    private double saldo;

    public double calculaNovoSaldo(double saldo, double preco){
        if(this.saldo < preco){
            return getSaldo();
        } else{
        return this.saldo -= preco;
        }
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }
}
