package com.service;

import java.util.List;

import com.model.Siparis;

public interface SiparisService {
	public Siparis findSiparisByMasaId(int masaId);

	public List<Siparis> allSiparis();
}
