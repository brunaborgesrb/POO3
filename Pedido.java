
class ItemPedido {
    String produto;
    double preco;
    int quantidade;

    public ItemPedido(String produto, double preco, int quantidade) {
        this.produto = produto;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public double calcularSubtotal() {
        return preco * quantidade;
    }
}

class Pedido {
    private int numero;
    private ItemPedido[] itens;

    public Pedido(int numero, ItemPedido[] itens) {
        this.numero = numero;
        this.itens = itens;
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itens) {
            total += item.calcularSubtotal();
        }
        return total;
    }

    public int getNumero() {
        return numero;
    }
}
