package TPE3;

import java.util.ArrayList;
import java.util.Iterator;


import javax.swing.JOptionPane;

public class Main {

	public static void MostrarLista(ArrayList<Nodo> listado){
		Iterator <Nodo> i = listado.iterator();		
		System.out.println("Lista:");
		while(i.hasNext()){
			System.out.println(i.next().toString());
		}
		System.out.println("");

	}

	public static void main(String[] args){
		// TODO Auto-generated method stub
		// /Users/fernandostoessel/Downloads/datasets/
		String path= JOptionPane.showInputDialog("Por favor ingrese la ruta de la carpeta, para leer y escribir");
		if(path!=null){
			Archivo miArchivo = new Archivo(path);
			GrafoGustos g = new GrafoGustos();
			
			System.out.println("Inicio de Carga del Grafo: ------------------------------------------");
			miArchivo.cargar(g, "dataset_500000.csv");
			System.out.println("Fin Carga del Grafo: ------------------------------------------");
	
			System.out.println("Inicio buscar personas con mismos gustos: ------------------------------------------");
			MostrarLista(g.personasGustoComun(g.usuarioAlAzar()));
			System.out.println("Fin buscar personas con mismos gustos: ------------------------------------------");
			
			System.out.println("Inicio buscar gusto mas gustado: ------------------------------------------");
			System.out.println(g.gustoMasGustado().toString());
			System.out.println("Fin buscar gusto mas gustado: ------------------------------------------");
			
			System.out.println("Inicio busqueda del usuario mas lejano: ------------------------------------------");
			System.out.println(g.usuarioMasLejano(g.usuarioAlAzar()).toString());
			System.out.println("Fin busqueda del usuario mas lejano: ------------------------------------------");
		}
	}

}
