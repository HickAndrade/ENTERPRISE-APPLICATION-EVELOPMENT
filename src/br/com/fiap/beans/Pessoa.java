package br.com.fiap.beans;

import java.util.Calendar;

public class Pessoa {
	
	//Constante no Java
	// O java não permite alterar o valor
	// quando coloca static o objeto vira da classe
	public static final char ESPECIE_HUMANA = 'H';

	private String name;
	private Calendar dataNascimento;
	private Genero sexo;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public Genero getSexo() {
		return sexo;
	}
	public void setSexo(Genero sexo) {
		this.sexo = sexo;
	}
	public Calendar getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
