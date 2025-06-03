package ka;

import ma.a0.a;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class p$b
  extends w<b, a>
  implements t0
{
  public static final int APPEND_MISSING_ELEMENTS_FIELD_NUMBER = 6;
  private static final b DEFAULT_INSTANCE;
  public static final int FIELD_PATH_FIELD_NUMBER = 1;
  public static final int INCREMENT_FIELD_NUMBER = 3;
  public static final int MAXIMUM_FIELD_NUMBER = 4;
  public static final int MINIMUM_FIELD_NUMBER = 5;
  private static volatile b1<b> PARSER;
  public static final int REMOVE_ALL_FROM_ARRAY_FIELD_NUMBER = 7;
  public static final int SET_TO_SERVER_VALUE_FIELD_NUMBER = 2;
  private String fieldPath_ = "";
  private int transformTypeCase_ = 0;
  private Object transformType_;
  
  static
  {
    b localb = new b();
    DEFAULT_INSTANCE = localb;
    w.D(b.class, localb);
  }
  
  public static void G(b paramb, b paramb1)
  {
    paramb.getClass();
    transformType_ = paramb1;
    transformTypeCase_ = 6;
  }
  
  public static void H(b paramb, String paramString)
  {
    paramb.getClass();
    paramString.getClass();
    fieldPath_ = paramString;
  }
  
  public static void I(b paramb, b paramb1)
  {
    paramb.getClass();
    transformType_ = paramb1;
    transformTypeCase_ = 7;
  }
  
  public static void J(b paramb)
  {
    b localb = b.c;
    paramb.getClass();
    transformType_ = Integer.valueOf(localb.a());
    transformTypeCase_ = 2;
  }
  
  public static void K(b paramb, d0 paramd0)
  {
    paramb.getClass();
    paramd0.getClass();
    transformType_ = paramd0;
    transformTypeCase_ = 3;
  }
  
  public static a R()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final b L()
  {
    if (transformTypeCase_ == 6) {
      return (b)transformType_;
    }
    return b.J();
  }
  
  public final String M()
  {
    return fieldPath_;
  }
  
  public final d0 N()
  {
    if (transformTypeCase_ == 3) {
      return (d0)transformType_;
    }
    return d0.U();
  }
  
  public final b O()
  {
    if (transformTypeCase_ == 7) {
      return (b)transformType_;
    }
    return b.J();
  }
  
  public final b P()
  {
    b localb1 = b.b;
    b localb2 = localb1;
    if (transformTypeCase_ == 2)
    {
      int i = ((Integer)transformType_).intValue();
      if (i != 0) {
        if (i != 1) {
          localb1 = null;
        } else {
          localb1 = b.c;
        }
      }
      localb2 = localb1;
      if (localb1 == null) {
        localb2 = b.d;
      }
    }
    return localb2;
  }
  
  public final int Q()
  {
    int i = transformTypeCase_;
    if (i != 0) {
      switch (i)
      {
      default: 
        i = 0;
        break;
      case 7: 
        i = 6;
        break;
      case 6: 
        i = 5;
        break;
      case 5: 
        i = 4;
        break;
      case 4: 
        i = 3;
        break;
      case 3: 
        i = 2;
        break;
      case 2: 
        i = 1;
        break;
      }
    } else {
      i = 7;
    }
    return i;
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
      return new f1(DEFAULT_INSTANCE, "\000\007\001\000\001\007\007\000\000\000\001Ȉ\002?\000\003<\000\004<\000\005<\000\006<\000\007<\000", new Object[] { "transformType_", "transformTypeCase_", "fieldPath_", d0.class, d0.class, d0.class, b.class, b.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<p.b, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
    implements a0.a
  {
    public final int a;
    
    static
    {
      b localb1 = new b("SERVER_VALUE_UNSPECIFIED", 0, 0);
      b = localb1;
      b localb2 = new b("REQUEST_TIME", 1, 1);
      c = localb2;
      b localb3 = new b("UNRECOGNIZED", 2, -1);
      d = localb3;
      e = new b[] { localb1, localb2, localb3 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      if (this != d) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ka.p.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */