package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class b
  extends x
  implements P
{
  private static final b DEFAULT_INSTANCE;
  public static final int KEY_SIZE_FIELD_NUMBER = 1;
  public static final int PARAMS_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  private int keySize_;
  private c params_;
  
  static
  {
    b localb = new b();
    DEFAULT_INSTANCE = localb;
    x.Q(b.class, localb);
  }
  
  public static b Z()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static b a0(h paramh, p paramp)
  {
    return (b)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void c0(c paramc)
  {
    paramc.getClass();
    params_ = paramc;
  }
  
  public int X()
  {
    return keySize_;
  }
  
  public c Y()
  {
    c localc1 = params_;
    c localc2 = localc1;
    if (localc1 == null) {
      localc2 = c.W();
    }
    return localc2;
  }
  
  public final void b0(int paramInt)
  {
    keySize_ = paramInt;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\013\002\t", new Object[] { "keySize_", "params_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new b();
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
      b.V((b)p, paramInt);
      return this;
    }
    
    public b z(c paramc)
    {
      s();
      b.W((b)p, paramc);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */