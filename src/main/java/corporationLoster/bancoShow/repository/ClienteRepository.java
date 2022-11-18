package corporationLoster.bancoShow.repository;

import corporationLoster.bancoShow.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
