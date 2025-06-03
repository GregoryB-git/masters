package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class g
  extends x
  implements P
{
  private static final g DEFAULT_INSTANCE;
  public static final int KEY_SIZE_FIELD_NUMBER = 2;
  public static final int PARAMS_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  private int keySize_;
  private h params_;
  
  static
  {
    g localg = new g();
    DEFAULT_INSTANCE = localg;
    x.Q(g.class, localg);
  }
  
  public static g X()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b a0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static g b0(com.google.crypto.tink.shaded.protobuf.h paramh, p paramp)
  {
    return (g)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void c0(int paramInt)
  {
    keySize_ = paramInt;
  }
  
  private void d0(h paramh)
  {
    paramh.getClass();
    params_ = paramh;
  }
  
  public int Y()
  {
    return keySize_;
  }
  
  public h Z()
  {
    h localh1 = params_;
    h localh2 = localh1;
    if (localh1 == null) {
      localh2 = h.W();
    }
    return localh2;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\t\002\013", new Object[] { "params_", "keySize_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new g();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b y(int paramInt)
    {
      s();
      g.W((g)p, paramInt);
      return this;
    }
    
    public b z(h paramh)
    {
      s();
      g.V((g)p, paramh);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */