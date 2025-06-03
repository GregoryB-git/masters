package ma;

public final class y
  extends w<y, a>
  implements t0
{
  private static final y DEFAULT_INSTANCE;
  private static volatile b1<y> PARSER;
  public static final int VALUE_FIELD_NUMBER = 1;
  private long value_;
  
  static
  {
    y localy = new y();
    DEFAULT_INSTANCE = localy;
    w.D(y.class, localy);
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
      return new y();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\000\000\001\002", new Object[] { "value_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<y, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ma.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */