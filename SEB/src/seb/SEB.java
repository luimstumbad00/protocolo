package seb;
// (SEB) Sistema de Encriptado Básico

import java.util.Scanner;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class SEB {

    public static void main(String[] args) {
        String mensaje = null;
        String encriptado;
        String digito1;
        String digito2;

        int tamaño = 0;
        Scanner SC = new Scanner(System.in);
        LocalDateTime reloj = LocalDateTime.now();
        int miliseg = reloj.getNano();
        int segundos = reloj.getSecond();
        int minutos = reloj.getMinute();
        char cifrado1 = 0;
        char cifrado2 = 0;
        char cifrado3;
        int pseudo1;
        int pseudo2;
        int pseudo3;
        int num3 = 1001;
        String codigoencriptado;
        String ncifrado1;
        String ncifrado2;
        String ncifrado3;
        String numero3;
        if (miliseg > 10) {
            digito1 = String.valueOf(miliseg);
            digito2 = String.valueOf(miliseg);
            cifrado1 = digito1.charAt(0);
            cifrado2 = digito2.charAt(1);
        } else if (miliseg == 0) {
            digito1 = String.valueOf(segundos);
            digito2 = String.valueOf(minutos);
            cifrado1 = digito1.charAt(0);
            cifrado2 = digito2.charAt(0);
        }
        

        pseudo1 = Integer.parseInt(String.valueOf(cifrado1));
        pseudo2 = Integer.parseInt(String.valueOf(cifrado2));
        if(pseudo1 == 0){
            digito1 = String.valueOf(1);
            cifrado1 = digito1.charAt(0);
            pseudo1 = Integer.parseInt(String.valueOf(cifrado1));
        }
        if(pseudo2 == 0){
            digito2 = String.valueOf(2);
            cifrado2 = digito2.charAt(0);
            pseudo2 = Integer.parseInt(String.valueOf(cifrado2));
        }
        num3 = num3 - pseudo1 - pseudo2;

        numero3 = Integer.toString(num3);
        cifrado3 = numero3.charAt(0);
        pseudo3 = Integer.parseInt(String.valueOf(cifrado3));

        ncifrado1 = Integer.toString(pseudo1);
        ncifrado2 = Integer.toString(pseudo2);
        ncifrado3 = Integer.toString(pseudo3);
        if (pseudo1 == 0) {
            pseudo1 = 1;
        }
        if (pseudo2 == 0) {
            pseudo2 = 1;
        }

        codigoencriptado = ncifrado1 + ncifrado2 + ncifrado3;

        while (tamaño == 0) {
            System.out.println("Ingrese el mensaje: ");
            mensaje = SC.nextLine();    //lee mensaje      
            tamaño = mensaje.length(); //detecta el tamaño del mensaje
            if (tamaño > 0) {
                //Si hay mensaje no se hace nada
            } else {
                System.out.println("No se detecto un mensaje.");
            }
        }

        //Abecedario
        encriptado = mensaje.replaceAll("[Aa]", "\\|");
        if (pseudo1 == 1) {

            encriptado = encriptado.replaceAll("[Bb]", "°");
            encriptado = encriptado.replaceAll("[Cc]", "!");
            encriptado = encriptado.replaceAll("[Dd]", "<");
            encriptado = encriptado.replaceAll("[Ee]", "#");
            encriptado = encriptado.replaceAll("[Ff]", "$");
            encriptado = encriptado.replaceAll("[Gg]", "%");
            encriptado = encriptado.replaceAll("[Hh]", ">");
            encriptado = encriptado.replaceAll("[Ii]", "\\(");
            encriptado = encriptado.replaceAll("[Jj]", "\\)");
            encriptado = encriptado.replaceAll("[Kk]", "=");
            encriptado = encriptado.replaceAll("[Ll]", "\\?");
            encriptado = encriptado.replaceAll("[Mm]", "'");
        }
        if (pseudo1 == 2) {

            encriptado = encriptado.replaceAll("[Bb]", "°");
            encriptado = encriptado.replaceAll("[Mm]", "!");
            encriptado = encriptado.replaceAll("[Cc]", "<");
            encriptado = encriptado.replaceAll("[Ll]", "#");
            encriptado = encriptado.replaceAll("[Kk]", "$");
            encriptado = encriptado.replaceAll("[Dd]", "%");
            encriptado = encriptado.replaceAll("[Jj]", ">");
            encriptado = encriptado.replaceAll("[Ii]", "\\(");
            encriptado = encriptado.replaceAll("[Ee]", "\\)");
            encriptado = encriptado.replaceAll("[Hh]", "=");
            encriptado = encriptado.replaceAll("[Ff]", "\\?");
            encriptado = encriptado.replaceAll("[Gg]", "'");
        }
        if (pseudo1 == 3) {

            encriptado = encriptado.replaceAll("[Mm]", "°");
            encriptado = encriptado.replaceAll("[Hh]", "!");
            encriptado = encriptado.replaceAll("[Gg]", "<");
            encriptado = encriptado.replaceAll("[Bb]", "#");
            encriptado = encriptado.replaceAll("[Ff]", "$");
            encriptado = encriptado.replaceAll("[Ii]", "%");
            encriptado = encriptado.replaceAll("[Cc]", ">");
            encriptado = encriptado.replaceAll("[Ee]", "\\(");
            encriptado = encriptado.replaceAll("[Jj]", "\\)");
            encriptado = encriptado.replaceAll("[Dd]", "=");
            encriptado = encriptado.replaceAll("[Kk]", "\\?");
            encriptado = encriptado.replaceAll("[Ll]", "'");
        }
        if (pseudo1 == 4) {

            encriptado = encriptado.replaceAll("[Mm]", "°");
            encriptado = encriptado.replaceAll("[Ll]", "!");
            encriptado = encriptado.replaceAll("[Kk]", "<");
            encriptado = encriptado.replaceAll("[Jj]", "#");
            encriptado = encriptado.replaceAll("[Ii]", "$");
            encriptado = encriptado.replaceAll("[Hh]", "%");
            encriptado = encriptado.replaceAll("[Gg]", ">");
            encriptado = encriptado.replaceAll("[Ff]", "\\(");
            encriptado = encriptado.replaceAll("[Ee]", "\\)");
            encriptado = encriptado.replaceAll("[Dd]", "=");
            encriptado = encriptado.replaceAll("[Cc]", "\\?");
            encriptado = encriptado.replaceAll("[Bb]", "'");
        }
        if (pseudo1 == 5) {

            encriptado = encriptado.replaceAll("[Bb]", "°");
            encriptado = encriptado.replaceAll("[Ee]", "!");
            encriptado = encriptado.replaceAll("[Ff]", "<");
            encriptado = encriptado.replaceAll("[Ii]", "#");
            encriptado = encriptado.replaceAll("[Jj]", "$");
            encriptado = encriptado.replaceAll("[Il]", "%");
            encriptado = encriptado.replaceAll("[Mm]", ">");
            encriptado = encriptado.replaceAll("[Kk]", "\\(");
            encriptado = encriptado.replaceAll("[Hh]", "\\)");
            encriptado = encriptado.replaceAll("[Gg]", "=");
            encriptado = encriptado.replaceAll("[Dd]", "\\?");
            encriptado = encriptado.replaceAll("[Cc]", "'");

        }
        if (pseudo1 == 6) {

            encriptado = encriptado.replaceAll("[Gg]", "°");
            encriptado = encriptado.replaceAll("[Ff]", "!");
            encriptado = encriptado.replaceAll("[Ee]", "<");
            encriptado = encriptado.replaceAll("[Dd]", "#");
            encriptado = encriptado.replaceAll("[Cc]", "$");
            encriptado = encriptado.replaceAll("[Bb]", "%");
            encriptado = encriptado.replaceAll("[Hh]", ">");
            encriptado = encriptado.replaceAll("[Ii]", "\\(");
            encriptado = encriptado.replaceAll("[Jj]", "\\)");
            encriptado = encriptado.replaceAll("[Kk]", "=");
            encriptado = encriptado.replaceAll("[Ll]", "\\?");
            encriptado = encriptado.replaceAll("[Mm]", "'");

        }
        if (pseudo1 == 7) {

            encriptado = encriptado.replaceAll("[Gg]", "°");
            encriptado = encriptado.replaceAll("[Ee]", "!");
            encriptado = encriptado.replaceAll("[Ff]", "<");
            encriptado = encriptado.replaceAll("[Hh]", "#");
            encriptado = encriptado.replaceAll("[Ii]", "$");
            encriptado = encriptado.replaceAll("[Dd]", "%");
            encriptado = encriptado.replaceAll("[Jj]", ">");
            encriptado = encriptado.replaceAll("[Kk]", "\\(");
            encriptado = encriptado.replaceAll("[Ll]", "\\)");
            encriptado = encriptado.replaceAll("[Cc]", "=");
            encriptado = encriptado.replaceAll("[Mm]", "\\?");
            encriptado = encriptado.replaceAll("[Bb]", "'");

        }
        if (pseudo1 == 8) {

            encriptado = encriptado.replaceAll("[Bb]", "°");
            encriptado = encriptado.replaceAll("[Ii]", "!");
            encriptado = encriptado.replaceAll("[Dd]", "<");
            encriptado = encriptado.replaceAll("[Cc]", "#");
            encriptado = encriptado.replaceAll("[Hh]", "$");
            encriptado = encriptado.replaceAll("[Ee]", "%");
            encriptado = encriptado.replaceAll("[Jj]", ">");
            encriptado = encriptado.replaceAll("[Gg]", "\\(");
            encriptado = encriptado.replaceAll("[Ff]", "\\)");
            encriptado = encriptado.replaceAll("[Mm]", "=");
            encriptado = encriptado.replaceAll("[Kk]", "\\?");
            encriptado = encriptado.replaceAll("[Ll]", "'");

        }
        if (pseudo1 == 9) {

            encriptado = encriptado.replaceAll("[Bb]", "°");
            encriptado = encriptado.replaceAll("[Cc]", "!");
            encriptado = encriptado.replaceAll("[Dd]", "<");
            encriptado = encriptado.replaceAll("[Ee]", "#");
            encriptado = encriptado.replaceAll("[Ff]", "$");
            encriptado = encriptado.replaceAll("[Gg]", "%");
            encriptado = encriptado.replaceAll("[Mm]", ">");
            encriptado = encriptado.replaceAll("[Ll]", "\\(");
            encriptado = encriptado.replaceAll("[Lk]", "\\)");
            encriptado = encriptado.replaceAll("[Jj]", "=");
            encriptado = encriptado.replaceAll("[Ii]", "\\?");
            encriptado = encriptado.replaceAll("[Hh]", "'");

        }
        if (pseudo2 == 1) {
            encriptado = encriptado.replaceAll("[Nn]", "¡");
            encriptado = encriptado.replaceAll("[Oo]", "¿");
            encriptado = encriptado.replaceAll("[Pp]", "¨");
            encriptado = encriptado.replaceAll("[Qq]", "´");
            encriptado = encriptado.replaceAll("[Rr]", "\\+");
            encriptado = encriptado.replaceAll("[Ss]", "\\*");
            encriptado = encriptado.replaceAll("[Tt]", "\\{");
            encriptado = encriptado.replaceAll("[Uu]", "\\}");
            encriptado = encriptado.replaceAll("[Vv]", "\\[");
            encriptado = encriptado.replaceAll("[Ww]", "\\]");
            encriptado = encriptado.replaceAll("[Xx]", "-");
            encriptado = encriptado.replaceAll("[Yy]", ":");
            encriptado = encriptado.replaceAll("[Zz]", ";");
        }
        if (pseudo2 == 2) {
            encriptado = encriptado.replaceAll("[Uu]", "¡");
            encriptado = encriptado.replaceAll("[Ss]", "¿");
            encriptado = encriptado.replaceAll("[Rr]", "¨");
            encriptado = encriptado.replaceAll("[Tt]", "´");
            encriptado = encriptado.replaceAll("[Vv]", "\\+");
            encriptado = encriptado.replaceAll("[Qq]", "\\*");
            encriptado = encriptado.replaceAll("[Ww]", "\\{");
            encriptado = encriptado.replaceAll("[Pp]", "\\}");
            encriptado = encriptado.replaceAll("[Yy]", "\\[");
            encriptado = encriptado.replaceAll("[Xx]", "\\]");
            encriptado = encriptado.replaceAll("[Oo]", "-");
            encriptado = encriptado.replaceAll("[Zz]", ":");
            encriptado = encriptado.replaceAll("[Nn]", ";");
        }
        if (pseudo2 == 3) {
            encriptado = encriptado.replaceAll("[Zz]", "¡");
            encriptado = encriptado.replaceAll("[Yy]", "¿");
            encriptado = encriptado.replaceAll("[Xx]", "¨");
            encriptado = encriptado.replaceAll("[Ww]", "´");
            encriptado = encriptado.replaceAll("[Vv]", "\\+");
            encriptado = encriptado.replaceAll("[Uu]", "\\*");
            encriptado = encriptado.replaceAll("[Tt]", "\\{");
            encriptado = encriptado.replaceAll("[Ss]", "\\}");
            encriptado = encriptado.replaceAll("[Rr]", "\\[");
            encriptado = encriptado.replaceAll("[Qq]", "\\]");
            encriptado = encriptado.replaceAll("[Pp]", "-");
            encriptado = encriptado.replaceAll("[Oo]", ":");
            encriptado = encriptado.replaceAll("[Nn]", ";");

        }
        if (pseudo2 == 4) {
            encriptado = encriptado.replaceAll("[Oo]", "¡");
            encriptado = encriptado.replaceAll("[Pp]", "¿");
            encriptado = encriptado.replaceAll("[Ss]", "¨");
            encriptado = encriptado.replaceAll("[Tt]", "´");
            encriptado = encriptado.replaceAll("[Ww]", "\\+");
            encriptado = encriptado.replaceAll("[Xx]", "\\*");
            encriptado = encriptado.replaceAll("[Zz]", "\\{");
            encriptado = encriptado.replaceAll("[Yy]", "\\}");
            encriptado = encriptado.replaceAll("[Vv]", "\\[");
            encriptado = encriptado.replaceAll("[Uu]", "\\]");
            encriptado = encriptado.replaceAll("[Rr]", "-");
            encriptado = encriptado.replaceAll("[Qq]", ":");
            encriptado = encriptado.replaceAll("[Nn]", ";");

        }
        if (pseudo2 == 5) {
            encriptado = encriptado.replaceAll("[Ss]", "¡");
            encriptado = encriptado.replaceAll("[Tt]", "¿");
            encriptado = encriptado.replaceAll("[Oo]", "¨");
            encriptado = encriptado.replaceAll("[Nn]", "´");
            encriptado = encriptado.replaceAll("[Rr]", "\\+");
            encriptado = encriptado.replaceAll("[Qq]", "\\*");
            encriptado = encriptado.replaceAll("[Pp]", "\\{");
            encriptado = encriptado.replaceAll("[Zz]", "\\}");
            encriptado = encriptado.replaceAll("[Yy]", "\\[");
            encriptado = encriptado.replaceAll("[Vv]", "\\]");
            encriptado = encriptado.replaceAll("[Uu]", "-");
            encriptado = encriptado.replaceAll("[Ww]", ":");
            encriptado = encriptado.replaceAll("[Xx]", ";");

        }
        if (pseudo2 == 6) {
            encriptado = encriptado.replaceAll("[Nn]", "¡");
            encriptado = encriptado.replaceAll("[Ss]", "¿");
            encriptado = encriptado.replaceAll("[Rr]", "¨");
            encriptado = encriptado.replaceAll("[Tt]", "´");
            encriptado = encriptado.replaceAll("[Ww]", "\\+");
            encriptado = encriptado.replaceAll("[Oo]", "\\*");
            encriptado = encriptado.replaceAll("[Qq]", "\\{");
            encriptado = encriptado.replaceAll("[Vv]", "\\}");
            encriptado = encriptado.replaceAll("[Uu]", "\\[");
            encriptado = encriptado.replaceAll("[Pp]", "\\]");
            encriptado = encriptado.replaceAll("[Yy]", "-");
            encriptado = encriptado.replaceAll("[Xx]", ":");
            encriptado = encriptado.replaceAll("[Zz]", ";");

        }
        if (pseudo2 == 7) {
            encriptado = encriptado.replaceAll("[Vv]", "¡");
            encriptado = encriptado.replaceAll("[Ww]", "¿");
            encriptado = encriptado.replaceAll("[Xx]", "¨");
            encriptado = encriptado.replaceAll("[Nn]", "´");
            encriptado = encriptado.replaceAll("[Zz]", "\\+");
            encriptado = encriptado.replaceAll("[Qq]", "\\*");
            encriptado = encriptado.replaceAll("[Pp]", "\\{");
            encriptado = encriptado.replaceAll("[Oo]", "\\}");
            encriptado = encriptado.replaceAll("[Yy]", "\\[");
            encriptado = encriptado.replaceAll("[Tt]", "\\]");
            encriptado = encriptado.replaceAll("[Uu]", "-");
            encriptado = encriptado.replaceAll("[Ss]", ":");
            encriptado = encriptado.replaceAll("[Rr]", ";");

        }
        if (pseudo2 == 8) {
            encriptado = encriptado.replaceAll("[Uu]", "¡");
            encriptado = encriptado.replaceAll("[Tt]", "¿");
            encriptado = encriptado.replaceAll("[Rr]", "¨");
            encriptado = encriptado.replaceAll("[Qq]", "´");
            encriptado = encriptado.replaceAll("[Ss]", "\\+");
            encriptado = encriptado.replaceAll("[Vv]", "\\*");
            encriptado = encriptado.replaceAll("[Pp]", "\\{");
            encriptado = encriptado.replaceAll("[Oo]", "\\}");
            encriptado = encriptado.replaceAll("[Nn]", "\\[");
            encriptado = encriptado.replaceAll("[Ww]", "\\]");
            encriptado = encriptado.replaceAll("[Zz]", "-");
            encriptado = encriptado.replaceAll("[Yy]", ":");
            encriptado = encriptado.replaceAll("[Xx]", ";");

        }
        if (pseudo2 == 9) {
            encriptado = encriptado.replaceAll("[Nn]", "¡");
            encriptado = encriptado.replaceAll("[Qq]", "¿");
            encriptado = encriptado.replaceAll("[Pp]", "¨");
            encriptado = encriptado.replaceAll("[Oo]", "´");
            encriptado = encriptado.replaceAll("[Uu]", "\\+");
            encriptado = encriptado.replaceAll("[Tt]", "\\*");
            encriptado = encriptado.replaceAll("[Ww]", "\\{");
            encriptado = encriptado.replaceAll("[Vv]", "\\}");
            encriptado = encriptado.replaceAll("[Ss]", "\\[");
            encriptado = encriptado.replaceAll("[Yy]", "\\]");
            encriptado = encriptado.replaceAll("[Zz]", "-");
            encriptado = encriptado.replaceAll("[Xx]", ":");
            encriptado = encriptado.replaceAll("[Rr]", ";");

        }
        if (pseudo3 == 1) {
            encriptado = encriptado.replaceAll("0", "A");
            encriptado = encriptado.replaceAll("1", "I");
            encriptado = encriptado.replaceAll("2", "H");
            encriptado = encriptado.replaceAll("3", "B");
            encriptado = encriptado.replaceAll("4", "G");
            encriptado = encriptado.replaceAll("5", "F");
            encriptado = encriptado.replaceAll("6", "C");
            encriptado = encriptado.replaceAll("7", "E");
            encriptado = encriptado.replaceAll("8", "D");
            encriptado = encriptado.replaceAll("9", "J");

        }
        if (pseudo3 == 2) {
            encriptado = encriptado.replaceAll("0", "A");
            encriptado = encriptado.replaceAll("1", "B");
            encriptado = encriptado.replaceAll("2", "C");
            encriptado = encriptado.replaceAll("3", "D");
            encriptado = encriptado.replaceAll("4", "E");
            encriptado = encriptado.replaceAll("5", "F");
            encriptado = encriptado.replaceAll("6", "G");
            encriptado = encriptado.replaceAll("7", "H");
            encriptado = encriptado.replaceAll("8", "I");
            encriptado = encriptado.replaceAll("9", "J");

        }
        if (pseudo3 == 3) {
            encriptado = encriptado.replaceAll("0", "J");
            encriptado = encriptado.replaceAll("1", "I");
            encriptado = encriptado.replaceAll("2", "H");
            encriptado = encriptado.replaceAll("3", "G");
            encriptado = encriptado.replaceAll("4", "F");
            encriptado = encriptado.replaceAll("5", "E");
            encriptado = encriptado.replaceAll("6", "D");
            encriptado = encriptado.replaceAll("7", "C");
            encriptado = encriptado.replaceAll("8", "B");
            encriptado = encriptado.replaceAll("9", "A");

        }
        if (pseudo3 == 4) {
            encriptado = encriptado.replaceAll("0", "A");
            encriptado = encriptado.replaceAll("1", "D");
            encriptado = encriptado.replaceAll("2", "E");
            encriptado = encriptado.replaceAll("3", "F");
            encriptado = encriptado.replaceAll("4", "I");
            encriptado = encriptado.replaceAll("5", "J");
            encriptado = encriptado.replaceAll("6", "H");
            encriptado = encriptado.replaceAll("7", "G");
            encriptado = encriptado.replaceAll("8", "C");
            encriptado = encriptado.replaceAll("9", "B");
        }
        if (pseudo3 == 5) {
            encriptado = encriptado.replaceAll("0", "E");
            encriptado = encriptado.replaceAll("1", "D");
            encriptado = encriptado.replaceAll("2", "F");
            encriptado = encriptado.replaceAll("3", "C");
            encriptado = encriptado.replaceAll("4", "I");
            encriptado = encriptado.replaceAll("5", "J");
            encriptado = encriptado.replaceAll("6", "B");
            encriptado = encriptado.replaceAll("7", "G");
            encriptado = encriptado.replaceAll("8", "H");
            encriptado = encriptado.replaceAll("9", "A");

        }
        if (pseudo3 == 6) {
            encriptado = encriptado.replaceAll("0", "I");
            encriptado = encriptado.replaceAll("1", "G");
            encriptado = encriptado.replaceAll("2", "E");
            encriptado = encriptado.replaceAll("3", "C");
            encriptado = encriptado.replaceAll("4", "A");
            encriptado = encriptado.replaceAll("5", "B");
            encriptado = encriptado.replaceAll("6", "D");
            encriptado = encriptado.replaceAll("7", "F");
            encriptado = encriptado.replaceAll("8", "H");
            encriptado = encriptado.replaceAll("9", "J");

        }
        if (pseudo3 == 7) {
            encriptado = encriptado.replaceAll("0", "I");
            encriptado = encriptado.replaceAll("1", "J");
            encriptado = encriptado.replaceAll("2", "E");
            encriptado = encriptado.replaceAll("3", "A");
            encriptado = encriptado.replaceAll("4", "F");
            encriptado = encriptado.replaceAll("5", "G");
            encriptado = encriptado.replaceAll("6", "D");
            encriptado = encriptado.replaceAll("7", "B");
            encriptado = encriptado.replaceAll("8", "H");
            encriptado = encriptado.replaceAll("9", "C");

        }
        if (pseudo3 == 8) {
            encriptado = encriptado.replaceAll("0", "G");
            encriptado = encriptado.replaceAll("1", "E");
            encriptado = encriptado.replaceAll("2", "D");
            encriptado = encriptado.replaceAll("3", "C");
            encriptado = encriptado.replaceAll("4", "F");
            encriptado = encriptado.replaceAll("5", "H");
            encriptado = encriptado.replaceAll("6", "B");
            encriptado = encriptado.replaceAll("7", "J");
            encriptado = encriptado.replaceAll("8", "I");
            encriptado = encriptado.replaceAll("9", "A");

        }
        if (pseudo3 == 9) {
            encriptado = encriptado.replaceAll("0", "I");
            encriptado = encriptado.replaceAll("1", "D");
            encriptado = encriptado.replaceAll("2", "C");
            encriptado = encriptado.replaceAll("3", "A");
            encriptado = encriptado.replaceAll("4", "B");
            encriptado = encriptado.replaceAll("5", "F");
            encriptado = encriptado.replaceAll("6", "E");
            encriptado = encriptado.replaceAll("7", "H");
            encriptado = encriptado.replaceAll("8", "J");
            encriptado = encriptado.replaceAll("9", "G");

        }

        System.out.println(encriptado);

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("mensaje_encriptado.txt"));
            writer.write(encriptado);
            writer.close();
            System.out.println("Mensaje encriptado guardado en mensaje_encriptado.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("pseudo.txt"));
            writer.write(codigoencriptado);
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
