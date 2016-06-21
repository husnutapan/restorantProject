package com.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.springframework.stereotype.Repository;

import com.model.Masa;
@Repository
public class MasaDAOImpl extends AbstractDao<Integer, Masa> implements MasaDAO {

	@Override
	public List<Masa> findAllMasa() {
		Criteria criteria = createEntityCriteria();
		return (List<Masa>) criteria.list();
	}

	@Override
	public void saveMasa(Masa masa) {
		persist(masa);
	}

	@Override
	public Masa findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void updateEmployeeById(Masa masa, int id) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteMasa(long id) {
		// TODO Auto-generated method stub

	}

}
