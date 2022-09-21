package testeAutomatizados.testeUnitariosAutomatizados.service;

import testeAutomatizados.testeUnitariosAutomatizados.model.PessoaModel;

import java.util.Objects;

public class PessoaService { //alt + enter (atalho para criar teste)
    public boolean isAdulto(PessoaModel pessoaModel) {
        Objects.requireNonNull(pessoaModel, "O objeto pessoa, não pode ser nulo");
        return pessoaModel.getIdade() >= 18;

    }
}
