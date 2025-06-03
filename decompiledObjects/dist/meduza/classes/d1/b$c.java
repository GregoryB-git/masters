package d1;

import b1.o0;
import b1.q0.b;
import b1.x;
import r.i;

public final class b$c
  extends o0
{
  public static final a f = new a();
  public i<b.a> d = new i();
  public boolean e = false;
  
  public final void b()
  {
    int i = d.c;
    int j = 0;
    while (j < i)
    {
      localObject1 = (b.a)d.b[j];
      c.a();
      c.d = true;
      localObject2 = e;
      if (localObject2 != null)
      {
        ((b.a)localObject1).removeObserver((x)localObject2);
        if (b) {
          a.getClass();
        }
      }
      e1.b localb = c;
      localObject2 = b;
      if (localObject2 != null)
      {
        if (localObject2 == localObject1)
        {
          b = null;
          e = true;
          c = false;
          d = false;
          f = false;
          j++;
        }
        else
        {
          throw new IllegalArgumentException("Attempting to unregister the wrong listener");
        }
      }
      else {
        throw new IllegalStateException("No listener register");
      }
    }
    Object localObject1 = d;
    i = c;
    Object localObject2 = b;
    for (j = 0; j < i; j++) {
      localObject2[j] = null;
    }
    c = 0;
  }
  
  public static final class a
    implements q0.b
  {
    public final <T extends o0> T a(Class<T> paramClass)
    {
      return new b.c();
    }
    
    public final o0 b(Class paramClass, c1.b paramb)
    {
      return a(paramClass);
    }
  }
}

/* Location:
 * Qualified Name:     d1.b.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */