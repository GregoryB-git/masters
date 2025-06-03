package ka;

import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class v
  extends w<v, a>
  implements t0
{
  private static final v DEFAULT_INSTANCE;
  public static final int EXISTS_FIELD_NUMBER = 1;
  private static volatile b1<v> PARSER;
  public static final int UPDATE_TIME_FIELD_NUMBER = 2;
  private int conditionTypeCase_ = 0;
  private Object conditionType_;
  
  static
  {
    v localv = new v();
    DEFAULT_INSTANCE = localv;
    w.D(v.class, localv);
  }
  
  public static void G(v paramv, boolean paramBoolean)
  {
    conditionTypeCase_ = 1;
    conditionType_ = Boolean.valueOf(paramBoolean);
  }
  
  public static void H(v paramv, n1 paramn1)
  {
    paramv.getClass();
    conditionType_ = paramn1;
    conditionTypeCase_ = 2;
  }
  
  public static v J()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a M()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final int I()
  {
    int i = conditionTypeCase_;
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
  
  public final boolean K()
  {
    if (conditionTypeCase_ == 1) {
      return ((Boolean)conditionType_).booleanValue();
    }
    return false;
  }
  
  public final n1 L()
  {
    if (conditionTypeCase_ == 2) {
      return (n1)conditionType_;
    }
    return n1.I();
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
      return new v();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\001\000\001\002\002\000\000\000\001:\000\002<\000", new Object[] { "conditionType_", "conditionTypeCase_", n1.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<v, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */