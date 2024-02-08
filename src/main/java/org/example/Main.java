package org.example;

import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        //Datos del Jugador

        String nickName;
        String nickNameBD = "juanorlas";
        String contrasena;
        String contrasenaBD = "yesterday";
        Integer nivelVida = 70;
        Integer contadorSkills = 0;
        Integer contadorDisparos = 0;
        Integer precioSkillVida = 100000;
        Integer danoDisparo = -5;
        boolean estaMuerto=false;

        String juego1 = "free fire";
        String juego2 = "Fifa 24";
        String juegoSeleccionado;

        Scanner lea = new Scanner(System.in);

        //Proceso
        System.out.println("*************Ingresando*************");
        try{
            Thread.sleep(5000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("*************Bienvenido*************");
        System.out.println("------------------------------------");


        System.out.print("Digita tu Nick Name: ");
        nickName=lea.nextLine();

        System.out.print("Digita tu contraseña: ");
        contrasena=lea.nextLine();

        // Rutina para verificar el perfil

        if (nickName.equals(nickNameBD) && contrasena.equals(contrasenaBD)){
            System.out.println("Bienvenido a PSPLUS " +nickName);
            //Rutina para iniciar el juego
            System.out.print("Seleccione un juego: ");
            juegoSeleccionado=lea.nextLine();
            if (juegoSeleccionado.equals(juego1)){
                //entra a free fire

                do {
                    Random ramdom = new Random();
                    int disparo=ramdom.nextInt(2);


                    if (disparo == 1){
                        contadorDisparos=contadorDisparos+1;
                        nivelVida=nivelVida-5;
                        System.out.println("Te dispararon y tu vida quedo en: " +nivelVida);
                        if (contadorDisparos==3){
                            estaMuerto=true;
                            break;
                        }
                        if (nivelVida==0){
                            estaMuerto=true;
                            break;
                        }
                    }else {
                        contadorDisparos=0;
                    }

                }while (estaMuerto==false);
                System.out.println("estas muerto");

                //RANDOM (disparar o no)




            }else {
                System.out.println("Servidor no disponible...");
            }
        }else{
            System.out.println("Usuario no encontrado...");
        }


    }
}



/*
import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Timer timer = new Timer();
        Scanner scanner = new Scanner(System.in);

        // Crear una tarea que cancele el timer después de cierta cantidad de tiempo
        TimerTask task = new TimerTask() {
            public void run() {
                System.out.println("Tiempo terminado, ya no puedes ingresar más.");
                timer.cancel(); // Cancelar el timer
            }
        };

        // Programar el timer para ejecutar la tarea después de 5 segundos (5000 milisegundos)
        timer.schedule(task, 5000);

        // Pedir al usuario que ingrese un valor dentro del tiempo límite
        System.out.println("Ingresa un valor:");
        String input = scanner.nextLine();

        // Mostrar el valor ingresado por el usuario
        System.out.println("Valor ingresado: " + input);

        // Cerrar el scanner
        scanner.close();
    }
}*/