package br.com.cadastra.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;

import java.io.Serializable;

@Embeddable
@AllArgsConstructor
@NoArgsConstructor
@Getter
public class Telefone implements Serializable {


	private static final long serialVersionUID = 1L;

	private String ddd;

    @NotNull
    @NotEmpty
    private String numero;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Telefone telefone = (Telefone) o;

        if (ddd != null ? !ddd.equals(telefone.ddd) : telefone.ddd != null) {
            return false;
        }
        return numero != null ? numero.equals(telefone.numero) : telefone.numero == null;

    }

    @Override
    public int hashCode() {
        int result = ddd != null ? ddd.hashCode() : 0;
        result = 31 * result + (numero != null ? numero.hashCode() : 0);
        return result;
    }

}