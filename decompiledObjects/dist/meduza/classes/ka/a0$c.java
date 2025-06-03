package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class a0$c
  extends w<c, a>
  implements t0
{
  private static final c DEFAULT_INSTANCE;
  public static final int PARENT_FIELD_NUMBER = 1;
  private static volatile b1<c> PARSER;
  public static final int STRUCTURED_QUERY_FIELD_NUMBER = 2;
  private String parent_ = "";
  private int queryTypeCase_ = 0;
  private Object queryType_;
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    w.D(c.class, localc);
  }
  
  public static void F(c paramc, z paramz)
  {
    paramc.getClass();
    queryType_ = paramz;
    queryTypeCase_ = 2;
  }
  
  public static void H(c paramc, String paramString)
  {
    paramc.getClass();
    paramString.getClass();
    parent_ = paramString;
  }
  
  public static c I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final String J()
  {
    return parent_;
  }
  
  public final z K()
  {
    if (queryTypeCase_ == 2) {
      return (z)queryType_;
    }
    return z.M();
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
      return new c();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\001\000\001\002\002\000\000\000\001Ȉ\002<\000", new Object[] { "queryType_", "queryTypeCase_", "parent_", z.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<a0.c, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.a0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */