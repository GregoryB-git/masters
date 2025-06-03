package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class e
  extends x
  implements P
{
  public static final int AES_CTR_KEY_FORMAT_FIELD_NUMBER = 1;
  private static final e DEFAULT_INSTANCE;
  public static final int HMAC_KEY_FORMAT_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  private g aesCtrKeyFormat_;
  private w hmacKeyFormat_;
  
  static
  {
    e locale = new e();
    DEFAULT_INSTANCE = locale;
    x.Q(e.class, locale);
  }
  
  public static b Z()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static e a0(h paramh, p paramp)
  {
    return (e)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  public g X()
  {
    g localg1 = aesCtrKeyFormat_;
    g localg2 = localg1;
    if (localg1 == null) {
      localg2 = g.X();
    }
    return localg2;
  }
  
  public w Y()
  {
    w localw1 = hmacKeyFormat_;
    w localw2 = localw1;
    if (localw1 == null) {
      localw2 = w.X();
    }
    return localw2;
  }
  
  public final void b0(g paramg)
  {
    paramg.getClass();
    aesCtrKeyFormat_ = paramg;
  }
  
  public final void c0(w paramw)
  {
    paramw.getClass();
    hmacKeyFormat_ = paramw;
  }
  
  public final Object t(x.d paramd, Object paramObject1, Object paramObject2)
  {
    switch (a.a[paramd.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramd = (x.d)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramd = (x.d)paramObject1;
          if (paramObject1 == null)
          {
            paramd = new com/google/crypto/tink/shaded/protobuf/x$b;
            paramd.<init>(DEFAULT_INSTANCE);
            PARSER = paramd;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramd;
      }
      return paramd;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\t\002\t", new Object[] { "aesCtrKeyFormat_", "hmacKeyFormat_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new e();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b y(g paramg)
    {
      s();
      e.V((e)p, paramg);
      return this;
    }
    
    public b z(w paramw)
    {
      s();
      e.W((e)p, paramw);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.e
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */