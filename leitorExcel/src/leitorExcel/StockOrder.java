package leitorExcel;

public class OrdemAcao {
	String Q;
	/**
	 * 1-BOVESPA (deve ter códigos para outras bolsas)
	 */
	String tipoNegociacao;
	/**
	 * C/V
	 */
	String operacao;
	/**
	 * 
	 */
	String prazo;
	/**
	 * Nome na nota
	 */
	String nomeAtivo;
	/**
	 * Código da XP, provalvelmente vai ter que fazer um parser específico
	 */
	String observacao;
	/**
	 * Quantidade Negociada
	 */
	String quantidade;
	/**
	 * Cotação Negociada
	 */
	String cotacao;

	/**
	 * Valor de ajuste da operação
	 */
	String valorTotal;
	/**
	 * D/C
	 */
	String tipoResultadoFinanceiro;
	public String getQ() {
		return Q;
	}
	public void setQ(String q) {
		Q = q;
	}
	public String getTipoNegociacao() {
		return tipoNegociacao;
	}
	public void setTipoNegociacao(String tipoNegociacao) {
		this.tipoNegociacao = tipoNegociacao;
	}
	public String getOperacao() {
		return operacao;
	}
	public void setOperacao(String operacao) {
		this.operacao = operacao;
	}
	public String getPrazo() {
		return prazo;
	}
	public void setPrazo(String prazo) {
		this.prazo = prazo;
	}
	public String getNomeAtivo() {
		return nomeAtivo;
	}
	public void setNomeAtivo(String nomeAtivo) {
		this.nomeAtivo = nomeAtivo;
	}
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	public String getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
	public String getCotacao() {
		return cotacao;
	}
	public void setCotacao(String cotacao) {
		this.cotacao = cotacao;
	}
	public String getValorTotal() {
		return valorTotal;
	}
	public void setValorTotal(String valorTotal) {
		this.valorTotal = valorTotal;
	}
	public String getTipoResultadoFinanceiro() {
		return tipoResultadoFinanceiro;
	}
	public void setTipoResultadoFinanceiro(String tipoResultadoFinanceiro) {
		this.tipoResultadoFinanceiro = tipoResultadoFinanceiro;
	}
}