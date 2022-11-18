package corporationLoster.bancoShow.controller;

import corporationLoster.bancoShow.entity.Cliente;
import corporationLoster.bancoShow.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

public class ClienteController {
    @Autowired
    private ClienteRepository clienteRepository;
    @PostMapping
    @ResponseBody
    public Cliente create(@RequestBody Cliente cliente){
        Cliente clienteSaved = clienteRepository.save(cliente);
        return clienteSaved;
    }


}
