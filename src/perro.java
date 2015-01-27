import java.io.IOException;

abstract public class perro {
	abstract static void main (String args[]) throws IOException {
		
		
	}
	
	class alano extends perro implements dogo, lebrel {

	}
	
	interface lebrel {

	}
	interface dogo {

	}

}