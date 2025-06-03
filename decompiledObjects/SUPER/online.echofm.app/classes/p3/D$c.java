package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class D$c
  extends x
  implements P
{
  private static final c DEFAULT_INSTANCE;
  public static final int KEY_ID_FIELD_NUMBER = 3;
  public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
  private static volatile X PARSER;
  public static final int STATUS_FIELD_NUMBER = 2;
  public static final int TYPE_URL_FIELD_NUMBER = 1;
  private int keyId_;
  private int outputPrefixType_;
  private int status_;
  private String typeUrl_ = "";
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    x.Q(c.class, localc);
  }
  
  public static a a0()
  {
    return (a)DEFAULT_INSTANCE.q();
  }
  
  private void b0(int paramInt)
  {
    keyId_ = paramInt;
  }
  
  private void c0(I paramI)
  {
    outputPrefixType_ = paramI.g();
  }
  
  private void d0(z paramz)
  {
    status_ = paramz.g();
  }
  
  private void e0(String paramString)
  {
    paramString.getClass();
    typeUrl_ = paramString;
  }
  
  public int Z()
  {
    return keyId_;
  }
  
  public final Object t(x.d paramd, Object paramObject1, Object paramObject2)
  {
    switch (D.a.a[paramd.ordinal()])
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
      return x.I(DEFAULT_INSTANCE, "\000\004\000\000\001\004\004\000\000\000\001Ȉ\002\f\003\013\004\f", new Object[] { "typeUrl_", "status_", "keyId_", "outputPrefixType_" });
    case 2: 
      label118:
      label123:
      return new a(null);
    }
    return new c();
  }
  
  public static final class a
    extends x.a
    implements P
  {
    public a()
    {
      super();
    }
    
    public a A(z paramz)
    {
      s();
      D.c.X((D.c)p, paramz);
      return this;
    }
    
    public a B(String paramString)
    {
      s();
      D.c.V((D.c)p, paramString);
      return this;
    }
    
    public a y(int paramInt)
    {
      s();
      D.c.Y((D.c)p, paramInt);
      return this;
    }
    
    public a z(I paramI)
    {
      s();
      D.c.W((D.c)p, paramI);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.D.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */