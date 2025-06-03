package d8;

import java.util.Collections;
import java.util.HashSet;

public final class b$a<T>
{
  public String a = null;
  public final HashSet b;
  public final HashSet c;
  public int d;
  public int e;
  public e<T> f;
  public final HashSet g;
  
  public b$a(t paramt, t[] paramArrayOft)
  {
    HashSet localHashSet = new HashSet();
    b = localHashSet;
    c = new HashSet();
    int i = 0;
    d = 0;
    e = 0;
    g = new HashSet();
    localHashSet.add(paramt);
    int j = paramArrayOft.length;
    while (i < j) {
      if (paramArrayOft[i] != null) {
        i++;
      } else {
        throw new NullPointerException("Null interface");
      }
    }
    Collections.addAll(b, paramArrayOft);
  }
  
  public b$a(Class paramClass, Class[] paramArrayOfClass)
  {
    HashSet localHashSet = new HashSet();
    b = localHashSet;
    c = new HashSet();
    int i = 0;
    d = 0;
    e = 0;
    g = new HashSet();
    localHashSet.add(t.a(paramClass));
    int j = paramArrayOfClass.length;
    while (i < j)
    {
      paramClass = paramArrayOfClass[i];
      if (paramClass != null)
      {
        b.add(t.a(paramClass));
        i++;
      }
      else
      {
        throw new NullPointerException("Null interface");
      }
    }
  }
  
  public final void a(k paramk)
  {
    t localt = a;
    if ((b.contains(localt) ^ true))
    {
      c.add(paramk);
      return;
    }
    throw new IllegalArgumentException("Components are not allowed to depend on interfaces they themselves provide.");
  }
  
  public final b<T> b()
  {
    int i;
    if (f != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0) {
      return new b(a, new HashSet(b), new HashSet(c), d, e, f, g);
    }
    throw new IllegalStateException("Missing required property: factory.");
  }
  
  public final void c(int paramInt)
  {
    int i;
    if (d == 0) {
      i = 1;
    } else {
      i = 0;
    }
    if (i != 0)
    {
      d = paramInt;
      return;
    }
    throw new IllegalStateException("Instantiation type has already been set.");
  }
}

/* Location:
 * Qualified Name:     d8.b.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */