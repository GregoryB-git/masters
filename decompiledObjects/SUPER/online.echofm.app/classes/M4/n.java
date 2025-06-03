package M4;

import java.net.URL;
import java.net.URLConnection;

public class n
{
  public final URL a;
  
  public n(URL paramURL)
  {
    a = paramURL;
  }
  
  public URLConnection a()
  {
    return a.openConnection();
  }
  
  public String toString()
  {
    return a.toString();
  }
}

/* Location:
 * Qualified Name:     M4.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */