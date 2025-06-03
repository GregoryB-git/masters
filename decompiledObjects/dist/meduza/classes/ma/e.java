package ma;

public final class e
  extends w<e, a>
  implements t0
{
  private static final e DEFAULT_INSTANCE;
  private static volatile b1<e> PARSER;
  public static final int TYPE_URL_FIELD_NUMBER = 1;
  public static final int VALUE_FIELD_NUMBER = 2;
  private String typeUrl_ = "";
  private h value_ = h.b;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    w.D(e.class, locale);
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
      return new e();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001Ȉ\002\n", new Object[] { "typeUrl_", "value_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<e, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ma.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */