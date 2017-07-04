/**
 * 
 */
package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.model.Food;
import java.lang.String;
import java.util.List;

/**
 * @author suleyman.yildirim
 *
 */
public interface IFoodRepository extends CrudRepository<Food, Long> {

	List<Food> findByName(String name);
	List<Food> findByPortionType(String portiontype);

	
}
