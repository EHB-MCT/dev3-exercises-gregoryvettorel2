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

    print("Where are you going?: ")

    val enteredString = readLine()
    println("You are going to: $enteredString")

    val statement = connection.prepareStatement("SELECT * FROM trains WHERE arrival_place = '${enteredString}';")
// The result of your query will be a type ResultSet
// This is a bit similar to collections in Kotlin
// But since the library is based on Java, we get a type from Java
    val result = statement.executeQuery()
    while(result.next()) {
        val departure = result.getString("departure_place")
        val arrival = result.getString("arrival_place")
        val atTime = result.getString("departure_time")
        val arTime = result.getString("arrival_time")
        var gate = result.getString("gate")

        println("Your train leaves at ${departure} at ${atTime} at gate ${gate}, and will arrive in ${arrival} at ${arTime}")
    }

   // println(statement)
   // println(result)

}