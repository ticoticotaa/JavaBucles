import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class repeticion {
	//Codigo Jose Ojeda - Bucles
	public static void main(String[] args) throws IOException {
		int repeticion;
		int contador;
		System.out.println("Cuantas repeticiones haremos?");
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		repeticion=Integer.parseInt(br.readLine());
		//bucle o repeticion con For
		for(contador=1;contador<=repeticion;contador++){
			System.out.println("Repeticion con For numero = "+contador);
		}
		//repeticion con While
		contador=1;
		while(contador<=repeticion){
			System.out.println("Repeticion con While numero = "+contador);
			contador++;
		}
		//repeticion con While
		contador=1;
		do{
			System.out.println("Repeticion con Do While numero = "+contador);
			contador++;
		}while(contador<=repeticion);
	}

}
