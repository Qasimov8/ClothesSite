package www.finalProject.Backend.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import www.finalProject.Backend.entity.ClothesEntity;
import www.finalProject.Backend.repository.ClothesRepository;

@Service
public class ClothesService {
@Autowired
ClothesRepository clothesRepository;

public List<ClothesEntity> getAllClothes(){
	return clothesRepository.findAll();
}
public void createClothes(ClothesEntity clothesEntity) {
	clothesRepository.save(clothesEntity);
}
public void deleteClothes(Long id) {
	clothesRepository.deleteById(id);
}
public Optional<ClothesEntity> getClothesById(Long id){
	return clothesRepository.findById(id);
}
public List<ClothesEntity> search(String keyword){
	return clothesRepository.findByBrandContainingIgnoreCase(keyword);
}
public List<ClothesEntity> findByMinRate(int minRating){
	return clothesRepository.findAllByRatingGreaterThanEqual(minRating);
}
public void deleteAllClothes() {
    clothesRepository.deleteAll();
}
public List<ClothesEntity> sortByPriceDesc(){
	return clothesRepository.findAllByOrderByPriceDesc();
}
public List<ClothesEntity> sortByPriceAsc(){
	return clothesRepository.findAllByOrderByPriceAsc();
}
public void updateClothes(Long id, ClothesEntity clothesEntity) {
    Optional<ClothesEntity> oldClothes = clothesRepository.findById(id);
    if (oldClothes.isPresent()) {
        ClothesEntity clothes = oldClothes.get();

        clothes.setBrand(clothesEntity.getBrand());
        clothes.setType(clothesEntity.getType());
        clothes.setCategory(clothesEntity.getCategory());
        clothes.setDescription(clothesEntity.getDescription());
        clothes.setPrice(clothesEntity.getPrice());
        clothes.setRating(clothesEntity.getRating());
        clothes.setImgUrl(clothesEntity.getImgUrl());
        clothes.setOwnerId(clothesEntity.getownerId());

        clothesRepository.save(clothes);
    }
}

}


