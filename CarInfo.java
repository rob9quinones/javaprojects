class CarInfo extends Printer {
  private String brand;
  private Vendor vendor;
  private String client;
  private int price;
  
  //constructor
  public CarInfo(){
    vendor = new Vendor();
  };  
  public CarInfo(String brand, Vendor vendor){
    this.brand = brand;
    this.vendor = vendor;
    client = "No client yet.";
    price = 0;
  }
  public CarInfo(String brand, Vendor vendor, String client, int price){
    this.brand = brand;
    this.vendor = vendor;
    this.client = client;
    this.price = price;
  }
  //last constructor
  
  //set 
  void setBrand(String brand){
    this.brand = brand;
  }

  void setVendor(Vendor vendor){
    this.vendor = vendor;
  }

  void setClient(String client){
    this.client = client;
  }

  void setPrice(int price){
    this.price = price;
  }
  //
  //get
  public String getBrand(){
    return brand;
  }

  public Vendor getVendor(){
    return vendor;
  }

  public String getClient(){
    return client;
  }

  public int getPrice(){
    return price;
  }

  //Printer displays methods
  public void displayCar(){
    System.out.println("Car brand: " + brand);
  }
  public void displayVendor(){
    System.out.println("Vendor's name: " + vendor.getName() + "\nID: " + vendor.getID());
  }

  public void displayClient(){
    System.out.println("Client name: " + client);
  }

  public void displayPrice(){
    System.out.println("Car price: " + price);
  }
  
}