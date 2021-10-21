
public class DBManager
{
    private static DBManager instance = null;

    private DBManager()
    {
        System.out.println("DB Manager object created");
    }
   
    public static DBManager getDBManager()
    {
        if(instance == null) {
           instance = new DBManager();
        }
        return instance;
    }
}
