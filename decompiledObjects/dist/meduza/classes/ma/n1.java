package ma;

public final class n1
  extends w<n1, a>
  implements t0
{
  private static final n1 DEFAULT_INSTANCE;
  public static final int NANOS_FIELD_NUMBER = 2;
  private static volatile b1<n1> PARSER;
  public static final int SECONDS_FIELD_NUMBER = 1;
  private int nanos_;
  private long seconds_;
  
  static
  {
    n1 localn1 = new n1();
    DEFAULT_INSTANCE = localn1;
    w.D(n1.class, localn1);
  }
  
  public static void G(n1 paramn1, long paramLong)
  {
    seconds_ = paramLong;
  }
  
  public static void H(n1 paramn1, int paramInt)
  {
    nanos_ = paramInt;
  }
  
  public static n1 I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final int J()
  {
    return nanos_;
  }
  
  public final long K()
  {
    return seconds_;
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
      return new n1();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\002\002\004", new Object[] { "seconds_", "nanos_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<n1, a>
    implements t0
  {
    public a()
    {
      super();
    }
    
    public final void p(long paramLong)
    {
      m();
      n1.G((n1)b, paramLong);
    }
  }
}

/* Location:
 * Qualified Name:     ma.n1
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */