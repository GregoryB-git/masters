package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$g
  extends w<g, a>
  implements t0
{
  public static final int COMPOSITE_FILTER_FIELD_NUMBER = 1;
  private static final g DEFAULT_INSTANCE;
  public static final int FIELD_FILTER_FIELD_NUMBER = 2;
  private static volatile b1<g> PARSER;
  public static final int UNARY_FILTER_FIELD_NUMBER = 3;
  private int filterTypeCase_ = 0;
  private Object filterType_;
  
  static
  {
    g localg = new g();
    DEFAULT_INSTANCE = localg;
    w.D(g.class, localg);
  }
  
  public static void F(g paramg, z.e parame)
  {
    paramg.getClass();
    filterType_ = parame;
    filterTypeCase_ = 2;
  }
  
  public static void G(g paramg, z.j paramj)
  {
    paramg.getClass();
    filterType_ = paramj;
    filterTypeCase_ = 3;
  }
  
  public static void I(g paramg, z.c paramc)
  {
    paramg.getClass();
    filterType_ = paramc;
    filterTypeCase_ = 1;
  }
  
  public static g K()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a O()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final z.c J()
  {
    if (filterTypeCase_ == 1) {
      return (z.c)filterType_;
    }
    return z.c.I();
  }
  
  public final z.e L()
  {
    if (filterTypeCase_ == 2) {
      return (z.e)filterType_;
    }
    return z.e.J();
  }
  
  public final b M()
  {
    int i = filterTypeCase_;
    b localb;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2)
        {
          if (i != 3) {
            localb = null;
          } else {
            localb = b.c;
          }
        }
        else {
          localb = b.b;
        }
      }
      else {
        localb = b.a;
      }
    }
    else {
      localb = b.d;
    }
    return localb;
  }
  
  public final z.j N()
  {
    if (filterTypeCase_ == 3) {
      return (z.j)filterType_;
    }
    return z.j.I();
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
      return new g();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\001\000\001\003\003\000\000\000\001<\000\002<\000\003<\000", new Object[] { "filterType_", "filterTypeCase_", z.c.class, z.e.class, z.j.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.g, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("COMPOSITE_FILTER", 0);
      a = localb1;
      b localb2 = new b("FIELD_FILTER", 1);
      b = localb2;
      b localb3 = new b("UNARY_FILTER", 2);
      c = localb3;
      b localb4 = new b("FILTERTYPE_NOT_SET", 3);
      d = localb4;
      e = new b[] { localb1, localb2, localb3, localb4 };
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */