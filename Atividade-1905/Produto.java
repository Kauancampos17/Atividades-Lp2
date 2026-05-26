package EstudoDeCaso1;



    public class Produto {

        private String nome;
        private double preco;
        private int quantidade;

        private static int totalProdutos = 0;

        public Produto(String nome, double preco, int quantidade) {

            this.nome = nome;

            if(preco >= 0) {
                this.preco = preco;
            } else {
                this.preco = 0;
                System.out.println("Preco inválido");
            }

            if(quantidade >= 0) {
                this.quantidade = quantidade;
            } else {
                this.quantidade = 0;
                System.out.println("Quantidade inválida");
            }

            totalProdutos++;
        }

        public String getNome() {
            return nome;
        }
        public double getPreco() {
            return preco;
        }

        public int getQuantidade() {
            return quantidade;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public void setPreco(double preco) {
            if(preco >= 0) {
                this.preco = preco;
            } else {
                System.out.println("Preço não pode ser negativo!");
            }
        }

        public void setQuantidade(int quantidade) {
            if(quantidade >= 0) {
                this.quantidade = quantidade;
            } else {
                System.out.println("Quantidade não pode ser negativa!");
            }
        }

        public double calcularValorEstoque() {
            return preco * quantidade;
        }

        public static int getTotalProdutos() {
            return totalProdutos;
        }
    }


