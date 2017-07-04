package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * 
 * Entity that holds nutrition data
 * 
 * @author suleyman.yildirim
 *
 */
/**
 * @author suleyman.yildirim
 *
 */
@Entity
public class Food {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String name; // Oats
	private int calories; // 200 kcal
	private double protein;
	private double carbs;
	private double fat;
	private int portionAmount; // 100 (gram), 1 (cup)
	private String portionType; // gram, cup

	Food() {
	}
 
	/**
	 * @param id
	 * @param name
	 * @param calories
	 * @param carbs
	 * @param protein
	 * @param fat
	 * @param portionAmount
	 * @param portionType
	 */
	public Food(Long id, String name, int calories,  double carbs, double protein, double fat, int portionAmount,
			String portionType) {
		super();
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.carbs = carbs;
		this.protein = protein;
		this.fat = fat;
		this.portionAmount = portionAmount;
		this.portionType = portionType;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @return the calories
	 */
	public int getCalories() {
		return calories;
	}

	/**
	 * @return the portionAmount
	 */
	public int getPortionAmount() {
		return portionAmount;
	}

	/**
	 * @return the portionType
	 */
	public String getPortionType() {
		return portionType;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @param calories
	 *            the calories to set
	 */
	public void setCalories(int calories) {
		this.calories = calories;
	}

	/**
	 * @param portionAmount
	 *            the portionAmount to set
	 */
	public void setPortionAmount(int portionAmount) {
		this.portionAmount = portionAmount;
	}

	/**
	 * @param portionType
	 *            the portionType to set
	 */
	public void setPortionType(String portionType) {
		this.portionType = portionType;
	}

	/**
	 * @return the protein
	 */
	public double getProtein() {
		return protein;
	}

	/**
	 * @return the carbs
	 */
	public double getCarbs() {
		return carbs;
	}

	/**
	 * @return the fat
	 */
	public double getFat() {
		return fat;
	}

	/**
	 * @param protein
	 *            the protein to set
	 */
	public void setProtein(double protein) {
		this.protein = protein;
	}

	/**
	 * @param carbs
	 *            the carbs to set
	 */
	public void setCarbs(double carbs) {
		this.carbs = carbs;
	}

	/**
	 * @param fat
	 *            the fat to set
	 */
	public void setFat(double fat) {
		this.fat = fat;
	}

}
