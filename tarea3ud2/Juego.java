package tarea3ud2;

public class Juego {

	public static void main(String[] args) {
		//Creamos el Almacen
		AlmacenComida alamacen=new AlmacenComida();
		Thread aComida=new Thread(alamacen);
		aComida.start();
		//Creamos nuesstra primera ciudad
		Ciudad c1=new Ciudad("Madrid", alamacen);
		Ciudad c2=new Ciudad("Barcelona", alamacen);
		c1.start(); //Se arranca la ciudad c1
		c2.start(); //Se arranca la ciudad c2
	}

}
