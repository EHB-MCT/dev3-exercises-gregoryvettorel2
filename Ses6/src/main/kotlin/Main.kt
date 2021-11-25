import java.sql.DriverManager
import java.util.*

fun main(){
    val credentials = Credentials()

    Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance()

    // Prepare credentials
    val connectionProps = Properties()
    connectionProps["user"] = credentials.databaseUser
    connectionProps["password"] = credentials.databasePassword
// Create the connection: this will allow us to run queries on it later
    val connection = DriverManager.getConnection(
        "jdbc:" + "mysql" + "://" +
                "remotemysql.com" +
                ":" + "3306" + "/" +
                "w4JtDCushc",
        connectionProps)
}