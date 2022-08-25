//Subclase Oracle que hereda BDatos e implementa la interface Operaciones
public class Oracle extends BDatos implements Operaciones {
    
	//Seminombre de tipo String 
	private String SemiNombre;

    public Oracle() {
        SemiNombre = "Por defecto";
    }

    public Oracle(String semiNombre) {
        SemiNombre = semiNombre;
    }

    public String getSemiNombre() {
        return SemiNombre;
    }

    public void setSemiNombre(String semiNombre) {
        SemiNombre = semiNombre;
    }

    @Override
    public String Crear() {
        return "Estoy creando...";
    }

    @Override
    public String Consultar() {
    	return "Estoy Consultando";
    }

    @Override
    public String Eliminar() {
    	return "Estoy Eliminando";
    }

    @Override
    public String Actualizar() {
    	return "Estoy Actualizando";
    }

    @Override
    public String SaludoHijo(String nombre) {
        return "Saludos desde: " + nombre + " - " + SemiNombre;
    }
}
