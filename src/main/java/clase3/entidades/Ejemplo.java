package clase3.entidades;


public class Ejemplo {

	public static void main(String[] args) {
		Persona persona = new Persona();
		persona.numeroDocumento = "73646447";
		persona.tipoDocumento = TipoDocumento.DNI;
		persona.nombre = "Arthur";
		persona.apellido = "Mauricio";
		
		PersonaDao personaDao = new PersonaDao();
		personaDao.save(persona);
		
		System.out.println("Se guardo en la BD");
	}
}
