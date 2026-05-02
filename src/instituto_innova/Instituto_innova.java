/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package instituto_innova;

/**
 *
 * @author UCB10116
 */
public class Instituto_innova {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        EstudianteControlador control = new EstudianteControlador();
        String rpta = "s";
        try {
            while (rpta.equals("s")) {
                System.out.println("Ingrese nombre:");
                String nombre = sc.nextLine();

                System.out.println("Ingrese tipo de documento (DNI / Residencia):");
                String tipoDoc = sc.nextLine();

                System.out.println("Ingrese numero de documento:");
                String numDoc = sc.nextLine();

                System.out.println("Ingrese nivel socioeconomico (A, B, C):");
                char nivel = sc.nextLine().toUpperCase().charAt(0);

                System.out.println("Ingrese tipo de beca (Total / Parcial / Ninguna):");
                String beca = sc.nextLine();

                
                Estudiante e1 = new Estudiante(beca);
                e1.setNombre(nombre);
                e1.setTipoDocumento(tipoDoc);
                e1.setCodigo(numDoc); 
                e1.setNivelSocio(nivel);

                System.out.println("Los datos del estudiante creado son:");
                e1.verDatos();

                control.agregar_estudiante(e1);

                System.out.println("Desea agregar más estudiantes: s/n");
                rpta = sc.nextLine();
            }

            control.listar_estudiantes();

        } catch (ArithmeticException x) {
            System.out.println("Error division entre cero");
        } catch (InputMismatchException x) {
            System.out.println("Error debe ingresar un numero");
        }

        System.out.println("Fin del programa");
    }
        
    
 }
    

