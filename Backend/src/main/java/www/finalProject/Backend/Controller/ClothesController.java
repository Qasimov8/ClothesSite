package www.finalProject.Backend.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import www.finalProject.Backend.entity.ClothesEntity;
import www.finalProject.Backend.service.ClothesService;

@RestController
@RequestMapping("/clothes")
public class ClothesController {
@Autowired
ClothesService clothesService;

@GetMapping("getAll")
public List<ClothesEntity> findAll(){
	return clothesService.getAllClothes();
}
@GetMapping("/{id}")
public Optional<ClothesEntity> getClothesById(@PathVariable Long id){
	return clothesService.getClothesById(id);
}
@GetMapping("/search")
public List<ClothesEntity> search(@RequestParam String keyword){
	return clothesService.search(keyword);
}
@PostMapping("/create")
public void create(@RequestBody ClothesEntity clothesEntity) {
	clothesService.createClothes(clothesEntity);
}
@DeleteMapping("/delete/{id}")
public void delete(@PathVariable Long id) {
	clothesService.deleteClothes(id);
}
@GetMapping("/rating")
public List<ClothesEntity> byRating(@RequestParam int minRating){
	return clothesService.findByMinRate(minRating);
}
@DeleteMapping("deleteAll")
public void deleteAll() {
	clothesService.deleteAllClothes();
}
@GetMapping("sortByPrice-desc")
public List<ClothesEntity> sortByPriceDesc(){
	return clothesService.sortByPriceDesc();
}
@GetMapping("sortByPrice-asc")
public List<ClothesEntity> sortByPriceAsc(){
	return clothesService.sortByPriceAsc();
}
@PutMapping("/update/{id}")
public void upd(@PathVariable Long id, @RequestBody ClothesEntity clothes) {
	clothesService.updateClothes(id, clothes);
}
}
