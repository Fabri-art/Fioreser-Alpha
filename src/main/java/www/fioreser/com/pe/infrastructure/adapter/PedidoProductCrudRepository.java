package www.fioreser.com.pe.infrastructure.adapter;

import www.fioreser.com.pe.infrastructure.entity.PedidoEntity;
import www.fioreser.com.pe.infrastructure.entity.PedidoProductEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FENIX
 */
public interface PedidoProductCrudRepository extends CrudRepository<PedidoProductEntity, Integer> {
    List<PedidoProductEntity> findByPedidoEntity(PedidoEntity pedidoEntity);
}
