
public class Sequences
{

 public static void main(String args[])
  {
    String str1 = "abbacd";
    System.out.println(remove_adjacent(str1));
 
    
  }
   
 public static String remove_credentials(String str, char last_removed)
  {
     
    if (str.length() == 0 || str.length() == 1)
      return str;
 
    
    if (str.charAt(0) == str.charAt(1))
    {
      last_removed = str.charAt(0);
      while (str.length() > 1 && str.charAt(0) == str.charAt(1))
        str = str.substring(1, str.length());
      str = str.substring(1, str.length());
      return remove_credentials(str, last_removed);
    }
 
    String str2 = remove_credentials(str.substring(
                  1,str.length()), last_removed);
 
   
    if (str2.length() != 0 &&
             str2.charAt(0) == str.charAt(0))
    {
      last_removed = str.charAt(0);
       
      return str2.substring(1,str2.length());
    }
 
    if (str2.length() == 0 && last_removed == str.charAt(0))
      return str2;
 
   
    return (str.charAt(0) + str2);
  }
 
  public static String remove_adjacent(String str) 
  {
    char last_removed = '\0';
    return remove_credentials(str, last_removed);      
  }
 

}
 

