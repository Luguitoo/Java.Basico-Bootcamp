package com.lugo;

import org.w3c.dom.Document;
import org.w3c.dom.NamedNodeMap;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ParseXML {
    public static void main(String[] args) {
        File file = new File("datos.xml");
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance(); //crea un patron
        try{
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            try {
                //analizamos el fichero
                Document document = documentBuilder.parse(file);

                //obtenemos usuario y calve
                String usuario = document.getElementsByTagName("usuario").item(0).getTextContent(); //usamos item 0 pq podria ser un array
                String clave = document.getElementsByTagName("clave").item(0).getTextContent();

                //imprimimos
                System.out.println("Usuario: " + usuario + " Clave: " + clave);

                //Atributo proveedor
                NamedNodeMap atributos = document.getElementsByTagName("videos").item(0).getAttributes(); //devuelve un array de atributos

                for (int i = 0; i < atributos.getLength(); i++){
                    String atributoNombre = atributos.item(i).getNodeName(); //nombre del atributo
                    String atributoValor = atributos.item(i).getNodeValue(); //atrbutos que contienen

                    System.out.println("Atributo: " + atributoNombre + " contiene:" + atributoValor);
                }
                //obtenemos los valores asociados a la etiquetaa
                NodeList array = document.getElementsByTagName("videos");

                for (int i = 0; i < array.getLength(); i++){
                    System.out.println(array.item(i).getTextContent());
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            } catch (SAXException e) {
                throw new RuntimeException(e);
            }
        } catch (ParserConfigurationException e) {
            throw new RuntimeException(e);
        }

    }
}
