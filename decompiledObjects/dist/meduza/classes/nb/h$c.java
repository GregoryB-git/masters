package nb;

import eb.u;
import java.net.SocketAddress;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import x6.b;

public final class h$c
{
  public final String[] a;
  public final int b;
  
  public h$c(u paramu)
  {
    b.y(paramu, "eag");
    a = new String[a.size()];
    paramu = a.iterator();
    for (int i = 0; paramu.hasNext(); i++)
    {
      SocketAddress localSocketAddress = (SocketAddress)paramu.next();
      a[i] = localSocketAddress.toString();
    }
    Arrays.sort(a);
    b = Arrays.hashCode(a);
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof c)) {
      return false;
    }
    paramObject = (c)paramObject;
    if (b == b)
    {
      String[] arrayOfString = a;
      int i = arrayOfString.length;
      paramObject = a;
      if (i == paramObject.length) {
        return Arrays.equals(arrayOfString, (Object[])paramObject);
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return b;
  }
  
  public final String toString()
  {
    return Arrays.toString(a);
  }
}

/* Location:
 * Qualified Name:     nb.h.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */