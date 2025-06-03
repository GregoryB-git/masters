package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$h
  extends w<h, a>
  implements t0
{
  private static final h DEFAULT_INSTANCE;
  public static final int DIRECTION_FIELD_NUMBER = 2;
  public static final int FIELD_FIELD_NUMBER = 1;
  private static volatile b1<h> PARSER;
  private int bitField0_;
  private int direction_;
  private z.f field_;
  
  static
  {
    h localh = new h();
    DEFAULT_INSTANCE = localh;
    w.D(h.class, localh);
  }
  
  public static void G(h paramh, z.f paramf)
  {
    paramh.getClass();
    field_ = paramf;
    bitField0_ |= 0x1;
  }
  
  public static void H(h paramh, z.d paramd)
  {
    paramh.getClass();
    direction_ = paramd.a();
  }
  
  public static a K()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final z.d I()
  {
    int i = direction_;
    z.d locald1;
    if (i != 0)
    {
      if (i != 1)
      {
        if (i != 2) {
          locald1 = null;
        } else {
          locald1 = z.d.d;
        }
      }
      else {
        locald1 = z.d.c;
      }
    }
    else {
      locald1 = z.d.b;
    }
    z.d locald2 = locald1;
    if (locald1 == null) {
      locald2 = z.d.e;
    }
    return locald2;
  }
  
  public final z.f J()
  {
    z.f localf1 = field_;
    z.f localf2 = localf1;
    if (localf1 == null) {
      localf2 = z.f.H();
    }
    return localf2;
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
      return new h();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\001\001\002\002\000\000\000\001ဉ\000\002\f", new Object[] { "bitField0_", "field_", "direction_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.h, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */