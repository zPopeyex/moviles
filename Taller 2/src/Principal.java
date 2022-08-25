public class Principal {

    public static void main(String[] args) {
      
    	
    	
    	//Pruebas que realizamos para ver el funcionamiento
    	//Objeto mi_PostGres de tipo Postgres
        Postgres mi_PostGres = new Postgres();
        System.out.println(mi_PostGres.Crear());
        System.out.println(mi_PostGres.Consultar());
        System.out.println(mi_PostGres.Eliminar());
        System.out.println(mi_PostGres.Actualizar());
        System.out.println(mi_PostGres.SaludoPadre());
        System.out.println(mi_PostGres.SaludoHijo("Postgres"));
       
        
        //Objeto mi_Oracle de tipo Oracle
//        Oracle mi_Oracle = new Oracle();
//        System.out.println(mi_Oracle.SaludoPadre());
//        System.out.println(mi_Oracle.SaludoHijo("Oracle"));
//        System.out.println(mi_Oracle.getSemiNombre());
    }
}