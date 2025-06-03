package eb;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import n7.g;
import n7.g.a;
import x6.b;

public final class k0$b
{
  public final List<u> a;
  public final a b;
  public final Object[][] c;
  
  public k0$b(List paramList, a parama, Object[][] paramArrayOfObject)
  {
    b.y(paramList, "addresses are not set");
    a = paramList;
    b.y(parama, "attrs");
    b = parama;
    b.y(paramArrayOfObject, "customOptions");
    c = paramArrayOfObject;
  }
  
  public final Object a()
  {
    b localb = k0.c;
    for (int i = 0;; i++)
    {
      Object[][] arrayOfObject = c;
      if (i >= arrayOfObject.length) {
        break;
      }
      if (localb.equals(arrayOfObject[i][0])) {
        return c[i][1];
      }
    }
    return null;
  }
  
  public final String toString()
  {
    g.a locala = g.b(this);
    locala.a(a, "addrs");
    locala.a(b, "attrs");
    locala.a(Arrays.deepToString(c), "customOptions");
    return locala.toString();
  }
  
  public static final class a
  {
    public List<u> a;
    public a b = a.b;
    public Object[][] c = new Object[0][2];
    
    public final void a(k0.k paramk)
    {
      k0.b.b localb = k0.c;
      Object[][] arrayOfObject1;
      for (int i = 0;; i++)
      {
        arrayOfObject1 = c;
        if (i >= arrayOfObject1.length) {
          break;
        }
        if (localb.equals(arrayOfObject1[i][0])) {
          break label43;
        }
      }
      i = -1;
      label43:
      int j = i;
      if (i == -1)
      {
        arrayOfObject1 = new Object[c.length + 1][2];
        Object[][] arrayOfObject2 = c;
        System.arraycopy(arrayOfObject2, 0, arrayOfObject1, 0, arrayOfObject2.length);
        c = arrayOfObject1;
        j = arrayOfObject1.length - 1;
      }
      c[j] = { localb, paramk };
    }
    
    public final void b(List paramList)
    {
      b.s("addrs is empty", paramList.isEmpty() ^ true);
      a = Collections.unmodifiableList(new ArrayList(paramList));
    }
  }
  
  public static final class b<T>
  {
    public final String a = "internal:health-check-consumer-listener";
    
    public final String toString()
    {
      return a;
    }
  }
}

/* Location:
 * Qualified Name:     eb.k0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */