package herency;

public class person {
    
    private final String name;
    private String address;
    
    public person(String name, String address){//builder
        
        this.name=name;
        this.address=address;
    }
    
    public String getName(){//getter
        return name;
    }
    
    public String getAddress(){//getter
        return address;
    }
    
    /**
     *
     * @param pepo clown
     */
    public void setAddress(String direc){//setter
        if (direc==null) {
            address="no address found";
        } else {
            address=direc;
        }
    }
    
    /**
     * @return Devuelve el nombre y la direccion de la persona
     */
    public String toStrings(){
        return name + " (" + address + ").";
    }
    
}
