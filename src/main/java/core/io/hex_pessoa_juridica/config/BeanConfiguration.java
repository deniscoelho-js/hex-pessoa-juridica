package core.io.hex_pessoa_juridica.config;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.usecase.DeletePJUseCase;
import core.io.hex_pessoa_juridica.application.core.usecase.FindAllPJUseCase;
import core.io.hex_pessoa_juridica.application.core.usecase.FindPJUseCase;
import core.io.hex_pessoa_juridica.application.core.usecase.SavePJUseCase;
import core.io.hex_pessoa_juridica.application.ports.in.DeletePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.FindAllPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.SavePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.DeletePJOutputPort;
import core.io.hex_pessoa_juridica.application.ports.out.FindAllPJOutputPort;
import core.io.hex_pessoa_juridica.application.ports.out.FindPJOutputPort;
import core.io.hex_pessoa_juridica.application.ports.out.SavePJOutputPort;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class BeanConfiguration {

    @Bean
    public SavePJInputPort savePJUseCase(SavePJOutputPort savePJOutputPort, EnderecoClient enderecoClient) {
        return new  SavePJUseCase(savePJOutputPort, enderecoClient);
    }

    @Bean
    public FindPJInputPort findPJUseCase(FindPJOutputPort findPJOutputPort,
                                         EnderecoClient enderecoClient) {
        return new FindPJUseCase(findPJOutputPort, enderecoClient);
    }

    @Bean
    public FindAllPJInputPort findAllPjUseCase(EnderecoClient enderecoClient,
                                               FindAllPJOutputPort findAllPjOutputPort) {
        return new FindAllPJUseCase(enderecoClient, findAllPjOutputPort);
    }

    @Bean
    public DeletePJInputPort deletePJUseCase(FindPJInputPort findPJInputPort,
                                             DeletePJOutputPort deletePJOutputPort) {
        return new DeletePJUseCase(findPJInputPort, deletePJOutputPort);
    }
}
