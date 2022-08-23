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

public class CarreraProfesional implements Serializable {

    private static final long serialVersionUID = 003L;

    private String empleado;
    private String codigo;
    private String titulo;
    private int cantHoras;
    private String tipo;

    public ArrayList<CarreraProfesional> carrera;

    public CarreraProfesional() {
    }

    public CarreraProfesional(String empleado, String codigo, String titulo, int cantHoras, String tipo) {
        this.empleado = empleado;
        this.codigo = codigo;
        this.titulo = titulo;
        this.cantHoras = cantHoras;
        this.tipo = tipo;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getCantHoras() {
        return cantHoras;
    }

    public void setCantHoras(int cantHoras) {
        this.cantHoras = cantHoras;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public ArrayList<CarreraProfesional> saveCarrera() { //escribir un nuevo plato en un archivo binario
        // se crea el package archivos para guardar nuestros files binarios

        ArrayList<CarreraProfesional> carrera = new ArrayList<>();

        ObjectOutputStream objSalida = null; //crear obj de escritura, creamos la variable global (fuera del try) para que nos deje usarla en el finally
        File db = this.fileValidation(); // abrir el archivo

        try {
            //crear el flujo de escritura:
            FileOutputStream fileSalida = new FileOutputStream(db, true); // el true tiene que ir SI o SI, de lo contrario me sobreescribe los ficheros proximos a crear, con el true abrimos el archivo y escribimos al final, de lo contrario reemplaza lo que habia antesriormente

            //crear obj de escritura: lleva como parametro el file que creamos
            objSalida = new ObjectOutputStream(fileSalida);

            //escribir en el archivo:
            objSalida.writeObject(this); //este this hace referencia a toda la ClsDish TODA
            JOptionPane.showMessageDialog(null, "Carrera guardado", "Message", JOptionPane.INFORMATION_MESSAGE);

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "No se encuentra la Carrera", "Error", JOptionPane.ERROR_MESSAGE);
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
        return carrera;
    }

    public void modifyCarrera(String name) {//modificar un plato en un archivo binario
        ArrayList<CarreraProfesional> carrera = this.getCarrera();
        ObjectOutputStream objExit = null;

        File db = this.fileValidation();

        //eliminar db:
        db.delete();

        //crear nuevamente la db
        db = this.fileValidation();

        try {

            //crear el flujo de escritura:
            FileOutputStream fileExit = new FileOutputStream(db);// no necesita el true como segundo parametro

            for (CarreraProfesional cp : carrera) {
                //crear obj de escritura:
                objExit = new ObjectOutputStream(fileExit);
                if (cp.getEmpleado().compareToIgnoreCase(name) != 0) {
                    objExit.writeObject(cp); //guarda un plato que NO se va a modificar, al haberlo validado con el !=
                } else { //de lo contrario lo guardamos modificado
                    objExit.writeObject(this);
                }
            }
            JOptionPane.showMessageDialog(null, "Carrera modificada", "Message", JOptionPane.INFORMATION_MESSAGE);

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

    public void deleteCarrera(String name) { //eliminar un plato en un archivo binario
        ArrayList<CarreraProfesional> carrera = this.getCarrera();

        ObjectOutputStream objExit = null;

        File db = this.fileValidation();

        //eliminar db:
        db.delete();

        //crear nuevamente la db
        db = this.fileValidation();

        try {

            //crear el flujo de escritura:
            FileOutputStream fileExit = new FileOutputStream(db);

            for (CarreraProfesional cp : carrera) {

                //crear obj de escritura:
                if (cp.getEmpleado().compareToIgnoreCase(name) != 0) {

                    objExit = new ObjectOutputStream(fileExit);
                    objExit.writeObject(cp); //guarda un plato que NO se va a modificar, al haberlo validado con el !=
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

    public ArrayList<CarreraProfesional> getCarrera() { //obtener todos los platillos del archivo

        ArrayList<CarreraProfesional> carrera = new ArrayList<>();

        ObjectInputStream objEntry = null;

        File db = this.fileValidation(); //abrir el archivo

        try {

            FileInputStream ficheroEntry = new FileInputStream(db);

            //leer caga registro del archivo
            while (ficheroEntry.available() > 0) { //si es mayor a 0, significa que falatan registros por llenar
                //crear obj de lectura
                objEntry = new ObjectInputStream(ficheroEntry);
                carrera.add((CarreraProfesional) objEntry.readObject()); //debemos castear, convertir otro obj en otro Obj
            }

        } catch (FileNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "No se encuentra el archivo", "Error", JOptionPane.ERROR_MESSAGE);

        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "No se han guardado los datos", "Error", JOptionPane.ERROR_MESSAGE);
        } catch (Exception ex) {
            Logger.getLogger(User.class.getName()).log(Level.SEVERE, null, ex);

        }

        return carrera;
    }

    private File fileValidation() {
        File db = new File("src\\database\\carreraProfDatabase.dat"); //asigna el archivo al obj

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
