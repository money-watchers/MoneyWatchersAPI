package br.imd.hackfest2019.MoneyWatchers.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.imd.hackfest2019.MoneyWatchers.domain.ItemContrato;

@Repository
public interface ItemContratoRepository extends JpaRepository<ItemContrato, Integer> {

}
