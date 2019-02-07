package br.com.fiap.teste;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import br.com.fiap.beans.Genero;
import br.com.fiap.beans.Pessoa;

public class Teste {
	public static void main(String[] args) {
		Pessoa pes = new Pessoa();
		
		
		pes.getName();
		pes.setSexo(Genero.OUTROS);
		
		Calendar data = Calendar.getInstance(); // DATA ATUAL
		Calendar data2 = new GregorianCalendar(2000, Calendar.JANUARY, 20); 
		
		pes.setDataNascimento(data);
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println(sdf.format(data.getTime()));
		System.out.println(sdf.format(data2.getTime()));	

	}
}
