package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class H
  extends x
  implements P
{
  private static final H DEFAULT_INSTANCE;
  public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
  public static final int KEK_URI_FIELD_NUMBER = 1;
  private static volatile X PARSER;
  private A dekTemplate_;
  private String kekUri_ = "";
  
  static
  {
    H localH = new H();
    DEFAULT_INSTANCE = localH;
    x.Q(H.class, localH);
  }
  
  public static H V()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static H Z(h paramh, p paramp)
  {
    return (H)x.K(DEFAULT_INSTANCE, paramh, paramp);
  }
  
  public A W()
  {
    A localA1 = dekTemplate_;
    A localA2 = localA1;
    if (localA1 == null) {
      localA2 = A.Y();
    }
    return localA2;
  }
  
  public String X()
  {
    return kekUri_;
  }
  
  public boolean Y()
  {
    boolean bool;
    if (dekTemplate_ != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\000\000\001Ȉ\002\t", new Object[] { "kekUri_", "dekTemplate_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new H();
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
 * Qualified Name:     p3.H
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */