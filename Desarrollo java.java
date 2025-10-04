/**
 * Sistema de Gestión de Estudiantes
 * Actividad Formativa 2 - Desarrollo de Aplicación Simple
 * Versión con una sola clase en un archivo
 */

class Estudiante {
    // Atributos de la clase
    private String nombre;
    private String id;
    private int edad;
    private String carrera;
    private double[] calificaciones;
    
    /**
     * Constructor por defecto
     */
    public Estudiante() {
        this.nombre = "";
        this.id = "";
        this.edad = 0;
        this.carrera = "";
        this.calificaciones = new double[0];
    }
    
    /**
     * Constructor con parámetros
     */
    public Estudiante(String nombre, String id, int edad, String carrera) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
        this.carrera = carrera;
        this.calificaciones = new double[0];
    }
    
    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }
    
    public int getEdad() { return edad; }
    public void setEdad(int edad) { this.edad = edad; }
    
    public String getCarrera() { return carrera; }
    public void setCarrera(String carrera) { this.carrera = carrera; }
    
    public double[] getCalificaciones() { return calificaciones; }
    public void setCalificaciones(double[] calificaciones) { 
        this.calificaciones = calificaciones; 
    }
    
    public double calcularPromedio() {
        if (calificaciones.length == 0) return 0.0;
        
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
    
    public boolean estaAprobado() {
        return calcularPromedio() >= 6.0;
    }
    
    public void mostrarInformacion() {
        System.out.println("=== INFORMACIÓN DEL ESTUDIANTE ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("ID: " + id);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + String.format("%.2f", calcularPromedio()));
        System.out.println("Estado: " + (estaAprobado() ? "APROBADO" : "REPROBADO"));
        System.out.println("Calificaciones: " + java.util.Arrays.toString(calificaciones));
        System.out.println("==================================");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE ESTUDIANTES ===");
        
        // Crear estudiantes
        Estudiante estudiante1 = new Estudiante();
        estudiante1.setNombre("Ana García");
        estudiante1.setId("2024001");
        estudiante1.setEdad(20);
        estudiante1.setCarrera("Ingeniería en Sistemas");
        estudiante1.setCalificaciones(new double[]{8.5, 7.0, 9.0, 8.0});
        
        Estudiante estudiante2 = new Estudiante("Carlos López", "2024002", 22, "Administración");
        estudiante2.setCalificaciones(new double[]{5.5, 6.0, 4.5, 5.0});
        
        Estudiante estudiante3 = new Estudiante("María Rodríguez", "2024003", 19, "Medicina");
        estudiante3.setCalificaciones(new double[]{9.5, 8.5, 9.0, 10.0});
        
        // Mostrar información
        Estudiante[] estudiantes = {estudiante1, estudiante2, estudiante3};
        
        System.out.println("\n--- INFORMACIÓN DE ESTUDIANTES ---");
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("\nEstudiante " + (i + 1) + ":");
            estudiantes[i].mostrarInformacion();
        }
        
        System.out.println("\n=== FIN DEL SISTEMA ===");
    }
}






     

        