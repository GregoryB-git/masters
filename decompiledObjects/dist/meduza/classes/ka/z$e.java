package ka;

import ma.a0.a;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$e
  extends w<e, a>
  implements t0
{
  private static final e DEFAULT_INSTANCE;
  public static final int FIELD_FIELD_NUMBER = 1;
  public static final int OP_FIELD_NUMBER = 2;
  private static volatile b1<e> PARSER;
  public static final int VALUE_FIELD_NUMBER = 3;
  private int bitField0_;
  private z.f field_;
  private int op_;
  private d0 value_;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    w.D(e.class, locale);
  }
  
  public static void G(e parame, z.f paramf)
  {
    parame.getClass();
    field_ = paramf;
    bitField0_ |= 0x1;
  }
  
  public static void H(e parame, b paramb)
  {
    parame.getClass();
    op_ = paramb.a();
  }
  
  public static void I(e parame, d0 paramd0)
  {
    parame.getClass();
    paramd0.getClass();
    value_ = paramd0;
    bitField0_ |= 0x2;
  }
  
  public static e J()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a N()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final z.f K()
  {
    z.f localf1 = field_;
    z.f localf2 = localf1;
    if (localf1 == null) {
      localf2 = z.f.H();
    }
    return localf2;
  }
  
  public final b L()
  {
    b localb1 = b.f(op_);
    b localb2 = localb1;
    if (localb1 == null) {
      localb2 = b.u;
    }
    return localb2;
  }
  
  public final d0 M()
  {
    d0 locald01 = value_;
    d0 locald02 = locald01;
    if (locald01 == null) {
      locald02 = d0.U();
    }
    return locald02;
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
      return new e();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\000\001\001\003\003\000\000\000\001ဉ\000\002\f\003ဉ\001", new Object[] { "bitField0_", "field_", "op_", "value_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.e, a>
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
      b localb1 = new b("OPERATOR_UNSPECIFIED", 0, 0);
      b = localb1;
      b localb2 = new b("LESS_THAN", 1, 1);
      c = localb2;
      b localb3 = new b("LESS_THAN_OR_EQUAL", 2, 2);
      d = localb3;
      b localb4 = new b("GREATER_THAN", 3, 3);
      e = localb4;
      b localb5 = new b("GREATER_THAN_OR_EQUAL", 4, 4);
      f = localb5;
      b localb6 = new b("EQUAL", 5, 5);
      o = localb6;
      b localb7 = new b("NOT_EQUAL", 6, 6);
      p = localb7;
      b localb8 = new b("ARRAY_CONTAINS", 7, 7);
      q = localb8;
      b localb9 = new b("IN", 8, 8);
      r = localb9;
      b localb10 = new b("ARRAY_CONTAINS_ANY", 9, 9);
      s = localb10;
      b localb11 = new b("NOT_IN", 10, 10);
      t = localb11;
      b localb12 = new b("UNRECOGNIZED", 11, -1);
      u = localb12;
      v = new b[] { localb1, localb2, localb3, localb4, localb5, localb6, localb7, localb8, localb9, localb10, localb11, localb12 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public static b f(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 10: 
        return t;
      case 9: 
        return s;
      case 8: 
        return r;
      case 7: 
        return q;
      case 6: 
        return p;
      case 5: 
        return o;
      case 4: 
        return f;
      case 3: 
        return e;
      case 2: 
        return d;
      case 1: 
        return c;
      }
      return b;
    }
    
    public final int a()
    {
      if (this != u) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */