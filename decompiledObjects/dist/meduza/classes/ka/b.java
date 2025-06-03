package ka;

import java.util.Collections;
import java.util.List;
import ma.a;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class b
  extends w<b, a>
  implements c
{
  private static final b DEFAULT_INSTANCE;
  private static volatile b1<b> PARSER;
  public static final int VALUES_FIELD_NUMBER = 1;
  private a0.d<d0> values_ = e1.d;
  
  static
  {
    b localb = new b();
    DEFAULT_INSTANCE = localb;
    w.D(b.class, localb);
  }
  
  public static void G(b paramb, d0 paramd0)
  {
    paramb.getClass();
    paramd0.getClass();
    a0.d locald = values_;
    if (!locald.g()) {
      values_ = w.A(locald);
    }
    values_.add(paramd0);
  }
  
  public static void H(b paramb, List paramList)
  {
    a0.d locald = values_;
    if (!locald.g()) {
      values_ = w.A(locald);
    }
    a.k(paramList, values_);
  }
  
  public static void I(b paramb, int paramInt)
  {
    a0.d locald = values_;
    if (!locald.g()) {
      values_ = w.A(locald);
    }
    values_.remove(paramInt);
  }
  
  public static b J()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a M()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final d0 K(int paramInt)
  {
    return (d0)values_.get(paramInt);
  }
  
  public final int L()
  {
    return values_.size();
  }
  
  public final List<d0> h()
  {
    return values_;
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
      return new b();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\001\000\001\033", new Object[] { "values_", d0.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<b, a>
    implements c
  {
    public a()
    {
      super();
    }
    
    public final List<d0> h()
    {
      return Collections.unmodifiableList(((b)b).h());
    }
  }
}

/* Location:
 * Qualified Name:     ka.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */