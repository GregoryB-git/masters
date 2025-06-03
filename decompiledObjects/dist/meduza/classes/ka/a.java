package ka;

import java.util.Collections;
import java.util.Map;
import ma.b1;
import ma.f1;
import ma.l0;
import ma.m0;
import ma.t0;
import ma.v1;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class a
  extends w<a, b>
  implements t0
{
  public static final int AGGREGATE_FIELDS_FIELD_NUMBER = 2;
  private static final a DEFAULT_INSTANCE;
  private static volatile b1<a> PARSER;
  private m0<String, d0> aggregateFields_ = m0.b;
  
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
  
  public final Map<String, d0> G()
  {
    return Collections.unmodifiableMap(aggregateFields_);
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
      return new b();
    case 3: 
      return new a();
    case 2: 
      paramf = a.a;
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\002\002\001\001\000\000\0022", new Object[] { "aggregateFields_", paramf });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
  {
    public static final l0<String, d0> a = new l0(v1.c, v1.e, d0.U());
  }
  
  public static final class b
    extends w.a<a, b>
    implements t0
  {
    public b()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */