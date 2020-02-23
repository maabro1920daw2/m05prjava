package MainPack;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.lang.reflect.Array;

import com.google.gson.*;

import Campeones.Campeon;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Appmain {
	
	public static void main(String[] args) {
		Gson gson = new Gson();
		try (Reader reader = new FileReader("C:\\Users\\marco\\eclipse-workspace\\M03UF5_PROYECTO\\assets\\json\\data.json")) {
					
			Campeon[] object = gson.fromJson(reader, Campeon[].class);			
			int n = 0;
			double vida = 0;
			double resultado = 0;
			String nombre ="";
			while(n < object.length) {
				
				vida += object[n].getStats().getArmor();
				
				//System.out.println("Nombre: "+object[n].getName()+" Vida: "+object[n].getStats().getHp());
				n++;
			}
			resultado = vida / object.length;
			System.out.println("Media vida: "+resultado);

        } catch (IOException e) {
            e.printStackTrace();
        }
	}
}
