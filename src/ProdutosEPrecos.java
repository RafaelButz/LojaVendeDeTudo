public class ProdutosEPrecos implements Comparable<ProdutosEPrecos>{

    private String nomeDoPoduto;
    private double precoProduto;


    public String getNomeDoPoduto() {
        return nomeDoPoduto;
    }

    public void setNomeDoPoduto(String nomeDoPoduto) {
        this.nomeDoPoduto = nomeDoPoduto;
    }

    public double getPrecoProduto() {
        return precoProduto;
    }

    public void setPrecoProduto(double precoProduto) {
        this.precoProduto = precoProduto;
    }

    @Override
    public String toString() {
        return "Produto: " + getNomeDoPoduto() + "  |||| " + " Preco: " + getPrecoProduto();
    }

    @Override
    public int compareTo(ProdutosEPrecos nomeDoProduto) {
        return this.getNomeDoPoduto().compareTo(nomeDoProduto.getNomeDoPoduto());
    }
}
