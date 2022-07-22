package br.com.zup.edu.funcionariosclient.cliente;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(
        name = "meusFuncionariosClient",
        url = "http://localhost:8080/oauth2-resourceserver-gestao-funcionarios"
)
public interface FuncionariosClient {

    @GetMapping("/api/funcionarios")
    public List<FuncionarioResponse> lista();

}
