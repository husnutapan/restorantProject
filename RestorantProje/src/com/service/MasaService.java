package com.service;

import java.util.List;
import com.model.Masa;

public interface MasaService {
	public List<Masa> findAllMasa();

	public void saveMasa(Masa masa);

	public Masa findById(int id);

	public void updateEmployeeById(Masa masa, int id);

	public void deleteMasa(long id);
	
}
