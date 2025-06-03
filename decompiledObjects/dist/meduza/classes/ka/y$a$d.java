package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class y$a$d
  extends w<d, a>
  implements t0
{
  private static final d DEFAULT_INSTANCE;
  public static final int FIELD_FIELD_NUMBER = 1;
  private static volatile b1<d> PARSER;
  private int bitField0_;
  private z.f field_;
  
  static
  {
    d locald = new d();
    DEFAULT_INSTANCE = locald;
    w.D(d.class, locald);
  }
  
  public static void G(d paramd, z.f paramf)
  {
    paramd.getClass();
    field_ = paramf;
    bitField0_ |= 0x1;
  }
  
  public static a H()
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
      return new d();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\001\001\001\001\000\000\000\001ဉ\000", new Object[] { "bitField0_", "field_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<y.a.d, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.y.a.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */