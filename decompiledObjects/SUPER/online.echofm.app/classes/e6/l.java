package e6;

import h6.a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;
import n6.b;

public final class l
  implements b
{
  public final BufferedReader a;
  
  public l(BufferedReader paramBufferedReader)
  {
    a = paramBufferedReader;
  }
  
  public Iterator iterator()
  {
    return new a(this);
  }
  
  public static final class a
    implements Iterator, a
  {
    public String o;
    public boolean p;
    
    public a(l paraml) {}
    
    public String b()
    {
      if (hasNext())
      {
        String str = o;
        o = null;
        Intrinsics.b(str);
        return str;
      }
      throw new NoSuchElementException();
    }
    
    public boolean hasNext()
    {
      String str = o;
      boolean bool = true;
      if ((str == null) && (!p))
      {
        str = l.a(q).readLine();
        o = str;
        if (str == null) {
          p = true;
        }
      }
      if (o == null) {
        bool = false;
      }
      return bool;
    }
    
    public void remove()
    {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
  }
}

/* Location:
 * Qualified Name:     e6.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */