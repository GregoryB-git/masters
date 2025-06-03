package l9;

import ka.a0.b;
import ka.a0.c;
import ma.b1;
import ma.f1;
import ma.h;
import ma.n1;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class c
  extends w<c, a>
  implements t0
{
  private static final c DEFAULT_INSTANCE;
  public static final int DOCUMENTS_FIELD_NUMBER = 6;
  public static final int LAST_LIMBO_FREE_SNAPSHOT_VERSION_FIELD_NUMBER = 7;
  public static final int LAST_LISTEN_SEQUENCE_NUMBER_FIELD_NUMBER = 4;
  private static volatile b1<c> PARSER;
  public static final int QUERY_FIELD_NUMBER = 5;
  public static final int RESUME_TOKEN_FIELD_NUMBER = 3;
  public static final int SNAPSHOT_VERSION_FIELD_NUMBER = 2;
  public static final int TARGET_ID_FIELD_NUMBER = 1;
  private int bitField0_;
  private n1 lastLimboFreeSnapshotVersion_;
  private long lastListenSequenceNumber_;
  private h resumeToken_ = h.b;
  private n1 snapshotVersion_;
  private int targetId_;
  private int targetTypeCase_ = 0;
  private Object targetType_;
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    w.D(c.class, localc);
  }
  
  public static void G(c paramc, a0.c paramc1)
  {
    paramc.getClass();
    targetType_ = paramc1;
    targetTypeCase_ = 5;
  }
  
  public static void H(c paramc, a0.b paramb)
  {
    paramc.getClass();
    targetType_ = paramb;
    targetTypeCase_ = 6;
  }
  
  public static void I(c paramc, n1 paramn1)
  {
    paramc.getClass();
    lastLimboFreeSnapshotVersion_ = paramn1;
    bitField0_ |= 0x2;
  }
  
  public static void J(c paramc)
  {
    lastLimboFreeSnapshotVersion_ = null;
    bitField0_ &= 0xFFFFFFFD;
  }
  
  public static void K(c paramc, int paramInt)
  {
    targetId_ = paramInt;
  }
  
  public static void L(c paramc, n1 paramn1)
  {
    paramc.getClass();
    snapshotVersion_ = paramn1;
    bitField0_ |= 0x1;
  }
  
  public static void M(c paramc, h paramh)
  {
    paramc.getClass();
    paramh.getClass();
    resumeToken_ = paramh;
  }
  
  public static void N(c paramc, long paramLong)
  {
    lastListenSequenceNumber_ = paramLong;
  }
  
  public static a W()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public static c X(byte[] paramArrayOfByte)
  {
    return (c)w.B(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public final a0.b O()
  {
    if (targetTypeCase_ == 6) {
      return (a0.b)targetType_;
    }
    return a0.b.H();
  }
  
  public final n1 P()
  {
    n1 localn11 = lastLimboFreeSnapshotVersion_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final long Q()
  {
    return lastListenSequenceNumber_;
  }
  
  public final a0.c R()
  {
    if (targetTypeCase_ == 5) {
      return (a0.c)targetType_;
    }
    return a0.c.I();
  }
  
  public final h S()
  {
    return resumeToken_;
  }
  
  public final n1 T()
  {
    n1 localn11 = snapshotVersion_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final int U()
  {
    return targetId_;
  }
  
  public final b V()
  {
    int i = targetTypeCase_;
    b localb;
    if (i != 0)
    {
      if (i != 5)
      {
        if (i != 6) {
          localb = null;
        } else {
          localb = b.b;
        }
      }
      else {
        localb = b.a;
      }
    }
    else {
      localb = b.c;
    }
    return localb;
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
      return new c();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\007\001\001\001\007\007\000\000\000\001\004\002ဉ\000\003\n\004\002\005<\000\006<\000\007ဉ\001", new Object[] { "targetType_", "targetTypeCase_", "bitField0_", "targetId_", "snapshotVersion_", "resumeToken_", "lastListenSequenceNumber_", a0.c.class, a0.b.class, "lastLimboFreeSnapshotVersion_" });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<c, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
  
  public static enum b
  {
    static
    {
      b localb1 = new b("QUERY", 0);
      a = localb1;
      b localb2 = new b("DOCUMENTS", 1);
      b = localb2;
      b localb3 = new b("TARGETTYPE_NOT_SET", 2);
      c = localb3;
      d = new b[] { localb1, localb2, localb3 };
    }
  }
}

/* Location:
 * Qualified Name:     l9.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */