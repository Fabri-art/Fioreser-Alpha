package www.fioreser.com.pe.infrastructure.adapter;

import www.fioreser.com.pe.infrastructure.entity.CategoryEntity;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FENIX
 */
public interface CategoryCrudRepository extends CrudRepository<CategoryEntity, Integer> {
    
}
