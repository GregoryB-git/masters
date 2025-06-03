package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class d
  extends w<d, a>
  implements t0
{
  public static final int DATABASE_FIELD_NUMBER = 1;
  private static final d DEFAULT_INSTANCE;
  public static final int DOCUMENTS_FIELD_NUMBER = 2;
  public static final int MASK_FIELD_NUMBER = 3;
  public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
  private static volatile b1<d> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 7;
  public static final int TRANSACTION_FIELD_NUMBER = 4;
  private int bitField0_;
  private int consistencySelectorCase_ = 0;
  private Object consistencySelector_;
  private String database_ = "";
  private a0.d<String> documents_ = e1.d;
  private n mask_;
  
  static
  {
    d locald = new d();
    DEFAULT_INSTANCE = locald;
    w.D(d.class, locald);
  }
  
  public static void G(d paramd, String paramString)
  {
    paramd.getClass();
    paramString.getClass();
    database_ = paramString;
  }
  
  public static void H(d paramd, String paramString)
  {
    paramd.getClass();
    paramString.getClass();
    a0.d locald = documents_;
    if (!locald.g()) {
      documents_ = w.A(locald);
    }
    documents_.add(paramString);
  }
  
  public static d I()
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
      return new d();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\006\001\001\001\007\006\000\001\000\001Ȉ\002Ț\003ဉ\000\004=\000\005<\000\007<\000", new Object[] { "consistencySelector_", "consistencySelectorCase_", "bitField0_", "database_", "documents_", "mask_", c0.class, n1.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<d, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */