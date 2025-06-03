package R;

import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.X;
import androidx.datastore.preferences.protobuf.w;
import androidx.datastore.preferences.protobuf.w.a;
import androidx.datastore.preferences.protobuf.w.b;
import androidx.datastore.preferences.protobuf.w.d;

public final class h
  extends w
  implements P
{
  public static final int BOOLEAN_FIELD_NUMBER = 1;
  private static final h DEFAULT_INSTANCE;
  public static final int DOUBLE_FIELD_NUMBER = 7;
  public static final int FLOAT_FIELD_NUMBER = 2;
  public static final int INTEGER_FIELD_NUMBER = 3;
  public static final int LONG_FIELD_NUMBER = 4;
  private static volatile X PARSER;
  public static final int STRING_FIELD_NUMBER = 5;
  public static final int STRING_SET_FIELD_NUMBER = 6;
  private int bitField0_;
  private int valueCase_ = 0;
  private Object value_;
  
  static
  {
    h localh = new h();
    DEFAULT_INSTANCE = localh;
    w.F(h.class, localh);
  }
  
  public static h Q()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a Y()
  {
    return (a)DEFAULT_INSTANCE.p();
  }
  
  public boolean P()
  {
    if (valueCase_ == 1) {
      return ((Boolean)value_).booleanValue();
    }
    return false;
  }
  
  public double R()
  {
    if (valueCase_ == 7) {
      return ((Double)value_).doubleValue();
    }
    return 0.0D;
  }
  
  public float S()
  {
    if (valueCase_ == 2) {
      return ((Float)value_).floatValue();
    }
    return 0.0F;
  }
  
  public int T()
  {
    if (valueCase_ == 3) {
      return ((Integer)value_).intValue();
    }
    return 0;
  }
  
  public long U()
  {
    if (valueCase_ == 4) {
      return ((Long)value_).longValue();
    }
    return 0L;
  }
  
  public String V()
  {
    String str;
    if (valueCase_ == 5) {
      str = (String)value_;
    } else {
      str = "";
    }
    return str;
  }
  
  public g W()
  {
    if (valueCase_ == 6) {
      return (g)value_;
    }
    return g.L();
  }
  
  public b X()
  {
    return b.c(valueCase_);
  }
  
  public final void Z(boolean paramBoolean)
  {
    valueCase_ = 1;
    value_ = Boolean.valueOf(paramBoolean);
  }
  
  public final void a0(double paramDouble)
  {
    valueCase_ = 7;
    value_ = Double.valueOf(paramDouble);
  }
  
  public final void b0(float paramFloat)
  {
    valueCase_ = 2;
    value_ = Float.valueOf(paramFloat);
  }
  
  public final void c0(int paramInt)
  {
    valueCase_ = 3;
    value_ = Integer.valueOf(paramInt);
  }
  
  public final void d0(long paramLong)
  {
    valueCase_ = 4;
    value_ = Long.valueOf(paramLong);
  }
  
  public final void e0(String paramString)
  {
    paramString.getClass();
    valueCase_ = 5;
    value_ = paramString;
  }
  
  public final void f0(g.a parama)
  {
    value_ = parama.s();
    valueCase_ = 6;
  }
  
  public final Object s(w.d paramd, Object paramObject1, Object paramObject2)
  {
    switch (e.a[paramd.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramd = (w.d)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramd = (w.d)paramObject1;
          if (paramObject1 == null)
          {
            paramd = new androidx/datastore/preferences/protobuf/w$b;
            paramd.<init>(DEFAULT_INSTANCE);
            PARSER = paramd;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramd;
      }
      return paramd;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      return w.C(DEFAULT_INSTANCE, "\001\007\001\001\001\007\007\000\000\000\001:\000\0024\000\0037\000\0045\000\005;\000\006<\000\0073\000", new Object[] { "value_", "valueCase_", "bitField0_", g.class });
    case 2: 
      label118:
      label123:
      return new a(null);
    }
    return new h();
  }
  
  public static final class a
    extends w.a
    implements P
  {
    public a()
    {
      super();
    }
    
    public a A(boolean paramBoolean)
    {
      v();
      h.M((h)p, paramBoolean);
      return this;
    }
    
    public a B(double paramDouble)
    {
      v();
      h.K((h)p, paramDouble);
      return this;
    }
    
    public a C(float paramFloat)
    {
      v();
      h.N((h)p, paramFloat);
      return this;
    }
    
    public a D(int paramInt)
    {
      v();
      h.O((h)p, paramInt);
      return this;
    }
    
    public a E(long paramLong)
    {
      v();
      h.H((h)p, paramLong);
      return this;
    }
    
    public a F(String paramString)
    {
      v();
      h.I((h)p, paramString);
      return this;
    }
    
    public a G(g.a parama)
    {
      v();
      h.J((h)p, parama);
      return this;
    }
  }
  
  public static enum b
  {
    public final int o;
    
    static
    {
      b localb1 = new b("BOOLEAN", 0, 1);
      p = localb1;
      b localb2 = new b("FLOAT", 1, 2);
      q = localb2;
      b localb3 = new b("INTEGER", 2, 3);
      r = localb3;
      b localb4 = new b("LONG", 3, 4);
      s = localb4;
      b localb5 = new b("STRING", 4, 5);
      t = localb5;
      b localb6 = new b("STRING_SET", 5, 6);
      u = localb6;
      b localb7 = new b("DOUBLE", 6, 7);
      v = localb7;
      b localb8 = new b("VALUE_NOT_SET", 7, 0);
      w = localb8;
      x = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8 };
    }
    
    public b(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static b c(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 7: 
        return v;
      case 6: 
        return u;
      case 5: 
        return t;
      case 4: 
        return s;
      case 3: 
        return r;
      case 2: 
        return q;
      case 1: 
        return p;
      }
      return w;
    }
  }
}

/* Location:
 * Qualified Name:     R.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */