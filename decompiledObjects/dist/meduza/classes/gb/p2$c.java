package gb;

import eb.u;
import java.net.SocketAddress;
import java.util.Collections;
import java.util.List;
import o7.l0;

public final class p2$c
{
  public List<u> a;
  public int b;
  public int c;
  
  public p2$c(l0 paraml0)
  {
    if (paraml0 == null) {
      paraml0 = Collections.emptyList();
    }
    a = paraml0;
  }
  
  public final SocketAddress a()
  {
    if (c()) {
      return (SocketAddress)a.get(b)).a.get(c);
    }
    throw new IllegalStateException("Index is past the end of the address group list");
  }
  
  public final boolean b()
  {
    boolean bool1 = c();
    boolean bool2 = false;
    if (!bool1) {
      return false;
    }
    u localu = (u)a.get(b);
    int i = c + 1;
    c = i;
    if (i >= a.size())
    {
      i = b + 1;
      b = i;
      c = 0;
      if (i < a.size()) {
        bool2 = true;
      }
      return bool2;
    }
    return true;
  }
  
  public final boolean c()
  {
    boolean bool;
    if (b < a.size()) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean d(SocketAddress paramSocketAddress)
  {
    int i = 0;
    while (i < a.size())
    {
      int j = a.get(i)).a.indexOf(paramSocketAddress);
      if (j == -1)
      {
        i++;
      }
      else
      {
        b = i;
        c = j;
        return true;
      }
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     gb.p2.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */