package ka;

import java.util.List;
import ma.a0.d;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class g0
  extends w<g0, a>
  implements t0
{
  public static final int COMMIT_TIME_FIELD_NUMBER = 4;
  private static final g0 DEFAULT_INSTANCE;
  private static volatile b1<g0> PARSER;
  public static final int STREAM_ID_FIELD_NUMBER = 1;
  public static final int STREAM_TOKEN_FIELD_NUMBER = 2;
  public static final int WRITE_RESULTS_FIELD_NUMBER = 3;
  private int bitField0_;
  private n1 commitTime_;
  private String streamId_ = "";
  private h streamToken_ = h.b;
  private a0.d<h0> writeResults_ = e1.d;
  
  static
  {
    g0 localg0 = new g0();
    DEFAULT_INSTANCE = localg0;
    w.D(g0.class, localg0);
  }
  
  public static g0 H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final n1 G()
  {
    n1 localn11 = commitTime_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final h I()
  {
    return streamToken_;
  }
  
  public final h0 J(int paramInt)
  {
    return (h0)writeResults_.get(paramInt);
  }
  
  public final int K()
  {
    return writeResults_.size();
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
      return new g0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\004\000\001\001\004\004\000\001\000\001Ȉ\002\n\003\033\004ဉ\000", new Object[] { "bitField0_", "streamId_", "streamToken_", "writeResults_", h0.class, "commitTime_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<g0, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.g0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */