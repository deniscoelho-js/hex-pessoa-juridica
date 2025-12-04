package core.io.hex_pessoa_juridica.config;

import core.io.hex_pessoa_juridica.adapter.out.client.EnderecoClient;
import core.io.hex_pessoa_juridica.application.core.usecase.*;
import core.io.hex_pessoa_juridica.application.ports.in.*;
import core.io.hex_pessoa_juridica.application.ports.out.*;
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

    @Bean
    public UpdatePJInputPort updatePJUseCase(FindPJInputPort findPJInputPort,
                                             UpdatePJOutputPort updatePJOutputPort, EnderecoClient enderecoClient) {
        return new UpdatePJUseCase(findPJInputPort, updatePJOutputPort, enderecoClient);
    }
}
