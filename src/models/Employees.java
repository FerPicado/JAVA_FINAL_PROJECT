package models;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class Employees implements Serializable {
    //atributo binary file
    private static final long serialVersionUID = 002L;
    private String name;
    private String lastname;
    private String email;
    private String puesto;
    private String gradoAcademico;
    private String prestamo;
    private String pension;
    
    public ArrayList<Employees> employee;

    public Employees() {
    }

    public Employees(String name, String lastname, String email, String puesto, String gradoAcademico, String prestamo, String pension) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.puesto = puesto;
        this.gradoAcademico = gradoAcademico;
        this.prestamo = prestamo;
        this.pension = pension;
    }
    
    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setGradoAcademico(String gradoAcademico) {
        this.gradoAcademico = gradoAcademico;
            
    }

    public void setPrestamo(String prestamo) {
        this.prestamo = prestamo;
    }

    public void setPension(String pension) {
        this.pension = pension;
    }
     
    // getters
    public String getName() {
        return name;
    }

    public String getLastname() {
        return lastname;
    }

    public String getEmail() {
        return email;
    }

    public String getPuesto() {
        return puesto;
    }

    public String getGradoAcademico() {
        return gradoAcademico;
    }

    public String getPrestamo() {
        return prestamo;
    }    

    public String getPension() {
        return pension;
    }
    
    //methods
    
    public ArrayList<Employees> saveEmployee() { //escribir un nuevo plato en un archivo binario
        // se crea el package archivos para guardar nuestros files binarios

        ArrayList<Employees> employee = new ArrayList<>();
        
        ObjectOutputStream objSalida = null; //crear obj de escritura, creamos la variable global (fuera del try) para que nos deje usarla en el finally
        File db = this.fileValidation(); // abrir el archivo

        try {
            //crear el flujo de escritura:
            FileOutputStream fileSalida = new FileOutputStream(db, true); // el true tiene que ir SI o SI, de lo contrario me sobreescribe los ficheros proximos a crear, con el true abrimos el archivo y escribimos al final, de lo contrario reemplaza lo que habia antesriormente

            //crear obj de escritura: lleva como parametro el file que creamos
            objSalida = new ObjectOutputStream(fileSalida);

            //escribir en el archivo:
            objSalida.writeObject(this); //este this hace referencia a toda la ClsDish TODA
            JOptionPane.showMessageDialog(null, "Empleado guardado", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el empleado", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se han guardado los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                objSalida.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return employee;
    }
    
    public void modifyEmployee(String name) {//modificar un plato en un archivo binario
        ArrayList<Employees> employee = this.getEmployee();
        ObjectOutputStream objExit = null;

        File db = this.fileValidation();

        //eliminar db:
        db.delete();

        //crear nuevamente la db
        db = this.fileValidation();

        try {

            //crear el flujo de escritura:
            FileOutputStream fileExit = new FileOutputStream(db);// no necesita el true como segundo parametro

            for (Employees e : employee) {
                //crear obj de escritura:
                objExit = new ObjectOutputStream(fileExit);
                if (e.getName().compareToIgnoreCase(name) != 0) {
                    objExit.writeObject(e); //guarda un plato que NO se va a modificar, al haberlo validado con el !=
                } else { //de lo contrario lo guardamos modificado
                    objExit.writeObject(this);
                }
            }
            JOptionPane.showMessageDialog(null, "Empleado modificado", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se han guardado los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                objExit.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }

    }
    
    public void deleteEmployee(String name) { //eliminar un plato en un archivo binario
        ArrayList<Employees> employee = this.getEmployee();
        
        ObjectOutputStream objExit = null;

        File db = this.fileValidation();

        //eliminar db:
        db.delete();

        //crear nuevamente la db
        db = this.fileValidation();

        try {

            //crear el flujo de escritura:
            FileOutputStream fileExit = new FileOutputStream(db);

            for (Employees e : employee) {

                //crear obj de escritura:
                if (e.getName().compareToIgnoreCase(name) != 0) {
                    
                    objExit = new ObjectOutputStream(fileExit);
                    objExit.writeObject(e); //guarda un plato que NO se va a modificar, al haberlo validado con el !=
                }
            }
            JOptionPane.showMessageDialog(null, "Empleado borrado", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se han guardado los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
        } finally {
            try {
                objExit.close();
            } catch (IOException ex) {
                Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public ArrayList<Employees> getEmployee() { //obtener todos los platillos del archivo

        ArrayList<Employees> employee = new ArrayList<>();

        ObjectInputStream objEntry = null;

        File db = this.fileValidation(); //abrir el archivo

        try {

            FileInputStream ficheroEntry = new FileInputStream(db);

            //leer caga registro del archivo
            while (ficheroEntry.available() > 0) { //si es mayor a 0, significa que falatan registros por llenar
                //crear obj de lectura
                objEntry = new ObjectInputStream(ficheroEntry);
                employee.add((Employees) objEntry.readObject()); //debemos castear, convertir otro obj en otro Obj
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se han guardado los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);

        }

        return employee;
    }
    
    private File fileValidation() {
        File db = new File("src\\database\\employeeDatabase.dat"); //asigna el archivo al obj

        if (!db.exists()) {

            try {
                db.createNewFile(); //si no existe lo crea, usamos el try / catch
            } catch (IOException ex) {
                JOptionPane.showMessageDialog(null, "No se puede abrir el archivo", "Error", JOptionPane.ERROR_MESSAGE);
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, "Ha ocurrido un error inesperado", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        return db;
    }
}


