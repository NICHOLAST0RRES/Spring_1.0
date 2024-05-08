package A3Unifacs.sd.UnifacsA3.repositories;

import A3Unifacs.sd.UnifacsA3.model.Pedido;
import A3Unifacs.sd.UnifacsA3.model.Produto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;



public interface PedidoRepository extends JpaRepository <Pedido, Long> {



}
