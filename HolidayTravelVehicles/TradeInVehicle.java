public class TradeInVehicle {
    private String t_serialNo = "";
    private String t_make = "";
    private String t_model = "";
    private int t_year = 0;

    public TradeInVehicle(String t_serial, String t_make, String t_model, int t_year){
    	this.t_serialNo = t_serial;
    	this.t_make = t_make;
    	this.t_model = t_model;
    	this.t_year = t_year;
    }
}
