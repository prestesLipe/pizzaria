package model.entity;

import java.time.LocalDateTime;

public class pedido {
    public Long id;
    public String valorPedido;
    private  LocalDateTime datahorapedido;
    private LocalDateTime datahoraentrega;
    private String status;
    private boolean CodStatus;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValorPedido() {
        return valorPedido;
    }

    public void setValorPedido(String valorPedido) {
        this.valorPedido = valorPedido;
    }

    public localDateTime getDatahorapedido() {
        return datahorapedido;
    }

    public void setDatahorapedido(localDateTime datahorapedido) {
        this.datahorapedido = datahorapedido;
    }

    public localDateTime getDatahoraentrega() {
        return datahoraentrega;
    }

    public void setDatahoraentrega(localDateTime datahoraentrega) {
        this.datahoraentrega = datahoraentrega;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isCodStatus() {
        return CodStatus;
    }

    public void setCodStatus(boolean codStatus) {
        CodStatus = codStatus;
    }
}
}
