/*
 * MultiResultSet
 *
 */
import java.sql.*;

public class MultiRS {

    public static void main(String[] args) throws Exception{
 		String           url="jdbc:IRIS://localhost:51773/USER";
		String           username="_SYSTEM";  // null for default
		String           password="SYS";  // null for default
    	Class.forName("com.intersystems.jdbc.IRISDriver");
		Connection dbconnection = DriverManager.getConnection(url, username, password);
		CallableStatement cstmt = dbconnection.prepareCall("{? = call devcon2008.getMultipleResultSets(?) }");

	cstmt.registerOutParameter(1,java.sql.Types.BINARY);
	cstmt.setInt(2,5);

	boolean ok = cstmt.execute();
	int count=1;

	do {
		if (ok) {
			ResultSet rs = cstmt.getResultSet();
			out("\n\n\nresultset #" + count++);
			int row = 1;
			while (rs.next())
			{
				out("row #" + row++);
				int columns = rs.getMetaData().getColumnCount();
				for (int col=1; col <= columns; col++)
				{
					out( "\t" + 
					rs.getMetaData().getColumnName(col) + "\t=\t"
					+ rs.getString(col));
				}
				out("");
			}
			out("\n");
		}
	} while (cstmt.getMoreResults());

	dbconnection.close();
}

static void out(Object o) {
	System.out.println(o);
}

}
