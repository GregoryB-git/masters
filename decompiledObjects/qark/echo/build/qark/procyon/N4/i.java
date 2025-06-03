// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class i extends r implements j
{
    public static final int APPLICATION_INFO_FIELD_NUMBER = 1;
    private static final i DEFAULT_INSTANCE;
    public static final int GAUGE_METRIC_FIELD_NUMBER = 4;
    public static final int NETWORK_REQUEST_METRIC_FIELD_NUMBER = 3;
    private static volatile T PARSER;
    public static final int TRACE_METRIC_FIELD_NUMBER = 2;
    public static final int TRANSPORT_INFO_FIELD_NUMBER = 5;
    private N4.c applicationInfo_;
    private int bitField0_;
    private g gaugeMetric_;
    private h networkRequestMetric_;
    private m traceMetric_;
    private n transportInfo_;
    
    static {
        r.Q(i.class, DEFAULT_INSTANCE = new i());
    }
    
    public static /* synthetic */ i T() {
        return i.DEFAULT_INSTANCE;
    }
    
    public static b a0() {
        return (b)i.DEFAULT_INSTANCE.u();
    }
    
    public N4.c Y() {
        N4.c c;
        if ((c = this.applicationInfo_) == null) {
            c = N4.c.a0();
        }
        return c;
    }
    
    public boolean Z() {
        return (this.bitField0_ & 0x1) != 0x0;
    }
    
    public final void b0(final N4.c applicationInfo_) {
        applicationInfo_.getClass();
        this.applicationInfo_ = applicationInfo_;
        this.bitField0_ |= 0x1;
    }
    
    public final void c0(final g gaugeMetric_) {
        gaugeMetric_.getClass();
        this.gaugeMetric_ = gaugeMetric_;
        this.bitField0_ |= 0x8;
    }
    
    public final void d0(final h networkRequestMetric_) {
        networkRequestMetric_.getClass();
        this.networkRequestMetric_ = networkRequestMetric_;
        this.bitField0_ |= 0x4;
    }
    
    public final void e0(final m traceMetric_) {
        traceMetric_.getClass();
        this.traceMetric_ = traceMetric_;
        this.bitField0_ |= 0x2;
    }
    
    @Override
    public boolean f() {
        return (this.bitField0_ & 0x8) != 0x0;
    }
    
    @Override
    public g g() {
        g g;
        if ((g = this.gaugeMetric_) == null) {
            g = N4.g.e0();
        }
        return g;
    }
    
    @Override
    public boolean l() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    @Override
    public m n() {
        m m;
        if ((m = this.traceMetric_) == null) {
            m = N4.m.n0();
        }
        return m;
    }
    
    @Override
    public boolean o() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    @Override
    public h p() {
        h h;
        if ((h = this.networkRequestMetric_) == null) {
            h = N4.h.m0();
        }
        return h;
    }
    
    @Override
    public final Object x(final c c, final Object o, final Object o2) {
        Label_0166: {
            switch (i$a.a[c.ordinal()]) {
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
                    final T parser = i.PARSER;
                    if (parser == null) {
                        break Label_0166;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0166;
                }
                case 3: {
                    break Label_0166;
                }
                case 2: {
                    break Label_0166;
                }
                case 1: {
                    // monitorenter(i.class)
                    while (true) {
                        Label_0175: {
                            break Label_0175;
                            try {
                                T parser2;
                                if ((parser2 = i.PARSER) == null) {
                                    parser2 = (i.PARSER = new r.b(i.DEFAULT_INSTANCE));
                                }
                                // monitorexit(i.class)
                                return parser2;
                                // monitorexit(i.class)
                                return i.DEFAULT_INSTANCE;
                                return r.O(i.DEFAULT_INSTANCE, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001\u1009\u0000\u0002\u1009\u0001\u0003\u1009\u0002\u0004\u1009\u0003\u0005\u1009\u0004", new Object[] { "bitField0_", "applicationInfo_", "traceMetric_", "networkRequestMetric_", "gaugeMetric_", "transportInfo_" });
                                return new b((i$a)null);
                                return new i();
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends a implements j
    {
        public b() {
            super(i.T());
        }
        
        public b D(final N4.c.b b) {
            ((a)this).y();
            ((i)super.p).b0((N4.c)((a)b).v());
            return this;
        }
        
        public b E(final g g) {
            ((a)this).y();
            ((i)super.p).c0(g);
            return this;
        }
        
        public b F(final h h) {
            ((a)this).y();
            ((i)super.p).d0(h);
            return this;
        }
        
        public b G(final m m) {
            ((a)this).y();
            ((i)super.p).e0(m);
            return this;
        }
        
        @Override
        public boolean f() {
            return ((i)super.p).f();
        }
        
        @Override
        public g g() {
            return ((i)super.p).g();
        }
        
        @Override
        public boolean l() {
            return ((i)super.p).l();
        }
        
        @Override
        public m n() {
            return ((i)super.p).n();
        }
        
        @Override
        public boolean o() {
            return ((i)super.p).o();
        }
        
        @Override
        public h p() {
            return ((i)super.p).p();
        }
    }
}
