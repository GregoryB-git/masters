package ka;

import java.util.ArrayList;
import ma.a;
import ma.a0.a;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$c
  extends w<c, a>
  implements t0
{
  private static final c DEFAULT_INSTANCE;
  public static final int FILTERS_FIELD_NUMBER = 2;
  public static final int OP_FIELD_NUMBER = 1;
  private static volatile b1<c> PARSER;
  private a0.d<z.g> filters_ = e1.d;
  private int op_;
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    w.D(c.class, localc);
  }
  
  public static void G(c paramc, b paramb)
  {
    paramc.getClass();
    op_ = paramb.a();
  }
  
  public static void H(c paramc, ArrayList paramArrayList)
  {
    a0.d locald = filters_;
    if (!locald.g()) {
      filters_ = w.A(locald);
    }
    a.k(paramArrayList, filters_);
  }
  
  public static c I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final a0.d J()
  {
    return filters_;
  }
  
  public final b K()
  {
    int i = op_;
    b localb1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          localb1 = null;
        } else {
          localb1 = b.d;
        }
      }
      else {
        localb1 = b.c;
      }
    }
    else {
      localb1 = b.b;
    }
    b localb2 = localb1;
    if (localb1 == null) {
      localb2 = b.e;
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
      return new c();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\001\000\001\f\002\033", new Object[] { "op_", "filters_", z.g.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.c, a>
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
      b localb2 = new b("AND", 1, 1);
      c = localb2;
      b localb3 = new b("OR", 2, 2);
      d = localb3;
      b localb4 = new b("UNRECOGNIZED", 3, -1);
      e = localb4;
      f = new b[] { localb1, localb2, localb3, localb4 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public final int a()
    {
      if (this != e) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */