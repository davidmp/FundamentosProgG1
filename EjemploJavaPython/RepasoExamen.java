import java.util.Scanner;

class RepasoExamen{
    static Scanner teclado=new Scanner(System.in);

    public static void calcularBono01DMP(){
        int puntos;
        double bono=0, salariominimo;
        //datos entrada
        System.out.print("Ingrese el salario minimo:");
        salariominimo=teclado.nextDouble();
        System.out.print("Ingrese los puntos tiene el profesor:");
        puntos=teclado.nextInt();
        //Proceso
        if(puntos<=100){
            bono=1*salariominimo;
        }else if(puntos>=101 && puntos<=150){
            bono=2*salariominimo;
        }else{
            bono=3*salariominimo;
        }
        //Datos Salido
        System.out.print("El monto de Bono que le corresponde es:"+bono);
    }


    public static void calcularXXXX02DMP(){

        //datos entrada
        System.out.print("Pregunta 02:");

    }


    public static void main(String[] arg){
        System.out.println("Holas.....");

        System.out.println("Pregunta 02:");
        char continuar='S';
        String opcion;

        do{
            System.out.println("Eliga el algoritmo que desea probar:\n01=Calcular Bono\n02=Pregunta02");
            opcion=teclado.next();

            switch(opcion){
                  case  "01": calcularBono01DMP(); break;
                  case  "02": calcularXXXX02DMP(); break;
                  case  "03": calcularXXXX02DMP(); break;
                  case  "04": calcularXXXX02DMP(); break;
                    default:  System.out.print("Opcion no existe:"); break;
            }
             System.out.println("Desea probar mas algoritmos? S=SI, N=NO");
            continuar=teclado.next().charAt(0);
        }while(continuar=='S');

    }

}