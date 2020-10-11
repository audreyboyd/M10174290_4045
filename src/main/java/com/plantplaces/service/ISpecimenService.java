package com.plantplaces.service;

import com.plantplaces.dto.SpecimenDTO;


/**
 * CRUD operations or specimens
 * @author Administrator
 *
 */
public interface ISpecimenService {
	/**
	 * Get Specimens from persistence layer
	 * @param id a unique lookup
	 * @return a specimen with a matching id
	 *
	 */
	SpecimenDTO fetchById(int id);
	/**
	 * persist the given DTO
	 * @param specimenDTO
	 *
	 */
	void save(SpecimenDTO specimenDTO);

}