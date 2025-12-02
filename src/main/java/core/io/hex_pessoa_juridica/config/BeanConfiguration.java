package core.io.hex_pessoa_juridica.config;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.usecase.FindAllPjUseCase;
import core.io.hex_pessoa_juridica.application.core.usecase.FindPJUseCase;
import core.io.hex_pessoa_juridica.application.core.usecase.SavePJUseCase;
import core.io.hex_pessoa_juridica.application.ports.in.FindAllPjInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.FindPjInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.SavePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.FindAllPjOutputPort;
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
    public FindPjInputPort findPJUseCase(FindPJOutputPort findPJOutputPort,
                                         EnderecoClient enderecoClient) {
        return new FindPJUseCase(findPJOutputPort, enderecoClient);
    }

    @Bean
    public FindAllPjInputPort findAllPjUseCase(EnderecoClient enderecoClient,
                                               FindAllPjOutputPort findAllPjOutputPort) {
        return new FindAllPjUseCase(enderecoClient, findAllPjOutputPort);
    }
}
