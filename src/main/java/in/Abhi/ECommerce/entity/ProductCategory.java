package in.Abhi.ECommerce.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Set;

@Entity
@Table(name = "product_category")
@Data
public class ProductCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String categoryName;


    @OneToMany(mappedBy = "category",cascade = CascadeType.ALL)
    private Set<Product> product;
}
