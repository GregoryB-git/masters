package ka;

import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class q
  extends w<q, a>
  implements t0
{
  public static final int COUNT_FIELD_NUMBER = 2;
  private static final q DEFAULT_INSTANCE;
  private static volatile b1<q> PARSER;
  public static final int TARGET_ID_FIELD_NUMBER = 1;
  public static final int UNCHANGED_NAMES_FIELD_NUMBER = 3;
  private int bitField0_;
  private int count_;
  private int targetId_;
  private g unchangedNames_;
  
  static
  {
    q localq = new q();
    DEFAULT_INSTANCE = localq;
    w.D(q.class, localq);
  }
  
  public static q H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final int G()
  {
    return count_;
  }
  
  public final int I()
  {
    return targetId_;
  }
  
  public final g J()
  {
    g localg1 = unchangedNames_;
    g localg2 = localg1;
    if (localg1 == null) {
      localg2 = g.H();
    }
    return localg2;
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
      return new q();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\000\001\001\003\003\000\000\000\001\004\002\004\003ဉ\000", new Object[] { "bitField0_", "targetId_", "count_", "unchangedNames_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<q, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */