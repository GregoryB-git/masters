package p3;

import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.X;
import com.google.crypto.tink.shaded.protobuf.h;
import com.google.crypto.tink.shaded.protobuf.x;
import com.google.crypto.tink.shaded.protobuf.x.a;
import com.google.crypto.tink.shaded.protobuf.x.b;
import com.google.crypto.tink.shaded.protobuf.x.d;
import com.google.crypto.tink.shaded.protobuf.z.a;
import com.google.crypto.tink.shaded.protobuf.z.b;

public final class y
  extends x
  implements P
{
  private static final y DEFAULT_INSTANCE;
  public static final int KEY_MATERIAL_TYPE_FIELD_NUMBER = 3;
  private static volatile X PARSER;
  public static final int TYPE_URL_FIELD_NUMBER = 1;
  public static final int VALUE_FIELD_NUMBER = 2;
  private int keyMaterialType_;
  private String typeUrl_ = "";
  private h value_ = h.p;
  
  static
  {
    y localy = new y();
    DEFAULT_INSTANCE = localy;
    x.Q(y.class, localy);
  }
  
  public static y Y()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b c0()
  {
    return (b)DEFAULT_INSTANCE.q();
  }
  
  public c Z()
  {
    c localc1 = c.c(keyMaterialType_);
    c localc2 = localc1;
    if (localc1 == null) {
      localc2 = c.u;
    }
    return localc2;
  }
  
  public String a0()
  {
    return typeUrl_;
  }
  
  public h b0()
  {
    return value_;
  }
  
  public final void d0(c paramc)
  {
    keyMaterialType_ = paramc.g();
  }
  
  public final void e0(String paramString)
  {
    paramString.getClass();
    typeUrl_ = paramString;
  }
  
  public final void f0(h paramh)
  {
    paramh.getClass();
    value_ = paramh;
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
      return x.I(DEFAULT_INSTANCE, "\000\003\000\000\001\003\003\000\000\000\001Ȉ\002\n\003\f", new Object[] { "typeUrl_", "value_", "keyMaterialType_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new y();
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
      y.W((y)p, paramh);
      return this;
    }
    
    public b y(y.c paramc)
    {
      s();
      y.X((y)p, paramc);
      return this;
    }
    
    public b z(String paramString)
    {
      s();
      y.V((y)p, paramString);
      return this;
    }
  }
  
  public static enum c
    implements z.a
  {
    public static final z.b v = new a();
    public final int o;
    
    static
    {
      c localc1 = new c("UNKNOWN_KEYMATERIAL", 0, 0);
      p = localc1;
      c localc2 = new c("SYMMETRIC", 1, 1);
      q = localc2;
      c localc3 = new c("ASYMMETRIC_PRIVATE", 2, 2);
      r = localc3;
      c localc4 = new c("ASYMMETRIC_PUBLIC", 3, 3);
      s = localc4;
      c localc5 = new c("REMOTE", 4, 4);
      t = localc5;
      c localc6 = new c("UNRECOGNIZED", 5, -1);
      u = localc6;
      w = new c[] { localc1, localc2, localc3, localc4, localc5, localc6 };
    }
    
    public c(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static c c(int paramInt)
    {
      if (paramInt != 0)
      {
        if (paramInt != 1)
        {
          if (paramInt != 2)
          {
            if (paramInt != 3)
            {
              if (paramInt != 4) {
                return null;
              }
              return t;
            }
            return s;
          }
          return r;
        }
        return q;
      }
      return p;
    }
    
    public final int g()
    {
      if (this != u) {
        return o;
      }
      throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
    }
    
    public class a
      implements z.b
    {}
  }
}

/* Location:
 * Qualified Name:     p3.y
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */