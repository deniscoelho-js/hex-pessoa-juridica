package core.io.hex_pessoa_juridica.application.core.usecase;

import core.io.hex_pessoa_juridica.application.ports.in.DeletePJInputPort;
import core.io.hex_pessoa_juridica.application.ports.in.FindPJInputPort;
import core.io.hex_pessoa_juridica.application.ports.out.DeletePJOutputPort;

public class DeletePJUseCase implements DeletePJInputPort {

    private final FindPJInputPort findPJInputPort;

    private final DeletePJOutputPort deletePJOutputPort;

    public DeletePJUseCase(FindPJInputPort findPJInputPort, DeletePJOutputPort deletePJOutputPort) {
        this.findPJInputPort = findPJInputPort;
        this.deletePJOutputPort = deletePJOutputPort;
    }

    @Override
    public void delete(Long id) {
        findPJInputPort.findById(id);
        deletePJOutputPort.delete(id);
    }
}
