package models;

import java.util.ArrayList;

public abstract class Bean {
	protected String identifier;
	protected String relationship;
	
	public abstract String get(String field);
	
	public abstract void set(String field, String data);
	
	public abstract ArrayList<String> fieldsList();
	
	public abstract int getId();
	
	public abstract void setId(int id);
	
	public static ArrayList<Integer> getIds(ArrayList<? extends Bean> list){
		ArrayList<Integer> ids = new ArrayList<Integer>();
		for(Bean bean : list){
			ids.add(bean.getId());
		}
		return ids;
	}
}