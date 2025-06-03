package N4;

import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;
import com.google.protobuf.t.e;
import java.util.List;

public final class g
  extends r
  implements L
{
  public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
  public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
  private static final g DEFAULT_INSTANCE;
  public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
  private static volatile T PARSER;
  public static final int SESSION_ID_FIELD_NUMBER = 1;
  private t.e androidMemoryReadings_ = r.z();
  private int bitField0_;
  private t.e cpuMetricReadings_ = r.z();
  private f gaugeMetadata_;
  private String sessionId_ = "";
  
  static
  {
    g localg = new g();
    DEFAULT_INSTANCE = localg;
    r.Q(g.class, localg);
  }
  
  public static g e0()
  {
    return DEFAULT_INSTANCE;
  }
  
  public static b i0()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public final void Y(b paramb)
  {
    paramb.getClass();
    a0();
    androidMemoryReadings_.add(paramb);
  }
  
  public final void Z(e parame)
  {
    parame.getClass();
    b0();
    cpuMetricReadings_.add(parame);
  }
  
  public final void a0()
  {
    t.e locale = androidMemoryReadings_;
    if (!locale.p()) {
      androidMemoryReadings_ = r.M(locale);
    }
  }
  
  public final void b0()
  {
    t.e locale = cpuMetricReadings_;
    if (!locale.p()) {
      cpuMetricReadings_ = r.M(locale);
    }
  }
  
  public int c0()
  {
    return androidMemoryReadings_.size();
  }
  
  public int d0()
  {
    return cpuMetricReadings_.size();
  }
  
  public f f0()
  {
    f localf1 = gaugeMetadata_;
    f localf2 = localf1;
    if (localf1 == null) {
      localf2 = f.X();
    }
    return localf2;
  }
  
  public boolean g0()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean h0()
  {
    int i = bitField0_;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public final void j0(f paramf)
  {
    paramf.getClass();
    gaugeMetadata_ = paramf;
    bitField0_ |= 0x2;
  }
  
  public final void k0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x1;
    sessionId_ = paramString;
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
      return r.O(DEFAULT_INSTANCE, "\001\004\000\001\001\004\004\000\002\000\001ဈ\000\002\033\003ဉ\001\004\033", new Object[] { "bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", b.class });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new g();
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
    
    public b D(b paramb)
    {
      y();
      g.V((g)p, paramb);
      return this;
    }
    
    public b E(e parame)
    {
      y();
      g.X((g)p, parame);
      return this;
    }
    
    public b F(f paramf)
    {
      y();
      g.W((g)p, paramf);
      return this;
    }
    
    public b G(String paramString)
    {
      y();
      g.U((g)p, paramString);
      return this;
    }
  }
}

/* Location:
 * Qualified Name:     N4.g
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */