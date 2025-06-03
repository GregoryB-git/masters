package N4;

import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;

public final class i
  extends r
  implements j
{
  public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
  private static final i DEFAULT_INSTANCE;
  public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
  public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
  private static volatile T PARSER;
  public static final int TRACE_METRIC_FIELD_NUMBER = 2;
  public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
  private c applicationInfo_;
  private int bitField0_;
  private g gaugeMetric_;
  private h networkRequestMetric_;
  private m traceMetric_;
  private n transportInfo_;
  
  static
  {
    i locali = new i();
    DEFAULT_INSTANCE = locali;
    r.Q(i.class, locali);
  }
  
  public static b a0()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public c Y()
  {
    c localc1 = applicationInfo_;
    c localc2 = localc1;
    if (localc1 == null) {
      localc2 = c.a0();
    }
    return localc2;
  }
  
  public boolean Z()
  {
    int i = bitField0_;
    boolean bool = true;
    if ((i & 0x1) == 0) {
      bool = false;
    }
    return bool;
  }
  
  public final void b0(c paramc)
  {
    paramc.getClass();
    applicationInfo_ = paramc;
    bitField0_ |= 0x1;
  }
  
  public final void c0(g paramg)
  {
    paramg.getClass();
    gaugeMetric_ = paramg;
    bitField0_ |= 0x8;
  }
  
  public final void d0(h paramh)
  {
    paramh.getClass();
    networkRequestMetric_ = paramh;
    bitField0_ |= 0x4;
  }
  
  public final void e0(m paramm)
  {
    paramm.getClass();
    traceMetric_ = paramm;
    bitField0_ |= 0x2;
  }
  
  public boolean f()
  {
    boolean bool;
    if ((bitField0_ & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public g g()
  {
    g localg1 = gaugeMetric_;
    g localg2 = localg1;
    if (localg1 == null) {
      localg2 = g.e0();
    }
    return localg2;
  }
  
  public boolean l()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public m n()
  {
    m localm1 = traceMetric_;
    m localm2 = localm1;
    if (localm1 == null) {
      localm2 = m.n0();
    }
    return localm2;
  }
  
  public boolean o()
  {
    boolean bool;
    if ((bitField0_ & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public h p()
  {
    h localh1 = networkRequestMetric_;
    h localh2 = localh1;
    if (localh1 == null) {
      localh2 = h.m0();
    }
    return localh2;
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
      return r.O(DEFAULT_INSTANCE, "\001\005\000\001\001\005\005\000\000\000\001ဉ\000\002ဉ\001\003ဉ\002\004ဉ\003\005ဉ\004", new Object[] { "bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_" });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new i();
  }
  
  public static final class b
    extends r.a
    implements j
  {
    public b()
    {
      super();
    }
    
    public b D(c.b paramb)
    {
      y();
      i.U((i)p, (c)paramb.v());
      return this;
    }
    
    public b E(g paramg)
    {
      y();
      i.V((i)p, paramg);
      return this;
    }
    
    public b F(h paramh)
    {
      y();
      i.X((i)p, paramh);
      return this;
    }
    
    public b G(m paramm)
    {
      y();
      i.W((i)p, paramm);
      return this;
    }
    
    public boolean f()
    {
      return ((i)p).f();
    }
    
    public g g()
    {
      return ((i)p).g();
    }
    
    public boolean l()
    {
      return ((i)p).l();
    }
    
    public m n()
    {
      return ((i)p).n();
    }
    
    public boolean o()
    {
      return ((i)p).o();
    }
    
    public h p()
    {
      return ((i)p).p();
    }
  }
}

/* Location:
 * Qualified Name:     N4.i
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */