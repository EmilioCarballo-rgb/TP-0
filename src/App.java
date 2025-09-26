public class App {
  public static void main(String[] args) {

    Estudiante estudianteUno;
    Estudiante estudianteDos;
    Estudiante estudianteTres;
    Estudiante estudianteCuatro;
    Estudiante estudianteCinco;
    Estudiante estudianteSeis;

    Estudiante[] listaEstudiantes;

    estudianteUno = new Estudiante();
    estudianteDos = new Estudiante();
    estudianteTres = new Estudiante();
    estudianteCuatro = new Estudiante();
    estudianteCinco = new Estudiante();
    estudianteSeis = new Estudiante();

    estudianteCuatro.setNombre("Tomas");
    estudianteCuatro.setApellido("Baigorria");
    estudianteCuatro.setEdad(24);
    estudianteCuatro.setCarrera("Programación");
    estudianteCuatro.setPromedio(8.5F);

    estudianteCinco.setNombre("Bruno");
    estudianteCinco.setApellido("Alva");
    estudianteCinco.setEdad(18);
    estudianteCinco.setCarrera("Programación");
    estudianteCinco.setPromedio(7.5F);

    estudianteSeis.setNombre("Ezequiel");
    estudianteSeis.setApellido("Acosta");
    estudianteSeis.setEdad(24);
    estudianteSeis.setCarrera("Programación");;
    estudianteSeis.setPromedio(8);

    estudianteUno = new Estudiante("Franco", "Sibona", 24, "Programación", 9.98F);
    estudianteDos = new Estudiante("Emilio","Carballo", 24, "Programación", 10);
    estudianteTres = new Estudiante("Pablo", "Sanabria", 30, "Ingenieria en sistemas", 9.70F);


    listaEstudiantes= new Estudiante[6];

    listaEstudiantes[0] = estudianteUno;
    listaEstudiantes[1] = estudianteDos;
    listaEstudiantes[2] = estudianteTres;
    listaEstudiantes[3] = estudianteCuatro;
    listaEstudiantes[4] = estudianteCinco;
    listaEstudiantes[5] = estudianteSeis;

    for(int i= 0; i<6 ; i++){
        System.out.println("Nombre: " + listaEstudiantes[i].getNombre() + " Promedio: " + listaEstudiantes[i].getPromedio());
    } 

  }
}
