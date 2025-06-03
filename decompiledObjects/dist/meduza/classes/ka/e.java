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

public final class e
  extends w<e, a>
  implements t0
{
  private static final e DEFAULT_INSTANCE;
  public static final int FOUND_FIELD_NUMBER = 1;
  public static final int MISSING_FIELD_NUMBER = 2;
  private static volatile b1<e> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 4;
  public static final int TRANSACTION_FIELD_NUMBER = 3;
  private int bitField0_;
  private n1 readTime_;
  private int resultCase_ = 0;
  private Object result_;
  private h transaction_ = h.b;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    w.D(e.class, locale);
  }
  
  public static e G()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final k H()
  {
    if (resultCase_ == 1) {
      return (k)result_;
    }
    return k.J();
  }
  
  public final String I()
  {
    String str;
    if (resultCase_ == 2) {
      str = (String)result_;
    } else {
      str = "";
    }
    return str;
  }
  
  public final n1 J()
  {
    n1 localn11 = readTime_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final int K()
  {
    int i = resultCase_;
    int j = 2;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          j = 0;
        }
      }
      else {
        j = 1;
      }
    }
    else {
      j = 3;
    }
    return j;
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
      return new f1(DEFAULT_INSTANCE, "\000\004\001\001\001\004\004\000\000\000\001<\000\002Ȼ\000\003\n\004ဉ\000", new Object[] { "result_", "resultCase_", "bitField0_", k.class, "transaction_", "readTime_" });
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
 * Qualified Name:     ka.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */