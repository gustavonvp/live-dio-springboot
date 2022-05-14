package com.dio.live.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class MovimentacaoIdClass  implements Serializable {

        private static final long serialVersionUID = -8450195271351341722L;
        @Column(name = "ID_MOVIMENTO")
        private long idMovimento;
        @Column(name = "ID_USUARIO")
        private long idUsuario;


    public MovimentacaoIdClass() {

    }

    @Override
    public String toString() {
        return "MovimentacaoIdClass{" +
                "idMovimento=" + idMovimento +
                ", idUsuario=" + idUsuario +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MovimentacaoIdClass that = (MovimentacaoIdClass) o;
        return idMovimento == that.idMovimento && idUsuario == that.idUsuario;
    }

    @Override
    public int hashCode() {
        return Objects.hash(idMovimento, idUsuario);
    }

    public void setIdMovimento(long idMovimento) {
        this.idMovimento = idMovimento;
    }

    public void setIdUsuario(long idUsuario) {
        this.idUsuario = idUsuario;
    }

    public long getIdMovimento() {
        return idMovimento;
    }

    public long getIdUsuario() {
        return idUsuario;
    }

    public MovimentacaoIdClass(long idMovimento, long idUsuario) {
        this.idMovimento = idMovimento;
        this.idUsuario = idUsuario;
    }
}
