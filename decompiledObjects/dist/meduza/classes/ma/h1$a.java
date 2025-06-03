package ma;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class h1$a
  extends h.b
{
  public final h1.c a;
  public h.f b;
  
  public h1$a(h1 paramh1)
  {
    a = new h1.c(paramh1);
    b = a();
  }
  
  public final h.a a()
  {
    h.a locala;
    if (a.hasNext()) {
      locala = new h.a(a.a());
    } else {
      locala = null;
    }
    return locala;
  }
  
  public final byte f()
  {
    h.f localf = b;
    if (localf != null)
    {
      byte b1 = localf.f();
      if (!b.hasNext()) {
        b = a();
      }
      return b1;
    }
    throw new NoSuchElementException();
  }
  
  public final boolean hasNext()
  {
    boolean bool;
    if (b != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
}

/* Location:
 * Qualified Name:     ma.h1.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */