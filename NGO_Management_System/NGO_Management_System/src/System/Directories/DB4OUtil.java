/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package System.Directories;

/**
 *
 * @author pavanpai
 */
import com.db4o.Db4oEmbedded;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.EmbeddedConfiguration;
import com.db4o.ta.TransparentPersistenceSupport;

public class DB4OUtil {
    
    private final String FILENAME = "ProjectDataBank.db4o";// path to the data store
    private static DB4OUtil dB4OUtil;
    
    public synchronized static DB4OUtil getInstance(){
        if (dB4OUtil == null){
            dB4OUtil = new DB4OUtil();
        }
        return dB4OUtil;
    }

    protected synchronized static void shutdown(ObjectContainer conn) {
        if (conn != null) {
            conn.close();
        }
    }

    private ObjectContainer createConnection() {
        try {
              ObjectContainer db = Db4oEmbedded.openFile(Db4oEmbedded.newConfiguration(), FILENAME);
//            EmbeddedConfiguration config = Db4oEmbedded.newConfiguration();
//            config.common().add(new TransparentPersistenceSupport());
//            //Controls the number of objects in memory
//            config.common().activationDepth(Integer.MAX_VALUE);
//            //Controls the depth/level of updation of Object
//            config.common().updateDepth(Integer.MAX_VALUE);
//
//            //Register your top most Class here
//            config.common().objectClass(MainSystem.class).cascadeOnUpdate(true); // Change to the object you want to save

//            ObjectContainer db = Db4oEmbedded.openFile(config, FILENAME);
              return db;
        } catch (Exception ex) {
            java.lang.System.out.print(ex.getMessage());
        }
        return null;
    }

    public synchronized void storeSystem(MainSystem system) {
        ObjectContainer conn = createConnection();
        conn.store(system);
        conn.commit();
        conn.close();
    }
    
    public MainSystem retrieveSystem(){
        ObjectContainer conn = createConnection();
        ObjectSet result = conn.queryByExample(MainSystem.class); // Change to the object you want to save
        MainSystem system;
        if (result.size() == 0){
            system = MainSystem.getInstance();  // If there's no MainSystem in the record, create a new one
            System.out.println(result);
            System.out.println(1);
        }
        else{
            system = (MainSystem) result.get(result.size() - 1);
//            System.out.println(result);
//            System.out.println(2);
        }
        conn.close();
        return system;
    }
    
}
