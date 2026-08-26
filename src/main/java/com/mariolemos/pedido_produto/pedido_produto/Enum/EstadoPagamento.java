package com.mariolemos.pedido_produto.pedido_produto.Enum;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum EstadoPagamento {

    PENDENTE(1, "Pedido Pendente"),
    QUITADO(2, "Pedido Quitado"),
    CANCELADO(3, "Pedido Cancelado");

    private int cod;
    private String descricao;

    public static EstadoPagamento toEnum(Integer id) {

        if (id == null) {
            return null;
        }

        for (EstadoPagamento x : EstadoPagamento.values()) {
            if (id.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido " + id);
    }
}
