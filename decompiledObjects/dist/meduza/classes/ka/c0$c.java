package ka;

import ma.b1;
import ma.f1;
import ma.h;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class c0$c
  extends w<c, a>
  implements t0
{
  private static final c DEFAULT_INSTANCE;
  private static volatile b1<c> PARSER;
  public static final int RETRY_TRANSACTION_FIELD_NUMBER = 1;
  private h retryTransaction_ = h.b;
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    w.D(c.class, localc);
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
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\000\000\001\n", new Object[] { "retryTransaction_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<c0.c, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.c0.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */