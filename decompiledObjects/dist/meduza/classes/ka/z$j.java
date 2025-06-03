package ka;

import ma.a0.a;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$j
  extends w<j, a>
  implements t0
{
  private static final j DEFAULT_INSTANCE;
  public static final int FIELD_FIELD_NUMBER = 2;
  public static final int OP_FIELD_NUMBER = 1;
  private static volatile b1<j> PARSER;
  private int op_;
  private int operandTypeCase_ = 0;
  private Object operandType_;
  
  static
  {
    j localj = new j();
    DEFAULT_INSTANCE = localj;
    w.D(j.class, localj);
  }
  
  public static void G(j paramj, b paramb)
  {
    paramj.getClass();
    op_ = paramb.a();
  }
  
  public static void H(j paramj, z.f paramf)
  {
    paramj.getClass();
    operandType_ = paramf;
    operandTypeCase_ = 2;
  }
  
  public static j I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final z.f J()
  {
    if (operandTypeCase_ == 2) {
      return (z.f)operandType_;
    }
    return z.f.H();
  }
  
  public final b K()
  {
    b localb1 = b.f(op_);
    b localb2 = localb1;
    if (localb1 == null) {
      localb2 = b.o;
    }
    return localb2;
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
      return new j();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\001\000\001\002\002\000\000\000\001\f\002<\000", new Object[] { "operandType_", "operandTypeCase_", "op_", z.f.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.j, a>
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
      b localb2 = new b("IS_NAN", 1, 2);
      c = localb2;
      b localb3 = new b("IS_NULL", 2, 3);
      d = localb3;
      b localb4 = new b("IS_NOT_NAN", 3, 4);
      e = localb4;
      b localb5 = new b("IS_NOT_NULL", 4, 5);
      f = localb5;
      b localb6 = new b("UNRECOGNIZED", 5, -1);
      o = localb6;
      p = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public static b f(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 2)
        {
          if (paramInt != 3)
          {
            if (paramInt != 4)
            {
              if (paramInt != 5) {
                return null;
              }
              return f;
            }
            return e;
          }
          return d;
        }
        return c;
      }
      return b;
    }
    
    public final int a()
    {
      if (this != o) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */