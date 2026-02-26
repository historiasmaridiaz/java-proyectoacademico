interface Evaluador {
    void evaluar();
    void publicarNotas(); 
}

class Docente extends Miembro_Universitario implements Evaluador {
    private double salario; 
    private String categoria;

    public Docente() {}
    public Docente(String codigo, String nombre, double salario, String categoria) {
        super(codigo, nombre);
        this.salario = salario;
        this.categoria = categoria;
    }


    @Override
    public void calcular_carga() {
        System.out.println("Carga de Docente " + getNombre() + ": 20 horas de dictado.");
    }

    
    @Override
    public void evaluar() {
        System.out.println("Docente " + getNombre() + " está evaluando el examen final.");
    }

    @Override
    public void publicarNotas() {
        System.out.println("Docente " + getNombre() + " ha publicado las notas en el sistema.");

public void agregarA(Curso curso) {
        System.out.println("Asignando al docente " + getNombre() + " al curso " + curso.getNombreCurso());
        curso.agregarMiembro(this); // Aquí te conectas con la parte de Anderson
    }

    public double getSalario(){
        return salario;
        }
    public void setSalario(double salario){
        this.salario = salario; 
        
    }
    public String getCategoria(){
        return categoria;
        }
    public void setCategoria(String categoria){
        this.categoria = categoria;
        }
}