//Clase Abstracta

public abstract class BDatos {
    //Funcion publica que retorna un saludo indicando ser la clase padre
	//La cual luego sera heredada por las 2 bases de datos
	public String SaludoPadre() {
        return "Saludos desde papá BDatos";
    }
	//Metodo abstracto que recibe un parametro de tipo String
    public abstract String SaludoHijo(String nombre);
}
