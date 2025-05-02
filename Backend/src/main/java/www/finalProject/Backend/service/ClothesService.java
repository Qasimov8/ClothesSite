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
}
