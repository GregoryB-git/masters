package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class g
  extends w<g, a>
  implements t0
{
  public static final int BITS_FIELD_NUMBER = 1;
  private static final g DEFAULT_INSTANCE;
  public static final int HASH_COUNT_FIELD_NUMBER = 2;
  private static volatile b1<g> PARSER;
  private int bitField0_;
  private f bits_;
  private int hashCount_;
  
  static
  {
    g localg = new g();
    DEFAULT_INSTANCE = localg;
    w.D(g.class, localg);
  }
  
  public static g H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final f G()
  {
    f localf1 = bits_;
    f localf2 = localf1;
    if (localf1 == null) {
      localf2 = f.H();
    }
    return localf2;
  }
  
  public final int I()
  {
    return hashCount_;
  }
  
  public final boolean J()
  {
    int i = bitField0_;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
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
      return new f1(DEFAULT_INSTANCE, "\000\002\000\001\001\002\002\000\000\000\001ဉ\000\002\004", new Object[] { "bitField0_", "bits_", "hashCount_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<g, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */