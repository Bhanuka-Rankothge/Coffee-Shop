package backend_files;

public class Product_Status_Changer {

    private String status;

    //Get the status to display in the jTable
    public String getProductDisplayStatus(String s) {
        switch (s) {
            case "A" -> this.status = "Available";
            case "D" -> this.status = "Deleted";
        }
        return this.status;
    }

    //Get the status to update the sql table
    public String getProductDBStatus(String s) {
        switch (s) {
            case "Available" -> this.status = "A";
            case "Deleted" -> this.status = "D";
        }
        return this.status;
    }
}
