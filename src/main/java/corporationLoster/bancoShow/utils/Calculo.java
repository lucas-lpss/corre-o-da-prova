package corporationLoster.bancoShow.utils;

import corporationLoster.bancoShow.entity.Cliente;
import org.springframework.stereotype.Service;

@Service
public class Calculo {
    public Cliente calc (Cliente cliente) {
        if (cliente.getReceita() > 1000000000.00) {
            Double valorIdeal = cliente.getReceita() - 99999999.9;
            cliente.setReceitaTotal(valorIdeal);
            return cliente;

        } else {
            Double porcentagem = (cliente.getReceita() * 0.05);
            cliente.setReceitaTotal(cliente.getReceita() - porcentagem);
            return cliente;


        }

    }
}