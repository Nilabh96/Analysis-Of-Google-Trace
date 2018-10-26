import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Comppart2 {

	public static void main(String[] args) throws IOException {
	
        //Enter the Previous Programs Output Address below
	File inpath =new File("F:\\hourwise1.csv");
        
        //Enter the Usage Address below
        File usage =new File( "F:\\qazxsw.csv");
        
        //Enter A Location Where You Want To Save The Output
        File outpath =new File("F:\\FinalOutput.csv");

                BufferedReader br = null;
                BufferedReader br1 = null;
                BufferedWriter br2=null;
            
try{
                            
     
                                br = new BufferedReader(new FileReader(inpath));
                                br1 = new BufferedReader(new FileReader(usage));
                                br2=new BufferedWriter(new FileWriter(outpath));

                                String inpathLine = br.readLine();
                                String usageLine = br1.readLine();
       
                                while (inpathLine!=null) {
                        	String[] inpathLine1=inpathLine.trim().split(",");
                                String stringinpathcolumn1=inpathLine1[0].trim();
                                String stringinpathcolumn2=inpathLine1[1].trim();
                                
                        	double inpathcolumn1 = Double.parseDouble(stringinpathcolumn1);
                        	double inpathcolumn2 = Double.parseDouble(stringinpathcolumn2);
                                
                                
                                while (usageLine!=null){
                        	String[] usageLine1=usageLine.trim().split(",");
                                String stringusagecolumn4=usageLine1[3].trim();
                                String stringusagecolumn3=usageLine1[2].trim();
                                String stringusagecolumn1=usageLine1[0].trim();
                                String stringusagecolumn2=usageLine1[1].trim();
                                
                        	double usagecolumn4 = Double.parseDouble(stringusagecolumn4);
                        	double usagecolumn3 =Double.parseDouble(stringusagecolumn3);
                        	double usagecolumn1 = Double.parseDouble(stringusagecolumn1);
                        	double usagecolumn2 =Double.parseDouble(stringusagecolumn2);
                                
                 
                        	
if(stringinpathcolumn2.equals(stringusagecolumn3))
{
    
    Double executionTime = usagecolumn2 - usagecolumn1;
    Double deadLine=executionTime+inpathcolumn1+50;

br2.write(inpathcolumn1+","+usagecolumn4+ ","+executionTime+","+deadLine);
br2.write("\t\t ");
br2.write("\n");
}

inpathLine = br.readLine();
usageLine = br1.readLine();
}
}
}
catch (NumberFormatException e){
                                      e.printStackTrace();
                                }
                                  catch (FileNotFoundException e) {
                                                                  } catch (IOException e) {
                                                                  } finally {
                                                                     if (br != null) {
                                                                                     try {
                                                                                            br.close();
                                                                                                br1.close();
                                                                                          } catch (IOException e) {
                                                                                                    e.printStackTrace();

                                                                                            }
                                                     
                                                                                            }
                                                                                            br.close();
                                                                                            br1.close();
                                                                                            br2.close();
}                                                                                   
}
}
