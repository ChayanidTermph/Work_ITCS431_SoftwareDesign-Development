
public class Vehicle {
    private String v_serialNo = "";
    private String v_name = "";
    private String v_model = "";
    private int v_year = 0;
    private String v_manufac = "";
    private int v_basecost = 0;

    public Vehicle(String v_serial, String v_name, String v_model, int v_year, String v_manufac, int v_basecost){
        this.v_serialNo = v_serial;
        this.v_name = v_name;
        this.v_model = v_model;
        this.v_year = v_year;
        this.v_manufac = v_manufac;
        this.v_basecost = v_basecost;
    }

    public void getVehicleInfo() {
        System.out.println("Serial No: " + v_serialNo);
        System.out.println("Name: " + v_name);
        System.out.println("Model: " + v_model);
        System.out.println("Year: " + v_year);
        System.out.println("Manufacturer: " + v_manufac);
        System.out.println("Base Cost: $" + v_basecost);
    }

    public String getSerialNo() {
        return v_serialNo;
    }

    public String getName() {
        return v_name;
    }

    public String getModel() {
        return v_model;
    }

    public int getYear() {
        return v_year;
    }

    public String getManufacturer() {
        return v_manufac;
    }

    public int getBaseCost() {
        return v_basecost;
    }

}
