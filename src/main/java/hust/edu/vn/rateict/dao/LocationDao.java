package hust.edu.vn.rateict.dao;

import java.util.List;

import hust.edu.vn.rateict.model.Location;


public interface LocationDao {
	
	public List<Location> getAllLocation();
	
	public void updateLocation (Location location);
	
	public Location getLocationById(int id);

}
