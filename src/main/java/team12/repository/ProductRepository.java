package team12.repository;

import java.awt.print.Pageable;

import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.CrossOrigin;

import team12.entity.ProductEntity;

@CrossOrigin("http://localhost:4200")
public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
	 Page<ProductEntity> findByCategoryIdCategory(@Param("idCategory") Long idCategory, Pageable pageable);
	    Page<ProductEntity> findByNameFoodContaining(String nameProduct, Pageable pageable);
	   
}
