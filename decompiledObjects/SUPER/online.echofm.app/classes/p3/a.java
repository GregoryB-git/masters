package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class a
  extends x
  implements P
{
  private static final a DEFAULT_INSTANCE;
  public static final int KEY_VALUE_FIELD_NUMBER = 2;
  public static final int PARAMS_FIELD_NUMBER = 3;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 1;
  private h keyValue_ = h.p;
  private c params_;
  private int version_;
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    x.Q(a.class, locala);
  }
  
  public static b b0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static a c0(h paramh, p paramp)
  {
    return (a)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  public h Y()
  {
    return keyValue_;
  }
  
  public c Z()
  {
    c localc1 = params_;
    c localc2 = localc1;
    if (localc1 == null) {
      localc2 = c.W();
    }
    return localc2;
  }
  
  public int a0()
  {
    return version_;
  }
  
  public final void d0(h paramh)
  {
    paramh.getClass();
    keyValue_ = paramh;
  }
  
  public final void e0(c paramc)
  {
    paramc.getClass();
    params_ = paramc;
  }
  
  public final void f0(int paramInt)
  {
    version_ = paramInt;
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
      return x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001\013\002\n\003\t", new Object[] { "version_", "keyValue_", "params_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new a();
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
      a.V((a)p, paramInt);
      return this;
    }
    
    public b y(h paramh)
    {
      s();
      a.W((a)p, paramh);
      return this;
    }
    
    public b z(c paramc)
    {
      s();
      a.X((a)p, paramc);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */