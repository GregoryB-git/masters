package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;
import java.io.InputStream;

public final class t
  extends x
  implements P
{
  private static final t DEFAULT_INSTANCE;
  public static final int ENCRYPTED_KEYSET_FIELD_NUMBER = 2;
  public static final int KEYSET_INFO_FIELD_NUMBER = 3;
  private static volatile X PARSER;
  private h encryptedKeyset_ = h.p;
  private D keysetInfo_;
  
  static
  {
    t localt = new t();
    DEFAULT_INSTANCE = localt;
    x.Q(t.class, localt);
  }
  
  public static b Y()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static t Z(InputStream paramInputStream, p paramp)
  {
    return (t)x.L(DEFAULT_INSTANCE, paramInputStream, paramp);
  }
  
  public h X()
  {
    return encryptedKeyset_;
  }
  
  public final void a0(h paramh)
  {
    paramh.getClass();
    encryptedKeyset_ = paramh;
  }
  
  public final void b0(D paramD)
  {
    paramD.getClass();
    keysetInfo_ = paramD;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\002\003\002\000\000\000\002\n\003\t", new Object[] { "encryptedKeyset_", "keysetInfo_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new t();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b y(h paramh)
    {
      s();
      t.V((t)p, paramh);
      return this;
    }
    
    public b z(D paramD)
    {
      s();
      t.W((t)p, paramD);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.t
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */