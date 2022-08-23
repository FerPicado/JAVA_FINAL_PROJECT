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

public class PuestosTrabajo implements Serializable {

    private static final long serialVersionUID = 004L;

    private String nombre;
    private String categoria;
    private int salario;

    public ArrayList<PuestosTrabajo> puestoTrabajo;

    public PuestosTrabajo() {
        puestoTrabajo = new ArrayList<>();
    }

    public PuestosTrabajo(String nombre, String categoria, int salario) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public ArrayList<PuestosTrabajo> savePuestoTrabajo() { //escribir un nuevo plato en un archivo binario
        // se crea el package archivos para guardar nuestros files binarios

        ArrayList<PuestosTrabajo> puestoTrab = new ArrayList<>();

        ObjectOutputStream objSalida = null; //crear obj de escritura, creamos la variable global (fuera del try) para que nos deje usarla en el finally
        File db = this.fileValidation(); // abrir el archivo

        try {
            //crear el flujo de escritura:
            FileOutputStream fileSalida = new FileOutputStream(db, true); // el true tiene que ir SI o SI, de lo contrario me sobreescribe los ficheros proximos a crear, con el true abrimos el archivo y escribimos al final, de lo contrario reemplaza lo que habia antesriormente

            //crear obj de escritura: lleva como parametro el file que creamos
            objSalida = new ObjectOutputStream(fileSalida);

            //escribir en el archivo:
            objSalida.writeObject(this); //este this hace referencia a toda la ClsDish TODA
            JOptionPane.showMessageDialog(null, "Puesto guardado", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra el Puesto", "Error", JOptionPane.ERROR_MESSAGE);
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
        return puestoTrab;
    }

    public void modifyPuestoTrabajo(String name) {//modificar un plato en un archivo binario
        ArrayList<PuestosTrabajo> puestoTrab = this.getPuestoTrabajo();
        ObjectOutputStream objExit = null;

        File db = this.fileValidation();

        //eliminar db:
        db.delete();

        //crear nuevamente la db
        db = this.fileValidation();

        try {

            //crear el flujo de escritura:
            FileOutputStream fileExit = new FileOutputStream(db);// no necesita el true como segundo parametro

            for (PuestosTrabajo pt : puestoTrab) {
                //crear obj de escritura:
                objExit = new ObjectOutputStream(fileExit);
                if (pt.getNombre().compareToIgnoreCase(name) != 0) {
                    objExit.writeObject(pt); //guarda un plato que NO se va a modificar, al haberlo validado con el !=
                } else { //de lo contrario lo guardamos modificado
                    objExit.writeObject(this);
                }
            }
            JOptionPane.showMessageDialog(null, "Puesto modificado", "Message", JOptionPane.INFORMATION_MESSAGE);

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

    public void deletePuestoTrabajo(String name) { //eliminar un plato en un archivo binario
        ArrayList<PuestosTrabajo> puestoTrabajo = this.getPuestoTrabajo();

        ObjectOutputStream objExit = null;

        File db = this.fileValidation();

        //eliminar db:
        db.delete();

        //crear nuevamente la db
        db = this.fileValidation();

        try {

            //crear el flujo de escritura:
            FileOutputStream fileExit = new FileOutputStream(db);

            for (PuestosTrabajo pt : puestoTrabajo) {

                //crear obj de escritura:
                if (pt.getNombre().compareToIgnoreCase(name) != 0) {

                    objExit = new ObjectOutputStream(fileExit);
                    objExit.writeObject(pt); //guarda un plato que NO se va a modificar, al haberlo validado con el !=
                }
            }
            JOptionPane.showMessageDialog(null, "Carrera borrada", "Message", JOptionPane.INFORMATION_MESSAGE);

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

    public ArrayList<PuestosTrabajo> getPuestoTrabajo() { //obtener todos los platillos del archivo

        ArrayList<PuestosTrabajo> puestoTrab = new ArrayList<>();

        ObjectInputStream objEntry = null;

        File db = this.fileValidation(); //abrir el archivo

        try {

            FileInputStream ficheroEntry = new FileInputStream(db);

            //leer caga registro del archivo
            while (ficheroEntry.available() > 0) { //si es mayor a 0, significa que falatan registros por llenar
                //crear obj de lectura
                objEntry = new ObjectInputStream(ficheroEntry);
                puestoTrab.add((PuestosTrabajo) objEntry.readObject()); //debemos castear, convertir otro obj en otro Obj
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se han guardado los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);

        }

        return puestoTrab;
    }

    private File fileValidation() {
        File db = new File("src\\database\\puestosTrabajoDatabase.dat"); //asigna el archivo al obj

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
