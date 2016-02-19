import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 * Write a description of class CSV here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CSV
{
    public long jumlahkan (String namaBerkas) throws IOException {
        int total=0;
        int test=0;
        
        BufferedReader br = null;
        String line = null;
        
        try {
            br = new BufferedReader(new FileReader(namaBerkas));
            
            while((line = br.readLine()) != null){
                String[] value = line.split(",");
                for (String nilai : value){
                test=(Integer.parseInt(nilai));
            }
                total = total+test;
            }
        
        }finally{
            if(br != null)
            br.close();
        }
        return total;
    }
    
}