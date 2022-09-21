package testeAutomatizados.testeUnitariosAutomatizados.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import testeAutomatizados.testeUnitariosAutomatizados.model.PessoaModel;

class PessoaServiceTest {

    private PessoaModel adult;
    private PessoaModel isNotAdult;
    private PessoaService pessoaService;

    @BeforeEach
    public void setUp() {
        adult = new PessoaModel(18);
        isNotAdult = new PessoaModel(15);
        pessoaService = new PessoaService();
    }

    @Test
    @DisplayName("Deve retornar false se o usuario for menor de idade")
    void naoEAdultoRetorneFalse() {
        Assertions.assertFalse(pessoaService.isAdulto(isNotAdult));
    }

    @Test
    @DisplayName("Deve retornar true se usuario for maior de idade")
    void eAdultoRetorneTrue() {
        Assertions.assertTrue(pessoaService.isAdulto(adult));
    }
}