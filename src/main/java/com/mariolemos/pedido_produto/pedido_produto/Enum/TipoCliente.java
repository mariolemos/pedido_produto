package com.mariolemos.pedido_produto.pedido_produto.Enum;

import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum TipoCliente {

    PESSOAFISICA(1, "Pessoa Física"),
    PESSOAJURÍDICA(2, "Pessoa Jurídica");

    private int cod;
    private String descricao;

    public static TipoCliente toEnum(Integer id) {

        if (id == null) {
            return null;
        }

        for (TipoCliente x : TipoCliente.values()) {
            if (id.equals(x.getCod())) {
                return x;
            }
        }
        throw new IllegalArgumentException("Id inválido " + id);
    }
}

