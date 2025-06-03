package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class h0
  extends w<h0, a>
  implements t0
{
  private static final h0 DEFAULT_INSTANCE;
  private static volatile b1<h0> PARSER;
  public static final int TRANSFORM_RESULTS_FIELD_NUMBER = 2;
  public static final int UPDATE_TIME_FIELD_NUMBER = 1;
  private int bitField0_;
  private a0.d<d0> transformResults_ = e1.d;
  private n1 updateTime_;
  
  static
  {
    h0 localh0 = new h0();
    DEFAULT_INSTANCE = localh0;
    w.D(h0.class, localh0);
  }
  
  public final d0 G(int paramInt)
  {
    return (d0)transformResults_.get(paramInt);
  }
  
  public final int H()
  {
    return transformResults_.size();
  }
  
  public final n1 I()
  {
    n1 localn11 = updateTime_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
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
      return new h0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\002\000\001\001\002\002\000\001\000\001ဉ\000\002\033", new Object[] { "bitField0_", "updateTime_", "transformResults_", d0.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<h0, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.h0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */