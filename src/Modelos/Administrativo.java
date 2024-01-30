package Modelos;

public class Administrativo extends Empleado{

	public String reporteMensual;
	public int totalnominas ;
	
	
	public Administrativo() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Administrativo(int id, String nombre, String correoElectronico, String direccion,
			int sueldo,String departamento, String supervisor,String reporteMensual,int totalnominas) {
		
		super(id, nombre, correoElectronico, direccion, sueldo, departamento, supervisor);
		this.reporteMensual = reporteMensual;
		this.totalnominas = totalnominas;
	}
	
	public String getReporteMensual() {
		return reporteMensual;
	}
	
	public void setReporteMensual(String reporteMensual) {
		this.reporteMensual = reporteMensual;
	}
	
	public int getTotalnominas() {
		return totalnominas;
	}
	
	public void setTotalnominas(int totalnominas) {
		this.totalnominas = totalnominas;
	}

	

}
