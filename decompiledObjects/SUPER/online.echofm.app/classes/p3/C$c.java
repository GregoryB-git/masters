package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;

public final class C$c
  extends x
  implements P
{
  private static final c DEFAULT_INSTANCE;
  public static final int KEY_DATA_FIELD_NUMBER = 1;
  public static final int KEY_ID_FIELD_NUMBER = 3;
  public static final int OUTPUT_PREFIX_TYPE_FIELD_NUMBER = 4;
  private static volatile X PARSER;
  public static final int STATUS_FIELD_NUMBER = 2;
  private y keyData_;
  private int keyId_;
  private int outputPrefixType_;
  private int status_;
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    x.Q(c.class, localc);
  }
  
  public static a e0()
  {
    return (a)DEFAULT_INSTANCE.q();
  }
  
  private void h0(I paramI)
  {
    outputPrefixType_ = paramI.g();
  }
  
  public y Z()
  {
    y localy1 = keyData_;
    y localy2 = localy1;
    if (localy1 == null) {
      localy2 = y.Y();
    }
    return localy2;
  }
  
  public int a0()
  {
    return keyId_;
  }
  
  public I b0()
  {
    I localI1 = I.c(outputPrefixType_);
    I localI2 = localI1;
    if (localI1 == null) {
      localI2 = I.u;
    }
    return localI2;
  }
  
  public z c0()
  {
    z localz1 = z.c(status_);
    z localz2 = localz1;
    if (localz1 == null) {
      localz2 = z.t;
    }
    return localz2;
  }
  
  public boolean d0()
  {
    boolean bool;
    if (keyData_ != null) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void f0(y paramy)
  {
    paramy.getClass();
    keyData_ = paramy;
  }
  
  public final void g0(int paramInt)
  {
    keyId_ = paramInt;
  }
  
  public final void i0(z paramz)
  {
    status_ = paramz.g();
  }
  
  public final Object t(x.d paramd, Object paramObject1, Object paramObject2)
  {
    switch (C.a.a[paramd.ordinal()])
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
      return x.I(DEFAULT_INSTANCE, "\000\004\000\000\001\004\004\000\000\000\001\t\002\f\003\013\004\f", new Object[] { "keyData_", "status_", "keyId_", "outputPrefixType_" });
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
    
    public a A(I paramI)
    {
      s();
      C.c.W((C.c)p, paramI);
      return this;
    }
    
    public a B(z paramz)
    {
      s();
      C.c.X((C.c)p, paramz);
      return this;
    }
    
    public a y(y paramy)
    {
      s();
      C.c.V((C.c)p, paramy);
      return this;
    }
    
    public a z(int paramInt)
    {
      s();
      C.c.Y((C.c)p, paramInt);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     p3.C.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */