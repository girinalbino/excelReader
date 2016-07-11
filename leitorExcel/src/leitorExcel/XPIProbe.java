package leitorExcel;

import org.apache.poi.ss.usermodel.Cell;

public class XPIProbe {

	public class QuadroOrdensAcoes extends QuadroInformativo{		
	}

	public class QuadroOrdensOpcoes extends QuadroInformativo{
	}
	
	public XPIProbe() {
		super();		
	}

	private QuadroInformativo quadroAtual;

	public QuadroInformativo getQuadroAtual() {
		return quadroAtual;
	}

	public void setQuadroAtual(QuadroInformativo quadroAtual) {
		this.quadroAtual = quadroAtual;
	}

	public void processaCelula(Cell cell) {
		String valor = cell.getStringCellValue();
		
		// Marca o início do Quadro de ações: Bovespa - Depósito / Vista				
		if (getQuadroAtual() == null && valor != null
				&& "Bovespa - Depósito / Vista".equalsIgnoreCase(valor)) {
			setQuadroAtual(new QuadroOrdensAcoes());
			//processaQuadroAcoes();
		}
		// Quadro de ordens, formado pelas células:
		// Q; Negociação; C/V; Prazo; Especificação do Título; Obs;
		// Quantidade; Preço/Ajuste; Valor/Ajuste; D/C				
		
		// Marca o início do Quadro de opções
		if (valor != null
				&& "Bovespa - Depósito / Opções".equalsIgnoreCase(valor)) {
			
		}		
		
	}
}