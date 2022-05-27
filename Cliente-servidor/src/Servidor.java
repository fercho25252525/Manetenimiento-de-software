import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class Servidor {

	public static void main(String args[]) {

		// Inicializamos el socket
		ServerSocket servidor = null;
		Socket sc = null;
		
		//comunicacion entre cliente-servidor
		DataInputStream in;
		DataOutputStream out;

		// Creamos el puerto de escucha
		int PUERTO = 5000;

		try {
			//iniciamos el socket econ el puerto establecido
			servidor = new ServerSocket(PUERTO);
			System.out.println("Se ha iniciado el servidor");
			
			//recorremos la peticion que se ha realizado
			while(true) {
				// aceptamos las conexiones que se realice del lado del cliente
				sc = servidor.accept();
				
				System.out.println("Se ha conectado el cliente.");
				//leemos las peticiones del cliente
				in = new DataInputStream(sc.getInputStream());
				
				out = new DataOutputStream(sc.getOutputStream());
				
				//Quedamos a la espera de la peticion del cliente
				String mensaje = in.readUTF();
				
				System.out.println(mensaje);
				
				out.writeUTF("Mensaje desde el servidor al cliente.");
				
				//Cerramos el cliente
				sc.close();
				System.out.println("Se ha desconectado el cliente.");
				
				//desconectamos el cliente
				sc.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
