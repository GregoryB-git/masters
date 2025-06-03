package ka;

import ma.b1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.t0;
import ma.v1;
import ma.v1.a;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class s
  extends w<s, a>
  implements t0
{
  public static final int ADD_TARGET_FIELD_NUMBER = 2;
  public static final int DATABASE_FIELD_NUMBER = 1;
  private static final s DEFAULT_INSTANCE;
  public static final int LABELS_FIELD_NUMBER = 4;
  private static volatile b1<s> PARSER;
  public static final int REMOVE_TARGET_FIELD_NUMBER = 3;
  private String database_ = "";
  private m0<String, String> labels_ = m0.b;
  private int targetChangeCase_ = 0;
  private Object targetChange_;
  
  static
  {
    s locals = new s();
    DEFAULT_INSTANCE = locals;
    w.D(s.class, locals);
  }
  
  public static m0 G(s params)
  {
    m0 localm0 = labels_;
    if (!a) {
      labels_ = localm0.d();
    }
    return labels_;
  }
  
  public static void H(s params, String paramString)
  {
    params.getClass();
    paramString.getClass();
    database_ = paramString;
  }
  
  public static void I(s params, a0 parama0)
  {
    params.getClass();
    targetChange_ = parama0;
    targetChangeCase_ = 2;
  }
  
  public static void J(s params, int paramInt)
  {
    targetChangeCase_ = 3;
    targetChange_ = Integer.valueOf(paramInt);
  }
  
  public static s K()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
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
      return new s();
    case 2: 
      paramf = b.a;
      return new f1(DEFAULT_INSTANCE, "\000\004\001\000\001\004\004\001\000\000\001Ȉ\002<\000\0037\000\0042", new Object[] { "targetChange_", "targetChangeCase_", "database_", a0.class, "labels_", paramf });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<s, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
  {
    public static final l0<String, String> a;
    
    static
    {
      v1.a locala = v1.c;
      a = new l0(locala, locala, "");
    }
  }
}

/* Location:
 * Qualified Name:     ka.s
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */