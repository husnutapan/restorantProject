package com.dao;

import java.util.List;

import com.model.Siparis;

public interface SiparisDAO {
	public Siparis findSiparisByMasaId(int masaId);

	public List<Siparis> allSiparis();

}
