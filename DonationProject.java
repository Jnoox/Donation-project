
        /*..Scanner input = new Scanner(System.in); 
        System.out.println("welcome in life in Donation app\n");
        System.out.print("1- Donor \n2- Those in need \nplease enter the number that represent you: ");
        int UserType = input.nextInt();
        
        //check input
        while(UserType != 1 && UserType != 2){
            System.out.print("\n!! wrong input !!"
                    + "\n1- Donor "
                    + "\n2- Those in need "
                    + "\nplease enter the number that represent you: ");
            UserType = input.nextInt();
        }
        
        if(UserType == 1){
            donor();
        }else{
            thoseInNeed();
        }
    }
    
    
    public static void donor(){
        Scanner input = new Scanner(System.in); 
        System.out.print("\n1- List of need "
                + "\n2- Display what to donate "
                + "\nPlease enter the number of what you want: ");
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("\n!! wrong input !! "
                    + "\n1- List of need "
                    + "\n2- Display what to donate "
                    + "\nPlease enter the number of what you want: ");
            userSelection = input.nextInt();
        }
         
        if(userSelection == 2){
            detailOfDonate();
        }
    }
    
    public static void detailOfDonate(){
        Scanner input = new Scanner(System.in);
        String name, status, type;
        int duration = 0;
        
        System.out.print("\nEnter the name of the device: ");
        name = input.nextLine();
        
        System.out.print("used or new: ");
        status = input.nextLine();
        
        if(status.equalsIgnoreCase("used")){
            System.out.print("Device usage time in years: ");
            duration = input.nextInt();
            String line;
            line = input.nextLine();
        }
        
        System.out.print("electronic or normal: ");
        type = input.next();
        
        device addDevice = new device(name,status,type,duration);
        try{
        addDevice.addDevice();
        System.out.println("\ndevice successfully added. "
                + "\nWe will contact you to set a date for receiving the device");
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
    }
    
    public static void thoseInNeed() throws IOException{
        
        Scanner input = new Scanner(System.in); 
        System.out.print("\n1- List of available medical devices. "
                + "\n2- Add a specific need. "
                + "\n3- Search for a product "
                + "\nPlease enter the number of what you want: ");
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("\n!! wrong input !! "
                    + "\n1- List of available medical devices. "
                    + "\n2- Add a specific need. "
                     + "\n3- Search for a product "
                    + "\nPlease enter the number of what you want: ");
            userSelection = input.nextInt();
         }
         if(userSelection == 1){
            list_of_devices list=new list_of_devices();
            list.available_devices_list();
         }
         
    }
    
}..*/
package donationproject;

/**
 *
 * @author Jana
 */
import java.io.IOException;
import static java.lang.System.exit;
import java.util.*;


public class DonationProject {
    
    public static void main(String[] args) throws IOException {
        
   
        int cin = 0;
       DonationProject d = new DonationProject();
     for (int choice = 0;choice<=7;choice++){
          do{    
              
       System.out.println(".......life in Donation........ ");
       System.out.println("-------------------------------------------------");
       System.out.println("choose an action: ");
       System.out.println("> 1- Donor");
       System.out.println("> 2- Those in need");
       System.out.println("> 3- Exit");
       System.out.println("-------------------------------------------------");
      
       Scanner keyboard = new Scanner(System.in);
       choice = keyboard.nextInt();
       
       switch(choice){
       
       
       case 1:
            Scanner input = new Scanner(System.in); 
        System.out.print("--------------------------------------------------"
                + "\nchoose an action: "
                + "\n> 1- List of needs "
                + "\n> 2- Device donation"
                + "\n------------------------------------------------------\n");
        int userSelection = input.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("\n!! wrong input !! "
                + "--------------------------------------------------"
                + "\nchoose an action: "
                + "\n> 1- List of needs "
                + "\n> 2- Device donation"
                + "\n------------------------------------------------------\n");
            userSelection = input.nextInt();
        }
         
          if(userSelection == 1){
            List_of_needs needs=new List_of_needs();
            needs.available_needs_list();
        }
         
          else if(userSelection == 2){
            detailOfDonate();
        }
         
          
          break;
       case 2:
           
        Scanner input2 = new Scanner(System.in);
          
        System.out.print("--------------------------------------------------"
                + "\nchoose an action: "
                + "\n> 1- List of available medical devices "
                + "\n> 2- Add a specific need"
                + "\n> 3- Search for a product "
                + "\n------------------------------------------------------\n");
         userSelection = input2.nextInt();
        
        //check input
         while(userSelection != 1 && userSelection != 2){
            System.out.print("\n!! wrong input !! "
                + "--------------------------------------------------"
                + "\nchoose an action: "
                + "\n> 1- List of available medical devices "
                + "\n> 2- Add a specific need"
                + "\n> 3- Search for a product "
                + "\n------------------------------------------------------\n");
            userSelection = input2.nextInt();
         }
         if(userSelection == 1){
            list_of_devices list=new list_of_devices();
            list.available_devices_list();
         }
         
         else if(userSelection == 2){
            specificNeed();
         }
              
           
      break; 
       case 3:
            exit(0);
           
          break;

       default:
        System.out.print("Invalid Choice ");
        System.out.print("Try Again\n");
                                                                                                      
        }
    
    }
     while (choice != 3);
     
    
    }
    }
     public static void detailOfDonate(){
        Scanner input = new Scanner(System.in);
        String name, status, type,description;
        int duration = 0;
        
        System.out.print("\nEnter the name of the device: ");
        name = input.nextLine();
        
        System.out.print("Device status (used or new):");
        status = input.nextLine();
        
        if(status.equalsIgnoreCase("used")){
            System.out.print("Device usage time in years: ");
            duration = input.nextInt();
            String line;
            line = input.nextLine();
        }
        
        System.out.print("Device type (electronic or normal): ");
        type = input.next();
        
        System.out.print("Device description: ");
        description = input.nextLine();
        
        device addDevice = new device(name,status,type,duration,description);
        try{
        addDevice.addDevice();
        System.out.println("\ndevice successfully added. "
                + "\nWe will contact you to set a date for receiving the device");
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
    }
     
     public static void specificNeed(){
         
         Scanner input = new Scanner(System.in);
        String name,description,address,id;
        int number;
        
        
        System.out.print("\nEnter your National Identity number: ");
        
        //if(id.matches("\\d{10}")){
            id = input.nextLine();
        /*..}
        else {
            System.out.print("invalid try agin!");
            System.out.print("\nEnter your National Identity number: ");
            if(id.matches("\\d{10}")){
            id = input.nextLine();
            }
        }..*/
        
        
        System.out.print("\nEnter the name of the device you need: ");
        name = input.nextLine();
       
        System.out.print("Device description: ");
        description = input.nextLine();
      
         System.out.print("Enter the address where the order will be delivered: ");
        address= input.nextLine();
        
        System.out.print("contact phone number: ");
        number = input.nextInt();
       
       
        
         
        
        Specific_Need addNeeds = new Specific_Need( name, description,  address,  id, number);
        try{
        addNeeds.specificNeed();
        System.out.println("\nYour specific need successfully added. "
                + "\nWe will contact you to tell you if your request accepted or rejected");
        }catch(Exception e){
            System.out.println("\nThere was an error. Try later");
        }
     }
     
    

}