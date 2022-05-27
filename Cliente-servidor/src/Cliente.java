import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Cliente {

	public static void main(String args[]) {

		// comunicacion entre cliente-servidor
		DataInputStream in;
		DataOutputStream out;

		// definimos el host desde donde nos vamos a conectar
		final String HOST = "127.0.0.1";
		// Creamos el puerto de escucha
		int PUERTO = 5000;

		try {
			Socket sc = new Socket(HOST, PUERTO);
			
			in = new DataInputStream(sc.getInputStream());			
			out = new DataOutputStream(sc.getOutputStream());
			
			//enviamos mensaje al servidor
			out.writeUTF("Mensaje desde el cliente al servidor");
			
			String mensaje = in.readUTF();
			
			System.out.println(mensaje);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
