package herency;

public class teacher extends person {
    
    private int numCourses;
    private String[] courses=new String[5];
    
    
    public teacher(String name, String direc){//builder teacher
     
        super(name, direc);//llama al builder de person
        
        numCourses=0;
        
    }
    
    public boolean addCourse(String curso){//setter comprueba si ese curso existe y lo crea
                                            //getter devuelve un boolean si se crea correctamente
        
        boolean err=false,space=false,resp;
        int asig=0;
        
        for (int i = 4; i >= 0 || err==true; i--) {//cambia de curso, sale si da error o termina
            
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
            numCourses++;
            System.out.println("Curso añadido.");
            resp=true;
        }else{//en caso contrario salta un error
            if (space) {//si hay espacio significa que ya existe el curso
                System.out.println("Curso: "+ curso +" (ya existente)");
            } else {
                System.out.println("No se pueden añadir cursos (no space found)");
            }
            resp=false;
        }
        return resp;
    }
    
    public boolean removeCourses(String curso){//setter comprueba si existe el curso y lo elimina
                                            //getter devuelve un boolean si se crea correctamente
        
        boolean err=true,resp=false;
        
        for (int i = 0; i < 5 || err==false; i++) {//bucle para cambiar de dato en el array
            
            if(curso.equalsIgnoreCase(this.courses[i])){//compara curso con los datos del array
                System.out.println("Curso:" + this.courses[i] + " (se ha eliminado)");
                this.courses[i]=null;//vacia el dato correspondiente del array
                numCourses--;//decrementa el numero de cursos total
                err=false;//dado que el curso se ha eliminado, no hay errores
                resp=true;
            }
        }
                //en el caso de no encontrar ningun curso con ese nombre devuelve este error
        if(err==true){
            System.out.println("No hay ningun curso con este nombre: "+curso);
        }
        return resp;
    }
    
    public void getCourses(){// devuelve todos los cursos de teacher
        
        System.out.println("El profesor: "+this.getName() + ", tiene los siguientes cursos:");
        
        for (String cursos : courses) {
            System.out.println(cursos);
        }
    }
    
    /**
     * @return devuelve que es un prefesor, más su nombre y direccion
     */
    @Override
    public String toStrings(){
        return "Teacher: " + teacher.super.toStrings();
    }
}

