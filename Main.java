import java.util.*;
class Main {
  public static void main(String[] args) {
    
    //objects
    //CarInfo c = new CarInfo(); Vendor v = new Vendor();
    SaleLog s = new SaleLog();
   
    
    //for choices
    boolean exit = true; //to exit while if false
    Scanner sc1 = new Scanner(System.in); //for user input
    int opc1; //for dowhile options
    
//----------MENU-----------------------
    System.out.println("Starting!");
    System.out.println("Select option for: ");
    System.out.println("1. Add to log.\n" +
                       "2. Remove from log.\n" +
                       "3. Display log.\n" +
                       "4. Display log size.\n" +
                       "0. To exit.\n");
//-----------END MENU-------------------

    
    //while
    while(exit != false){
      
      try{ //TO CATCH AN EXCEPTION
            CarInfo c = new CarInfo();
            Vendor v = new Vendor();
        //sc1 = new Scanner(System.in);

        System.out.print("Choose: ");
        opc1 = sc1.nextInt();
        
        switch(opc1){
          case 1: //ADD CARINFO
            
            //for int input
            int inputInt = 0;
            //--------------
            sc1 = new Scanner(System.in);  //to  clean sc1 from junks
            System.out.println("case 1");

            
            System.out.println("Is the car sold?");
            String line = sc1.nextLine();

            if(line.equals("yes") || line.equals("YES")){
  //----------------Car brand-----------
              System.out.println("Enter car brand: ");
              line = sc1.nextLine();
              System.out.println("Brand: " + line);
          //inserting line with Brand input
              c.setBrand(line);
              
  //----------------Vendor ID-----------
              System.out.println("Enter Vendor name and ID: ");
              line = sc1.nextLine();
              inputInt = sc1.nextInt();
              System.out.println("Vendor: " + line + "\nID: " + inputInt);
          //inserting line with Vendor name and ID input
              v.setName(line);
              v.setID(inputInt);
              
  //----------------Client name-----------
              sc1 = new Scanner(System.in);
              System.out.println("Enter client name: ");
              line = sc1.nextLine();
              System.out.println("Client: " + line);
          //inserting Client name
              c.setClient(line);              

  //-----------------Price-------------------
              System.out.println("Enter car selling price");
              inputInt = sc1.nextInt();
              System.out.println("Selling price: " + inputInt);
          //inserting price
              c.setPrice(inputInt);

          //inserting all data in log and vendor information into carinfo
              c.setVendor(v);
              s.addToLog(c);
            }// first if
  
            else if(line.equals("no") || line.equals("NO")){
              sc1 = new Scanner(System.in);
  //----------------Car brand-----------
              System.out.println("Enter car brand: ");
              line = sc1.nextLine();
              System.out.println("Brand: " + line);
          //inserting line with Brand input
              c.setBrand(line);
              
  //----------------Vendor ID-----------
              System.out.println("Enter Vendor name and ID: ");
              line = sc1.nextLine();
              inputInt = sc1.nextInt();
              System.out.println("Vendor: " + line + "\nID: " + inputInt);
          //inserting line with Vendor name and ID input
              v.setName(line);
              v.setID(inputInt);
          
          //inserting all data in log and vendor information into carinfo
              c.setVendor(v);
              s.addToLog(c);
            }//end else if
              
            else{
              sc1 = new Scanner(System.in);  //to  clean sc1 from junks
              System.out.println("No useful input, only enter 'yes' or 'no'....");
              break;
            }//end else
            break;
            
  //-------------------END CASE 1-------------------
            
          case 2: //    REMOVE CAR
            int index;
            sc1 = new Scanner(System.in);  //to  clean sc1 from junks
            System.out.println("case 2");
            System.out.println("Enter the number car index to be removed. ");
            index = sc1.nextInt();
  //-----------ENTER INDEX TO REMOVE CAR INFORMATION------
            s.removeFromLog(index);
            
            break;
  //-------------------END CASE 2-------------------
            
          case 3: // PRINT LOG
            System.out.println("Printing Log: ");
        //Displaying all info in the Log
                s.displayAllInfo();
                break;
  //-------------------END CASE 3--------------------------
            
          case 0:
            System.out.println("case 0, going out...");
            exit = false;
  //--------------------END CASE 0-------------------------
        }//end switch
      }
      catch(NoSuchElementException nsee){
        System.out.println("Exception: LINE CORRUPTED: ");
        sc1 = new Scanner(System.in);  //to  clean sc1 from junks
        break;
      }
       
    }
  
    sc1.close(); //closing Scanner
    System.out.println("out");//to know whe it's out  of program (tests)
  }
  
}