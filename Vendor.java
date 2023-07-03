class Vendor{
  protected String name;
  protected int ID;
  //constructor
  public Vendor(){
    name = "Not specified";
    ID = 0;
  }

  //set
  void setName(String name){
    this.name = name;
  }
  void setID(int ID){
    this.ID = ID;
  }

  //get
  public String getName(){
    return name;
  }

  public int getID(){
    return ID;
  }
  
}