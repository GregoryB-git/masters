package N4;

import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a;
import com.google.protobuf.m0.b;
import com.google.protobuf.r;
import com.google.protobuf.r.a;
import com.google.protobuf.r.b;
import com.google.protobuf.r.c;
import com.google.protobuf.t.e;
import java.util.AbstractMap;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class m
  extends r
  implements L
{
  public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 4;
  public static final int COUNTERS_FIELD_NUMBER = 6;
  public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 8;
  private static final m DEFAULT_INSTANCE;
  public static final int DURATION_US_FIELD_NUMBER = 5;
  public static final int IS_AUTO_FIELD_NUMBER = 2;
  public static final int NAME_FIELD_NUMBER = 1;
  private static volatile T PARSER;
  public static final int PERF_SESSIONS_FIELD_NUMBER = 9;
  public static final int SUBTRACES_FIELD_NUMBER = 7;
  private int bitField0_;
  private long clientStartTimeUs_;
  private E counters_ = E.f();
  private E customAttributes_ = E.f();
  private long durationUs_;
  private boolean isAuto_;
  private String name_ = "";
  private t.e perfSessions_ = r.z();
  private t.e subtraces_ = r.z();
  
  static
  {
    m localm = new m();
    DEFAULT_INSTANCE = localm;
    r.Q(m.class, localm);
  }
  
  private void A0(long paramLong)
  {
    bitField0_ |= 0x4;
    clientStartTimeUs_ = paramLong;
  }
  
  private void d0(Iterable paramIterable)
  {
    i0();
    a.e(paramIterable, perfSessions_);
  }
  
  private void i0()
  {
    t.e locale = perfSessions_;
    if (!locale.p()) {
      perfSessions_ = r.M(locale);
    }
  }
  
  public static m n0()
  {
    return DEFAULT_INSTANCE;
  }
  
  private Map q0()
  {
    return y0();
  }
  
  private E y0()
  {
    if (!customAttributes_.n()) {
      customAttributes_ = customAttributes_.s();
    }
    return customAttributes_;
  }
  
  public static b z0()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public final void B0(long paramLong)
  {
    bitField0_ |= 0x8;
    durationUs_ = paramLong;
  }
  
  public final void C0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x1;
    name_ = paramString;
  }
  
  public final void e0(Iterable paramIterable)
  {
    j0();
    a.e(paramIterable, subtraces_);
  }
  
  public final void f0(k paramk)
  {
    paramk.getClass();
    i0();
    perfSessions_.add(paramk);
  }
  
  public final void g0(m paramm)
  {
    paramm.getClass();
    j0();
    subtraces_.add(paramm);
  }
  
  public boolean h0(String paramString)
  {
    paramString.getClass();
    return w0().containsKey(paramString);
  }
  
  public final void j0()
  {
    t.e locale = subtraces_;
    if (!locale.p()) {
      subtraces_ = r.M(locale);
    }
  }
  
  public int k0()
  {
    return v0().size();
  }
  
  public Map l0()
  {
    return Collections.unmodifiableMap(v0());
  }
  
  public Map m0()
  {
    return Collections.unmodifiableMap(w0());
  }
  
  public long o0()
  {
    return durationUs_;
  }
  
  public final Map p0()
  {
    return x0();
  }
  
  public String r0()
  {
    return name_;
  }
  
  public List s0()
  {
    return perfSessions_;
  }
  
  public List t0()
  {
    return subtraces_;
  }
  
  public boolean u0()
  {
    boolean bool;
    if ((bitField0_ & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final E v0()
  {
    return counters_;
  }
  
  public final E w0()
  {
    return customAttributes_;
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
      paramc = c.a;
      paramObject1 = d.a;
      return r.O(DEFAULT_INSTANCE, "\001\b\000\001\001\t\b\002\002\000\001ဈ\000\002ဇ\001\004ဂ\002\005ဂ\003\0062\007\033\b2\t\033", new Object[] { "bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", paramc, "subtraces_", m.class, "customAttributes_", paramObject1, "perfSessions_", k.class });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new m();
  }
  
  public final E x0()
  {
    if (!counters_.n()) {
      counters_ = counters_.s();
    }
    return counters_;
  }
  
  public static final class b
    extends r.a
    implements L
  {
    public b()
    {
      super();
    }
    
    public b D(Iterable paramIterable)
    {
      y();
      m.a0((m)p, paramIterable);
      return this;
    }
    
    public b E(Iterable paramIterable)
    {
      y();
      m.X((m)p, paramIterable);
      return this;
    }
    
    public b F(k paramk)
    {
      y();
      m.Z((m)p, paramk);
      return this;
    }
    
    public b G(m paramm)
    {
      y();
      m.W((m)p, paramm);
      return this;
    }
    
    public b H(Map paramMap)
    {
      y();
      m.V((m)p).putAll(paramMap);
      return this;
    }
    
    public b I(Map paramMap)
    {
      y();
      m.Y((m)p).putAll(paramMap);
      return this;
    }
    
    public b J(String paramString, long paramLong)
    {
      paramString.getClass();
      y();
      m.V((m)p).put(paramString, Long.valueOf(paramLong));
      return this;
    }
    
    public b K(String paramString1, String paramString2)
    {
      paramString1.getClass();
      paramString2.getClass();
      y();
      m.Y((m)p).put(paramString1, paramString2);
      return this;
    }
    
    public b L(long paramLong)
    {
      y();
      m.b0((m)p, paramLong);
      return this;
    }
    
    public b M(long paramLong)
    {
      y();
      m.c0((m)p, paramLong);
      return this;
    }
    
    public b N(String paramString)
    {
      y();
      m.U((m)p, paramString);
      return this;
    }
  }
  
  public static final abstract class c
  {
    public static final D a = D.d(m0.b.y, "", m0.b.s, Long.valueOf(0L));
  }
  
  public static final abstract class d
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
 * Qualified Name:     N4.m
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */