package na;

import ma.a0.d;
import ma.b1;
import ma.e;
import ma.e1;
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
  public static final int CODE_FIELD_NUMBER = 1;
  private static final a DEFAULT_INSTANCE;
  public static final int DETAILS_FIELD_NUMBER = 3;
  public static final int MESSAGE_FIELD_NUMBER = 2;
  private static volatile b1<a> PARSER;
  private int code_;
  private a0.d<e> details_ = e1.d;
  private String message_ = "";
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    w.D(a.class, locala);
  }
  
  public static a H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final int G()
  {
    return code_;
  }
  
  public final String I()
  {
    return message_;
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
      return new f1(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\001\000\001\004\002Ȉ\003\033", new Object[] { "code_", "message_", "details_", e.class });
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
 * Qualified Name:     na.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */