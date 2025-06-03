package j9;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import ma.a0;
import ma.h;
import ma.h.h;
import x6.b;

public abstract class e<B extends e<B>>
  implements Comparable<B>
{
  public final List<String> a;
  
  public e(List<String> paramList)
  {
    a = paramList;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool = true;
    if (this == paramObject) {
      return true;
    }
    if ((!(paramObject instanceof e)) || (i((e)paramObject) != 0)) {
      bool = false;
    }
    return bool;
  }
  
  public final B f(B paramB)
  {
    ArrayList localArrayList = new ArrayList(a);
    localArrayList.addAll(a);
    return l(localArrayList);
  }
  
  public final B g(String paramString)
  {
    ArrayList localArrayList = new ArrayList(a);
    localArrayList.add(paramString);
    return l(localArrayList);
  }
  
  public abstract String h();
  
  public final int hashCode()
  {
    int i = getClass().hashCode();
    return a.hashCode() + (i + 37) * 37;
  }
  
  public final int i(B paramB)
  {
    int i = q();
    int j = paramB.q();
    for (int k = 0; (k < i) && (k < j); k++)
    {
      String str1 = n(k);
      String str2 = paramB.n(k);
      boolean bool = str1.startsWith("__id");
      int m = 1;
      int n;
      if ((bool) && (str1.endsWith("__"))) {
        n = 1;
      } else {
        n = 0;
      }
      int i1;
      if ((str2.startsWith("__id")) && (str2.endsWith("__"))) {
        i1 = 1;
      } else {
        i1 = 0;
      }
      if ((n != 0) && (i1 == 0))
      {
        n = -1;
      }
      else if ((n == 0) && (i1 != 0))
      {
        n = m;
      }
      else if ((n != 0) && (i1 != 0))
      {
        n = Long.compare(Long.parseLong(str1.substring(4, str1.length() - 2)), Long.parseLong(str2.substring(4, str2.length() - 2)));
      }
      else
      {
        Object localObject = n9.o.a;
        localObject = h.b;
        localObject = a0.a;
        n = n9.o.c(new h.h(str1.getBytes((Charset)localObject)), new h.h(str2.getBytes((Charset)localObject)));
      }
      if (n != 0) {
        return n;
      }
    }
    return n9.o.d(i, j);
  }
  
  public abstract B l(List<String> paramList);
  
  public final String m()
  {
    return (String)a.get(q() - 1);
  }
  
  public final String n(int paramInt)
  {
    return (String)a.get(paramInt);
  }
  
  public final boolean o()
  {
    boolean bool;
    if (q() == 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final boolean p(B paramB)
  {
    if (q() > paramB.q()) {
      return false;
    }
    for (int i = 0; i < q(); i++) {
      if (!n(i).equals(paramB.n(i))) {
        return false;
      }
    }
    return true;
  }
  
  public final int q()
  {
    return a.size();
  }
  
  public final e r()
  {
    int i = q();
    boolean bool;
    if (i >= 5) {
      bool = true;
    } else {
      bool = false;
    }
    b.Z("Can't call popFirst with count > length() (%d > %d)", bool, new Object[] { Integer.valueOf(5), Integer.valueOf(i) });
    return new o(a.subList(5, i));
  }
  
  public final B s()
  {
    return l(a.subList(0, q() - 1));
  }
  
  public final String toString()
  {
    return h();
  }
}

/* Location:
 * Qualified Name:     j9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */