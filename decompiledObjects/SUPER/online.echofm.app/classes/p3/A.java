package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class A
  extends x
  implements P
{
  private static final A DEFAULT_INSTANCE;
  public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 3;
  private static volatile X PARSER;
  public static final int TYPE_URL_FIELD_NUMBER = 1;
  public static final int VALUE_FIELD_NUMBER = 2;
  private int outputPrefixType_;
  private String typeUrl_ = "";
  private h value_ = h.p;
  
  static
  {
    A localA = new A();
    DEFAULT_INSTANCE = localA;
    x.Q(A.class, localA);
  }
  
  public static A Y()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b c0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  private void e0(String paramString)
  {
    paramString.getClass();
    typeUrl_ = paramString;
  }
  
  private void f0(h paramh)
  {
    paramh.getClass();
    value_ = paramh;
  }
  
  public I Z()
  {
    I localI1 = I.c(outputPrefixType_);
    I localI2 = localI1;
    if (localI1 == null) {
      localI2 = I.u;
    }
    return localI2;
  }
  
  public String a0()
  {
    return typeUrl_;
  }
  
  public h b0()
  {
    return value_;
  }
  
  public final void d0(I paramI)
  {
    outputPrefixType_ = paramI.g();
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
      return x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001Ȉ\002\n\003\f", new Object[] { "typeUrl_", "value_", "outputPrefixType_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new A();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public b A(h paramh)
    {
      s();
      A.W((A)p, paramh);
      return this;
    }
    
    public b y(I paramI)
    {
      s();
      A.X((A)p, paramI);
      return this;
    }
    
    public b z(String paramString)
    {
      s();
      A.V((A)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.A
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */