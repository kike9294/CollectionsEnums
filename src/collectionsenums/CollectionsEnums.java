/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsenums;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author enriq
 */
public class CollectionsEnums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{   
            File myFile = new File("C:\\Users\\enriq\\Desktop\\MiniHomwork\\MOCK_DATA.csv"); //Access the file
            Scanner myReader = new Scanner(myFile); // create my reader
            ArrayList<String> myList = new ArrayList<>(); //create new List
            Teams[] myTeam = Teams.values(); //

            //Add elements to myList
            while (myReader.hasNextLine()){

                myList.add(myReader.nextLine());
            }
            myReader.close();

            //Randomizing myList
            Collections.shuffle(myList);

            //creating new List to store the Teams created
            ArrayList<String> myTeams = new ArrayList<>();
            
            for (int i = 0 ; i < 20; i++){
                //Add a Team name every 5 members
                myTeams.add(myTeam[i].toString());
                //Add members to the Team
                for (int j = 0; j < 5; j++){
                    myTeams.add(myList.get(0));
                    myList.remove(0);
                }
            }

            //Looping through the List and printing into the console
            for (String x : myTeams){
                System.out.println(x);
            }


        }catch (IOException e){
            System.out.println("An error has occurred");
            e.printStackTrace();
        }
    }
    
}
