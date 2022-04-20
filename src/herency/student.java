package herency;

public class student extends person {
    
    private int numCourses;
    private String[] courses=new String[30];
    private int[] grades=new int[50];
    
    public student(String name,String direc){//builder student
     
        super(name, direc);//llama al builder de person
        
        numCourses=0;
        
    }
    
    public void addCourseGrade(String curso,int nota){
        
        boolean err=false,space=false;
        int asig=0;
        
        for (int i = 29; i >= 0 || err==true; i--) {//cambia de curso, sale si da error o termina
            
            if(curso.equalsIgnoreCase(this.courses[i])){//compara curso con los datos del array
                err=true;//si el curso existe da un error
            }else{
                if(this.courses[i]==null){//si el campo esta vacio mete ahí el curso
                    asig=i;//guarda la ultima posicion libre del bucle
                    space=true;//se activa si hay espacio disponible
                }
            }
        }
        
        if(err==false&&space){//en caso de no haber errores crea el curso
            courses[asig]=curso;
            grades[asig]=nota;
            numCourses++;
            System.out.println("Curso añadido.");
        }else{//en caso contrario salta un error
            if (space) {//si hay espacio significa que ya existe el curso
                System.out.println("Curso: "+ curso +" (ya existente)");
                System.out.println("O nota fuera de los valores aceptados");
            } else {
                System.out.println("No se pueden añadir cursos (no space found)");
            }
        }
    }
    
    public void printGrades(){
        for (int i = 29; i >= 0; i--) {//cambia de curso, sale si da error o termina
            
            if(this.courses[i]!=null){//compara curso con los datos del array
                System.out.println("La nota de " + this.courses[i] + " es " + this.grades[i]);
            }
        }
    }
    
    public double getAveregeGrade(){
        
        double media=0;
        int i=0;
        
        for (int nota : grades) {
            i++;
            media=media+nota;
        }
        i=i/10;
        media=media/i;
        return media;
    }
    
    /**
     * @return Devuelve que es un estudiante, más su nombre y direccion
     */
    @Override
    public String toStrings(){
        return "Student: "+ super.toStrings();
    }
}
