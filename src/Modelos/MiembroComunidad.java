package Modelos;

public abstract class MiembroComunidad {
	
	private int id;
    private String nombre;
	private String correoElectronico;
	private String direccion;
	
	public MiembroComunidad() {
	
	}

	public MiembroComunidad(int id, String nombre, String correoElectronico, String direccion) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.correoElectronico = correoElectronico;
		this.direccion = direccion;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCorreoElectronico() {
		return correoElectronico;
	}

	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	public abstract void mostrarInformacion();
}