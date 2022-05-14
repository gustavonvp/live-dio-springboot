package com.dio.live.model;


import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class BancoHorasIdClass implements Serializable  {
        private static final long serialVersionUID = -3123123;

        @Column(name = "ID_BANCO_HORAS")
        private long idBancoHoras;
        @Column(name = "ID_MOVIMENTACAO")
        private long idMovimentacao;
        @Column(name = "ID_USUARIO")
        private long idUsuario;

    public BancoHorasIdClass(long idBancoHoras, long idMovimentacao, long idUsuario) {
        this.idBancoHoras = idBancoHoras;
        this.idMovimentacao = idMovimentacao;
        this.idUsuario = idUsuario;
    }

    public BancoHorasIdClass() {

    }

    @Override
    public String toString() {
        return "BancoHorasIdClass{" +
                "idBancoHoras=" + idBancoHoras +
                ", idMovimentacao=" + idMovimentacao +
                ", idUsuario=" + idUsuario +
                '}';
    }

    public void setIdBancoHoras(long idBancoHoras) {
        this.idBancoHoras = idBancoHoras;
    }

    public void setIdMovimentacao(long idMovimentacao) {
        this.idMovimentacao = idMovimentacao;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdBancoHoras() {
        return idBancoHoras;
    }

    public long getIdMovimentacao() {
        return idMovimentacao;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BancoHorasIdClass that = (BancoHorasIdClass) o;
        return idBancoHoras == that.idBancoHoras && idMovimentacao == that.idMovimentacao && idUsuario == that.idUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idBancoHoras, idMovimentacao, idUsuario);
    }
}
