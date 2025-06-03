package ka;

import java.util.List;
import ma.a;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class j
  extends w<j, a>
  implements t0
{
  public static final int BEFORE_FIELD_NUMBER = 2;
  private static final j DEFAULT_INSTANCE;
  private static volatile b1<j> PARSER;
  public static final int VALUES_FIELD_NUMBER = 1;
  private boolean before_;
  private a0.d<d0> values_ = e1.d;
  
  static
  {
    j localj = new j();
    DEFAULT_INSTANCE = localj;
    w.D(j.class, localj);
  }
  
  public static void G(j paramj, List paramList)
  {
    a0.d locald = values_;
    if (!locald.g()) {
      values_ = w.A(locald);
    }
    a.k(paramList, values_);
  }
  
  public static void H(j paramj, boolean paramBoolean)
  {
    before_ = paramBoolean;
  }
  
  public static j J()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static a K()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public final boolean I()
  {
    return before_;
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
      return new j();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\001\000\001\033\002\007", new Object[] { "values_", d0.class, "before_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<j, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.j
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */