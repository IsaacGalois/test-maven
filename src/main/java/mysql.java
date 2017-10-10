public class mysql {

    public static void main(String[] args) {

        try {
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("worked");
        } catch (ClassNotFoundException ex) {
            System.out.println("MySQL Driver not found! " + ex);
        }

    }
}
