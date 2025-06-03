package ka;

import ma.b1;
import ma.f1;
import ma.h;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class f
  extends w<f, a>
  implements t0
{
  public static final int BITMAP_FIELD_NUMBER = 1;
  private static final f DEFAULT_INSTANCE;
  public static final int PADDING_FIELD_NUMBER = 2;
  private static volatile b1<f> PARSER;
  private h bitmap_ = h.b;
  private int padding_;
  
  static
  {
    f localf = new f();
    DEFAULT_INSTANCE = localf;
    w.D(f.class, localf);
  }
  
  public static f H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final h G()
  {
    return bitmap_;
  }
  
  public final int I()
  {
    return padding_;
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
      return new f();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\n\002\004", new Object[] { "bitmap_", "padding_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<f, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */