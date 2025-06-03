// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.K;
import com.google.protobuf.t;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class g extends r implements L
{
    public static final int ANDROID_MEMORY_READINGS_FIELD_NUMBER = 4;
    public static final int CPU_METRIC_READINGS_FIELD_NUMBER = 2;
    private static final g DEFAULT_INSTANCE;
    public static final int GAUGE_METADATA_FIELD_NUMBER = 3;
    private static volatile T PARSER;
    public static final int SESSION_ID_FIELD_NUMBER = 1;
    private t.e androidMemoryReadings_;
    private int bitField0_;
    private t.e cpuMetricReadings_;
    private f gaugeMetadata_;
    private String sessionId_;
    
    static {
        r.Q(g.class, DEFAULT_INSTANCE = new g());
    }
    
    public g() {
        this.sessionId_ = "";
        this.cpuMetricReadings_ = r.z();
        this.androidMemoryReadings_ = r.z();
    }
    
    public static /* synthetic */ g T() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static g e0() {
        return g.DEFAULT_INSTANCE;
    }
    
    public static b i0() {
        return (b)g.DEFAULT_INSTANCE.u();
    }
    
    public final void Y(final N4.b b) {
        b.getClass();
        this.a0();
        this.androidMemoryReadings_.add(b);
    }
    
    public final void Z(final e e) {
        e.getClass();
        this.b0();
        this.cpuMetricReadings_.add(e);
    }
    
    public final void a0() {
        final t.e androidMemoryReadings_ = this.androidMemoryReadings_;
        if (!androidMemoryReadings_.p()) {
            this.androidMemoryReadings_ = r.M(androidMemoryReadings_);
        }
    }
    
    public final void b0() {
        final t.e cpuMetricReadings_ = this.cpuMetricReadings_;
        if (!cpuMetricReadings_.p()) {
            this.cpuMetricReadings_ = r.M(cpuMetricReadings_);
        }
    }
    
    public int c0() {
        return this.androidMemoryReadings_.size();
    }
    
    public int d0() {
        return this.cpuMetricReadings_.size();
    }
    
    public f f0() {
        f f;
        if ((f = this.gaugeMetadata_) == null) {
            f = N4.f.X();
        }
        return f;
    }
    
    public boolean g0() {
        return (this.bitField0_ & 0x2) != 0x0;
    }
    
    public boolean h0() {
        return (this.bitField0_ & 0x1) != 0x0;
    }
    
    public final void j0(final f gaugeMetadata_) {
        gaugeMetadata_.getClass();
        this.gaugeMetadata_ = gaugeMetadata_;
        this.bitField0_ |= 0x2;
    }
    
    public final void k0(final String sessionId_) {
        sessionId_.getClass();
        this.bitField0_ |= 0x1;
        this.sessionId_ = sessionId_;
    }
    
    @Override
    public final Object x(final c c, final Object o, final Object o2) {
        Label_0172: {
            switch (g$a.a[c.ordinal()]) {
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
                    final T parser = g.PARSER;
                    if (parser == null) {
                        break Label_0172;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0172;
                }
                case 3: {
                    break Label_0172;
                }
                case 2: {
                    break Label_0172;
                }
                case 1: {
                    // monitorenter(g.class)
                    while (true) {
                        Label_0181: {
                            break Label_0181;
                            try {
                                T parser2;
                                if ((parser2 = g.PARSER) == null) {
                                    parser2 = (g.PARSER = new r.b(g.DEFAULT_INSTANCE));
                                }
                                // monitorexit(g.class)
                                return parser2;
                                return new b((g$a)null);
                                return r.O(g.DEFAULT_INSTANCE, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0002\u0000\u0001\u1008\u0000\u0002\u001b\u0003\u1009\u0001\u0004\u001b", new Object[] { "bitField0_", "sessionId_", "cpuMetricReadings_", e.class, "gaugeMetadata_", "androidMemoryReadings_", N4.b.class });
                                return g.DEFAULT_INSTANCE;
                                return new g();
                            }
                            // monitorexit(g.class)
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public static final class b extends a implements L
    {
        public b() {
            super(g.T());
        }
        
        public b D(final N4.b b) {
            ((a)this).y();
            ((g)super.p).Y(b);
            return this;
        }
        
        public b E(final e e) {
            ((a)this).y();
            ((g)super.p).Z(e);
            return this;
        }
        
        public b F(final f f) {
            ((a)this).y();
            ((g)super.p).j0(f);
            return this;
        }
        
        public b G(final String s) {
            ((a)this).y();
            ((g)super.p).k0(s);
            return this;
        }
    }
}
