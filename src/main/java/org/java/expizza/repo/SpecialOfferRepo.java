package org.java.expizza.repo;

import java.util.List;

import org.java.expizza.pojo.SpecialOffer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SpecialOfferRepo extends JpaRepository<SpecialOffer, Integer> {
	
	public List<SpecialOffer> findByTitleContaining(String title);
}