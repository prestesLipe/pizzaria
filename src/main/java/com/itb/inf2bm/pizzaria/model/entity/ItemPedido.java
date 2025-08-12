package model.entity;

public class itemPedido {
    private int id;
    private int quantidadeItem;
    private boolean CodStatus;
    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public boolean isCodStatus() {
        return CodStatus;
    }

    public void setCodStatus(boolean codStatus) {
        CodStatus = codStatus;
    }

    public int getQuantidadeItem() {
        return quantidadeItem;
    }

    public void setQuantidadeItem(int quantidadeItem) {
        this.quantidadeItem = quantidadeItem;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    private double valorUnitario;

    public static class categoria {
        private long id;
        private String nome;
        private String descricao;
        public boolean codStatus;

        public long getId() {
            return id;
        }

        public void setId(long id) {
            this.id = id;
        }

        public String getNome() {
            return nome;
        }

        public void setNome(String nome) {
            this.nome = nome;
        }

        public String getDescricao() {
            return descricao;
        }

        public void setDescricao(String descricao) {
            this.descricao = descricao;
        }

        public boolean isCodStatus() {
            return codStatus;
        }

        public void setCodStatus(boolean codStatus) {
            this.codStatus = codStatus;
        }
    }
}
