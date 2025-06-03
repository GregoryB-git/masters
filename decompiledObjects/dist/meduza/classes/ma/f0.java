package ma;

public class f0
{
  public volatile s0 a;
  public volatile h b;
  
  static
  {
    o.a();
  }
  
  public final s0 a(s0 params0)
  {
    if (a == null) {}
    try
    {
      s0 locals0 = a;
      if (locals0 == null) {
        try
        {
          a = params0;
          b = h.b;
        }
        catch (b0 localb0)
        {
          a = params0;
          b = h.b;
        }
      }
      return a;
    }
    finally {}
  }
  
  public final h b()
  {
    if (b != null) {
      return b;
    }
    try
    {
      if (b != null)
      {
        localObject1 = b;
        return (h)localObject1;
      }
      if (a == null) {
        localObject1 = h.b;
      } else {
        localObject1 = a.c();
      }
      b = ((h)localObject1);
      Object localObject1 = b;
      return (h)localObject1;
    }
    finally {}
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof f0)) {
      return false;
    }
    paramObject = (f0)paramObject;
    s0 locals01 = a;
    s0 locals02 = a;
    if ((locals01 == null) && (locals02 == null)) {
      return b().equals(((f0)paramObject).b());
    }
    if ((locals01 != null) && (locals02 != null)) {
      return locals01.equals(locals02);
    }
    if (locals01 != null) {
      return locals01.equals(((f0)paramObject).a(locals01.b()));
    }
    return a(locals02.b()).equals(locals02);
  }
  
  public int hashCode()
  {
    return 1;
  }
}

/* Location:
 * Qualified Name:     ma.f0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */