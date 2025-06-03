package ka;

import ma.b1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class x
  extends w<x, a>
  implements t0
{
  private static final x DEFAULT_INSTANCE;
  private static volatile b1<x> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 3;
  public static final int RESULT_FIELD_NUMBER = 1;
  public static final int TRANSACTION_FIELD_NUMBER = 2;
  private int bitField0_;
  private n1 readTime_;
  private a result_;
  private h transaction_ = h.b;
  
  static
  {
    x localx = new x();
    DEFAULT_INSTANCE = localx;
    w.D(x.class, localx);
  }
  
  public static x G()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final a H()
  {
    a locala1 = result_;
    a locala2 = locala1;
    if (locala1 == null) {
      locala2 = a.H();
    }
    return locala2;
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
      return new f1(DEFAULT_INSTANCE, "\000\003\000\001\001\003\003\000\000\000\001ဉ\000\002\n\003ဉ\001", new Object[] { "bitField0_", "result_", "transaction_", "readTime_" });
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
 * Qualified Name:     ka.x
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */