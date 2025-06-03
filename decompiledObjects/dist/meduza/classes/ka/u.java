package ka;

import java.util.AbstractMap;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
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

public final class u
  extends w<u, a>
  implements t0
{
  private static final u DEFAULT_INSTANCE;
  public static final int FIELDS_FIELD_NUMBER = 1;
  private static volatile b1<u> PARSER;
  private m0<String, d0> fields_ = m0.b;
  
  static
  {
    u localu = new u();
    DEFAULT_INSTANCE = localu;
    w.D(u.class, localu);
  }
  
  public static m0 G(u paramu)
  {
    m0 localm0 = fields_;
    if (!a) {
      fields_ = localm0.d();
    }
    return fields_;
  }
  
  public static u H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a M()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final int I()
  {
    return fields_.size();
  }
  
  public final Map<String, d0> J()
  {
    return Collections.unmodifiableMap(fields_);
  }
  
  public final d0 K(String paramString)
  {
    paramString.getClass();
    m0 localm0 = fields_;
    if (localm0.containsKey(paramString)) {
      paramString = (d0)localm0.get(paramString);
    } else {
      paramString = null;
    }
    return paramString;
  }
  
  public final d0 L(String paramString)
  {
    paramString.getClass();
    m0 localm0 = fields_;
    if (localm0.containsKey(paramString)) {
      return (d0)localm0.get(paramString);
    }
    throw new IllegalArgumentException();
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
      return new u();
    case 2: 
      paramf = b.a;
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\001\000\000\0012", new Object[] { "fields_", paramf });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<u, a>
    implements t0
  {
    public a()
    {
      super();
    }
    
    public final void p(d0 paramd0, String paramString)
    {
      paramString.getClass();
      paramd0.getClass();
      m();
      u.G((u)b).put(paramString, paramd0);
    }
  }
  
  public static final class b
  {
    public static final l0<String, d0> a = new l0(v1.c, v1.e, d0.U());
  }
}

/* Location:
 * Qualified Name:     ka.u
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */