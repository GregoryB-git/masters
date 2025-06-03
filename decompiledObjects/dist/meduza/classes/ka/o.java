package ka;

import ma.a0.c;
import ma.b1;
import ma.f1;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import ma.z;

public final class o
  extends w<o, a>
  implements t0
{
  private static final o DEFAULT_INSTANCE;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private static volatile b1<o> PARSER;
  public static final int READ_TIME_FIELD_NUMBER = 4;
  public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 2;
  private int bitField0_;
  private String document_ = "";
  private n1 readTime_;
  private int removedTargetIdsMemoizedSerializedSize = -1;
  private a0.c removedTargetIds_ = z.d;
  
  static
  {
    o localo = new o();
    DEFAULT_INSTANCE = localo;
    w.D(o.class, localo);
  }
  
  public static o G()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final String H()
  {
    return document_;
  }
  
  public final a0.c I()
  {
    return removedTargetIds_;
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
      return new o();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\000\001\001\004\003\000\001\000\001Ȉ\002'\004ဉ\000", new Object[] { "bitField0_", "document_", "removedTargetIds_", "readTime_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<o, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.o
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */