package N4;

import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.m0.b;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;
import java.util.Map;

public final class c
  extends r
  implements L
{
  public static final int ANDROID_APP_INFO_FIELD_NUMBER = 3;
  public static final int APPLICATION_PROCESS_STATE_FIELD_NUMBER = 5;
  public static final int APP_INSTANCE_ID_FIELD_NUMBER = 2;
  public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 6;
  private static final c DEFAULT_INSTANCE;
  public static final int GOOGLE_APP_ID_FIELD_NUMBER = 1;
  private static volatile T PARSER;
  private a androidAppInfo_;
  private String appInstanceId_ = "";
  private int applicationProcessState_;
  private int bitField0_;
  private E customAttributes_ = E.f();
  private String googleAppId_ = "";
  
  static
  {
    c localc = new c();
    DEFAULT_INSTANCE = localc;
    r.Q(c.class, localc);
  }
  
  public static c a0()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b h0()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public a Z()
  {
    a locala1 = androidAppInfo_;
    a locala2 = locala1;
    if (locala1 == null) {
      locala2 = a.X();
    }
    return locala2;
  }
  
  public final Map b0()
  {
    return g0();
  }
  
  public boolean c0()
  {
    boolean bool;
    if ((bitField0_ & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean d0()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean e0()
  {
    boolean bool;
    if ((bitField0_ & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean f0()
  {
    int i = bitField0_;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public final E g0()
  {
    if (!customAttributes_.n()) {
      customAttributes_ = customAttributes_.s();
    }
    return customAttributes_;
  }
  
  public final void i0(a parama)
  {
    parama.getClass();
    androidAppInfo_ = parama;
    bitField0_ |= 0x4;
  }
  
  public final void j0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x2;
    appInstanceId_ = paramString;
  }
  
  public final void k0(d paramd)
  {
    applicationProcessState_ = paramd.g();
    bitField0_ |= 0x8;
  }
  
  public final void l0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x1;
    googleAppId_ = paramString;
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
      paramc = d.c();
      paramObject1 = c.a;
      return r.O(DEFAULT_INSTANCE, "\001\005\000\001\001\006\005\001\000\000\001ဈ\000\002ဈ\001\003ဉ\002\005ဌ\003\0062", new Object[] { "bitField0_", "googleAppId_", "appInstanceId_", "androidAppInfo_", "applicationProcessState_", paramc, "customAttributes_", paramObject1 });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new c();
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
    
    public boolean D()
    {
      return ((c)p).d0();
    }
    
    public b E(Map paramMap)
    {
      y();
      c.W((c)p).putAll(paramMap);
      return this;
    }
    
    public b F(a.b paramb)
    {
      y();
      c.Y((c)p, (a)paramb.v());
      return this;
    }
    
    public b G(String paramString)
    {
      y();
      c.X((c)p, paramString);
      return this;
    }
    
    public b H(d paramd)
    {
      y();
      c.V((c)p, paramd);
      return this;
    }
    
    public b I(String paramString)
    {
      y();
      c.U((c)p, paramString);
      return this;
    }
  }
  
  public static final abstract class c
  {
    public static final D a;
    
    static
    {
      m0.b localb = m0.b.y;
      a = D.d(localb, "", localb, "");
    }
  }
}

/* Location:
 * Qualified Name:     N4.c
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */