package furtado.erlan.dominio;

import java.time.Instant;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "TB_MATRICULA")
public class Matricula {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="matri_seq")
	@SequenceGenerator(name="matri_seq", sequenceName="sq_matricula", initialValue = 1, allocationSize =1)
	private Long id;
	
	@Column(name = "CODIGO", length = 10, nullable = false, unique = true)
	private String codigo;
	
	@Column(name = "CODIGO", length = 50, nullable = false)
	private String nome;
	
	@Column(name = "DATA_MATRICULA", nullable = false)
	private Instant dataMatriculua;
	
	@Column(name = "valor", nullable = false)
	private Double valor;
	
	@Column(name = "status", nullable = false)
	private String status;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Instant getDataMatriculua() {
		return dataMatriculua;
	}

	public void setDataMatriculua(Instant dataMatriculua) {
		this.dataMatriculua = dataMatriculua;
	}

	public Double getValor() {
		return valor;
	}

	public void setValor(Double valor) {
		this.valor = valor;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	
}
