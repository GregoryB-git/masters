package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class d
  extends x
  implements P
{
  public static final int AES_CTR_KEY_FIELD_NUMBER = 2;
  private static final d DEFAULT_INSTANCE;
  public static final int HMAC_KEY_FIELD_NUMBER = 3;
  private static volatile X PARSER;
  public static final int VERSION_FIELD_NUMBER = 1;
  private f aesCtrKey_;
  private v hmacKey_;
  private int version_;
  
  static
  {
    d locald = new d();
    DEFAULT_INSTANCE = locald;
    x.Q(d.class, locald);
  }
  
  public static b b0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static d c0(h paramh, p paramp)
  {
    return (d)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  private void f0(int paramInt)
  {
    version_ = paramInt;
  }
  
  public f Y()
  {
    f localf1 = aesCtrKey_;
    f localf2 = localf1;
    if (localf1 == null) {
      localf2 = f.Y();
    }
    return localf2;
  }
  
  public v Z()
  {
    v localv1 = hmacKey_;
    v localv2 = localv1;
    if (localv1 == null) {
      localv2 = v.Y();
    }
    return localv2;
  }
  
  public int a0()
  {
    return version_;
  }
  
  public final void d0(f paramf)
  {
    paramf.getClass();
    aesCtrKey_ = paramf;
  }
  
  public final void e0(v paramv)
  {
    paramv.getClass();
    hmacKey_ = paramv;
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
      return x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001\013\002\t\003\t", new Object[] { "version_", "aesCtrKey_", "hmacKey_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new d();
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
      d.V((d)p, paramInt);
      return this;
    }
    
    public b y(f paramf)
    {
      s();
      d.W((d)p, paramf);
      return this;
    }
    
    public b z(v paramv)
    {
      s();
      d.X((d)p, paramv);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */