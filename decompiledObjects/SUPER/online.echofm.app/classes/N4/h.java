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
import com.google.protobuf.t.a;
import com.google.protobuf.t.b;
import com.google.protobuf.t.c;
import com.google.protobuf.t.e;
import java.util.List;
import java.util.Map;

public final class h
  extends r
  implements L
{
  public static final int CLIENT_START_TIME_US_FIELD_NUMBER = 7;
  public static final int CUSTOM_ATTRIBUTES_FIELD_NUMBER = 12;
  private static final h DEFAULT_INSTANCE;
  public static final int HTTP_METHOD_FIELD_NUMBER = 2;
  public static final int HTTP_RESPONSE_CODE_FIELD_NUMBER = 5;
  public static final int NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER = 11;
  private static volatile T PARSER;
  public static final int PERF_SESSIONS_FIELD_NUMBER = 13;
  public static final int REQUEST_PAYLOAD_BYTES_FIELD_NUMBER = 3;
  public static final int RESPONSE_CONTENT_TYPE_FIELD_NUMBER = 6;
  public static final int RESPONSE_PAYLOAD_BYTES_FIELD_NUMBER = 4;
  public static final int TIME_TO_REQUEST_COMPLETED_US_FIELD_NUMBER = 8;
  public static final int TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER = 10;
  public static final int TIME_TO_RESPONSE_INITIATED_US_FIELD_NUMBER = 9;
  public static final int URL_FIELD_NUMBER = 1;
  private int bitField0_;
  private long clientStartTimeUs_;
  private E customAttributes_ = E.f();
  private int httpMethod_;
  private int httpResponseCode_;
  private int networkClientErrorReason_;
  private t.e perfSessions_ = r.z();
  private long requestPayloadBytes_;
  private String responseContentType_ = "";
  private long responsePayloadBytes_;
  private long timeToRequestCompletedUs_;
  private long timeToResponseCompletedUs_;
  private long timeToResponseInitiatedUs_;
  private String url_ = "";
  
  static
  {
    h localh = new h();
    DEFAULT_INSTANCE = localh;
    r.Q(h.class, localh);
  }
  
  private E G0()
  {
    if (!customAttributes_.n()) {
      customAttributes_ = customAttributes_.s();
    }
    return customAttributes_;
  }
  
  public static b H0()
  {
    return (b)DEFAULT_INSTANCE.u();
  }
  
  public static h m0()
  {
    return DEFAULT_INSTANCE;
  }
  
  private Map p0()
  {
    return G0();
  }
  
  public boolean A0()
  {
    boolean bool;
    if ((bitField0_ & 0x20) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean B0()
  {
    boolean bool;
    if ((bitField0_ & 0x4) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean C0()
  {
    boolean bool;
    if ((bitField0_ & 0x8) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean D0()
  {
    boolean bool;
    if ((bitField0_ & 0x100) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean E0()
  {
    boolean bool;
    if ((bitField0_ & 0x400) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean F0()
  {
    boolean bool;
    if ((bitField0_ & 0x200) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public final void I0(long paramLong)
  {
    bitField0_ |= 0x80;
    clientStartTimeUs_ = paramLong;
  }
  
  public final void J0(d paramd)
  {
    httpMethod_ = paramd.g();
    bitField0_ |= 0x2;
  }
  
  public final void K0(int paramInt)
  {
    bitField0_ |= 0x20;
    httpResponseCode_ = paramInt;
  }
  
  public final void L0(e parame)
  {
    networkClientErrorReason_ = parame.g();
    bitField0_ |= 0x10;
  }
  
  public final void M0(long paramLong)
  {
    bitField0_ |= 0x4;
    requestPayloadBytes_ = paramLong;
  }
  
  public final void N0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x40;
    responseContentType_ = paramString;
  }
  
  public final void O0(long paramLong)
  {
    bitField0_ |= 0x8;
    responsePayloadBytes_ = paramLong;
  }
  
  public final void P0(long paramLong)
  {
    bitField0_ |= 0x100;
    timeToRequestCompletedUs_ = paramLong;
  }
  
  public final void Q0(long paramLong)
  {
    bitField0_ |= 0x400;
    timeToResponseCompletedUs_ = paramLong;
  }
  
  public final void R0(long paramLong)
  {
    bitField0_ |= 0x200;
    timeToResponseInitiatedUs_ = paramLong;
  }
  
  public final void S0(String paramString)
  {
    paramString.getClass();
    bitField0_ |= 0x1;
    url_ = paramString;
  }
  
  public final void i0(Iterable paramIterable)
  {
    k0();
    a.e(paramIterable, perfSessions_);
  }
  
  public final void j0()
  {
    bitField0_ &= 0xFFFFFFBF;
    responseContentType_ = m0().s0();
  }
  
  public final void k0()
  {
    t.e locale = perfSessions_;
    if (!locale.p()) {
      perfSessions_ = r.M(locale);
    }
  }
  
  public long l0()
  {
    return clientStartTimeUs_;
  }
  
  public d n0()
  {
    d locald1 = d.c(httpMethod_);
    d locald2 = locald1;
    if (locald1 == null) {
      locald2 = d.p;
    }
    return locald2;
  }
  
  public int o0()
  {
    return httpResponseCode_;
  }
  
  public List q0()
  {
    return perfSessions_;
  }
  
  public long r0()
  {
    return requestPayloadBytes_;
  }
  
  public String s0()
  {
    return responseContentType_;
  }
  
  public long t0()
  {
    return responsePayloadBytes_;
  }
  
  public long u0()
  {
    return timeToRequestCompletedUs_;
  }
  
  public long v0()
  {
    return timeToResponseCompletedUs_;
  }
  
  public long w0()
  {
    return timeToResponseInitiatedUs_;
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
      paramObject1 = d.e();
      paramObject2 = e.c();
      paramc = c.a;
      return r.O(DEFAULT_INSTANCE, "\001\r\000\001\001\r\r\001\001\000\001ဈ\000\002ဌ\001\003ဂ\002\004ဂ\003\005င\005\006ဈ\006\007ဂ\007\bဂ\b\tဂ\t\nဂ\n\013ဌ\004\f2\r\033", new Object[] { "bitField0_", "url_", "httpMethod_", paramObject1, "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", paramObject2, "customAttributes_", paramc, "perfSessions_", k.class });
    case 2: 
      label118:
      label123:
      return new b(null);
    }
    return new h();
  }
  
  public String x0()
  {
    return url_;
  }
  
  public boolean y0()
  {
    boolean bool;
    if ((bitField0_ & 0x80) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
  }
  
  public boolean z0()
  {
    boolean bool;
    if ((bitField0_ & 0x2) != 0) {
      bool = true;
    } else {
      bool = false;
    }
    return bool;
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
      h.e0((h)p, paramIterable);
      return this;
    }
    
    public b E()
    {
      y();
      h.d0((h)p).clear();
      return this;
    }
    
    public b F()
    {
      y();
      h.Y((h)p);
      return this;
    }
    
    public long G()
    {
      return ((h)p).w0();
    }
    
    public String H()
    {
      return ((h)p).x0();
    }
    
    public boolean I()
    {
      return ((h)p).y0();
    }
    
    public boolean J()
    {
      return ((h)p).A0();
    }
    
    public boolean K()
    {
      return ((h)p).E0();
    }
    
    public b L(Map paramMap)
    {
      y();
      h.d0((h)p).putAll(paramMap);
      return this;
    }
    
    public b M(long paramLong)
    {
      y();
      h.Z((h)p, paramLong);
      return this;
    }
    
    public b N(h.d paramd)
    {
      y();
      h.f0((h)p, paramd);
      return this;
    }
    
    public b O(int paramInt)
    {
      y();
      h.W((h)p, paramInt);
      return this;
    }
    
    public b P(h.e parame)
    {
      y();
      h.V((h)p, parame);
      return this;
    }
    
    public b Q(long paramLong)
    {
      y();
      h.g0((h)p, paramLong);
      return this;
    }
    
    public b R(String paramString)
    {
      y();
      h.X((h)p, paramString);
      return this;
    }
    
    public b S(long paramLong)
    {
      y();
      h.h0((h)p, paramLong);
      return this;
    }
    
    public b T(long paramLong)
    {
      y();
      h.a0((h)p, paramLong);
      return this;
    }
    
    public b U(long paramLong)
    {
      y();
      h.c0((h)p, paramLong);
      return this;
    }
    
    public b V(long paramLong)
    {
      y();
      h.b0((h)p, paramLong);
      return this;
    }
    
    public b W(String paramString)
    {
      y();
      h.U((h)p, paramString);
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
  
  public static enum d
    implements t.a
  {
    public static final t.b z = new a();
    public final int o;
    
    static
    {
      d locald1 = new d("HTTP_METHOD_UNKNOWN", 0, 0);
      p = locald1;
      d locald2 = new d("GET", 1, 1);
      q = locald2;
      d locald3 = new d("PUT", 2, 2);
      r = locald3;
      d locald4 = new d("POST", 3, 3);
      s = locald4;
      d locald5 = new d("DELETE", 4, 4);
      t = locald5;
      d locald6 = new d("HEAD", 5, 5);
      u = locald6;
      d locald7 = new d("PATCH", 6, 6);
      v = locald7;
      d locald8 = new d("OPTIONS", 7, 7);
      w = locald8;
      d locald9 = new d("TRACE", 8, 8);
      x = locald9;
      d locald10 = new d("CONNECT", 9, 9);
      y = locald10;
      A = new d[] { locald1, locald2, locald3, locald4, locald5, locald6, locald7, locald8, locald9, locald10 };
    }
    
    public d(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static d c(int paramInt)
    {
      switch (paramInt)
      {
      default: 
        return null;
      case 9: 
        return y;
      case 8: 
        return x;
      case 7: 
        return w;
      case 6: 
        return v;
      case 5: 
        return u;
      case 4: 
        return t;
      case 3: 
        return s;
      case 2: 
        return r;
      case 1: 
        return q;
      }
      return p;
    }
    
    public static t.c e()
    {
      return b.a;
    }
    
    public final int g()
    {
      return o;
    }
    
    public class a
      implements t.b
    {}
    
    public static final class b
      implements t.c
    {
      public static final t.c a = new b();
    }
  }
  
  public static enum e
    implements t.a
  {
    public static final t.b r = new a();
    public final int o;
    
    static
    {
      e locale1 = new e("NETWORK_CLIENT_ERROR_REASON_UNKNOWN", 0, 0);
      p = locale1;
      e locale2 = new e("GENERIC_CLIENT_ERROR", 1, 1);
      q = locale2;
      s = new e[] { locale1, locale2 };
    }
    
    public e(int paramInt1)
    {
      o = paramInt1;
    }
    
    public static t.c c()
    {
      return b.a;
    }
    
    public final int g()
    {
      return o;
    }
    
    public class a
      implements t.b
    {}
    
    public static final class b
      implements t.c
    {
      public static final t.c a = new b();
    }
  }
}

/* Location:
 * Qualified Name:     N4.h
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */