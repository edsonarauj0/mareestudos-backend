package com.nosde.mareestudos.domain.enums;

public enum StatusTopicoEnum {
    PENDENTE(0, "Pendente"),
    ESTUDANDO(1, "Estudando"),
    CONCLUIDO(2, "Concluído"),
    REVISAR(3, "Revisar");

    private int codigo;
    private String descricao;

    StatusTopicoEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static StatusTopicoEnum getEnum(int codigo) {
        for (StatusTopicoEnum statusTopicoEnum : StatusTopicoEnum.values()) {
            if (statusTopicoEnum.getCodigo() == codigo) {
                return statusTopicoEnum;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "StatusTopicoEnum{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }
    
}
