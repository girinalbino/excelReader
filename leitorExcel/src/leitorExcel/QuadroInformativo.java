package leitorExcel;

import java.util.List;

public abstract class QuadroInformativo{	
	private List<OrdemAcao> ordens;

	public List<OrdemAcao> getOrdens() {
		return ordens;
	}

	public void setOrdens(List<OrdemAcao> ordens) {
		this.ordens = ordens;
	} 		
};