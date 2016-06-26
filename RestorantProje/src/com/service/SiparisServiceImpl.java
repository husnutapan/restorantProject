package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.dao.SiparisDAO;
import com.model.Siparis;

public class SiparisServiceImpl implements SiparisService {

	@Autowired
	private SiparisDAO siparisDAO;

	@Override
	public Siparis findSiparisByMasaId(int masaId) {
		return siparisDAO.findSiparisByMasaId(masaId);
	}

	@Override
	public List<Siparis> allSiparis() {
		return siparisDAO.allSiparis();
	}

}
