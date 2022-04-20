package herency;

import javax.swing.JOptionPane;

public class Herency {

    public static void main(String[] args) {
        // TODO code application logic here
        person[] pers=new person[6];
        
        pers[0]=new person("alvaro", "vendimia");
        pers[1]=new person("sejota","madrid");
        for (int i = 2; i < 6; i++) {
            
            if (i%2==0) {
                pers[i]=new student(JOptionPane.showInputDialog("Inserte nombre de studiante", "Nombre"),
                JOptionPane.showInputDialog("Inserte dirección de studiante", "Dirección"));
            } else {
                pers[i]=new teacher(JOptionPane.showInputDialog("Inserte nombre de profesor", "Nombre"),
                JOptionPane.showInputDialog("Inserte dirección de profesor", "Dirección"));
            }
            
        }
        
        for (person per : pers) {
            System.out.println(per.toStrings());
        }
    }
    
}
