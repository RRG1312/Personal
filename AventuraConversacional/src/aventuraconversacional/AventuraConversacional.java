
package aventuraconversacional;
import java.util.Scanner;
        
public class AventuraConversacional {


    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        
        int opcion,dinero;
        
        System.out.println("Te encuentras en el interior de un banco que "
                + "planeas atracar \ndesde hace tiempo,vas armado con una pistola "
                + "de gran calibre \ny dentro del banco se encuentran unos cuanto clientes "
                + "\nademas de un guardia de seguridad y las empleadas del propio \nbanco "
                + "que se encuentran tras sus taquillas. "
                + "Al echar una vista \nrapida ves la oficina del director a escasos "
                + "metros de las \ntaquillas y el baño.");
        System.out.println("");
        System.out.println("");
        
        System.out.println("¿Que deseas hacer?");
        
        System.out.println("1-Disparar al techo y gritar 'Esto es un atraco'.");
        System.out.println("2-Ir al baño (¿Estas nerviso?).");
        System.out.println("3-Amordazar al vigilante y quitarle la llave de la alarma.");
        System.out.println("4-Entrar a la oficina del director sin preguntar.");
        System.out.println("5-Comenzar una masacre.");
        
        opcion=teclado.nextInt();
        
            switch (opcion){
                case 1:
                    System.out.println("El guardia ha reaccionado rapido y ha sacado "
                            + "su arma con \nla que te esta apuntando desde el otro "
                            + "lado de la \nsala mientras te dice que te tires al suelo.");
                    
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1-Le disparas.");
                    System.out.println("2-Te tiras la suelo y le haces caso.");
                    System.out.println("3-Te escondes rapido detras de una mesa.");
                    opcion=teclado.nextInt();
                    
                        switch (opcion){
                            case 1:
                                System.out.println("Te has cargado al guardia con una sola bala, "
                                        + "vaya pistolero estas hecho.\nLas empleadas del banco han activado "
                                        + "la alarma en cuanto \nhas disparado al guardia. "
                                        + "\nLa policia esta de camino al banco, date prisa en decidir.");
                                
                                System.out.println("¿Que deseas hacer?");
                                System.out.println("1-Salir corriendo del banco.");
                                System.out.println("2-Vas a por la caja fuerte de todas maneras.");
                                opcion=teclado.nextInt();
                                
                                    switch (opcion){
                                        case 1:
                                            System.out.println("La policia te ve corriendo "
                                                    + "por la calle y sabiendo que se \ntrataba "
                                                    + "del atracador te embisten con el coche."
                                                    + "\nHas fracasado.");
                                            break;
                                        case 2:
                                            System.out.println("Estas cojiendo el dinero a espuertas "
                                                    + "cuando aparece la policia \nen el banco "
                                                    + "gritando '¡Si no te entregas abriremos fuego! ");
                                            
                                            System.out.println("¿Que deseas hacer?");
                                            System.out.println("1-Te lias a tiros con la policia.");
                                            System.out.println("2-Te entregas.");
                                            
                                            opcion=teclado.nextInt();
                                            
                                                switch(opcion){
                                                    case 1:
                                                        System.out.println("Te han pegado un tiro entre "
                                                                + "las cejas en cuanto "
                                                                + "te has asomado,\ntio "
                                                                + "en serio creias que podias con ellos?"
                                                                + "\nHas fracasado. ");
                                                        break;
                                                    case 2:    
                                                        System.out.println("¿Pero que se te pasa por la cabeza? "
                                                                + "\nTe comeras unos cuantos años en la carcel "
                                                                + "por esto aunque \nmirandolo por el lado positivo "
                                                                + "al menos no estas muerto."
                                                                + "\nHas fracasado.");
                                                        break;
                                                    default:
                                                        System.out.println("El valor introducido es incorrecto.");
                                                        break;
                                                }
                                            break;
                                        default:
                                            System.out.println("El valor introducido es incorrecto.");
                                            break;
                                    }
                                
                                break;
                                
                    
                    
                                
                            case 2:
                                System.out.println("¿En serio?"
                                        + "\n¿Llegas hasta aqui para hacerle caso a un "
                                        + "segurata?"
                                        + "\nVaya delincuente de pacotilla estas hecho."
                                        + "\nHas fracasado.");
                                break;
                                
                            case 3:
                                System.out.println("Te has puesto a cubierto detras de "
                                        + "una mesa de madera, \npor suerte no te ha llegado " 
                                        + "a dar el disparo, pero estas \nescuchando como "
                                        + "el segurata se acerca por tu espalda."
                                        + "\nTienes que actuar rapido.");
                                
                                System.out.println("¿Que deseas hacer?");
                                System.out.println("1-Coger angulo y disparar.");
                                System.out.println("2-Intentar negociar.");
                                
                                opcion=teclado.nextInt();
                                
                                    switch (opcion){
                                        
                                        case 1:
                                            System.out.println("En cuanto te asomas te "
                                                    + "te revientan la cabeza de un balazo."
                                                    + "\nLa verdad es que te has metido con el "
                                                    + "segurata equivocado"
                                                    + "\nHas fracasado.");
                                            break;
                                        case 2:
                                            System.out.println("Segurata:'no negocio con ladrones'."
                                                    + "\nEl segurata empieza a disparar contra la mesa "
                                                    + "y te llevas unos \ncuantos balazos, asi de regalo."
                                                    + "\nHas fracasado.");
                                            break;
                                        default:
                                            System.out.println("El valor introducido es incorrecto.");
                                            break;
                                    }
                                break;    
                            default:
                                System.out.println("El valor introducido es incorrecto.");
                                break;
                        }
                            
                    break; 
                    
                case 2:
                    System.out.println("Entras al baño y te planteas tu existencia "
                            + "y el sentido de la \nvida ademas te esta dando un apreton.");
                    
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1-Ir hacia el vater porque ya no aguantas mas.");
                    System.out.println("2-Tomar cocaina a ver si se te pasa.");
                    
                    opcion=teclado.nextInt();
                    
                        switch(opcion){
                            case 1:
                                System.out.println("Los burritos de ayer te han pasado factura,"
                                        + "si esque hay que \nplanear estas cosas mejor."
                                        + "\nHas fracasado");
                                break;
                            case 2:
                                System.out.println("Te has puesto una raya muy grande y has caido como "
                                        + "una torre, \nsi esque ya te decía tu madre que "
                                        + "no tomáras cosas raras."
                                        + "\nHas fracasado");
                                break; 
                            default:
                                System.out.println("El valor introducido es incorrecto.");
                                break;
                        }
                    break;
                    
                case 3:
                    System.out.println("Las empleadas del banco han activado la alarma "
                            + "porque has \namordazado al guardia de seguridad delante suya, "
                            + "si esque \nparece que no piensas demasiado."
                            + "\nLa policia esta de camino, date prisa.");
                    
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1-Salir corriendo del banco.");
                    System.out.println("2-Amenazar a las empleadas.");
                    
                    opcion=teclado.nextInt();
                    
                        switch (opcion){
                            case 1:
                                System.out.println("Has llegado vivo a casa, pero sin "
                                        + "nada de efectivo. \nDeberias currartelo un poco mas."
                                        + "\nHas fracasado.");
                                break;
                            case 2:
                                System.out.println("Te acercas a un mostrador y apuntas a la "
                                        + "empleada que esta \ndetras mientras le gritas "
                                        + "'!Dame el dinero ya joder¡'"
                                        + "\nLa empleada por los nervios no puede abrir la caja.");
                                
                                System.out.println("¿Que deseas hacer?");
                                System.out.println("1-Salir corriendo del banco.");
                                System.out.println("2-Disparar y cojer tu mismo el dinero.");
                                
                                opcion=teclado.nextInt();
                                
                                    switch (opcion){
                                        case 1:
                                            System.out.println("Demasiado tarde para huír tio, "
                                                    + "la policia esta en la puerta \npara cuando sales "
                                                    + "y te dan una bonita despedida en forma de \nbalazo "
                                                    + "en la cabeza."
                                                    + "\nHas fracasado.");
                                            break;
                                        case 2:
                                            System.out.println("Estas saltando el mostrador cuando la "
                                                    + "policia irrumpe en el \nbanco disparando, al ver a "
                                                    + "la empleada muerta no se lo piensan \ndos veces y te "
                                                    + "acribillan a tiros."
                                                    + "\nDeberias probar a ser un poco menos agresivo."
                                                    + "\nHas fracasado.");
                                            break;
                                        default:
                                            System.out.println("El valor introducido es incorrecto.");
                                            break;                                                                                         
                                    }
                                break; 
                            default:
                                System.out.println("El valor introducido es incorrecto.");
                                break;
                                
                        }
                    break;    
                
                case 4:
                    System.out.println("Al entrar en la oficina el director te mira extrañado "
                            + "y te \npregunta que si necesitas algo importante mientras "
                            + "intenta \nsospechosamente meter la mano en el cajon de la mesa.");
                    
                    System.out.println("¿Que deseas hacer?");
                    System.out.println("1-Sacar la pistola y disparar sin responder ni siquiera "
                            + "\ny cojer la llave.");
                    System.out.println("2-Sacar la pistola y apuntarle a la cabeza mientras "
                            + "\nle pides la llave.");       
                    System.out.println("3-Pedirle amablemente la llave de la caja fuerte.");  
                    
                    opcion=teclado.nextInt();
                        
                            switch (opcion){
                                case 1:
                                    System.out.println("El ruido ha asustado a la gente del banco "
                                            + "y al salir del \ndespacho esta la alarma activada y el "
                                            + "guardia apuntandote.");
                                    
                                    System.out.println("¿Que deseas hacer?");                                   
                                    System.out.println("1-Rendirte.");
                                    System.out.println("2-Intentar huir.");
                                    
                                    opcion=teclado.nextInt();
                                    
                                        switch (opcion){
                                            case 1:
                                                System.out.println("Te han detenido, te comeras "
                                                        + "unos cuantos años extra por cargarte al director, "
                                                        + "si esque tendrias que tener mas calma."
                                                        + "\nHas fracasado.");
                                                break;
                                            case 2:
                                                System.out.println("Al empezar a correr para escapar en "
                                                        + "dirección a la \npuerta el guardia te dispara "
                                                        + "hasta vaciar el cargador."
                                                        + "\nHas fracasado.");
                                                break;
                                            default:
                                                System.out.println("El valor introducido es incorrecto.");
                                                break;
                                        }
                                        
                                    break;
                                    
                                case 2:
                                    System.out.println("El director asustado, se levanta despacio y te pide "
                                            + "\nque lo acompañes."
                                            + "\nAcabas de entrar en la caja fuerte donde le das una bolsa "
                                            + "al \ndirector y le dices que la llene."
                                            + "\nEn total hay 120 mil pavos tio es mucha pasta.");
                                    
                                    System.out.println("¿Que deseas hacer?");
                                    System.out.println("1-Te llevas al director como rehén.");
                                    System.out.println("2-Matas al director.");
                                    
                                    opcion=teclado.nextInt();
                                    
                                        switch (opcion){
                                            case 1:
                                                System.out.println("Sales de la caja fuerte con el director "
                                                        + "delante tuya\n mientras le apetras la espalda con una pistola."
                                                        + "\nAl pasar por el vestibulo el guardia ve el arma y da la alarma.");
                                                
                                                System.out.println("¿Que deseas hacer?");
                                                System.out.println("1-Amenazar con matar al director.");
                                                System.out.println("2-Disparar al guardia.");
                                                
                                                opcion=teclado.nextInt();
                                                
                                                    switch(opcion){
                                                        case 1:
                                                            System.out.println("Has podido salir del banco "
                                                                    + "sin rasguños y ahora te estas \nsubiendo al coche "
                                                                    + "con el director del banco, con la intencion de \ntirarlo "
                                                                    + "en alguna cuneta cuando te pide una \nrecompensa a cambio "
                                                                    + "de no dar tu descripción a la policía.");
                                                            
                                                            System.out.println("¿Cuanto le das al director para comprar su silencio?(numero)");
                                                            
                                                            dinero=teclado.nextInt();
                                                            
                                                            if(dinero>=40000){
                                                                System.out.println("Has escapado a Panama "
                                                                        + "con el dinero y parece que el director \nse ha currado su parte. "
                                                                        + "\nHas ganado tio, pensaba que nunca lo conseguirias.");
                                                            }else {   
                                                                System.out.println("Mientras cruzabas la frontera un poli te ha reconocido "
                                                                        + "por un \nretrato robot que habia en la comisaria,"
                                                                        + "ya sabia yo que el director te delataria."
                                                                        + "\nLa proxima dale mas pasta."
                                                                        + "\nHas fracasado.");
                                                            }
                                                                    
                                                                    
                                                                    
                                                                }
                                                            break;
                                                            
                                                        case 2:
                                                            System.out.println("Al disparar, el guardia tambien abre "
                                                                    + "fuego matando al director del banco y despues a ti."
                                                                    + "\nHas fracasado.");
                                                            break;
                                                        default:
                                                            System.out.println("El valor introducido es incorrecto.");
                                                            break;
                                                    }
                                        
                                        
                                    break;
                                    
                                case 3:
                                    System.out.println("El director acaba de activar la alarma "
                                            + "por lo que intentas \nhuir de la oficina, pero cuando "
                                            +"sales el guardia esta apuntandote con su arma.");
                                    
                                    System.out.println("¿Que deseas hacer?");
                                    System.out.println("1-Entregarte.");
                                    System.out.println("2-Disparar al guardia.");
                                        
                                        opcion=teclado.nextInt();
                                            switch (opcion){
                                                case 1:
                                                    System.out.println("Te comeras unos cuantos años en la carcel "
                                                            + "pero al menos estas vivo."
                                                            + "\nHas fracasado.");
                                                    break;
                                                case 2:
                                                    System.out.println("Cuando intentas sacar tu arma para "
                                                            + "disparar el guardia aprieta \nel gatillo rapidamente "
                                                            + "y te acribilla a balazos."
                                                            + "\nHas fracasado.");
                                                    break;
                                                default:
                                                    System.out.println("El valor introducido es incorrecto.");
                                                    break;
                                            }
                                
                                        }
                                        break;
                                  
                                    
                                    
                                    
                                    
                                    
                                    
                case 5:
                    System.out.println("El guardia de seguridad abre fuego "
                            + "contra ti nada mas volarle la cabeza al primer inocente,"
                            + "Hay que manejar esa ira, el yoga dicen que funciona."
                            + "\nHas fracasado.");
                    break;
                    
                    
                    
                default :
                    System.out.println("El valor introducido es incorrecto.");
                    break;
                                }
                  
           
            
            
            
            
            
            
            
            }                           
                        
                
       
                            
                                    
   }                

