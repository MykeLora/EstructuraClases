package Modelos;

public class Administrador extends Docente {

   
	public Administrador() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Administrador(int id, String nombre, String correoElectronico, String direccion, int sueldo,
			String departamento, String supervisor, String maestria, String experiencia, String conocimientos) {
		super(id, nombre, correoElectronico, direccion, sueldo, departamento, supervisor, maestria, experiencia, conocimientos);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mostrarInformacion() {
		// TODO Auto-generated method stub
		
	}

}
