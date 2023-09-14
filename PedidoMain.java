import java.util.ArrayList;
import java.util.List;

public class PedidoMain {
    public static void main(String[] args) {
        // criando uma lista de objetos Pedido
        List<Pedido> pedidos = new ArrayList<>();

        // adicionando pedidos à lista
        pedidos.add(new Pedido(1, new ItemPedido[]{new ItemPedido("Produto A", 100, 2)}));
        pedidos.add(new Pedido(2, new ItemPedido[]{new ItemPedido("Produto B", 250, 3)}));
        pedidos.add(new Pedido(3, new ItemPedido[]{new ItemPedido("Produto C", 80, 5)}));

        // usando uma estrutura de repetição para calcular o total de todos os pedidos
        for (Pedido pedido : pedidos) {
            double totalPedido = pedido.calcularTotal();

            // usando uma estrutura de decisão para identificar pedidos com valor total superior a R$500
            if (totalPedido > 500) {
                System.out.println("Pedido #" + pedido.getNumero() + " tem um total de R$" + totalPedido);
            }
        }
    }
}

