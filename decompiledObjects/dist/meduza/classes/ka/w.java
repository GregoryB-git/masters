package ka;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w.b;
import ma.w.f;

public final class w
  extends ma.w<w, a>
  implements t0
{
  private static final w DEFAULT_INSTANCE;
  public static final int NEW_TRANSACTION_FIELD_NUMBER = 5;
  public static final int PARENT_FIELD_NUMBER = 1;
  private static volatile b1<w> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 6;
  public static final int STRUCTURED_AGGREGATION_QUERY_FIELD_NUMBER = 2;
  public static final int TRANSACTION_FIELD_NUMBER = 4;
  private int consistencySelectorCase_ = 0;
  private Object consistencySelector_;
  private String parent_ = "";
  private int queryTypeCase_ = 0;
  private Object queryType_;
  
  static
  {
    w localw = new w();
    DEFAULT_INSTANCE = localw;
    ma.w.D(w.class, localw);
  }
  
  public static void G(w paramw, String paramString)
  {
    paramw.getClass();
    paramString.getClass();
    parent_ = paramString;
  }
  
  public static void H(w paramw, y paramy)
  {
    paramw.getClass();
    queryType_ = paramy;
    queryTypeCase_ = 2;
  }
  
  public static w I()
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
      return new w();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\005\002\000\001\006\005\000\000\000\001Ȉ\002<\000\004=\001\005<\001\006<\001", new Object[] { "queryType_", "queryTypeCase_", "consistencySelector_", "consistencySelectorCase_", "parent_", y.class, c0.class, n1.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends ma.w.a<w, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */