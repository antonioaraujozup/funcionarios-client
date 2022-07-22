package br.com.zup.edu.funcionariosclient.funcionarios;

import br.com.zup.edu.funcionariosclient.cliente.FuncionarioResponse;

public class FuncionarioFiltradoResponse {

    private Long id;
    private String nome;
    private String cpf;
    private String cargo;

    public FuncionarioFiltradoResponse(FuncionarioResponse funcionario) {
        this.id = funcionario.getId();
        this.nome = funcionario.getNome();
        this.cpf = funcionario.getCpf();
        this.cargo = funcionario.getCargo();
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getCargo() {
        return cargo;
    }

}
