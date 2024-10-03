package br.com.fiap.ecommerce.dtos.pedido;

import org.modelmapper.ModelMapper;

import br.com.fiap.ecommerce.model.Pedido;

import java.math.BigDecimal;

public class PedidoResponseDto {
    private Long id;
    private Long idCliente;
    private String dataPedido;
    private String status;
    private String formaPagamento;
    private BigDecimal valorTotal;

    private static final ModelMapper modelMapper = new ModelMapper();

    public static PedidoResponseDto toDto(Pedido pedido) {
        return modelMapper.map(pedido, PedidoResponseDto.class);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Long idCliente) {
        this.idCliente = idCliente;
    }

    public String getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(String dataPedido) {
        this.dataPedido = dataPedido;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
}
