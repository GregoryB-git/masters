package ka;

import ma.a0.a;
import ma.a0.c;
import ma.b1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import ma.z;
import na.a;

public final class b0
  extends w<b0, a>
  implements t0
{
  public static final int CAUSE_FIELD_NUMBER = 3;
  private static final b0 DEFAULT_INSTANCE;
  private static volatile b1<b0> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 6;
  public static final int RESUME_TOKEN_FIELD_NUMBER = 4;
  public static final int TARGET_CHANGE_TYPE_FIELD_NUMBER = 1;
  public static final int TARGET_IDS_FIELD_NUMBER = 2;
  private int bitField0_;
  private a cause_;
  private n1 readTime_;
  private h resumeToken_ = h.b;
  private int targetChangeType_;
  private int targetIdsMemoizedSerializedSize = -1;
  private a0.c targetIds_ = z.d;
  
  static
  {
    b0 localb0 = new b0();
    DEFAULT_INSTANCE = localb0;
    w.D(b0.class, localb0);
  }
  
  public static b0 H()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final a G()
  {
    a locala1 = cause_;
    a locala2 = locala1;
    if (locala1 == null) {
      locala2 = a.H();
    }
    return locala2;
  }
  
  public final n1 I()
  {
    n1 localn11 = readTime_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final h J()
  {
    return resumeToken_;
  }
  
  public final b K()
  {
    b localb1 = b.f(targetChangeType_);
    b localb2 = localb1;
    if (localb1 == null) {
      localb2 = b.o;
    }
    return localb2;
  }
  
  public final int L()
  {
    return targetIds_).c;
  }
  
  public final a0.c M()
  {
    return targetIds_;
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
      return new b0();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\005\000\001\001\006\005\000\001\000\001\f\002'\003ဉ\000\004\n\006ဉ\001", new Object[] { "bitField0_", "targetChangeType_", "targetIds_", "cause_", "resumeToken_", "readTime_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<b0, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
    implements a0.a
  {
    public final int a;
    
    static
    {
      b localb1 = new b("NO_CHANGE", 0, 0);
      b = localb1;
      b localb2 = new b("ADD", 1, 1);
      c = localb2;
      b localb3 = new b("REMOVE", 2, 2);
      d = localb3;
      b localb4 = new b("CURRENT", 3, 3);
      e = localb4;
      b localb5 = new b("RESET", 4, 4);
      f = localb5;
      b localb6 = new b("UNRECOGNIZED", 5, -1);
      o = localb6;
      p = new b[] { localb1, localb2, localb3, localb4, localb5, localb6 };
    }
    
    public b(int paramInt)
    {
      a = paramInt;
    }
    
    public static b f(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return null;
              }
              return f;
            }
            return e;
          }
          return d;
        }
        return c;
      }
      return b;
    }
    
    public final int a()
    {
      if (this != o) {
        return a;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
  }
}

/* Location:
 * Qualified Name:     ka.b0
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */