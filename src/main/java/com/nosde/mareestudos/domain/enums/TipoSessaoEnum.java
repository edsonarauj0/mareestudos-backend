package com.nosde.mareestudos.domain.enums;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum TipoSessaoEnum {
    LEITURA(0, "Leitura"), 
    VIDEO(1, "Video"), 
    QUESTOES(2, "Questões"), 
    REVISAO(3, "Revisão");

    private int codigo;
    private String descricao;

    TipoSessaoEnum(int codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }

    public static TipoSessaoEnum getEnum(int codigo) {
        for (TipoSessaoEnum tipoSessaoEnum : TipoSessaoEnum.values()) {
            if (tipoSessaoEnum.getCodigo() == codigo) {
                return tipoSessaoEnum;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "TipoSessaoEnum{" +
                "codigo=" + codigo +
                ", descricao='" + descricao + '\'' +
                '}';
    }
    public static List<TipoSessaoEnum> getList() {
        return Arrays.asList(TipoSessaoEnum.values());
    }
    
    public static List<String> getDescricoes() {
        List<String> descricoes = new ArrayList<>();
        for (TipoSessaoEnum tipoSessaoEnum : TipoSessaoEnum.values()) {
            descricoes.add(tipoSessaoEnum.getDescricao());
        }
        return descricoes;
    }

}
