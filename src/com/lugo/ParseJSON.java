package com.lugo;
import org.json.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ParseJSON {
    public static void main(String[] args) {
        try {
            //Creamos el input steaam desde un fichero
            FileInputStream is = new FileInputStream("datos.json");

            //Creamos un token que leera desde nuestro IS
            JSONTokener tokener = new JSONTokener(is);

            //Creamos un objeto y le pasamos como instancia el token
            JSONObject obj = new JSONObject(tokener);

            //sacamos las credenciales
            JSONObject credenciales = obj.getJSONObject("credenciales");

            String usuario = credenciales.getString("usuario");
            String clave = credenciales.getString("clave");

            System.out.println("Usuario: " + usuario + " clave: " + clave);

            //sacamos los videos
            JSONArray videos = credenciales.getJSONArray("videos");
            for (Object video : videos){
                System.out.println(video.toString());
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
