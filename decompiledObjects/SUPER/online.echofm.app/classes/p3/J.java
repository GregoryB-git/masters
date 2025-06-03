package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;
import com.google.crypto.tink.shaded.protobuf.z.d;

public final class J
  extends x
  implements P
{
  public static final int CONFIG_NAME_FIELD_NUMBER = 1;
  private static final J DEFAULT_INSTANCE;
  public static final int ENTRY_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  private String configName_ = "";
  private z.d entry_ = x.u();
  
  static
  {
    J localJ = new J();
    DEFAULT_INSTANCE = localJ;
    x.Q(J.class, localJ);
  }
  
  public static J V()
  {
    return DEFAULT_INSTANCE;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\001\000\001Ȉ\002\033", new Object[] { "configName_", "entry_", B.class });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new J();
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
 * Qualified Name:     p3.J
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */