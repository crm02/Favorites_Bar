/*
 * Author: Cody Miller
 * E-mail: crm6434@psu.edu
 * Course: CMPSC 221
 * Assignment: Programming Assingment 4
 * Due Date: 4/14/2025
 * File: favoriteBar.java
 * Purpose: Make a favorites bar by reading a text file 
 * Compiler/IDE: Java SE Development Kit 23.02 / Visual Studio
 * Operating Syerm: Windows 11
 * Reference(s): Class sides and Textbook
 */





import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;


public class favoriteBar {
    
    public static void main(String[] args){
        Scanner inputStream =null;
        ArrayList<Website> siteData =new ArrayList<>();


        // Try-catch block for if file isn't recognized/found
        try{
        Scanner read =new Scanner(new FileInputStream("favoriteStuff.txt"));

        //while our file has lines we haven't read yet...
        while(read.hasNextLine()){

            // create new Website object
            Website site = new Website();
            
            // add object to ArrayList site Data
            siteData.add(site);

            // Sets variables corresponding to our objects 5 instance variables from lines in the file
            String rating =read.nextLine();
            String topic = read.nextLine();
            String name = read.nextLine();
            String url = read.nextLine();
            String date = read.nextLine();

            // Use set methods to make our instance variables equal the lines read
            site.setRating(rating);
            site.setTopic(topic);
            site.setWebName(name);
            site.setWebAddress(url);
            site.setDate(date);
            
            
        }
        }catch(FileNotFoundException e)
        {
            System.out.println("File favoriteStuff.txt was not found");
            System.out.println("or could not be opened");
            System.exit(0);
        }


        

        
        System.out.println("Creating list of Web sites visited....\n/********************************************************************************************/");
        
        // Creates while loop condition
        boolean cont =true;

        //creates ArrayList for objects of Website class, this is our favorites bar arraylist
        ArrayList<Website> favoritebar =new ArrayList<>();

        // Starts while loop
        while (cont == true){
            
            
            System.out.print("Welcome to the my collection of recently visited Web sites!\n");

            //creates Scanner object for input
            Scanner input = new Scanner(System.in);
            
            // Prompts user for input
            System.out.println("\nChoose an option.\n1) Create Favorites Bar\n2) Delete Favorites Bar\n3) Add Web Site to Favorites Bar"+
            "\n4) Remove Web Site from Favorites Bar\n5) Quit");
            int choice =input.nextInt();
            
            
            if(choice==1){
                System.out.println("/********************************************************************************\n\n"+
                "Favorites bar created!\n\n/********************************************************************************");
            }

            // If user wants to deletes favorites bar, clear it
            if (choice ==2){
                favoritebar.clear();
                cont=false;
            }

            // if user wants to add a website to the favorites bar
            if (choice ==3){

                // Prompt user for topic
                System.out.println("/********************************************************************************\n\n"+
                "Choose a topic.");
                System.out.println("1) "+siteData.get(0).getTopic() +"\n2) "+siteData.get(3).getTopic()+"\n3) "+siteData.get(7).getTopic()+"\n4) "+siteData.get(11).getTopic()+"\n5) "+siteData.get(14).getTopic());
                int secChoice = input.nextInt();

                // I know this all could've been made simpler with another method or with switches, but I am in a rush
                if (secChoice ==1){
                    System.out.println("Your choice ("+secChoice+") is being processed...");
                    System.out.println("Choose a Website.");
                    System.out.println("1) "+siteData.get(0).getwebsiteName()+"\n2) "+siteData.get(1).getwebsiteName()+"\n3) "+siteData.get(2).getwebsiteName());
                    int thirdChoice = input.nextInt();
                    if (thirdChoice ==1){
                        System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(0));
                    

                    }else if(thirdChoice ==2){
                        System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(1));
                    }else{System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(2));}
                    }else if (secChoice ==2){
                        System.out.println("Your choice ("+secChoice+") is being processed...");
                        System.out.println("Choose a Website.");
                        System.out.println("1) "+siteData.get(3).getwebsiteName()+"\n2) "+siteData.get(4).getwebsiteName()+"\n3) "+siteData.get(5).getwebsiteName());
                        int thirdChoice = input.nextInt();
                        if (thirdChoice ==1){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(3));
                    }else if(thirdChoice ==2){
                        System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(4));
                    }else{System.out.println("Your choice (" +thirdChoice+") is being processed");
                    favoritebar.add(siteData.get(5));}
                }else if (secChoice ==3){
                    System.out.println("Your choice ("+secChoice+") is being processed...");
                        System.out.println("Choose a Website.");
                        System.out.println("1) "+siteData.get(6).getwebsiteName()+"\n2) "+siteData.get(7).getwebsiteName()+"\n3) "+siteData.get(8).getwebsiteName());
                        int thirdChoice = input.nextInt();
                        if (thirdChoice ==1){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(6));
                        }else if (thirdChoice ==2){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(7));

                        }else{System.out.println("Your choice (" +thirdChoice+") is being processed");
                    favoritebar.add(siteData.get(8));}

                }else if (secChoice ==4){
                    System.out.println("Your choice ("+secChoice+") is being processed...");
                        System.out.println("Choose a Website.");
                        System.out.println("1) "+siteData.get(9).getwebsiteName()+"\n2) "+siteData.get(10).getwebsiteName()+"\n3) "+siteData.get(11).getwebsiteName());
                        int thirdChoice = input.nextInt();
                        if (thirdChoice ==1){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(9));
                        }else if (thirdChoice ==2){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(10));

                        }else{System.out.println("Your choice (" +thirdChoice+") is being processed");
                    favoritebar.add(siteData.get(11));}

                }else if (secChoice ==5){
                    System.out.println("Your choice ("+secChoice+") is being processed...");
                        System.out.println("Choose a Website.");
                        System.out.println("1) "+siteData.get(12).getwebsiteName()+"\n2) "+siteData.get(13).getwebsiteName()+"\n3) "+siteData.get(14).getwebsiteName());
                        int thirdChoice = input.nextInt();
                        if (thirdChoice ==1){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(12));
                        }else if (thirdChoice ==2){
                            System.out.println("Your choice (" +thirdChoice+") is being processed");
                        favoritebar.add(siteData.get(13));

                        }else{System.out.println("Your choice (" +thirdChoice+") is being processed");
                    favoritebar.add(siteData.get(14));}
                    

                }
                // Displays favorite bar entries
                for (int i = 0; i< favoritebar.size();i++){
                    System.out.println("\nSelection #"+(i+1)+":");
                    System.out.println(favoritebar.get(i).toString()+"\n\n");
                }

                
            }

            // If user wants to remove a favorite from favorites bar
            if (choice ==4){
                System.out.println("Displaying current favorites bar...");
                for (int i = 0; i< favoritebar.size();i++){
                    System.out.println("\nSelection #"+(i+1)+":");
                    System.out.println(favoritebar.get(i).toString()+"\n\n");
                }

                // Use .remove method
                System.out.println("Please enter the number of the selection you wish to remove.");
                int remove = input.nextInt();
                System.out.println("Your choice ("+remove+") is being processed ...");
                favoritebar.remove(remove-1);
            }

            

            // if user wants to exit, exit
            if (choice ==5){
                cont=false;
            }
        }

        // Thanks the user
        System.out.println("Thanks for viewing the my collection of recently viewed Websites!");
    }

}


