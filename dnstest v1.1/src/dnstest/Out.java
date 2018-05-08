package dnstest;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Out {
	public Out(){    
        try {    
              
            PrintStream print=new PrintStream("test.txt");  //写好输出位置文件；  
            System.setOut(print);    
        } catch (FileNotFoundException e) {    
            e.printStackTrace();    
        }    

		}
}
