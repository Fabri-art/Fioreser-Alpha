package www.fioreser.com.pe.infrastructure.adapter;

import www.fioreser.com.pe.infrastructure.entity.ProductEntity;
import www.fioreser.com.pe.infrastructure.entity.StockEntity;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author FENIX
 */
public interface StockCrudRepository extends CrudRepository<StockEntity, Integer>{
    List<StockEntity> getStockByProductEntity(ProductEntity productEntity); 
}
