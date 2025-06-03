package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import ma.x;

public final class a0
  extends w<a0, a>
  implements t0
{
  private static final a0 DEFAULT_INSTANCE;
  public static final int DOCUMENTS_FIELD_NUMBER = 3;
  public static final int EXPECTED_COUNT_FIELD_NUMBER = 12;
  public static final int ONCE_FIELD_NUMBER = 6;
  private static volatile b1<a0> PARSER;
  public static final int QUERY_FIELD_NUMBER = 2;
  public static final int READ_TIME_FIELD_NUMBER = 11;
  public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
  public static final int TARGET_ID_FIELD_NUMBER = 5;
  private int bitField0_;
  private x expectedCount_;
  private boolean once_;
  private int resumeTypeCase_ = 0;
  private Object resumeType_;
  private int targetId_;
  private int targetTypeCase_ = 0;
  private Object targetType_;
  
  static
  {
    a0 locala0 = new a0();
    DEFAULT_INSTANCE = locala0;
    w.D(a0.class, locala0);
  }
  
  public static void G(a0 parama0, c paramc)
  {
    parama0.getClass();
    targetType_ = paramc;
    targetTypeCase_ = 2;
  }
  
  public static void H(a0 parama0, b paramb)
  {
    parama0.getClass();
    targetType_ = paramb;
    targetTypeCase_ = 3;
  }
  
  public static void I(a0 parama0, h paramh)
  {
    parama0.getClass();
    paramh.getClass();
    resumeTypeCase_ = 4;
    resumeType_ = paramh;
  }
  
  public static void J(a0 parama0, n1 paramn1)
  {
    parama0.getClass();
    resumeType_ = paramn1;
    resumeTypeCase_ = 11;
  }
  
  public static void K(a0 parama0, int paramInt)
  {
    targetId_ = paramInt;
  }
  
  public static void L(a0 parama0, x paramx)
  {
    parama0.getClass();
    expectedCount_ = paramx;
    bitField0_ |= 0x1;
  }
  
  public static a M()
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
      return new a0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\007\002\001\002\f\007\000\000\000\002<\000\003<\000\004=\001\005\004\006\007\013<\001\fဉ\000", new Object[] { "targetType_", "targetTypeCase_", "resumeType_", "resumeTypeCase_", "bitField0_", c.class, b.class, "targetId_", "once_", n1.class, "expectedCount_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<a0, a>
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
    public static final int DOCUMENTS_FIELD_NUMBER = 2;
    private static volatile b1<b> PARSER;
    private a0.d<String> documents_ = e1.d;
    
    static
    {
      b localb = new b();
      DEFAULT_INSTANCE = localb;
      w.D(b.class, localb);
    }
    
    public static void G(b paramb, String paramString)
    {
      paramb.getClass();
      paramString.getClass();
      a0.d locald = documents_;
      if (!locald.g()) {
        documents_ = w.A(locald);
      }
      documents_.add(paramString);
    }
    
    public static b H()
    {
      return DEFAULT_INSTANCE;
    }
    
    public static a K()
    {
      return (a)DEFAULT_INSTANCE.s();
    }
    
    public final String I()
    {
      return (String)documents_.get(0);
    }
    
    public final int J()
    {
      return documents_.size();
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
        return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\000\001\000\002Ț", new Object[] { "documents_" });
      case 1: 
        return null;
      }
      return Byte.valueOf((byte)1);
    }
    
    public static final class a
      extends w.a<a0.b, a>
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
}

/* Location:
 * Qualified Name:     ka.a0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */