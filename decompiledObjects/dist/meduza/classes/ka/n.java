package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class n
  extends w<n, a>
  implements t0
{
  private static final n DEFAULT_INSTANCE;
  public static final int FIELD_PATHS_FIELD_NUMBER = 1;
  private static volatile b1<n> PARSER;
  private a0.d<String> fieldPaths_ = e1.d;
  
  static
  {
    n localn = new n();
    DEFAULT_INSTANCE = localn;
    w.D(n.class, localn);
  }
  
  public static void G(n paramn, String paramString)
  {
    paramn.getClass();
    paramString.getClass();
    a0.d locald = fieldPaths_;
    if (!locald.g()) {
      fieldPaths_ = w.A(locald);
    }
    fieldPaths_.add(paramString);
  }
  
  public static n H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a K()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final String I(int paramInt)
  {
    return (String)fieldPaths_.get(paramInt);
  }
  
  public final int J()
  {
    return fieldPaths_.size();
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
      return new n();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\001\000\001Ț", new Object[] { "fieldPaths_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<n, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.n
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */