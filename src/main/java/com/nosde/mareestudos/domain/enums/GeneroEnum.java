package com.nosde.mareestudos.domain.enums;

public enum GeneroEnum {
   NAO_INFORMADO(0, "Não informado"), 
   MASCULINO(1, "Masculino"), 
   FEMININO(2, "Feminino"), 
   OUTRO(3, "Outro");

   private final int codigo;
   private final String descricao;

   GeneroEnum(int codigo, String descricao) {
      this.codigo = codigo;
      this.descricao = descricao;
   }

   public int getCodigo() {
      return codigo;
   }

   public String getDescricao() {
      return descricao;
   }

   public static GeneroEnum getEnum(int codigo) {
      for (GeneroEnum generoEnum : GeneroEnum.values()) {
         if (generoEnum.getCodigo() == codigo) {
            return generoEnum;
         }
      }
      return null;
   }

   @Override
   public String toString() {
      return "GeneroEnum{" +
         "codigo=" + codigo +
         ", descricao='" + descricao + '\'' +
         '}';
   }
}
