import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int opçao=0;
        List<Cliente> listaDeCliente=new ArrayList<>();
        Cliente c1=new Cliente("cpf","email");
        listaDeCliente.add(c1);
        List<Vendedor> listaDeVendedor=new ArrayList<>();
        Vendedor v1=new Vendedor("cpf","email");
        listaDeVendedor.add(v1);
        List<Produto> listaDeProduto=new ArrayList<>();
        Produto p1=new Produto("nome","codigo",10);
        listaDeProduto.add(p1);
        Scanner scanner= new Scanner(System.in);
        System.out.println("menu");
        System.out.println("1.cadastrar produto");
        System.out.println("2.comprar produto");
        System.out.println("3.cadastrar cliente");
        System.out.println("4.cadastrar vendedor");
        System.out.println("5.exit");
         opçao=scanner.nextInt();
        System.out.println("opçao escolhida: "+ opçao);
        while (opçao!=5){
            if(opçao==1){
                System.out.println("Informe o nome do produto: ");
                String nome= scanner.next();
                System.out.println("Informe o codigo do produto: ");
                String codigo= scanner.next();
                System.out.println("Informe o preço do produto: ");
                int preço = scanner.nextInt();
                Produto produto=new Produto(nome,codigo,preço);
                listaDeProduto.add(produto);
                System.out.println("produto cadastrado");
                System.out.println("quantidade de produto cadastrados: "+ listaDeProduto.size());
            } else if (opçao==2){
                System.out.println("produto comprado");
            } else if (opçao==3){
                System.out.println("Informe o cpf do cliente: ");
                String cpf= scanner.next();
                System.out.println("Informe o email do cliente: ");
                String email= scanner.next();
                Cliente cliente=new Cliente(cpf,email);
                listaDeCliente.add(cliente);
                System.out.println("cliente cadastrado");
                System.out.println("quantidade de clientes cadastrados: "+ listaDeCliente.size());
            } else if (opçao==4) {
                System.out.println("Informe o cpf do vendedor: ");
                String cpf= scanner.next();
                System.out.println("Informe o email do vendedor: ");
                String email= scanner.next();
                Vendedor vendedor=new Vendedor(cpf,email);
                listaDeVendedor.add(vendedor);
                System.out.println("vendedor cadastrado");
                System.out.println("quantidade de vendedores cadastrados: "+ listaDeVendedor.size());
            }
            if (opçao!=5) {
                System.out.println("menu");
                System.out.println("1.cadastrar produto");
                System.out.println("2.comprar produto");
                System.out.println("3.cadastrar cliente");
                System.out.println("4.cadastrar vendedor");
                System.out.println("5.exit");
                opçao = scanner.nextInt();
            }
        }
        System.out.println("programa encerrado");
    }
}