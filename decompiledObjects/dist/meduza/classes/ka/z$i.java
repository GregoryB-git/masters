package ka;

import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$i
  extends w<i, a>
  implements t0
{
  private static final i DEFAULT_INSTANCE;
  public static final int FIELDS_FIELD_NUMBER = 2;
  private static volatile b1<i> PARSER;
  private a0.d<z.f> fields_ = e1.d;
  
  static
  {
    i locali = new i();
    DEFAULT_INSTANCE = locali;
    w.D(i.class, locali);
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
      return new i();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\000\001\000\002\033", new Object[] { "fields_", z.f.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.i, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */