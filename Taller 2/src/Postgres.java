
//Sub Clase de BDatos que hereda de BDatos e implementa la interface Operaciones
public class Postgres  extends BDatos implements Operaciones {
	
	//Con override indicamos que vamos a sobre-escribir los metodos abstractos
	//Instanciaremos lo que cada uno hace en cada clase por separado
    @Override
    public String Crear() {
        return "Estoy creando...";
    }

    @Override
    public String Consultar() {
    	return "Estoy Consultando...";
    }

    @Override
    public String Eliminar() {
    	return "Estoy Eliminando...";
    }

    @Override
    public String Actualizar() {
    	return "Estoy Actualizando...";
    }
    
    //Sobre-escribimos el metodo abstracto que recibe un parametro tipo String.

    @Override
    public String SaludoHijo(String nombre) {
        return "Saludos desde Subclase: "+ nombre;
    }
}
