import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner interfaceUsuario = new Scanner(System.in);
        List<ProdutosEPrecos> listaDeProdutosPrecos = new LinkedList<>();
        var saldoCLiente = new SaldoCliente();

        double entradaSaldo;
        String entradaNomeDoProduto;
        double entradaPrecoProduto;
        int paraLooping;

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                    /// Inicio da aplicação e Coleta de Saldo//
        System.out.println("===============================================================================");
        System.out.println("============================ Loja Muambeira ===================================");
        System.out.println("Digite seu saldo: ");
        entradaSaldo = interfaceUsuario.nextDouble();
        if (entradaSaldo < 0){
            System.out.println("Entrada invalida! ");
        } else{
            saldoCLiente.setSaldo(entradaSaldo);
        }

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                    /// Interface de coleta de dados (produtos e precos) //
        do {
            var compra = new ProdutosEPrecos();
            System.out.println("Nome do produto");
            entradaNomeDoProduto = interfaceUsuario.next();
            compra.setNomeDoPoduto(entradaNomeDoProduto);

            System.out.println("Preco do produto");
            entradaPrecoProduto = interfaceUsuario.nextDouble();
            saldoCLiente.setSaldo(entradaSaldo);
            compra.setPrecoProduto(entradaPrecoProduto);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                           /// Logica de compra //

            if (saldoCLiente.getSaldo() < compra.getPrecoProduto()) {
                System.out.println("Saldo indisponivel");
                System.out.println("Saldo: " + saldoCLiente.getSaldo());
                break;
            } else {
                saldoCLiente.calculaNovoSaldo(saldoCLiente.getSaldo(), entradaPrecoProduto);
            }

            listaDeProdutosPrecos.add(compra);

            System.out.println("Compra realizada!!");
            System.out.println("Deseja comprar mais itens?");
            System.out.println("[1] Sim    [2] Não");
            paraLooping = interfaceUsuario.nextInt();

        }while (paraLooping == 1);

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                                      /// Impressão de saida //
        Collections.sort(listaDeProdutosPrecos);
        System.out.println(listaDeProdutosPrecos);
        for (ProdutosEPrecos compra: listaDeProdutosPrecos) {
            System.out.println("Produto: " + compra.getNomeDoPoduto() );
            System.out.println("Preço: " + compra.getPrecoProduto());
        }

        System.out.println("Saldo:  " + saldoCLiente.getSaldo());

        interfaceUsuario.close();
    }
}

