package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class f
  extends x
  implements P
{
  private static final f DEFAULT_INSTANCE;
  public static final int KEY_VALUE_FIELD_NUMBER = 3;
  public static final int PARAMS_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 1;
  private com.google.crypto.tink.shaded.protobuf.h keyValue_ = com.google.crypto.tink.shaded.protobuf.h.p;
  private h params_;
  private int version_;
  
  static
  {
    f localf = new f();
    DEFAULT_INSTANCE = localf;
    x.Q(f.class, localf);
  }
  
  public static f Y()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b c0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static f d0(com.google.crypto.tink.shaded.protobuf.h paramh, p paramp)
  {
    return (f)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void e0(com.google.crypto.tink.shaded.protobuf.h paramh)
  {
    paramh.getClass();
    keyValue_ = paramh;
  }
  
  private void g0(int paramInt)
  {
    version_ = paramInt;
  }
  
  public com.google.crypto.tink.shaded.protobuf.h Z()
  {
    return keyValue_;
  }
  
  public h a0()
  {
    h localh1 = params_;
    h localh2 = localh1;
    if (localh1 == null) {
      localh2 = h.W();
    }
    return localh2;
  }
  
  public int b0()
  {
    return version_;
  }
  
  public final void f0(h paramh)
  {
    paramh.getClass();
    params_ = paramh;
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
      return x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\n", new Object[] { "version_", "params_", "keyValue_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new f();
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
      f.V((f)p, paramInt);
      return this;
    }
    
    public b y(com.google.crypto.tink.shaded.protobuf.h paramh)
    {
      s();
      f.X((f)p, paramh);
      return this;
    }
    
    public b z(h paramh)
    {
      s();
      f.W((f)p, paramh);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.f
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */