package b1;

import ec.i;

public enum k$a
{
  public static final a Companion = new a();
  
  static
  {
    a locala1 = new a("ON_CREATE", 0);
    ON_CREATE = locala1;
    a locala2 = new a("ON_START", 1);
    ON_START = locala2;
    a locala3 = new a("ON_RESUME", 2);
    ON_RESUME = locala3;
    a locala4 = new a("ON_PAUSE", 3);
    ON_PAUSE = locala4;
    a locala5 = new a("ON_STOP", 4);
    ON_STOP = locala5;
    a locala6 = new a("ON_DESTROY", 5);
    ON_DESTROY = locala6;
    a locala7 = new a("ON_ANY", 6);
    ON_ANY = locala7;
    $VALUES = new a[] { locala1, locala2, locala3, locala4, locala5, locala6, locala7 };
  }
  
  public k$a() {}
  
  public final k.b f()
  {
    switch (b.a[ordinal()])
    {
    default: 
      StringBuilder localStringBuilder = new StringBuilder();
      localStringBuilder.append(this);
      localStringBuilder.append(" has no target state");
      throw new IllegalArgumentException(localStringBuilder.toString());
    case 6: 
      return k.b.a;
    case 5: 
      return k.b.e;
    case 3: 
    case 4: 
      return k.b.d;
    }
    return k.b.c;
  }
  
  public static final class a
  {
    public static k.a a(k.b paramb)
    {
      i.e(paramb, "state");
      int i = paramb.ordinal();
      if (i != 2)
      {
        if (i != 3)
        {
          if (i != 4) {
            paramb = null;
          } else {
            paramb = k.a.ON_PAUSE;
          }
        }
        else {
          paramb = k.a.ON_STOP;
        }
      }
      else {
        paramb = k.a.ON_DESTROY;
      }
      return paramb;
    }
    
    public static k.a b(k.b paramb)
    {
      i.e(paramb, "state");
      int i = paramb.ordinal();
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            paramb = null;
          } else {
            paramb = k.a.ON_RESUME;
          }
        }
        else {
          paramb = k.a.ON_START;
        }
      }
      else {
        paramb = k.a.ON_CREATE;
      }
      return paramb;
    }
  }
}

/* Location:
 * Qualified Name:     b1.k.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */