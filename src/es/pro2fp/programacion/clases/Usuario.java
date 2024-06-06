package es.pro2fp.programacion.clases;

public class Usuario {
/**
 * Esta es la clase Usuario, clase que tiene unos atributos definidos y un unico constructor
 *
 * Como atributos la clase tiene:
 *
 * "id_usuario", que es un identificador único para cada direccion de cada usuario.
 * "nombre" que es el nombre del usuario.
 * "apellido1" y "apellido2" que son los apellidos de los usuarios.
 * "telefono" que es el número de contacto principal del usuario.
 * "correoElectronico" que es la dirección con la que se relaciona la cuenta del usuario.
 * "dni" que es el número nacional de identificación.
 * "direccion" que es un objeto de tipo Direccion que almacena datos de la residencia del usuario.
 * "administrador" que es un booleano que determina si el usuario es Cliente (False) o Administrador (True).
 * "password" que es la contraseña de acceso de la cuenta del usuario.
 */
	private int id_usuario;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String telefono;
	private String correoElectronico;
	private String dni;
	private Direccion direccion;
	private String password;
	private boolean administrador;
	
	public Usuario(String nombre, String apellido1, String apellido2, String telefono, String correoElectronico,
				   String dni, Direccion direccion, boolean administrador, int id_usuario, String password) {
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.telefono = telefono;
		this.correoElectronico = correoElectronico;
		this.dni = dni;
		this.direccion = direccion;
		this.administrador = administrador;
		this.id_usuario = id_usuario;
		this.password = password;
	}

	/**
	 *
	 * @return the getApellido2
	 */
	public String getApellido2() {
		return apellido2;
	}

	/**
	 *
	 * @param apellido2
	 */
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	/**
	 *
	 * @return the getTelefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 *
	 * @param telefono
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 *
	 * @return the getCorreoElectronico
	 */
	public String getCorreoElectronico() {
		return correoElectronico;
	}

	/**
	 *
	 * @param correoElectronico
	 */
	public void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = correoElectronico;
	}

	/**
	 *
	 * @return the isAdministrador
	 */
	public boolean isAdministrador() {
		return administrador;
	}

	/**
	 *
	 * @param administrador
	 */
	public void setAdministrador(boolean administrador) {
		this.administrador = administrador;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the apellidos
	 */
	public String getApellido1() {
		return apellido1;
	}
	/**
	 * @param apellido1 the apellidos to set
	 */
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}
	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	/**
	 * @return the direccion
	 */
	public Direccion getDireccion() {
		return direccion;
	}
	/**
	 * @param direccion the direccion to set
	 */

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	@Override
	public String toString() {
		if (this.isAdministrador()) {
			return "\n---------------------" +
					"\nNombre: " + this.getNombre() +
					"\nApellido 1: " + this.getApellido1() +
					"\nApellido 2: " + this.getApellido2() +
					"\nTelefono: " + this.getTelefono() +
					"\nCorreo Electronico: " + this.getCorreoElectronico() +
					"\nDni: " + this.getDni() +
					"\nAdministrador" +
					"\n--------------------" +
					"\nDireccion del integrante del equipo: " + direccion.toString();
		} else {
			return "\n---------------------" +
					"\nNombre: " + this.getNombre() +
					"\nApellido 1: " + this.getApellido1() +
					"\nApellido 2: " + this.getApellido2() +
					"\nTelefono: " + this.getTelefono() +
					"\nCorreo Electronico: " + this.getCorreoElectronico() +
					"\nDni: " + this.getDni() +
					"\nUsuario" +
					"\n--------------------" +
					"\nDireccion del Usuario: " + direccion.toString();
		}
	}
}
