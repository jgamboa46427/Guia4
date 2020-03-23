
package ean.edu;

import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.dao.DaoManager;
import com.j256.ormlite.jdbc.JdbcConnectionSource;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;

/**
 *
 * @author JGamboa
 */
public class BaseDatos {
    
   public static void main(String[] args) throws Exception {
       //Crear la tabla
       String urlBD = "jdbc:sqlite:data/nomina.db";
       
       //Crear conexion
       ConnectionSource fuente = new JdbcConnectionSource(urlBD);
       
       //Crear DAO
       Dao<Empleados, Integer> tablaEmpleados = DaoManager.createDao(fuente, Empleados.class);
       
       //Crear la BD y tabla
       TableUtils.createTable(tablaEmpleados);
       System.out.println("Tabla creada!");
       
   }
    
}
