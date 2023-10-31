class Car {
    String brandname;
    String enginetype;
    String fueltype;
    Int seating_capacity;
    double model;
    Car (String brandname, String enginetype, String fueltype, Int seating_capacity, double model)
 {
    this.brandname = brandname;
    this.enginetype = enginetype;
    this.fuel = fueltype;
    this.seating_capacity = seating_capacity;
    this.model = model;
 }
 void info()
 {
    System.out.println("Brandname: "+brandname+"Enginetype: "+enginetype+"Sittingcap: "+seating_capacity+"Fuel: "+fueltype+"Model: "+model);
 }
}
class Mainclass9
{
    public static void main(String[] args)
    {
        System.out.println("main method started");
        Car c1= new Car ("Mahindra", "CC", "Petrol", 4, 14.2);
        C1.info();
        System.out.println("main method ended");

    }
}
