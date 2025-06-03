package ka;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class c0$b
  extends w<b, a>
  implements t0
{
  private static final b DEFAULT_INSTANCE;
  private static volatile b1<b> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 2;
  private int consistencySelectorCase_ = 0;
  private Object consistencySelector_;
  
  static
  {
    b localb = new b();
    DEFAULT_INSTANCE = localb;
    w.D(b.class, localb);
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
      return new b();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\001\000\002\002\001\000\000\000\002<\000", new Object[] { "consistencySelector_", "consistencySelectorCase_", n1.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<c0.b, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.c0.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */