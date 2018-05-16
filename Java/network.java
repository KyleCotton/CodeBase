//This Code is currently not working.
import java.net.*;
class Test
{
 public static void main(String[] args)
 {
  InetAddress address = InetAddress.getLocalHost();
  System.out.println(address);
  address = InetAddress.getByName("www.studytonight.com");
  System.out.println(address);
  InetAddress sw[] = InetAddress.getAllByName("www.google.com");
  for(int i=0; i< sw.length; i++)
  {
   System.out.println(sw[i]);
  }
 }
}
