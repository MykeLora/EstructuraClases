package Modelos;
from Modelos import Aplication

public class Aplication {

	public static void main(String[] args) {
		Estudiante maycol = new Estudiante(21,"Maycol lora","maycol@gmail.com",
				"Santo doming","Desarrollo de software","Excelente");
		maycol.mostrarInformacion();
		System.out.println("********************************************\n");
		Estudiante Angelo = new Estudiante(21,"Maycol lora","maycol@gmail.com",
				"Santo doming","Multimedia","Bueno");
		Angelo.mostrarInformacion();

	}

}
