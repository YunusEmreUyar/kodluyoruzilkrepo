import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Fixture {


    public static void generateFixture(String teams){
        
        int teamSize = teams.split(" ").length;

        int roundCount=teamSize-1; 
        int matchCountPerRound=teamSize/2; 
        
        List<String> list=new ArrayList<>();
        
        for(String str: teams.split(" ")) {
            list.add(str);   
        }

        
        for (int i = 0; i < roundCount; i++) {
                
            System.out.println();
            System.out.println((i+1)+". round:");
            
            for(int j=0;j<matchCountPerRound;j++){
                    int firstIndex=j;
                    int secondIndex=(teamSize-1)-j;
                    System.out.println(list.get(firstIndex)+" vs "+list.get(secondIndex));       
            }

            List<String> newList=new ArrayList<>(); 
            newList.add(list.get(0)); 
            newList.add(list.get(list.size()-1)); 
            for(int k=1;k<list.size()-1;k++){
                    newList.add(list.get(k));
            }
            // Keydırılan liste yeni liste oluyor.
            list=newList;
        }
        System.out.println("\nToplam Round Sayısı : "+roundCount);
        System.out.println("Bir Round'daki Maç Sayısı:  "+matchCountPerRound);
}



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter teams with space seperated: ");
        generateFixture(in.nextLine());

        
        in.close();
    }
}