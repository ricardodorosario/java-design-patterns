package bean;

import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("rawtypes")
public abstract class PieceToBuildVehicle<T extends PieceToBuildVehicle> {
	private Integer id;
	private String name;
	private List<T> listChildren = new ArrayList<>();

	public PieceToBuildVehicle(Integer id, String name) {
		this.id = id;
		this.name = name;
	}

	public Integer getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void addChildren(T children) {
		listChildren.add(children);
	}
	public List<T> getChildren(){
		return listChildren;
	}

}
