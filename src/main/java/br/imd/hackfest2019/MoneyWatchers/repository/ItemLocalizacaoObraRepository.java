package br.imd.hackfest2019.MoneyWatchers.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import br.imd.hackfest2019.MoneyWatchers.domain.ItemLocalizacaoObra;

@Repository
public interface ItemLocalizacaoObraRepository extends JpaRepository<ItemLocalizacaoObra, Integer>{
	

	@Query(value = "SELECT a FROM ItemLocalizacaoObra a WHERE a.latitudeUTM LIKE  '-%'  AND a.longitudeUTM like  '-%' ")
	public List<ItemLocalizacaoObra> getAllNegativeLatLong();

}
