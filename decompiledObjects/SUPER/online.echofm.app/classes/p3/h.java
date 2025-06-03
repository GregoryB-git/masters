package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class h
  extends x
  implements P
{
  private static final h DEFAULT_INSTANCE;
  public static final int IV_SIZE_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  private int ivSize_;
  
  static
  {
    h localh = new h();
    DEFAULT_INSTANCE = localh;
    x.Q(h.class, localh);
  }
  
  public static h W()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b Y()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public int X()
  {
    return ivSize_;
  }
  
  public final void Z(int paramInt)
  {
    ivSize_ = paramInt;
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
      return x.I(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\000\000\001\013", new Object[] { "ivSize_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new h();
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
      h.V((h)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */