package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class m
  extends x
  implements P
{
  private static final m DEFAULT_INSTANCE;
  public static final int KEY_SIZE_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 3;
  private int keySize_;
  private int version_;
  
  static
  {
    m localm = new m();
    DEFAULT_INSTANCE = localm;
    x.Q(m.class, localm);
  }
  
  public static b X()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static m Y(h paramh, p paramp)
  {
    return (m)x.K(DEFAULT_INSTANCE, paramh, paramp);
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\002\003\002\000\000\000\002\013\003\013", new Object[] { "keySize_", "version_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new m();
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
      m.V((m)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */