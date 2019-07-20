package br.imd.hackfest2019.MoneyWatchers.repository;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.imd.hackfest2019.MoneyWatchers.domain.ObraServico;
import jdk.nashorn.internal.runtime.FindProperty;

@Repository
public interface ObraRepository extends JpaRepository<ObraServico, Integer> {
	
	
	@Query(value="SELECT * FROM obraservico WHERE nomejurisdicionado like UPPER('%' || :cidade || '%')", nativeQuery=true)
	public List<ObraServico> findByCidade(@Param("cidade") String cidade);
	
	@Query(value = "SELECT DISTINCT cnpj FROM obraservico", nativeQuery = true)
	public List<String> getAllCnpj();
	
	/*
	 * @Query(value = "SELECT * FROM ") public List<ObraServico>
	 * findByLatLong(@Param("latitute") String latitude, @Param("longitude") String
	 * longitude);
	 */
}
