package clase3.entidades;

import java.time.LocalDateTime;

import javax.persistence.*;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
@Table(name = "tbl_persona")
public class Persona {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;

	@Column(name = "numero_documento")
	String numeroDocumento;

	@Enumerated(EnumType.STRING)
	@Column(name = "tipo_documento")
	TipoDocumento tipoDocumento;

	String apellido;

	String nombre;
	
	@CreationTimestamp
	LocalDateTime fechaCreacion;
	
	@UpdateTimestamp
	LocalDateTime fechaActualizacion;
	
	
	String direccion;
	String calle;
	String numeroApartamento;
}