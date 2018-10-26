import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Hourwiseprogram {
	
	@SuppressWarnings("resource")
        
	public static void main(String[] args) throws IOException {
                
                //Enter the Address of the merged task_events_files below
		File inpath =new File( "C:\\PROJECT DUIET\\Java\\task_events\\task_events_all.csv");
                
                //Enter The Address Where You Want To Save The Output
                File outpath =new File( "F:\\hourwise78.csv");
        
                int day,hourfrom,hourto,arrivalfrom,arrivalto;
            
                BufferedReader br = null;
                BufferedWriter br2=null;
                System.out.println("Enter The Day For Which you want to get the Arrival Time");
                
                System.out.println("Enter Hour From");
                System.out.println("Enter Hour to");
                Scanner scan = new Scanner(System.in);


        try {
                                day = scan.nextInt();
                                hourfrom = scan.nextInt();
                                hourto = scan.nextInt();
                           
                                arrivalfrom = (((( hourfrom * 60 * 60 )  + ( day * 24 * 60 * 60 ))   + 600 )* 10 ^ 6);
                                arrivalto   = (((( hourto   * 60 * 60 )  + ( day * 24 * 60 * 60 ))   + 600 )* 10 ^ 6);
                            
                    String fromstring = Integer.toString(arrivalfrom);
                    String tostring = Integer.toString(arrivalto);

                                br = new BufferedReader(new FileReader(inpath));
                                System.out.println("\n"+"***The Timestamp Range***");
                                System.out.println(" Starting Value -> "+fromstring);
                                System.out.println(" Ending Value -> "+tostring);
                                br2=new BufferedWriter(new FileWriter(outpath));

                    String Line = br.readLine();
                    while (Line!=null){
                    String[] column=Line.split(",");
                    String column1 = column[0];
                    String column3 = column[2];

                  if(column1.compareTo(fromstring)>0 && column1.compareTo(tostring)<0){

                  br2.write(""+column1+","+""+column3);
                  br2.write("\n");
                  }
                  Line = br.readLine();
                  }
                  }

        
                catch (FileNotFoundException e) {
                                                 } catch (IOException e) {
                                                                         } finally {
                                                                         if (br != null) {
                                                                                          try {
                                                                                              br.close();
                                                                                              } catch (IOException e) {
                                                                                              }
                                                                                              }
                                                                                              br.close();
                                                                                              br2.close();
                                                                                              }                                                                                    
                                                                                       	      }
                                                                                              }