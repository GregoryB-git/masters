package ka;

import ma.a1;
import ma.b1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.n1.a;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import oa.a;
import oa.a.a;

public final class d0
  extends w<d0, a>
  implements t0
{
  public static final int ARRAY_VALUE_FIELD_NUMBER = 9;
  public static final int BOOLEAN_VALUE_FIELD_NUMBER = 1;
  public static final int BYTES_VALUE_FIELD_NUMBER = 18;
  private static final d0 DEFAULT_INSTANCE;
  public static final int DOUBLE_VALUE_FIELD_NUMBER = 3;
  public static final int GEO_POINT_VALUE_FIELD_NUMBER = 8;
  public static final int INTEGER_VALUE_FIELD_NUMBER = 2;
  public static final int MAP_VALUE_FIELD_NUMBER = 6;
  public static final int NULL_VALUE_FIELD_NUMBER = 11;
  private static volatile b1<d0> PARSER;
  public static final int REFERENCE_VALUE_FIELD_NUMBER = 5;
  public static final int STRING_VALUE_FIELD_NUMBER = 17;
  public static final int TIMESTAMP_VALUE_FIELD_NUMBER = 10;
  private int valueTypeCase_ = 0;
  private Object valueType_;
  
  static
  {
    d0 locald0 = new d0();
    DEFAULT_INSTANCE = locald0;
    w.D(d0.class, locald0);
  }
  
  public static void G(d0 paramd0, n1 paramn1)
  {
    paramd0.getClass();
    valueType_ = paramn1;
    valueTypeCase_ = 10;
  }
  
  public static void H(d0 paramd0, String paramString)
  {
    paramd0.getClass();
    paramString.getClass();
    valueTypeCase_ = 17;
    valueType_ = paramString;
  }
  
  public static void I(d0 paramd0, h paramh)
  {
    paramd0.getClass();
    paramh.getClass();
    valueTypeCase_ = 18;
    valueType_ = paramh;
  }
  
  public static void J(d0 paramd0, String paramString)
  {
    paramd0.getClass();
    paramString.getClass();
    valueTypeCase_ = 5;
    valueType_ = paramString;
  }
  
  public static void K(d0 paramd0, a parama)
  {
    paramd0.getClass();
    valueType_ = parama;
    valueTypeCase_ = 8;
  }
  
  public static void L(b paramb, d0 paramd0)
  {
    paramd0.getClass();
    paramb.getClass();
    valueType_ = paramb;
    valueTypeCase_ = 9;
  }
  
  public static void M(d0 paramd0, u paramu)
  {
    paramd0.getClass();
    paramu.getClass();
    valueType_ = paramu;
    valueTypeCase_ = 6;
  }
  
  public static void N(d0 paramd0)
  {
    a1 locala1 = a1.b;
    paramd0.getClass();
    valueType_ = Integer.valueOf(locala1.a());
    valueTypeCase_ = 11;
  }
  
  public static void O(d0 paramd0, boolean paramBoolean)
  {
    valueTypeCase_ = 1;
    valueType_ = Boolean.valueOf(paramBoolean);
  }
  
  public static void P(d0 paramd0, long paramLong)
  {
    valueTypeCase_ = 2;
    valueType_ = Long.valueOf(paramLong);
  }
  
  public static void Q(d0 paramd0, double paramDouble)
  {
    valueTypeCase_ = 3;
    valueType_ = Double.valueOf(paramDouble);
  }
  
  public static d0 U()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a d0()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final b R()
  {
    if (valueTypeCase_ == 9) {
      return (b)valueType_;
    }
    return b.J();
  }
  
  public final boolean S()
  {
    if (valueTypeCase_ == 1) {
      return ((Boolean)valueType_).booleanValue();
    }
    return false;
  }
  
  public final h T()
  {
    if (valueTypeCase_ == 18) {
      return (h)valueType_;
    }
    return h.b;
  }
  
  public final double V()
  {
    if (valueTypeCase_ == 3) {
      return ((Double)valueType_).doubleValue();
    }
    return 0.0D;
  }
  
  public final a W()
  {
    if (valueTypeCase_ == 8) {
      return (a)valueType_;
    }
    return a.I();
  }
  
  public final long X()
  {
    if (valueTypeCase_ == 2) {
      return ((Long)valueType_).longValue();
    }
    return 0L;
  }
  
  public final u Y()
  {
    if (valueTypeCase_ == 6) {
      return (u)valueType_;
    }
    return u.H();
  }
  
  public final String Z()
  {
    String str;
    if (valueTypeCase_ == 5) {
      str = (String)valueType_;
    } else {
      str = "";
    }
    return str;
  }
  
  public final String a0()
  {
    String str;
    if (valueTypeCase_ == 17) {
      str = (String)valueType_;
    } else {
      str = "";
    }
    return str;
  }
  
  public final n1 b0()
  {
    if (valueTypeCase_ == 10) {
      return (n1)valueType_;
    }
    return n1.I();
  }
  
  public final int c0()
  {
    int i = valueTypeCase_;
    int j = 6;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3)
          {
            if (i != 5)
            {
              if (i != 6)
              {
                if (i != 17) {
                  if (i != 18) {
                    switch (i)
                    {
                    default: 
                      j = 0;
                      break;
                    case 11: 
                      j = 1;
                      break;
                    case 10: 
                      j = 5;
                      break;
                    case 9: 
                      j = 10;
                      break;
                    case 8: 
                      j = 9;
                      break;
                    }
                  } else {
                    j = 7;
                  }
                }
              }
              else {
                j = 11;
              }
            }
            else {
              j = 8;
            }
          }
          else {
            j = 4;
          }
        }
        else {
          j = 3;
        }
      }
      else {
        j = 2;
      }
    }
    else {
      j = 12;
    }
    return j;
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
      return new d0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\013\001\000\001\022\013\000\000\000\001:\000\0025\000\0033\000\005Ȼ\000\006<\000\b<\000\t<\000\n<\000\013?\000\021Ȼ\000\022=\000", new Object[] { "valueType_", "valueTypeCase_", u.class, a.class, b.class, n1.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<d0, a>
    implements t0
  {
    public a()
    {
      super();
    }
    
    public final void p(b.a parama)
    {
      m();
      d0 locald0 = (d0)b;
      d0.L((b)parama.k(), locald0);
    }
    
    public final void q(double paramDouble)
    {
      m();
      d0.Q((d0)b, paramDouble);
    }
    
    public final void r(a.a parama)
    {
      m();
      d0.K((d0)b, (a)parama.k());
    }
    
    public final void s(long paramLong)
    {
      m();
      d0.P((d0)b, paramLong);
    }
    
    public final void t(u.a parama)
    {
      m();
      d0.M((d0)b, (u)parama.k());
    }
    
    public final void u(u paramu)
    {
      m();
      d0.M((d0)b, paramu);
    }
    
    public final void v(String paramString)
    {
      m();
      d0.H((d0)b, paramString);
    }
    
    public final void w(n1.a parama)
    {
      m();
      d0.G((d0)b, (n1)parama.k());
    }
  }
}

/* Location:
 * Qualified Name:     ka.d0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */