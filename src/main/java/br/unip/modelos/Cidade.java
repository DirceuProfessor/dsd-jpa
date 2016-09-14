package br.unip.modelos;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Cidade {
	@Id
	private Long id;
	private String name;

	public Cidade() {
	}

	public Cidade(Long id, String nome) {
		this.id = id;
		this.name = nome;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (!(o instanceof Cidade)) return false;

		Cidade cidade = (Cidade) o;

		if (id != null ? !id.equals(cidade.id) : cidade.id != null) return false;
		if (name != null ? !name.equals(cidade.name) : cidade.name != null) return false;

		return true;
	}

	@Override
	public int hashCode() {
		int result = id != null ? id.hashCode() : 0;
		result = 31 * result + (name != null ? name.hashCode() : 0);
		return result;
	}
}