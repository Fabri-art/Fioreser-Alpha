package www.fioreser.com.pe.infrastructure.adapter;

import www.fioreser.com.pe.infrastructure.entity.ProductEntity;
import www.fioreser.com.pe.infrastructure.entity.UsuarioEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FENIX
 */
public interface ProductCrudRepository extends CrudRepository<ProductEntity, Integer> {
    Iterable<ProductEntity> findByUsuarioEntity(UsuarioEntity usuarioEntity);
}
