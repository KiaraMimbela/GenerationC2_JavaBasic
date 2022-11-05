package cl.generation.f20221102;

import java.util.ArrayList;

public class MainColegio {

	public static void main(String[] args) {
		
		Profesor profe = new Profesor();
		profe.setNombre("Juan");
		profe.setApellido("Perez");
		profe.setEdad(55);
		profe.setAniosExperiencia(23);
		profe.setCurso("3A");
		profe.setColegio("Garcia de la Vega");
		
		Profesor profe1 = new Profesor();
		profe1.setNombre("Carlos");
		profe1.setApellido("Martinez");
		profe1.setEdad(40);
		profe1.setAniosExperiencia(12);
		profe1.setCurso("3B");
		profe1.setColegio("Garcia de la Vega");
		
		Profesor profe2 = new Profesor();
		profe2.setNombre("Maria");
		profe2.setApellido("Garcia");
		profe2.setEdad(25);
		profe2.setAniosExperiencia(4);
		profe2.setCurso("1B");
		profe2.setColegio("Garcia de la Vega");
		
		ArrayList<Profesor> profesores = new ArrayList<Profesor>();
		profesores.add(profe);
		profesores.add(profe1);
		profesores.add(profe2);
		
		for (Profesor profesor : profesores) {
			System.out.println(profesor.toString());
		}
		
		Administrativo adm = new Administrativo();
		adm.setNombre("Pancho");
		adm.setApellido("Ubilla");
		adm.setEdad(30);
		adm.setTitulo("Administracion de Colegios");
		adm.setCargo("UTP");	
		
		Administrativo adm1 = new Administrativo();
		adm1.setNombre("Juan");
		adm1.setApellido("Gamboa");
		adm1.setEdad(40);
		adm1.setTitulo("Administracion de Colegios");
		adm1.setCargo("UTP");
		
		Administrativo adm2 = new Administrativo();
		adm2.setNombre("Maria");
		adm2.setApellido("Porch");
		adm2.setEdad(38);
		adm2.setTitulo("Administracion de Colegios");
		adm2.setCargo("UTP");
		
		ArrayList<Administrativo> admis = new ArrayList<Administrativo>();
		admis.add(adm);
		admis.add(adm1);
		admis.add(adm2);
		
		for (Administrativo adminis : admis) {
			System.out.println(adminis.toString());
		}
		
		Estudiantes alumno = new Estudiantes();
		alumno.setNombre("Mario");
		alumno.setApellido("Cantinas");
		alumno.setEdad(14);
		alumno.setCurso("5B");
		alumno.setPromedio(5.6f);	
		
		Estudiantes alumno1 = new Estudiantes();
		alumno1.setNombre("Camilo");
		alumno1.setApellido("Castro");
		alumno1.setEdad(18);
		alumno1.setCurso("7A");
		alumno1.setPromedio(7f);
		
		Estudiantes alumno2 = new Estudiantes();
		alumno2.setNombre("Andrea");
		alumno2.setApellido("Miranda");
		alumno2.setEdad(12);
		alumno2.setCurso("3A");
		alumno2.setPromedio(4.7f);
		
		ArrayList<Estudiantes> alumnos = new ArrayList<Estudiantes>();
		alumnos.add(alumno);
		alumnos.add(alumno1);
		alumnos.add(alumno2);
		
		for(Estudiantes estudiante : alumnos) {
			System.out.println(estudiante);
		}

	}

}
