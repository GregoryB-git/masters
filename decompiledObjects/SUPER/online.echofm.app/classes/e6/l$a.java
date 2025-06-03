package e6;

import h6.a;
import java.io.BufferedReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.Intrinsics;

public final class l$a
  implements Iterator, a
{
  public String o;
  public boolean p;
  
  public l$a(l paraml) {}
  
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

/* Location:
 * Qualified Name:     e6.l.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */