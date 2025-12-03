package core.io.hex_pessoa_juridica.adapter.in.controller;

import core.io.hex_pessoa_juridica.adapter.dto.mapper.PessoaJuridicaDTOMapper;
import core.io.hex_pessoa_juridica.adapter.dto.request.PessoaJuridicaRequest;
import core.io.hex_pessoa_juridica.adapter.dto.response.PessoaJuridicaResponse;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.DeletePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.FindAllPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.SavePJInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/pessoasjuridicas")
public class PessoaJuridicaController {

    @Autowired
    private SavePJInputPort savePJInputPort;

    @Autowired
    private FindPJInputPort findPjInputPort;

    @Autowired
    private FindAllPJInputPort findAllPjInputPort;

    @Autowired
    private DeletePJInputPort deletePJInputPort;

    @Autowired
    private PessoaJuridicaDTOMapper pessoaJuridicaDTOMapper;

    @PostMapping
    public ResponseEntity<PessoaJuridicaResponse> save(@RequestBody PessoaJuridicaRequest pessoaJuridicaRequest) {
        PessoaJuridica pessoaJuridica = pessoaJuridicaDTOMapper.toPessoaJuridica(pessoaJuridicaRequest);
        PessoaJuridica pjSalvo = savePJInputPort.save(pessoaJuridica);
        PessoaJuridicaResponse pessoaJuridicaResponse = pessoaJuridicaDTOMapper.toPessoaJuridicaResponse(pjSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaJuridicaResponse);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PessoaJuridicaResponse> find(@PathVariable Long id){
        var pj = findPjInputPort.findById(id);
        var pjResponse = pessoaJuridicaDTOMapper.toPessoaJuridicaResponse(pj);
        return ResponseEntity.ok(pjResponse);
    }

    @GetMapping
    public ResponseEntity<List<PessoaJuridicaResponse>> findAll() {
        List<PessoaJuridica> pessoaJuridicas = findAllPjInputPort.findAll();
        List<PessoaJuridicaResponse> pessoaJuridicaResponses = pessoaJuridicas.stream()
                .map(pessoaJuridicaDTOMapper::toPessoaJuridicaResponse)
                .collect(Collectors.toList());
        return ResponseEntity.ok(pessoaJuridicaResponses);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        deletePJInputPort.delete(id);
        return ResponseEntity.noContent().build();
    }
}
