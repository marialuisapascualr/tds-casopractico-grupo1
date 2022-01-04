package umu.tds.Test1GitProject;

import java.awt.List;
import java.util.Arrays;
import java.util.Collection;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	List lista = (List) Arrays.asList("uno", "dos", "tres");
    	
    	int suma = (Integer) ((Collection<String>) lista).stream()
    			.map(s -> s.length())
    			.reduce(0,(s,ac) -> ac + s);
    	System.out.println(suma);
    }
}
