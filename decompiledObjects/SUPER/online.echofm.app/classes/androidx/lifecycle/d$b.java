package androidx.lifecycle;

public enum d$b
{
  static
  {
    b localb1 = new b("ON_CREATE", 0);
    ON_CREATE = localb1;
    b localb2 = new b("ON_START", 1);
    ON_START = localb2;
    b localb3 = new b("ON_RESUME", 2);
    ON_RESUME = localb3;
    b localb4 = new b("ON_PAUSE", 3);
    ON_PAUSE = localb4;
    b localb5 = new b("ON_STOP", 4);
    ON_STOP = localb5;
    b localb6 = new b("ON_DESTROY", 5);
    ON_DESTROY = localb6;
    b localb7 = new b("ON_ANY", 6);
    ON_ANY = localb7;
    $VALUES = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7 };
  }
  
  public static b c(d.c paramc)
  {
    int i = d.a.a[paramc.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 3) {
          return null;
        }
        return ON_PAUSE;
      }
      return ON_STOP;
    }
    return ON_DESTROY;
  }
  
  public static b h(d.c paramc)
  {
    int i = d.a.a[paramc.ordinal()];
    if (i != 1)
    {
      if (i != 2)
      {
        if (i != 5) {
          return null;
        }
        return ON_CREATE;
      }
      return ON_RESUME;
    }
    return ON_START;
  }
  
  public d.c e()
  {
    switch (d.a.b[ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this);
      localStringBuilder.append(" has no target state");
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 6: 
      return d.c.o;
    case 5: 
      return d.c.s;
    case 3: 
    case 4: 
      return d.c.r;
    }
    return d.c.q;
  }
}

/* Location:
 * Qualified Name:     androidx.lifecycle.d.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */