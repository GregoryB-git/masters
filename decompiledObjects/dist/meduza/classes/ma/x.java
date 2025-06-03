package ma;

public final class x
  extends w<x, a>
  implements t0
{
  private static final x DEFAULT_INSTANCE;
  private static volatile b1<x> PARSER;
  public static final int VALUE_FIELD_NUMBER = 1;
  private int value_;
  
  static
  {
    x localx = new x();
    DEFAULT_INSTANCE = localx;
    w.D(x.class, localx);
  }
  
  public static void G(x paramx, int paramInt)
  {
    value_ = paramInt;
  }
  
  public static x H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a J()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final int I()
  {
    return value_;
  }
  
  public final Object t(w.f paramf)
  {
    switch (paramf.ordinal())
    {
    default: 
      throw new UnsupportedOperationException();
    case 6: 
      b1 localb1 = PARSER;
      paramf = localb1;
      if (localb1 == null) {
        try
        {
          localb1 = PARSER;
          paramf = localb1;
          if (localb1 == null)
          {
            paramf = new ma/w$b;
            paramf.<init>(DEFAULT_INSTANCE);
            PARSER = paramf;
          }
        }
        finally {}
      }
      return paramf;
    case 5: 
      return DEFAULT_INSTANCE;
    case 4: 
      return new a();
    case 3: 
      return new x();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\000\000\001\004", new Object[] { "value_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<x, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ma.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */