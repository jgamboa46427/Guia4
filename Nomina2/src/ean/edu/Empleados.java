
package ean.edu;

import com.j256.ormlite.field.DatabaseField;
import com.j256.ormlite.table.DatabaseTable;

/**
 *
 * @author JOHN GAMBOA , HERNAN SEGURA
 */

@DatabaseTable(tableName = "empleados")
public class Empleados {
    
    //Atributos
        @DatabaseField(id=true)
        private int cedula;

        @DatabaseField(canBeNull=false)
	private String nombre;
        
        @DatabaseField(canBeNull=false)
	private String cargo;

        @DatabaseField(canBeNull=false)
	private int salario;

    public Empleados() {
    }

    public Empleados(int cedula, String nombre, String cargo, int salario) {
        this.cedula = cedula;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
        
        
    
}
