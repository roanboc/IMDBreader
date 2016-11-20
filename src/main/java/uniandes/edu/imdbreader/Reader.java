/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uniandes.edu.imdbreader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rodrigo B
 */
public class Reader {

    public static final String RUTA = "C:\\Users\\Rodrigo B\\Downloads\\biographies.list\\biographies.list";

    /**
     * @param args the command line arguments
     * @throws java.io.UnsupportedEncodingException
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws UnsupportedEncodingException, FileNotFoundException, IOException {

        Map<Integer, Personaje> map = new HashMap<>();
        int contadorPersonajes = 0;
        Personaje personajeActual = null;

        File fileDir = new File(RUTA);

        BufferedReader in = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream(fileDir), "ISO-8859-1"));

        String str;

        while ((str = in.readLine()) != null) {

            if (str.matches("---.*")) {
                if (personajeActual != null && personajeActual.getBirthDate() != null) {
                    map.put(contadorPersonajes, personajeActual);
                }
                contadorPersonajes++;
                personajeActual = new Personaje(contadorPersonajes);
            }

            if (str.matches("(RN.*)")) {
                personajeActual.setRealName(str);
            }
            if (str.matches("(NM.*)")) {
                personajeActual.setNickname(str);
            }
            if (str.matches("(DB.*)")) {
                personajeActual.setBirthDate(str.split(",")[0]);
            }
            if (str.matches("(DD.*)")) {
                personajeActual.setDeathDate(str.split(",")[0]);
            }
        }

        in.close();

        for (Map.Entry<Integer, Personaje> entry : map.entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

}
