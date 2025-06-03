package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class q
  extends x
  implements P
{
  private static final q DEFAULT_INSTANCE;
  public static final int KEY_SIZE_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 2;
  private int keySize_;
  private int version_;
  
  static
  {
    q localq = new q();
    DEFAULT_INSTANCE = localq;
    x.Q(q.class, localq);
  }
  
  public static b X()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static q Y(h paramh, p paramp)
  {
    return (q)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void Z(int paramInt)
  {
    keySize_ = paramInt;
  }
  
  public int W()
  {
    return keySize_;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001\013\002\013", new Object[] { "keySize_", "version_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new q();
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
      q.V((q)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.q
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */