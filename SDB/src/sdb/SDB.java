package sdb;
// SDB (Sistema de Desencriptado Basico
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
            
            

            String mensajeDesencriptado = mensajeEncriptado.replaceAll("\\|", "a");
            if (pseudo1 == 1) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "l");

            }
            if (pseudo1 == 2) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "g");

            }
            if (pseudo1 == 3) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "l");

            }
            if (pseudo1 == 4) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "b");
            }
            if (pseudo1 == 5) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "c");

            }
            if (pseudo1 == 6) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "m");

            }
            if (pseudo1 == 7) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "b");

            }
            if (pseudo1 == 8) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "h");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "l");

            }
            if (pseudo1 == 9) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("°", "b");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("!", "c");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("<", "d");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("#", "e");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("$", "f");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("%", "g");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(">", "m");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\(", "l");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\)", "k");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("=", "j");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\?", "i");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("'", "h");

            }
            if (pseudo2 == 1) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "z");

            }
            if (pseudo2 == 2) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "n");

            }
            if (pseudo2 == 3) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "n");
            }
            if (pseudo2 == 4) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "n");

            }
            if (pseudo2 == 5) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "x");

            }
            if (pseudo2 == 6) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "z");

            }
            if (pseudo2 == 7) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "r");

            }
            if (pseudo2 == 8) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "r");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "x");
            }
            if (pseudo2 == 9) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¡", "n");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¿", "q");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("¨", "p");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("´", "o");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\+", "u");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\*", "t");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\{", "w");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\}", "v");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\[", "s");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("\\]", "y");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("-", "z");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(":", "x");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll(";", "r");

            }
            if (pseudo3 == 1) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }
            if (pseudo3 == 2) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }
            if (pseudo3 == 3) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "9");

            }
            if (pseudo3 == 4) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }
            if (pseudo3 == 5) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "9");

            }
            if (pseudo3 == 6) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "9");

            }
            if (pseudo3 == 7) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("J", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("F", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("B", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("H", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("C", "9");

            }
            if (pseudo3 == 8) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("X", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("D", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("N", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Z", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("R", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("I", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("T", "9");

            }
            if (pseudo3 == 9) {
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("U", "0");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("G", "1");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("T", "2");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("Y", "3");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("M", "4");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("A", "5");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("L", "6");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("R", "7");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("E", "8");
                mensajeDesencriptado = mensajeDesencriptado.replaceAll("P", "9");

            }
            
            String Descenriptado = mensajeDesencriptado.substring(0, mensajeDesencriptado.length()-1);
            System.out.println("Mensaje desencriptado: " + Descenriptado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
