package s0;

public class b0
{
  public volatile o0 a;
  public volatile g b;
  
  static
  {
    n.a();
  }
  
  public final o0 a(o0 paramo0)
  {
    if (a == null) {}
    try
    {
      o0 localo0 = a;
      if (localo0 == null) {
        try
        {
          a = paramo0;
          b = g.b;
        }
        catch (y localy)
        {
          a = paramo0;
          b = g.b;
        }
      }
      return a;
    }
    finally {}
  }
  
  public final g b()
  {
    if (b != null) {
      return b;
    }
    try
    {
      if (b != null)
      {
        localObject1 = b;
        return (g)localObject1;
      }
      if (a == null) {
        localObject1 = g.b;
      } else {
        localObject1 = a.c();
      }
      b = ((g)localObject1);
      Object localObject1 = b;
      return (g)localObject1;
    }
    finally {}
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof b0)) {
      return false;
    }
    paramObject = (b0)paramObject;
    o0 localo01 = a;
    o0 localo02 = a;
    if ((localo01 == null) && (localo02 == null)) {
      return b().equals(((b0)paramObject).b());
    }
    if ((localo01 != null) && (localo02 != null)) {
      return localo01.equals(localo02);
    }
    if (localo01 != null) {
      return localo01.equals(((b0)paramObject).a(localo01.b()));
    }
    return a(localo02.b()).equals(localo02);
  }
  
  public int hashCode()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     s0.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */