package com.cg.ofr.service;

import java.util.List;

import com.cg.ofr.entities.Landlord;
import com.cg.ofr.exception.LandlordNotFoundException;

public interface LandlordService {
	public Landlord addLandlord(Landlord landlord);

	public Landlord updateLandlord(Landlord landlord);

	public Landlord deleteLandlord(Landlord landlord);

	public Landlord viewLandlord(int id) throws LandlordNotFoundException;

	public List<Landlord> viewAllLandlord();
}
