package f5;

import java.io.BufferedReader;
import java.util.ArrayDeque;
import java.util.Collection;
import java.util.NoSuchElementException;
import java.util.Queue;

public final class h$b
{
  public final BufferedReader a;
  public final Queue<String> b;
  public String c;
  
  public h$b(ArrayDeque paramArrayDeque, BufferedReader paramBufferedReader)
  {
    b = paramArrayDeque;
    a = paramBufferedReader;
  }
  
  public final boolean a()
  {
    if (c != null) {
      return true;
    }
    String str;
    if (!b.isEmpty())
    {
      str = (String)b.poll();
      str.getClass();
      c = str;
      return true;
    }
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
  
  public final String b()
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
 * Qualified Name:     f5.h.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */