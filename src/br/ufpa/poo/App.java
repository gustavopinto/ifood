package br.ufpa.poo;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class App {
	
	static String dataHora = new SimpleDateFormat("dd-MM-yyyy_HH:mm:ss").format(Calendar.getInstance().getTime());

	public static void main(String[] args) {

	System.out.println(dataHora);


	}

	
}
