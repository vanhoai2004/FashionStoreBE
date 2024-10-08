package team12.entity;

import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
public class ProductEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long productId;
	private String nameProduct;
	
	private BigDecimal price;
	
	 @ManyToOne
	    @JoinColumn(name = "category_id")
	    private CategoryEntity category;
	 
	 @Temporal(TemporalType.DATE)
	    private Date publicationDate;

	    @Column(columnDefinition = "TEXT")
	    private String description;

	    private String coverImage;
}
