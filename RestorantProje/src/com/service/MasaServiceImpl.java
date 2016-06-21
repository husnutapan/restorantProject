package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.MasaDAO;
import com.model.Masa;
@Service
@Transactional
public class MasaServiceImpl implements MasaService {

	@Autowired
	private MasaDAO masaDAO;

	@Override
	public List<Masa> findAllMasa() {
		return masaDAO.findAllMasa();
	}

	@Override
	public void saveMasa(Masa masa) {
		masaDAO.saveMasa(masa);
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
