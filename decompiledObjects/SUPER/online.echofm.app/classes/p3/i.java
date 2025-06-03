package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class i
  extends x
  implements P
{
  private static final i DEFAULT_INSTANCE;
  public static final int KEY_VALUE_FIELD_NUMBER = 3;
  public static final int PARAMS_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 1;
  private h keyValue_ = h.p;
  private k params_;
  private int version_;
  
  static
  {
    i locali = new i();
    DEFAULT_INSTANCE = locali;
    x.Q(i.class, locali);
  }
  
  public static b b0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static i c0(h paramh, p paramp)
  {
    return (i)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void d0(h paramh)
  {
    paramh.getClass();
    keyValue_ = paramh;
  }
  
  private void f0(int paramInt)
  {
    version_ = paramInt;
  }
  
  public h Y()
  {
    return keyValue_;
  }
  
  public k Z()
  {
    k localk1 = params_;
    k localk2 = localk1;
    if (localk1 == null) {
      localk2 = k.W();
    }
    return localk2;
  }
  
  public int a0()
  {
    return version_;
  }
  
  public final void e0(k paramk)
  {
    paramk.getClass();
    params_ = paramk;
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
    return new i();
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
      i.V((i)p, paramInt);
      return this;
    }
    
    public b y(h paramh)
    {
      s();
      i.X((i)p, paramh);
      return this;
    }
    
    public b z(k paramk)
    {
      s();
      i.W((i)p, paramk);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */