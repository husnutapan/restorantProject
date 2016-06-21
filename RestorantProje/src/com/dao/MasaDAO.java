package com.dao;

import java.util.List;

import com.model.Masa;

public interface MasaDAO {
	public List<Masa> findAllMasa();

	public void saveMasa(Masa masa);

	public Masa findById(int id);

	public void updateEmployeeById(Masa masa, int id);

	public void deleteMasa(long id);
}
