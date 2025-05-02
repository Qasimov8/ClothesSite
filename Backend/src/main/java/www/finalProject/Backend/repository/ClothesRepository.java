package www.finalProject.Backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import www.finalProject.Backend.entity.ClothesEntity;

@Repository 
public interface ClothesRepository extends JpaRepository<ClothesEntity, Long> {
List <ClothesEntity> findByOwnerId(Long OwnerId);
List<ClothesEntity> findAllByOrderByPriceAsc();
List <ClothesEntity> findAllByOrderByPriceDesc();
List<ClothesEntity> findByBrandContainingIgnoreCase(String brand);

}
