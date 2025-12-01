package core.io.hex_pessoa_juridica.adapter.in.controller;

import core.io.hex_pessoa_juridica.adapter.dto.mapper.PessoaJuridicaDTOMapper;
import core.io.hex_pessoa_juridica.adapter.dto.request.PessoaJuridicaRequest;
import core.io.hex_pessoa_juridica.adapter.dto.response.PessoaJuridicaResponse;
import core.io.hex_pessoa_juridica.application.core.domain.PessoaJuridica;
import core.io.hex_pessoa_juridica.application.ports.in.SavePJInputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/pessoasjuridicas")
public class PessoaJuridicaController {

    @Autowired
    private SavePJInputPort savePJInputPort;

    @Autowired
    private PessoaJuridicaDTOMapper pessoaJuridicaDTOMapper;

    @PostMapping
    public ResponseEntity<PessoaJuridicaResponse> save(@RequestBody PessoaJuridicaRequest pessoaJuridicaRequest) {
        PessoaJuridica pessoaJuridica = pessoaJuridicaDTOMapper.toPessoaJuridica(pessoaJuridicaRequest);
        PessoaJuridica pjSalvo = savePJInputPort.save(pessoaJuridica);
        PessoaJuridicaResponse pessoaJuridicaResponse = pessoaJuridicaDTOMapper.toPessoaJuridicaResponse(pjSalvo);
        return ResponseEntity.status(HttpStatus.CREATED).body(pessoaJuridicaResponse);
    }
}
