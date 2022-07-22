package br.com.zup.edu.funcionariosclient.funcionarios;

import br.com.zup.edu.funcionariosclient.cliente.FuncionariosClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
public class ListarFuncionariosPorCargoController {

    @Autowired
    private FuncionariosClient client;

    @GetMapping("/funcionarios")
    public ResponseEntity<?> listaPorCargo(@RequestParam String cargo) {

        List<FuncionarioFiltradoResponse> funcionariosPorCargo = client.lista().stream()
                .filter(f -> cargo.equalsIgnoreCase(f.getCargo()))
                .map(FuncionarioFiltradoResponse::new)
                .collect(Collectors.toList());

        return ResponseEntity.ok(funcionariosPorCargo);
    }

}
