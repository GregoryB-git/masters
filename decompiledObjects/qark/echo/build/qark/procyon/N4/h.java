// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.m0;
import com.google.protobuf.D;
import com.google.protobuf.K;
import java.util.List;
import com.google.protobuf.a;
import java.util.Map;
import com.google.protobuf.t;
import com.google.protobuf.E;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class h extends r implements L
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
    private E customAttributes_;
    private int httpMethod_;
    private int httpResponseCode_;
    private int networkClientErrorReason_;
    private t.e perfSessions_;
    private long requestPayloadBytes_;
    private String responseContentType_;
    private long responsePayloadBytes_;
    private long timeToRequestCompletedUs_;
    private long timeToResponseCompletedUs_;
    private long timeToResponseInitiatedUs_;
    private String url_;
    
    static {
        r.Q(h.class, DEFAULT_INSTANCE = new h());
    }
    
    public h() {
        this.customAttributes_ = E.f();
        this.url_ = "";
        this.responseContentType_ = "";
        this.perfSessions_ = r.z();
    }
    
    private E G0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }
    
    public static b H0() {
        return (b)h.DEFAULT_INSTANCE.u();
    }
    
    public static /* synthetic */ h T() {
        return h.DEFAULT_INSTANCE;
    }
    
    public static h m0() {
        return h.DEFAULT_INSTANCE;
    }
    
    private Map p0() {
        return this.G0();
    }
    
    public boolean A0() {
        return (this.bitField0_ & 0x20) != 0x0;
    }
    
    public boolean B0() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public boolean C0() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    public boolean D0() {
        return (this.bitField0_ & 0x100) != 0x0;
    }
    
    public boolean E0() {
        return (this.bitField0_ & 0x400) != 0x0;
    }
    
    public boolean F0() {
        return (this.bitField0_ & 0x200) != 0x0;
    }
    
    public final void I0(final long clientStartTimeUs_) {
        this.bitField0_ |= 0x80;
        this.clientStartTimeUs_ = clientStartTimeUs_;
    }
    
    public final void J0(final d d) {
        this.httpMethod_ = d.g();
        this.bitField0_ |= 0x2;
    }
    
    public final void K0(final int httpResponseCode_) {
        this.bitField0_ |= 0x20;
        this.httpResponseCode_ = httpResponseCode_;
    }
    
    public final void L0(final e e) {
        this.networkClientErrorReason_ = e.g();
        this.bitField0_ |= 0x10;
    }
    
    public final void M0(final long requestPayloadBytes_) {
        this.bitField0_ |= 0x4;
        this.requestPayloadBytes_ = requestPayloadBytes_;
    }
    
    public final void N0(final String responseContentType_) {
        responseContentType_.getClass();
        this.bitField0_ |= 0x40;
        this.responseContentType_ = responseContentType_;
    }
    
    public final void O0(final long responsePayloadBytes_) {
        this.bitField0_ |= 0x8;
        this.responsePayloadBytes_ = responsePayloadBytes_;
    }
    
    public final void P0(final long timeToRequestCompletedUs_) {
        this.bitField0_ |= 0x100;
        this.timeToRequestCompletedUs_ = timeToRequestCompletedUs_;
    }
    
    public final void Q0(final long timeToResponseCompletedUs_) {
        this.bitField0_ |= 0x400;
        this.timeToResponseCompletedUs_ = timeToResponseCompletedUs_;
    }
    
    public final void R0(final long timeToResponseInitiatedUs_) {
        this.bitField0_ |= 0x200;
        this.timeToResponseInitiatedUs_ = timeToResponseInitiatedUs_;
    }
    
    public final void S0(final String url_) {
        url_.getClass();
        this.bitField0_ |= 0x1;
        this.url_ = url_;
    }
    
    public final void i0(final Iterable iterable) {
        this.k0();
        com.google.protobuf.a.e(iterable, this.perfSessions_);
    }
    
    public final void j0() {
        this.bitField0_ &= 0xFFFFFFBF;
        this.responseContentType_ = m0().s0();
    }
    
    public final void k0() {
        final t.e perfSessions_ = this.perfSessions_;
        if (!perfSessions_.p()) {
            this.perfSessions_ = r.M(perfSessions_);
        }
    }
    
    public long l0() {
        return this.clientStartTimeUs_;
    }
    
    public d n0() {
        d d;
        if ((d = h.d.c(this.httpMethod_)) == null) {
            d = h.d.p;
        }
        return d;
    }
    
    public int o0() {
        return this.httpResponseCode_;
    }
    
    public List q0() {
        return this.perfSessions_;
    }
    
    public long r0() {
        return this.requestPayloadBytes_;
    }
    
    public String s0() {
        return this.responseContentType_;
    }
    
    public long t0() {
        return this.responsePayloadBytes_;
    }
    
    public long u0() {
        return this.timeToRequestCompletedUs_;
    }
    
    public long v0() {
        return this.timeToResponseCompletedUs_;
    }
    
    public long w0() {
        return this.timeToResponseInitiatedUs_;
    }
    
    @Override
    public final Object x(final r.c c, final Object o, final Object o2) {
        Label_0263: {
            switch (h$a.a[c.ordinal()]) {
                default: {
                    throw new UnsupportedOperationException();
                }
                case 7: {
                    return null;
                }
                case 6: {
                    return 1;
                }
                case 5: {
                    final T parser = h.PARSER;
                    if (parser == null) {
                        break Label_0263;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0263;
                }
                case 3: {
                    break Label_0263;
                }
                case 2: {
                    break Label_0263;
                }
                case 1: {
                    // monitorenter(h.class)
                    while (true) {
                        Label_0272: {
                            break Label_0272;
                            try {
                                T parser2;
                                if ((parser2 = h.PARSER) == null) {
                                    parser2 = (h.PARSER = new r.b(h.DEFAULT_INSTANCE));
                                }
                                // monitorexit(h.class)
                                return parser2;
                                return new b((h$a)null);
                                return h.DEFAULT_INSTANCE;
                                return r.O(h.DEFAULT_INSTANCE, "\u0001\r\u0000\u0001\u0001\r\r\u0001\u0001\u0000\u0001\u1008\u0000\u0002\u100c\u0001\u0003\u1002\u0002\u0004\u1002\u0003\u0005\u1004\u0005\u0006\u1008\u0006\u0007\u1002\u0007\b\u1002\b\t\u1002\t\n\u1002\n\u000b\u100c\u0004\f2\r\u001b", new Object[] { "bitField0_", "url_", "httpMethod_", d.e(), "requestPayloadBytes_", "responsePayloadBytes_", "httpResponseCode_", "responseContentType_", "clientStartTimeUs_", "timeToRequestCompletedUs_", "timeToResponseInitiatedUs_", "timeToResponseCompletedUs_", "networkClientErrorReason_", e.c(), "customAttributes_", h.c.a, "perfSessions_", k.class });
                                return new h();
                            }
                            // monitorexit(h.class)
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public String x0() {
        return this.url_;
    }
    
    public boolean y0() {
        return (this.bitField0_ & 0x80) != 0x0;
    }
    
    public boolean z0() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public static final class b extends a implements L
    {
        public b() {
            super(h.T());
        }
        
        public b D(final Iterable iterable) {
            ((a)this).y();
            ((h)super.p).i0(iterable);
            return this;
        }
        
        public b E() {
            ((a)this).y();
            ((h)super.p).p0().clear();
            return this;
        }
        
        public b F() {
            ((a)this).y();
            ((h)super.p).j0();
            return this;
        }
        
        public long G() {
            return ((h)super.p).w0();
        }
        
        public String H() {
            return ((h)super.p).x0();
        }
        
        public boolean I() {
            return ((h)super.p).y0();
        }
        
        public boolean J() {
            return ((h)super.p).A0();
        }
        
        public boolean K() {
            return ((h)super.p).E0();
        }
        
        public b L(final Map map) {
            ((a)this).y();
            ((h)super.p).p0().putAll(map);
            return this;
        }
        
        public b M(final long n) {
            ((a)this).y();
            ((h)super.p).I0(n);
            return this;
        }
        
        public b N(final d d) {
            ((a)this).y();
            ((h)super.p).J0(d);
            return this;
        }
        
        public b O(final int n) {
            ((a)this).y();
            ((h)super.p).K0(n);
            return this;
        }
        
        public b P(final e e) {
            ((a)this).y();
            ((h)super.p).L0(e);
            return this;
        }
        
        public b Q(final long n) {
            ((a)this).y();
            ((h)super.p).M0(n);
            return this;
        }
        
        public b R(final String s) {
            ((a)this).y();
            ((h)super.p).N0(s);
            return this;
        }
        
        public b S(final long n) {
            ((a)this).y();
            ((h)super.p).O0(n);
            return this;
        }
        
        public b T(final long n) {
            ((a)this).y();
            ((h)super.p).P0(n);
            return this;
        }
        
        public b U(final long n) {
            ((a)this).y();
            ((h)super.p).Q0(n);
            return this;
        }
        
        public b V(final long n) {
            ((a)this).y();
            ((h)super.p).R0(n);
            return this;
        }
        
        public b W(final String s) {
            ((a)this).y();
            ((h)super.p).S0(s);
            return this;
        }
    }
    
    public abstract static final class c
    {
        public static final D a;
        
        static {
            final m0.b y = m0.b.y;
            a = D.d(y, "", y, "");
        }
    }
    
    public enum d implements t.a
    {
        p("HTTP_METHOD_UNKNOWN", 0, 0), 
        q("GET", 1, 1), 
        r("PUT", 2, 2), 
        s("POST", 3, 3), 
        t("DELETE", 4, 4), 
        u("HEAD", 5, 5), 
        v("PATCH", 6, 6), 
        w("OPTIONS", 7, 7), 
        x("TRACE", 8, 8), 
        y("CONNECT", 9, 9);
        
        public static final t.b z;
        public final int o;
        
        static {
            z = new t.b() {};
        }
        
        public d(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static d c(final int n) {
            switch (n) {
                default: {
                    return null;
                }
                case 9: {
                    return d.y;
                }
                case 8: {
                    return d.x;
                }
                case 7: {
                    return d.w;
                }
                case 6: {
                    return d.v;
                }
                case 5: {
                    return d.u;
                }
                case 4: {
                    return d.t;
                }
                case 3: {
                    return d.s;
                }
                case 2: {
                    return d.r;
                }
                case 1: {
                    return d.q;
                }
                case 0: {
                    return d.p;
                }
            }
        }
        
        public static t.c e() {
            return b.a;
        }
        
        @Override
        public final int g() {
            return this.o;
        }
        
        public static final class b implements t.c
        {
            public static final t.c a;
            
            static {
                a = new b();
            }
        }
    }
    
    public enum e implements t.a
    {
        p("NETWORK_CLIENT_ERROR_REASON_UNKNOWN", 0, 0), 
        q("GENERIC_CLIENT_ERROR", 1, 1);
        
        public static final t.b r;
        public final int o;
        
        static {
            r = new t.b() {};
        }
        
        public e(final String name, final int ordinal, final int o) {
            this.o = o;
        }
        
        public static t.c c() {
            return b.a;
        }
        
        @Override
        public final int g() {
            return this.o;
        }
        
        public static final class b implements t.c
        {
            public static final t.c a;
            
            static {
                a = new b();
            }
        }
    }
}
