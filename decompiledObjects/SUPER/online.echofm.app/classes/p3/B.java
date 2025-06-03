package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class B
  extends x
  implements P
{
  public static final int CATALOGUE_NAME_FIELD_NUMBER = 5;
  private static final B DEFAULT_INSTANCE;
  public static final int KEY_MANAGER_VERSION_FIELD_NUMBER = 3;
  public static final int NEW_KEY_ALLOWED_FIELD_NUMBER = 4;
  private static volatile X PARSER;
  public static final int PRIMITIVE_NAME_FIELD_NUMBER = 1;
  public static final int TYPE_URL_FIELD_NUMBER = 2;
  private String catalogueName_ = "";
  private int keyManagerVersion_;
  private boolean newKeyAllowed_;
  private String primitiveName_ = "";
  private String typeUrl_ = "";
  
  static
  {
    B localB = new B();
    DEFAULT_INSTANCE = localB;
    x.Q(B.class, localB);
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
      return x.I(DEFAULT_INSTANCE, "\000\005\000\000\001\005\005\000\000\000\001Ȉ\002Ȉ\003\013\004\007\005Ȉ", new Object[] { "primitiveName_", "typeUrl_", "keyManagerVersion_", "newKeyAllowed_", "catalogueName_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new B();
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
 * Qualified Name:     p3.B
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */