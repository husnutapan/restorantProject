package com.dao;

import java.io.Serializable;
import java.util.List;

import org.hibernate.Criteria;

import com.model.Employee;
import com.model.Siparis;

public class SiparisDAOImpl extends AbstractDao<Integer, Siparis> implements SiparisDAO ,Serializable{

	@Override
	public Siparis findSiparisByMasaId(int masaId) {
		return null;
	}

	@Override
	public List<Siparis> allSiparis() {
		Criteria criteria = createEntityCriteria();
		return (List<Siparis>) criteria.list();
	}

}
