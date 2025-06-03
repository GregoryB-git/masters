package q0;

import s0.a1;
import s0.p0;
import s0.v;
import s0.v.a;
import s0.v.b;
import s0.v.f;
import s0.w0;

public final class f
  extends v<f, a>
  implements p0
{
  public static final int BOOLEAN_FIELD_NUMBER = 1;
  private static final f DEFAULT_INSTANCE;
  public static final int DOUBLE_FIELD_NUMBER = 7;
  public static final int FLOAT_FIELD_NUMBER = 2;
  public static final int INTEGER_FIELD_NUMBER = 3;
  public static final int LONG_FIELD_NUMBER = 4;
  private static volatile w0<f> PARSER;
  public static final int STRING_FIELD_NUMBER = 5;
  public static final int STRING_SET_FIELD_NUMBER = 6;
  private int bitField0_;
  private int valueCase_ = 0;
  private Object value_;
  
  static
  {
    f localf = new f();
    DEFAULT_INSTANCE = localf;
    v.o(f.class, localf);
  }
  
  public static a G()
  {
    return (a)DEFAULT_INSTANCE.k(v.f.e);
  }
  
  public static void p(f paramf, long paramLong)
  {
    valueCase_ = 4;
    value_ = Long.valueOf(paramLong);
  }
  
  public static void q(f paramf, String paramString)
  {
    paramf.getClass();
    paramString.getClass();
    valueCase_ = 5;
    value_ = paramString;
  }
  
  public static void r(f paramf, e.a parama)
  {
    paramf.getClass();
    value_ = parama.h();
    valueCase_ = 6;
  }
  
  public static void s(f paramf, double paramDouble)
  {
    valueCase_ = 7;
    value_ = Double.valueOf(paramDouble);
  }
  
  public static void u(f paramf, boolean paramBoolean)
  {
    valueCase_ = 1;
    value_ = Boolean.valueOf(paramBoolean);
  }
  
  public static void v(f paramf, float paramFloat)
  {
    valueCase_ = 2;
    value_ = Float.valueOf(paramFloat);
  }
  
  public static void w(f paramf, int paramInt)
  {
    valueCase_ = 3;
    value_ = Integer.valueOf(paramInt);
  }
  
  public static f y()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final float A()
  {
    if (valueCase_ == 2) {
      return ((Float)value_).floatValue();
    }
    return 0.0F;
  }
  
  public final int B()
  {
    if (valueCase_ == 3) {
      return ((Integer)value_).intValue();
    }
    return 0;
  }
  
  public final long C()
  {
    if (valueCase_ == 4) {
      return ((Long)value_).longValue();
    }
    return 0L;
  }
  
  public final String D()
  {
    String str;
    if (valueCase_ == 5) {
      str = (String)value_;
    } else {
      str = "";
    }
    return str;
  }
  
  public final e E()
  {
    if (valueCase_ == 6) {
      return (e)value_;
    }
    return e.r();
  }
  
  public final int F()
  {
    int i;
    switch (valueCase_)
    {
    default: 
      i = 0;
      break;
    case 7: 
      i = 7;
      break;
    case 6: 
      i = 6;
      break;
    case 5: 
      i = 5;
      break;
    case 4: 
      i = 4;
      break;
    case 3: 
      i = 3;
      break;
    case 2: 
      i = 2;
      break;
    case 1: 
      i = 1;
      break;
    case 0: 
      i = 8;
    }
    return i;
  }
  
  public final Object k(v.f paramf)
  {
    switch (paramf.ordinal())
    {
    default: 
      throw new UnsupportedOperationException();
    case 6: 
      w0 localw0 = PARSER;
      paramf = localw0;
      if (localw0 == null)
      {
        try
        {
          localw0 = PARSER;
          paramf = localw0;
          if (localw0 == null)
          {
            paramf = new s0/v$b;
            paramf.<init>(DEFAULT_INSTANCE);
            PARSER = paramf;
          }
        }
        finally
        {
          break label107;
        }
        break label112;
        throw paramf;
      }
      return paramf;
    case 5: 
      return DEFAULT_INSTANCE;
    case 4: 
      return new a();
    case 3: 
      return new f();
    case 2: 
      return new a1(DEFAULT_INSTANCE, "\001\007\001\001\001\007\007\000\000\000\001:\000\0024\000\0037\000\0045\000\005;\000\006<\000\0073\000", new Object[] { "value_", "valueCase_", "bitField0_", e.class });
    case 1: 
      label107:
      label112:
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public final boolean x()
  {
    if (valueCase_ == 1) {
      return ((Boolean)value_).booleanValue();
    }
    return false;
  }
  
  public final double z()
  {
    if (valueCase_ == 7) {
      return ((Double)value_).doubleValue();
    }
    return 0.0D;
  }
  
  public static final class a
    extends v.a<f, a>
    implements p0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     q0.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */