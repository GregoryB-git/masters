package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class w
  extends com.google.crypto.tink.shaded.protobuf.x
  implements P
{
  private static final w DEFAULT_INSTANCE;
  public static final int KEY_SIZE_FIELD_NUMBER = 2;
  public static final int PARAMS_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 3;
  private int keySize_;
  private x params_;
  private int version_;
  
  static
  {
    w localw = new w();
    DEFAULT_INSTANCE = localw;
    com.google.crypto.tink.shaded.protobuf.x.Q(w.class, localw);
  }
  
  public static w X()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b a0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static w b0(h paramh, p paramp)
  {
    return (w)com.google.crypto.tink.shaded.protobuf.x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void c0(int paramInt)
  {
    keySize_ = paramInt;
  }
  
  private void d0(x paramx)
  {
    paramx.getClass();
    params_ = paramx;
  }
  
  public int Y()
  {
    return keySize_;
  }
  
  public x Z()
  {
    x localx1 = params_;
    x localx2 = localx1;
    if (localx1 == null) {
      localx2 = x.X();
    }
    return localx2;
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
      return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001\t\002\013\003\013", new Object[] { "params_", "keySize_", "version_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new w();
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
      w.W((w)p, paramInt);
      return this;
    }
    
    public b z(x paramx)
    {
      s();
      w.V((w)p, paramx);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.w
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */