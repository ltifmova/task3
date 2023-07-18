package Singleton;

public class DBconnection {
    private static DBconnection dBconnection;
    private static String queryhistory= "Query History:\n";
    public static DBconnection getDbConnection() {
        if (dBconnection == null)  dBconnection  = new DBconnection();

        return dBconnection;
    }

    private DBconnection(){

    }
    public void addQuery(String query){
        queryhistory+=query + "\n";
    }
    public void showQueries(){
        System.out.println(queryhistory);
    }
}
