package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;

public final class a
  extends r
  implements L
{
  private static final a DEFAULT_INSTANCE;
  public static final int PACKAGE_NAME_FIELD_NUMBER = 1;
  private static volatile T PARSER;
  public static final int SDK_VERSION_FIELD_NUMBER = 2;
  public static final int VERSION_NAME_FIELD_NUMBER = 3;
  private int bitField0_;
  private String packageName_ = "";
  private String sdkVersion_ = "";
  private String versionName_ = "";
  
  static
  {
    a locala = new a();
    DEFAULT_INSTANCE = locala;
    r.Q(a.class, locala);
  }
  
  public static a X()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b a0()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public boolean Y()
  {
    int i = bitField0_;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public boolean Z()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void b0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x1;
    packageName_ = paramString;
  }
  
  public final void c0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x2;
    sdkVersion_ = paramString;
  }
  
  public final void d0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x4;
    versionName_ = paramString;
  }
  
  public final Object x(r.c paramc, Object paramObject1, Object paramObject2)
  {
    switch (a.a[paramc.ordinal()])
    {
    default: 
      throw new UnsupportedOperationException();
    case 7: 
      return null;
    case 6: 
      return Byte.valueOf((byte)1);
    case 5: 
      paramObject1 = PARSER;
      paramc = (r.c)paramObject1;
      if (paramObject1 == null)
      {
        try
        {
          paramObject1 = PARSER;
          paramc = (r.c)paramObject1;
          if (paramObject1 == null)
          {
            paramc = new com/google/protobuf/r$b;
            paramc.<init>(DEFAULT_INSTANCE);
            PARSER = paramc;
          }
        }
        finally
        {
          break label118;
        }
        break label123;
        throw paramc;
      }
      return paramc;
    case 4: 
      return DEFAULT_INSTANCE;
    case 3: 
      return r.O(DEFAULT_INSTANCE, "\001\003\000\001\001\003\003\000\000\000\001ဈ\000\002ဈ\001\003ဈ\002", new Object[] { "bitField0_", "packageName_", "sdkVersion_", "versionName_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new a();
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
    
    public b D(String paramString)
    {
      y();
      a.U((a)p, paramString);
      return this;
    }
    
    public b E(String paramString)
    {
      y();
      a.V((a)p, paramString);
      return this;
    }
    
    public b F(String paramString)
    {
      y();
      a.W((a)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     N4.a
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */