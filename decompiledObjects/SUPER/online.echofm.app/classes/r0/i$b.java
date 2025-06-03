package r0;

import g0.a;
import java.io.BufferedReader;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

public class i$b
{
  public final BufferedReader a;
  public final Queue b;
  public String c;
  
  public i$b(Queue paramQueue, BufferedReader paramBufferedReader)
  {
    b = paramQueue;
    a = paramBufferedReader;
  }
  
  public boolean a()
  {
    if (c != null) {
      return true;
    }
    if (!b.isEmpty())
    {
      c = ((String)a.e((String)b.poll()));
      return true;
    }
    String str;
    do
    {
      str = a.readLine();
      c = str;
      if (str == null) {
        break;
      }
      str = str.trim();
      c = str;
    } while (str.isEmpty());
    return true;
    return false;
  }
  
  public String b()
  {
    if (a())
    {
      String str = c;
      c = null;
      return str;
    }
    throw new NoSuchElementException();
  }
}

/* Location:
 * Qualified Name:     r0.i.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */