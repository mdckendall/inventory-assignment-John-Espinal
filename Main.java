import java.util.ArrayList;
import java.util.Scanner;

class Inventory {
       String name;
       String serialNum;
       int value;
       
   public Inventory(String name, String serialNum, int value){
        this.name = name;
        this.serialNum = serialNum;
        this.value = value;
       
       
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
   
}


class Main {
	public static void main(String[] args) {
  int choice;
  String name;
  String serialNum;
  int value;
    
 ArrayList <Inventory> InventItem = new ArrayList <>();
 
  Scanner key = new Scanner(System.in);
    do{
      System.out.println("Press 1 to add an item.\nPress 2 to delete an item.\nPress 3 to update an item.\nPress 4 to show all the items.\nPress 5 to quit the program.");
      
      choice = Integer.parseInt(key.nextLine());
     
      switch (choice){
        case 1 :
          System.out.println("Enter the name:");
          name = key.nextLine();
          System.out.println("Enter the serial number:");
          serialNum = key.nextLine();
          System.out.println ("Enter the value in dollars (whole number):");
          value = Integer.parseInt(key.nextLine());

          Inventory item = new Inventory(name, serialNum, value);

          InventItem.add(item);
       
          break;
        
        case 2:
           System.out.println("Enter the serial number of the item to delete:");
             String serial = key.nextLine();
            for (int i = 0 ; i < InventItem.size(); i++ ){
            if(InventItem.get(i).getSerialNum().contains(serial)){
              InventItem.remove(i);
             }
            }
          
          break;
       
        case 3:
           System.out.println("Enter the serial number of the item to change:");
              serial = key.nextLine();
          for (int i = 0 ; i < InventItem.size(); i++ ){
            if(InventItem.get(i).getSerialNum().contains(serial)){
              System.out.println("Enter the new name:");
              name = key.nextLine();
              InventItem.get(i).setName(name);
              System.out.println("Enter the new value in dollars (whole number):");
               value = Integer.parseInt(key.nextLine());
              InventItem.get(i).setValue(value);
             }
            }

          break;
          
        case 4:
           for (int i = 0 ; i < InventItem.size(); i++ ){
               System.out.print(InventItem.get(i).name + ",");
               System.out.print(InventItem.get(i).serialNum + ",");
               System.out.println(InventItem.get(i).value);
           }
        break;
      }

      
      
    } while(choice != 5);
    {
      return;
    }
    
	}
}
