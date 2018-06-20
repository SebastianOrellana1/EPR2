package modelo;
    import java.sql.Statement;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.ResultSet;
    import java.sql.SQLException;

public class GestionBD {
  

        Connection conexion=null;
        Statement sentencia=null;
        String BD="trex";
        String url="jdbc:postgresql://localhost:5432/"+BD;
        String usuario="postgres";
        String pass="root";

        public String ingresarLogin(String nomUsuario,String contraseña){
            try{
        Class.forName("com.mysql.jdbc.Driver");
        conexion=DriverManager.getConnection(url,usuario,pass);
        sentencia=conexion.createStatement();
        String sql="insert into login(usuario,contrasenia)"+
                "values('"+nomUsuario+"','"+contraseña+"')";
        sentencia.executeQuery(sql);
        sentencia.close();
        conexion.close();
        return "Datos ingresados con exito";
        }catch(ClassNotFoundException | SQLException e){
        return "Error: "+e.getMessage();
        }
    }
        public String ingresarPuntaje(int puntaje){
            try{
        Class.forName("org.mysql.Driver");
        conexion=DriverManager.getConnection(url,usuario,pass);
        sentencia=conexion.createStatement();
        String sql="insert into puntaje(puntaje)"+
                "values("+puntaje+")";
        sentencia.executeQuery(sql);
        sentencia.close();
        conexion.close();
        return "Datos ingresados con exito";
        }catch(ClassNotFoundException | SQLException e){
        return "Error: "+e.getMessage();
        }
    }
        public String registrar(String nomusuario,String contra){
        
            try{
                
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection(url, usuario, pass);
          sentencia = conexion.createStatement();
          String sql = "insert into login(usuario,contrasenia) values('"+nomusuario+"','"+contra+"')";
          sentencia.executeUpdate(sql);
          sentencia.close();
          conexion.close();
                return "Datos ingresados con exito";
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Error "+e);
                 return "Error: "+e.getMessage();
            }
        }
        
        
        public String modificar(String id, String columna,String cambio){
         //   int id1=Integer.parseInt(id);
            try{
                
          Class.forName("org.postgresql.Driver");
          conexion = DriverManager.getConnection(url, usuario, pass);
          sentencia = conexion.createStatement();
          String sql = "UPDATE login SET "+columna+" = '"+cambio+"' WHERE id =' "+id+"' ";
          sentencia.executeUpdate(sql);
          sentencia.close();
          conexion.close();
                return "Datos modificados con exito";
            }catch(ClassNotFoundException | SQLException e){
                System.out.println("Error "+e);
                return "Error: "+e.getMessage();
            }
            
        } 
        public String eliminar(String id){
            try{
        Class.forName("org.postgresql.Driver");
        conexion=DriverManager.getConnection(url,usuario,pass);
        sentencia=conexion.createStatement();
        String sql="delete from login where id ='"+id+"'";
        sentencia.executeQuery(sql);
        sentencia.close();
        conexion.close();
        return "Datos ingresados con exito";
        }catch(ClassNotFoundException | SQLException e){
        return "Error: "+e.getMessage();
        }
    }
}
    
    
