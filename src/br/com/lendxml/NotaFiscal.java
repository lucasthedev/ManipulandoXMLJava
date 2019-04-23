package br.com.lendxml;

import java.util.Calendar;

public class NotaFiscal {
	
	private int serie;
	private int numero;
	private Calendar dataEmissao;
	private String tipoOperacao;
	private int naturezaOperacao;
	
	public NotaFiscal(int serie, int numero, Calendar dataEmissao, String tipoOperacao, int naturezaOperacao) {
		this.serie = serie;
		this.numero = numero;
		this.dataEmissao = dataEmissao;
		this.tipoOperacao = tipoOperacao;
		this.naturezaOperacao = naturezaOperacao;
	}

	public int getSerie() {
		return serie;
	}

	public void setSerie(int serie) {
		this.serie = serie;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public String getTipoOperacao() {
		return tipoOperacao;
	}

	public void setTipoOperacao(String tipoOperacao) {
		this.tipoOperacao = tipoOperacao;
	}

	public int getNaturezaOperacao() {
		return naturezaOperacao;
	}

	public void setNaturezaOperacao(int naturezaOperacao) {
		this.naturezaOperacao = naturezaOperacao;
	}
	
	
	
}
