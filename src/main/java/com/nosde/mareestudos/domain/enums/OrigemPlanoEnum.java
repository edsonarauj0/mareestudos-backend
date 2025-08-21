package com.nosde.mareestudos.domain.enums;

public enum OrigemPlanoEnum {
    EDITAL(0, "Edital"),
    PERSONALIZADO(1, "Personalizado");

    private int codigo;
    private String descricao;

    OrigemPlanoEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static OrigemPlanoEnum getEnum(int codigo) {
        for (OrigemPlanoEnum origemPlanoEnum : OrigemPlanoEnum.values()) {
            if (origemPlanoEnum.getCodigo() == codigo) {
                return origemPlanoEnum;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "OrigemPlanoEnum{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }



}
