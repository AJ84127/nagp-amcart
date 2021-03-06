package com.nagarro.amcart.daos;

import java.util.Collection;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.nagarro.amcart.daos.exceptions.DAOException;
import com.nagarro.amcart.models.enums.ProductStatus;
import com.nagarro.amcart.models.product.Category;
import com.nagarro.amcart.models.product.Product;

/**
 * Defines DAO operations for the Product model.
 * 
 *
 */
@Repository
@Component("productDao")
public interface ProductDao extends JpaRepository<Product, Long> {

	/**
	 * finds products using name
	 * 
	 * @param name
	 * @return List of Products
	 */
	Collection<Product> findByName(String name) throws DAOException;

	/**
	 * finds products using productStatus
	 * 
	 * @param ProductStatus
	 * @return Collection of Products
	 */
	Collection<Product> findByStatus(ProductStatus status) throws DAOException;

	/**
	 * finds products using categories and productStatus
	 * 
	 * @param Category
	 * @return Collection of Products
	 */
	Collection<Product> findByCategories(Set<Category> categories) throws DAOException;

	/**
	 * finds products using categories and productStatus
	 * 
	 * @param Category
	 * @param ProductStatus
	 * @return Collection of Products
	 */
	Collection<Product> findByCategoriesAndStatus(Set<Category> categories, ProductStatus status) throws DAOException;
}