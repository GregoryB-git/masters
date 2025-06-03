package oa;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class a
  extends w<a, a>
  implements t0
{
  private static final a DEFAULT_INSTANCE;
  public static final int LATITUDE_FIELD_NUMBER = 1;
  public static final int LONGITUDE_FIELD_NUMBER = 2;
  private static volatile b1<a> PARSER;
  private double latitude_;
  private double longitude_;
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    w.D(a.class, locala);
  }
  
  public static void G(a parama, double paramDouble)
  {
    latitude_ = paramDouble;
  }
  
  public static void H(a parama, double paramDouble)
  {
    longitude_ = paramDouble;
  }
  
  public static a I()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a L()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final double J()
  {
    return latitude_;
  }
  
  public final double K()
  {
    return longitude_;
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
      return new a();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\000\002\000", new Object[] { "latitude_", "longitude_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<a, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     oa.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */