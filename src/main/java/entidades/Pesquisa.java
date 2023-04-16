package entidades;

public class Pesquisa {
	
	private int id;
	private String nome;
	private String email;
	private String sexo;
	private String check1;
	private String check2;
	private String check3;
	private String estadoCivil;
	
	public Pesquisa() {}
	
	public Pesquisa(int id, String nome, String email, String sexo, String check1, String check2, String check3,
			String estadoCivil) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.sexo = sexo;
		this.check1 = check1;
		this.check2 = check2;
		this.check3 = check3;
		this.estadoCivil = estadoCivil;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCheck1() {
		return check1;
	}

	public void setCheck1(String check1) {
		this.check1 = check1;
	}

	public String getCheck2() {
		return check2;
	}

	public void setCheck2(String check2) {
		this.check2 = check2;
	}

	public String getCheck3() {
		return check3;
	}

	public void setCheck3(String check3) {
		this.check3 = check3;
	}

	public String getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Pesquisa [id=" + id + ", nome=" + nome + ", email=" + email + ", sexo=" + sexo + ", check1=" + check1
				+ ", check2=" + check2 + ", check3=" + check3 + ", estadoCivil=" + estadoCivil + "]";
	}
	
	
	
}
