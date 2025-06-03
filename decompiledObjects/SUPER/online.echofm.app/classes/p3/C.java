package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.p;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;
import com.google.crypto.tink.shaded.protobuf.z.d;
import java.io.InputStream;
import java.util.Collections;
import java.util.List;

public final class C
  extends x
  implements P
{
  private static final C DEFAULT_INSTANCE;
  public static final int KEY_FIELD_NUMBER = 2;
  private static volatile X PARSER;
  public static final int PRIMARY_KEY_ID_FIELD_NUMBER = 1;
  private z.d key_ = x.u();
  private int primaryKeyId_;
  
  static
  {
    C localC = new C();
    DEFAULT_INSTANCE = localC;
    x.Q(C.class, localC);
  }
  
  public static b d0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public static C e0(InputStream paramInputStream, p paramp)
  {
    return (C)x.L(DEFAULT_INSTANCE, paramInputStream, paramp);
  }
  
  public static C f0(byte[] paramArrayOfByte, p paramp)
  {
    return (C)x.M(DEFAULT_INSTANCE, paramArrayOfByte, paramp);
  }
  
  public final void X(c paramc)
  {
    paramc.getClass();
    Y();
    key_.add(paramc);
  }
  
  public final void Y()
  {
    z.d locald = key_;
    if (!locald.p()) {
      key_ = x.G(locald);
    }
  }
  
  public c Z(int paramInt)
  {
    return (c)key_.get(paramInt);
  }
  
  public int a0()
  {
    return key_.size();
  }
  
  public List b0()
  {
    return key_;
  }
  
  public int c0()
  {
    return primaryKeyId_;
  }
  
  public final void g0(int paramInt)
  {
    primaryKeyId_ = paramInt;
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
      return x.I(DEFAULT_INSTANCE, "\000\002\000\000\001\002\002\000\001\000\001\013\002\033", new Object[] { "primaryKeyId_", "key_", c.class });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new C();
  }
  
  public static final class b
    extends x.a
    implements P
  {
    public b()
    {
      super();
    }
    
    public int A()
    {
      return ((C)p).a0();
    }
    
    public List B()
    {
      return Collections.unmodifiableList(((C)p).b0());
    }
    
    public b C(int paramInt)
    {
      s();
      C.V((C)p, paramInt);
      return this;
    }
    
    public b y(C.c paramc)
    {
      s();
      C.W((C)p, paramc);
      return this;
    }
    
    public C.c z(int paramInt)
    {
      return ((C)p).Z(paramInt);
    }
  }
  
  public static final class c
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
}

/* Location:
 * Qualified Name:     p3.C
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */