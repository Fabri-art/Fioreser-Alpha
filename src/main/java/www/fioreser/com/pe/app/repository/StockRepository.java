package www.fioreser.com.pe.app.repository;

import www.fioreser.com.pe.infrastructure.entity.ProductEntity;
import www.fioreser.com.pe.infrastructure.entity.StockEntity;
import java.util.List;

/**
 *
 * @author FENIX
 */
public interface StockRepository {
    
    StockEntity guardarStock(StockEntity stockEntity);
    List<StockEntity> getStockByProductEntity(ProductEntity productEntity);
    
}
