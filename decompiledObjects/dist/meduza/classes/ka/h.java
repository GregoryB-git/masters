package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class h
  extends w<h, a>
  implements t0
{
  public static final int DATABASE_FIELD_NUMBER = 1;
  private static final h DEFAULT_INSTANCE;
  private static volatile b1<h> PARSER;
  public static final int TRANSACTION_FIELD_NUMBER = 3;
  public static final int WRITES_FIELD_NUMBER = 2;
  private String database_ = "";
  private ma.h transaction_ = ma.h.b;
  private a0.d<e0> writes_ = e1.d;
  
  static
  {
    h localh = new h();
    DEFAULT_INSTANCE = localh;
    w.D(h.class, localh);
  }
  
  public static void G(h paramh, String paramString)
  {
    paramh.getClass();
    paramString.getClass();
    database_ = paramString;
  }
  
  public static void H(h paramh, e0 parame0)
  {
    paramh.getClass();
    a0.d locald = writes_;
    if (!locald.g()) {
      writes_ = w.A(locald);
    }
    writes_.add(parame0);
  }
  
  public static h I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a J()
  {
    return (a)DEFAULT_INSTANCE.s();
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
      return new h();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\001\000\001Ȉ\002\033\003\n", new Object[] { "database_", "writes_", e0.class, "transaction_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<h, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */