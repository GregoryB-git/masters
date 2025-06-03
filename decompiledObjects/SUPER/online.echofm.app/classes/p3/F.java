package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class F
  extends x
  implements P
{
  private static final F DEFAULT_INSTANCE;
  public static final int KEY_URI_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  private String keyUri_ = "";
  
  static
  {
    F localF = new F();
    DEFAULT_INSTANCE = localF;
    x.Q(F.class, localF);
  }
  
  public static F V()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static F X(h paramh, p paramp)
  {
    return (F)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  public String W()
  {
    return keyUri_;
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
      return x.I(DEFAULT_INSTANCE, "\000\001\000\000\001\001\001\000\000\000\001Ȉ", new Object[] { "keyUri_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new F();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
  }
}

/* Location:
 * Qualified Name:     p3.F
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */