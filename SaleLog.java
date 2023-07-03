import java.util.*;

class SaleLog extends CarInfo{
  ArrayList<CarInfo> car = new ArrayList<>();

  public SaleLog(){};

  //add
  public void addToLog(CarInfo carInfo){
    car.add(carInfo);
  }
  //remove
  public void removeFromLog(int index){
    index -= 1;
    car.remove(index);
  }

  
  public int getSize(){
    return car.size();
  }
  

  public void displayAllInfo(){ //Display all information
    int i = 0;
    for(CarInfo copy: car){
      System.out.println(++i + ": " );
      copy.displayCar();
      copy.displayVendor();
      copy.displayPrice();
      copy.displayClient();   
    }
  }
}