/*Required methods for the WebSite class include:
o A five-argument constructor that initializes the five instance variables (specified above).
o set and get methods for each of the five instance variables.
o A toString method to generate nicely formatted output. */


class Website{
    String rating;
    String topic;
    String websiteName;
    String webAddress;
    String date;
    //Constructor
    /** Our 5 parameter constructor to initialize our instance variables
     * 
     *
     */
    public void setWebInfo (String rating, String topic, String websiteName, String webAddress, String date){
        this.rating = rating;
        this.topic =topic;
        this.websiteName =websiteName;
        this.webAddress = webAddress;
        this.date=date;
    }
    //Set methods
    /**
     * 
     * @param rating takes rating from file, sets it to our instance variable rating
     */
    public void setRating(String rating){
        this.rating = rating;
    }

    /**
     * 
     * @param topic takes topic from file, sets it to our instance variable topic
     */
    public void setTopic(String topic){
        this.topic = topic;
    }

    /**
     * 
     * @param websiteName takes website name from file, sets it to our instance variable topic websiteName
     */
    
    public void setWebName(String websiteName){
        this.websiteName = websiteName;
    }

    /**
     * 
     * @param webAddress takes url from file, sets it to our instance variable webAddress
     */
    public void setWebAddress(String webAddress){
        this.webAddress = webAddress;
    }
    
    /**
     * 
     * @param date takes date from file, sets it to our instance variable date
     */
    public void setDate(String date){
        this.date = date;
    }
    //Get methods

    // Following methods are pretty self explanatory, all return the current value of the objects 5 instance variables
    public String getRating(){
        return this.rating;
    }
    public String getTopic(){
        return this.topic;
    }
    public String getwebsiteName(){
        return this.websiteName;
    }
    public String getWebsiteAddress(){
        return this.webAddress;
    }
    public String getDate(){
        return this.date;
    }
    //toString method
    // Overides the toString method with our own, 
    public String toString(){
        return "Rating: "+rating+"\n"+
        "Topic "+topic+"\n"+
        "Website Name: "+websiteName+"\n"+
        "URL: "+webAddress+"\n"+
        "Date Last Visited: "+date;
    }
    
}