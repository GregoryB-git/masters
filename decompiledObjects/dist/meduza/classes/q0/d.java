package q0;

import g3.b;
import java.io.FileInputStream;
import java.util.Collections;
import java.util.Map;
import s0.a1;
import s0.h.b;
import s0.h0;
import s0.i0;
import s0.n;
import s0.n1;
import s0.p0;
import s0.v;
import s0.v.a;
import s0.v.b;
import s0.v.f;
import s0.w0;
import s0.y;

public final class d
  extends v<d, a>
  implements p0
{
  private static final d DEFAULT_INSTANCE;
  private static volatile w0<d> PARSER;
  public static final int PREFERENCES_FIELD_NUMBER = 1;
  private i0<String, f> preferences_ = i0.b;
  
  static
  {
    d locald = new d();
    DEFAULT_INSTANCE = locald;
    v.o(d.class, locald);
  }
  
  public static i0 q(d paramd)
  {
    i0 locali0 = preferences_;
    if (!a) {
      preferences_ = locali0.d();
    }
    return preferences_;
  }
  
  public static a s()
  {
    return (a)DEFAULT_INSTANCE.k(v.f.e);
  }
  
  public static d t(FileInputStream paramFileInputStream)
  {
    paramFileInputStream = v.n(DEFAULT_INSTANCE, new h.b(paramFileInputStream), n.a());
    if (paramFileInputStream.f()) {
      return (d)paramFileInputStream;
    }
    throw new y(new b().getMessage());
  }
  
  public final Object k(v.f paramf)
  {
    switch (paramf.ordinal())
    {
    default: 
      throw new UnsupportedOperationException();
    case 6: 
      w0 localw0 = PARSER;
      paramf = localw0;
      if (localw0 == null)
      {
        try
        {
          localw0 = PARSER;
          paramf = localw0;
          if (localw0 == null)
          {
            paramf = new s0/v$b;
            paramf.<init>(DEFAULT_INSTANCE);
            PARSER = paramf;
          }
        }
        finally
        {
          break label107;
        }
        break label112;
        throw paramf;
      }
      return paramf;
    case 5: 
      return DEFAULT_INSTANCE;
    case 4: 
      return new a();
    case 3: 
      return new d();
    case 2: 
      paramf = b.a;
      return new a1(DEFAULT_INSTANCE, "\001\001\000\000\001\001\001\001\000\000\0012", new Object[] { "preferences_", paramf });
    case 1: 
      label107:
      label112:
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public final Map<String, f> r()
  {
    return Collections.unmodifiableMap(preferences_);
  }
  
  public static final class a
    extends v.a<d, a>
    implements p0
  {
    public a()
    {
      super();
    }
  }
  
  public static final class b
  {
    public static final h0<String, f> a = new h0(n1.c, n1.e, f.y());
  }
}

/* Location:
 * Qualified Name:     q0.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */