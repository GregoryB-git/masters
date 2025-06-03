package g9;

import j9.g;
import java.util.TreeMap;
import x6.b;

public final class j
{
  public final TreeMap<j9.i, i> a = new TreeMap();
  
  public final void a(i parami)
  {
    i.a locala1 = i.a.a;
    i.a locala2 = i.a.d;
    j9.i locali = b.getKey();
    i locali1 = (i)a.get(locali);
    if (locali1 == null)
    {
      a.put(locali, parami);
      return;
    }
    i.a locala3 = a;
    i.a locala4 = a;
    i.a locala5 = i.a.b;
    if ((locala4 != locala5) && (locala3 == locala2))
    {
      a.put(locali, parami);
    }
    else
    {
      if ((locala4 == locala2) && (locala3 != locala1))
      {
        parami = new i(locala3, b);
      }
      else
      {
        locala2 = i.a.c;
        if ((locala4 == locala2) && (locala3 == locala2))
        {
          parami = new i(locala2, b);
        }
        else if ((locala4 == locala2) && (locala3 == locala5))
        {
          parami = new i(locala5, b);
        }
        else
        {
          if ((locala4 == locala1) && (locala3 == locala5))
          {
            a.remove(locali);
            break label289;
          }
          if ((locala4 == locala1) && (locala3 == locala2))
          {
            parami = new i(locala1, b);
            a.put(locali, parami);
            break label289;
          }
          if ((locala4 != locala5) || (locala3 != locala1)) {
            break label290;
          }
          parami = new i(locala2, b);
        }
      }
      a.put(locali, parami);
    }
    label289:
    return;
    label290:
    b.T("Unsupported combination of changes %s after %s", new Object[] { locala4, locala3 });
    throw null;
  }
}

/* Location:
 * Qualified Name:     g9.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */