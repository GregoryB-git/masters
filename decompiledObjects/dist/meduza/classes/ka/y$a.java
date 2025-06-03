package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import ma.y;

public final class y$a
  extends w<a, b>
  implements t0
{
  public static final int ALIAS_FIELD_NUMBER = 7;
  public static final int AVG_FIELD_NUMBER = 3;
  public static final int COUNT_FIELD_NUMBER = 1;
  private static final a DEFAULT_INSTANCE;
  private static volatile b1<a> PARSER;
  public static final int SUM_FIELD_NUMBER = 2;
  private String alias_ = "";
  private int operatorCase_ = 0;
  private Object operator_;
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    w.D(a.class, locala);
  }
  
  public static void G(a parama, c paramc)
  {
    parama.getClass();
    paramc.getClass();
    operator_ = paramc;
    operatorCase_ = 1;
  }
  
  public static void H(a parama, d paramd)
  {
    parama.getClass();
    operator_ = paramd;
    operatorCase_ = 2;
  }
  
  public static void I(a parama, a parama1)
  {
    parama.getClass();
    operator_ = parama1;
    operatorCase_ = 3;
  }
  
  public static void J(a parama, String paramString)
  {
    parama.getClass();
    paramString.getClass();
    alias_ = paramString;
  }
  
  public static b K()
  {
    return (b)DEFAULT_INSTANCE.s();
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
      return new b();
    case 3: 
      return new a();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\004\001\000\001\007\004\000\000\000\001<\000\002<\000\003<\000\007Ȉ", new Object[] { "operator_", "operatorCase_", c.class, d.class, a.class, "alias_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w<a, a>
    implements t0
  {
    private static final a DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile b1<a> PARSER;
    private int bitField0_;
    private z.f field_;
    
    static
    {
      a locala = new a();
      DEFAULT_INSTANCE = locala;
      w.D(a.class, locala);
    }
    
    public static void G(a parama, z.f paramf)
    {
      parama.getClass();
      field_ = paramf;
      bitField0_ |= 0x1;
    }
    
    public static a H()
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
        return new a();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\001\000\001\001\001\001\000\000\000\001ဉ\000", new Object[] { "bitField0_", "field_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<y.a.a, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
  }
  
  public static final class b
    extends w.a<y.a, b>
    implements t0
  {
    public b()
    {
      super();
    }
  }
  
  public static final class c
    extends w<c, a>
    implements t0
  {
    private static final c DEFAULT_INSTANCE;
    private static volatile b1<c> PARSER;
    public static final int UP_TO_FIELD_NUMBER = 1;
    private int bitField0_;
    private y upTo_;
    
    static
    {
      c localc = new c();
      DEFAULT_INSTANCE = localc;
      w.D(c.class, localc);
    }
    
    public static c G()
    {
      return DEFAULT_INSTANCE;
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
        return new f1(DEFAULT_INSTANCE, "\000\001\000\001\001\001\001\000\000\000\001ဉ\000", new Object[] { "bitField0_", "upTo_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<y.a.c, a>
      implements t0
    {
      public a()
      {
        super();
      }
    }
  }
  
  public static final class d
    extends w<d, a>
    implements t0
  {
    private static final d DEFAULT_INSTANCE;
    public static final int FIELD_FIELD_NUMBER = 1;
    private static volatile b1<d> PARSER;
    private int bitField0_;
    private z.f field_;
    
    static
    {
      d locald = new d();
      DEFAULT_INSTANCE = locald;
      w.D(d.class, locald);
    }
    
    public static void G(d paramd, z.f paramf)
    {
      paramd.getClass();
      field_ = paramf;
      bitField0_ |= 0x1;
    }
    
    public static a H()
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
        return new d();
      case 2: 
        return new f1(DEFAULT_INSTANCE, "\000\001\000\001\001\001\001\000\000\000\001ဉ\000", new Object[] { "bitField0_", "field_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<y.a.d, a>
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
 * Qualified Name:     ka.y.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */