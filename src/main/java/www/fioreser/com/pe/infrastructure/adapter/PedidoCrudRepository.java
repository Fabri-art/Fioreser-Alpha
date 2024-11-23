package www.fioreser.com.pe.infrastructure.adapter;

import www.fioreser.com.pe.infrastructure.entity.PedidoEntity;
import www.fioreser.com.pe.infrastructure.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FENIX
 */
public interface PedidoCrudRepository extends CrudRepository<PedidoEntity, Integer> {
    public Iterable<PedidoEntity> findByUsuarioEntity(UsuarioEntity usuarioEntity);
}
