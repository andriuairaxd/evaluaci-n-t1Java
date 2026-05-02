/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author UCB10116
 */
public class Scanner {
    private String nombre;
    private String tipoDocumento;
    private String codigo;
    private String carrera; 
    private char nivelSocio;

    public Estudiante(String carrera) {
        this.carrera = carrera;
    }

    
    public void setCodigo(String codigo) {
        if (this.tipoDocumento.equalsIgnoreCase("DNI") && codigo.length() == 8) {
            this.codigo = codigo;
        } else if (this.tipoDocumento.equalsIgnoreCase("Residencia") && codigo.length() == 11) {
            this.codigo = codigo;
        } else {
            this.codigo = "ERROR_LONGITUD";
        }
    }

    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setTipoDocumento(String tipo) { this.tipoDocumento = tipo; }
    public void setNivelSocio(char nivel) { this.nivelSocio = nivel; }

    public double calcularPension() {
        double montoBase = (nivelSocio == 'A') ? 1000 : (nivelSocio == 'B' ? 800 : 600);
        if (carrera.equalsIgnoreCase("Parcial")) return montoBase * 0.50;
        if (carrera.equalsIgnoreCase("Total")) return montoBase * 0.0;
        return montoBase;
    }

    public void verDatos() {
        System.out.println("Estudiante CODIGO: " + this.codigo + 
                           " NOMBRE: " + this.nombre + 
                           " PAGO: S/ " + calcularPension());
    }
    class EstudianteControlador {
    ArrayList<Estudiante> lista_alumnos = new ArrayList<>();
    
    public void agregar_estudiante(Estudiante nuevo_estudiante) {
        lista_alumnos.add(nuevo_estudiante);
    }

    public void listar_estudiantes() {
        System.out.println("La lista de estudiantes es: ");
        if (lista_alumnos.isEmpty()) {
            System.out.println("La lista está vacía");
            return;
        }
        for (Estudiante es : lista_alumnos) {
            es.verDatos();
        }
    }
}
