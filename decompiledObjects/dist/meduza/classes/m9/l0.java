package m9;

import g9.i.a;
import j9.i;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import ma.h;
import t8.e;
import x6.b;

public final class l0
{
  public int a = 0;
  public final HashMap b = new HashMap();
  public boolean c = true;
  public h d = h.b;
  public boolean e = false;
  
  public final k0 a()
  {
    e locale1 = i.c;
    Iterator localIterator = b.entrySet().iterator();
    e locale2 = locale1;
    e locale3 = locale2;
    while (localIterator.hasNext())
    {
      Object localObject = (Map.Entry)localIterator.next();
      i locali = (i)((Map.Entry)localObject).getKey();
      localObject = (i.a)((Map.Entry)localObject).getValue();
      int i = ((Enum)localObject).ordinal();
      if (i != 0)
      {
        if (i != 1)
        {
          if (i == 2)
          {
            locale2 = locale2.a(locali);
          }
          else
          {
            b.T("Encountered invalid change type: %s", new Object[] { localObject });
            throw null;
          }
        }
        else {
          locale1 = locale1.a(locali);
        }
      }
      else {
        locale3 = locale3.a(locali);
      }
    }
    return new k0(d, e, locale1, locale2, locale3);
  }
}

/* Location:
 * Qualified Name:     m9.l0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */