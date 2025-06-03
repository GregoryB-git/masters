package l9;

import java.util.List;
import ka.e0;
import ma.a0.d;
import ma.b0;
import ma.b1;
import ma.e1;
import ma.f1;
import ma.h;
import ma.i;
import ma.n1;
import ma.o;
import ma.t0;
import ma.w;
import ma.w.a;
import ma.w.b;
import ma.w.f;

public final class e
  extends w<e, a>
  implements t0
{
  public static final int BASE_WRITES_FIELD_NUMBER = 4;
  public static final int BATCH_ID_FIELD_NUMBER = 1;
  private static final e DEFAULT_INSTANCE;
  public static final int LOCAL_WRITE_TIME_FIELD_NUMBER = 3;
  private static volatile b1<e> PARSER;
  public static final int WRITES_FIELD_NUMBER = 2;
  private a0.d<e0> baseWrites_;
  private int batchId_;
  private int bitField0_;
  private n1 localWriteTime_;
  private a0.d<e0> writes_;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    w.D(e.class, locale);
  }
  
  public e()
  {
    e1 locale1 = e1.d;
    writes_ = locale1;
    baseWrites_ = locale1;
  }
  
  public static void G(e parame, int paramInt)
  {
    batchId_ = paramInt;
  }
  
  public static void H(e parame, e0 parame0)
  {
    parame.getClass();
    a0.d locald = baseWrites_;
    if (!locald.g()) {
      baseWrites_ = w.A(locald);
    }
    baseWrites_.add(parame0);
  }
  
  public static void I(e parame, e0 parame0)
  {
    parame.getClass();
    a0.d locald = writes_;
    if (!locald.g()) {
      writes_ = w.A(locald);
    }
    writes_.add(parame0);
  }
  
  public static void J(e parame, n1 paramn1)
  {
    parame.getClass();
    localWriteTime_ = paramn1;
    bitField0_ |= 0x1;
  }
  
  public static a Q()
  {
    return (a)DEFAULT_INSTANCE.s();
  }
  
  public static e R(h paramh)
  {
    e locale = DEFAULT_INSTANCE;
    Object localObject = o.a();
    paramh = paramh.t();
    localObject = w.C(locale, paramh, (o)localObject);
    try
    {
      paramh.a(0);
      w.p((w)localObject);
      w.p((w)localObject);
      return (e)localObject;
    }
    catch (b0 paramh)
    {
      throw paramh;
    }
  }
  
  public static e S(byte[] paramArrayOfByte)
  {
    return (e)w.B(DEFAULT_INSTANCE, paramArrayOfByte);
  }
  
  public final e0 K(int paramInt)
  {
    return (e0)baseWrites_.get(paramInt);
  }
  
  public final int L()
  {
    return baseWrites_.size();
  }
  
  public final int M()
  {
    return batchId_;
  }
  
  public final n1 N()
  {
    n1 localn11 = localWriteTime_;
    n1 localn12 = localn11;
    if (localn11 == null) {
      localn12 = n1.I();
    }
    return localn12;
  }
  
  public final e0 O(int paramInt)
  {
    return (e0)writes_.get(paramInt);
  }
  
  public final int P()
  {
    return writes_.size();
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
      return new e();
    case 2: 
      return new f1(DEFAULT_INSTANCE, "\000\004\000\001\001\004\004\000\002\000\001\004\002\033\003ဉ\000\004\033", new Object[] { "bitField0_", "batchId_", "writes_", e0.class, "localWriteTime_", "baseWrites_", e0.class });
    case 1: 
      return null;
    }
    return Byte.valueOf((byte)1);
  }
  
  public static final class a
    extends w.a<e, a>
    implements t0
  {
    public a()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     l9.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */