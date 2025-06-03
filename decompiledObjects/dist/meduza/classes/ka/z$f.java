package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class z$f
  extends w<f, a>
  implements t0
{
  private static final f DEFAULT_INSTANCE;
  public static final int FIELD_PATH_FIELD_NUMBER = 2;
  private static volatile b1<f> PARSER;
  private String fieldPath_ = "";
  
  static
  {
    f localf = new f();
    DEFAULT_INSTANCE = localf;
    w.D(f.class, localf);
  }
  
  public static void G(f paramf, String paramString)
  {
    paramf.getClass();
    paramString.getClass();
    fieldPath_ = paramString;
  }
  
  public static f H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a J()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final String I()
  {
    return fieldPath_;
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
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\000\000\000\002Ȉ", new Object[] { "fieldPath_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<z.f, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.z.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */