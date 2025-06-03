package p1;

import ec.i;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import lc.h;
import sb.u;
import tb.g;
import va.a;

public final class e$d
{
  public final e.c a;
  public final int[] b;
  public final String[] c;
  public final Set<String> d;
  
  public e$d(e.c paramc, int[] paramArrayOfInt, String[] paramArrayOfString)
  {
    a = paramc;
    b = paramArrayOfInt;
    c = paramArrayOfString;
    int i = paramArrayOfString.length;
    int j = 1;
    if (i == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if ((i ^ 0x1) != 0)
    {
      paramc = Collections.singleton(paramArrayOfString[0]);
      i.d(paramc, "singleton(...)");
    }
    else
    {
      paramc = u.a;
    }
    d = paramc;
    if (paramArrayOfInt.length == paramArrayOfString.length) {
      i = j;
    } else {
      i = 0;
    }
    if (i != 0) {
      return;
    }
    throw new IllegalStateException("Check failed.".toString());
  }
  
  public final void a(Set<Integer> paramSet)
  {
    i.e(paramSet, "invalidatedTablesIds");
    Object localObject = b;
    int i = localObject.length;
    if (i != 0)
    {
      int j = 0;
      if (i != 1)
      {
        localObject = new g();
        int[] arrayOfInt = b;
        int k = arrayOfInt.length;
        for (i = 0; j < k; i++)
        {
          if (paramSet.contains(Integer.valueOf(arrayOfInt[j]))) {
            ((g)localObject).add(c[i]);
          }
          j++;
        }
        paramSet = a.a((g)localObject);
        break label126;
      }
      if (paramSet.contains(Integer.valueOf(localObject[0])))
      {
        paramSet = d;
        break label126;
      }
    }
    paramSet = u.a;
    label126:
    if ((paramSet.isEmpty() ^ true)) {
      a.a(paramSet);
    }
  }
  
  public final void b(String[] paramArrayOfString)
  {
    int i = c.length;
    if (i != 0)
    {
      int j = 0;
      if (i != 1)
      {
        g localg = new g();
        j = paramArrayOfString.length;
        for (i = 0; i < j; i++)
        {
          String str1 = paramArrayOfString[i];
          for (String str2 : c) {
            if (h.k0(str2, str1)) {
              localg.add(str2);
            }
          }
        }
        paramArrayOfString = a.a(localg);
        break label167;
      }
      ??? = paramArrayOfString.length;
      for (i = 0;; i++)
      {
        ??? = j;
        if (i >= ???) {
          break;
        }
        if (h.k0(paramArrayOfString[i], c[0]))
        {
          ??? = 1;
          break;
        }
      }
      if (??? != 0)
      {
        paramArrayOfString = d;
        break label167;
      }
    }
    paramArrayOfString = u.a;
    label167:
    if ((paramArrayOfString.isEmpty() ^ true)) {
      a.a(paramArrayOfString);
    }
  }
}

/* Location:
 * Qualified Name:     p1.e.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */