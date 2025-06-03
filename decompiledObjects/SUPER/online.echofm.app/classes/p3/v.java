package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class v
  extends com.google.crypto.tink.shaded.protobuf.x
  implements P
{
  private static final v DEFAULT_INSTANCE;
  public static final int KEY_VALUE_FIELD_NUMBER = 3;
  public static final int PARAMS_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 1;
  private h keyValue_ = h.p;
  private x params_;
  private int version_;
  
  static
  {
    v localv = new v();
    DEFAULT_INSTANCE = localv;
    com.google.crypto.tink.shaded.protobuf.x.Q(v.class, localv);
  }
  
  public static v Y()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b c0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static v d0(h paramh, p paramp)
  {
    return (v)com.google.crypto.tink.shaded.protobuf.x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void e0(h paramh)
  {
    paramh.getClass();
    keyValue_ = paramh;
  }
  
  private void g0(int paramInt)
  {
    version_ = paramInt;
  }
  
  public h Z()
  {
    return keyValue_;
  }
  
  public x a0()
  {
    x localx1 = params_;
    x localx2 = localx1;
    if (localx1 == null) {
      localx2 = x.X();
    }
    return localx2;
  }
  
  public int b0()
  {
    return version_;
  }
  
  public final void f0(x paramx)
  {
    paramx.getClass();
    params_ = paramx;
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
      return com.google.crypto.tink.shaded.protobuf.x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n", new Object[] { "version_", "params_", "keyValue_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new v();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b A(int paramInt)
    {
      s();
      v.V((v)p, paramInt);
      return this;
    }
    
    public b y(h paramh)
    {
      s();
      v.X((v)p, paramh);
      return this;
    }
    
    public b z(x paramx)
    {
      s();
      v.W((v)p, paramx);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.v
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */