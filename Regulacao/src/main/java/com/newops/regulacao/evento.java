package com.newops.regulacao;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class evento implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label(value = "Codigo")
	private java.lang.Integer codigo;
	@org.kie.api.definition.type.Label(value = "Descrição")
	private java.lang.String descricao;
	@org.kie.api.definition.type.Label(value = "Idade Mínina")
	private java.lang.Integer idademin;
	@org.kie.api.definition.type.Label(value = "Idade Máxima")
	private java.lang.Integer idademax;

	public evento() {
	}

	public java.lang.Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(java.lang.Integer codigo) {
		this.codigo = codigo;
	}

	public java.lang.String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(java.lang.String descricao) {
		this.descricao = descricao;
	}

	public java.lang.Integer getIdademin() {
		return this.idademin;
	}

	public void setIdademin(java.lang.Integer idademin) {
		this.idademin = idademin;
	}

	public java.lang.Integer getIdademax() {
		return this.idademax;
	}

	public void setIdademax(java.lang.Integer idademax) {
		this.idademax = idademax;
	}

	public evento(java.lang.Integer codigo, java.lang.String descricao,
			java.lang.Integer idademin, java.lang.Integer idademax) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.idademin = idademin;
		this.idademax = idademax;
	}

}