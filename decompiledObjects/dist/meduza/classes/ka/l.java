package ka;

import ma.a0.c;
import ma.b1;
import ma.f1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;
import ma.z;

public final class l
  extends w<l, a>
  implements t0
{
  private static final l DEFAULT_INSTANCE;
  public static final int DOCUMENT_FIELD_NUMBER = 1;
  private static volatile b1<l> PARSER;
  public static final int REMOVED_TARGET_IDS_FIELD_NUMBER = 6;
  public static final int TARGET_IDS_FIELD_NUMBER = 5;
  private int bitField0_;
  private k document_;
  private int removedTargetIdsMemoizedSerializedSize = -1;
  private a0.c removedTargetIds_;
  private int targetIdsMemoizedSerializedSize = -1;
  private a0.c targetIds_;
  
  static
  {
    l locall = new l();
    DEFAULT_INSTANCE = locall;
    w.D(l.class, locall);
  }
  
  public l()
  {
    z localz = z.d;
    targetIds_ = localz;
    removedTargetIds_ = localz;
  }
  
  public static l G()
  {
    return DEFAULT_INSTANCE;
  }
  
  public final k H()
  {
    k localk1 = document_;
    k localk2 = localk1;
    if (localk1 == null) {
      localk2 = k.J();
    }
    return localk2;
  }
  
  public final a0.c I()
  {
    return removedTargetIds_;
  }
  
  public final a0.c J()
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
      return new l();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\003\000\001\001\006\003\000\002\000\001ဉ\000\005'\006'", new Object[] { "bitField0_", "document_", "targetIds_", "removedTargetIds_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<l, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     ka.l
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */