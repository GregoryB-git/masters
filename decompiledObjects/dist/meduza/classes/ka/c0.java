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

public final class c0
  extends w<c0, a>
  implements t0
{
  private static final c0 DEFAULT_INSTANCE;
  private static volatile b1<c0> PARSER;
  public static final int READ_ONLY_FIELD_NUMBER = 2;
  public static final int READ_WRITE_FIELD_NUMBER = 3;
  private int modeCase_ = 0;
  private Object mode_;
  
  static
  {
    c0 localc0 = new c0();
    DEFAULT_INSTANCE = localc0;
    w.D(c0.class, localc0);
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
      return new c0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\001\000\002\003\002\000\000\000\002<\000\003<\000", new Object[] { "mode_", "modeCase_", b.class, c.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<c0, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
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
  
  public static final class c
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
}

/* Location:
 * Qualified Name:     ka.c0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */