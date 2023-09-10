package sdb;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SDB {

    public static void main(String[] args) {
        try {

            BufferedReader reader = new BufferedReader(new FileReader("mensaje_encriptado.txt"));
            String mensajeEncriptado = reader.readLine();
            reader.close();

            BufferedReader codigo = new BufferedReader(new FileReader("pseudo.txt"));
            String codiencri = codigo.readLine();
            codigo.close();

            char num1;
            char num2;
            char num3;
            int pseudo1;
            int pseudo2;
            int pseudo3;
            num1 = codiencri.charAt(0);
            pseudo1 = Character.getNumericValue(num1);
            num2 = codiencri.charAt(1);
            pseudo2 = Character.getNumericValue(num2);
            num3 = codiencri.charAt(2);
            pseudo3 = Character.getNumericValue(num3);

            String mensajeDesencriptado = mensajeEncriptado.replaceAll("!", "a");
            if (pseudo1 == 1) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "l");

            }
            if (pseudo1 == 2) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "k");

            }
            if (pseudo1 == 3) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "m");

            }
            if (pseudo1 == 4) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "¡","b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "=","c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "!","d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "#","e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%","f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "\\$","g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "'","h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "&","i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "/","j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "\\)","k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "\\(","l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll( "\\?","m");
            }
            if (pseudo1 == 5) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "b");

            }
            if (pseudo1 == 6) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "b");

            }
            if (pseudo1 == 7) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "b");

            }
            if (pseudo1 == 8) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%", "b");

            }
            if (pseudo1 == 9) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("&", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("/", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\$", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\%", "b");

            }
            if (pseudo2 == 1) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\<", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "n");

            }
            if (pseudo2 == 2) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\<", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "n");

            }
            if (pseudo2 == 3) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "z");

            }
            if (pseudo2 == 4) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "z");

            }
            if (pseudo2 == 5) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "n");

            }
            if (pseudo2 == 6) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "n");

            }
            if (pseudo2 == 7) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "n");

            }
            if (pseudo2 == 8) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\>", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "n");

            }
            if (pseudo2 == 9) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("]", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("}", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\|", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "z");

            }
            if (pseudo3 == 1) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }
            if (pseudo3 == 2) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }
            if (pseudo3 == 3) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "9");

            }
            if (pseudo3 == 4) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "9");

            }
            if (pseudo3 == 5) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "9");

            }
            if (pseudo3 == 6) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "9");

            }
            if (pseudo3 == 7) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "9");

            }
            if (pseudo3 == 8) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "9");

            }
            if (pseudo3 == 9) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("S", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }

            System.out.println("Mensaje desencriptado: " + mensajeDesencriptado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
