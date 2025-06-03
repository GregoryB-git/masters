// 
// Decompiled by Procyon v1.0-SNAPSHOT
// 

package N4;

import com.google.protobuf.m0;
import com.google.protobuf.D;
import com.google.protobuf.K;
import java.util.Collections;
import java.util.List;
import com.google.protobuf.a;
import java.util.Map;
import com.google.protobuf.t;
import com.google.protobuf.E;
import com.google.protobuf.T;
import com.google.protobuf.L;
import com.google.protobuf.r;

public final class m extends r implements L
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
    private E counters_;
    private E customAttributes_;
    private long durationUs_;
    private boolean isAuto_;
    private String name_;
    private t.e perfSessions_;
    private t.e subtraces_;
    
    static {
        r.Q(m.class, DEFAULT_INSTANCE = new m());
    }
    
    public m() {
        this.counters_ = E.f();
        this.customAttributes_ = E.f();
        this.name_ = "";
        this.subtraces_ = r.z();
        this.perfSessions_ = r.z();
    }
    
    private void A0(final long clientStartTimeUs_) {
        this.bitField0_ |= 0x4;
        this.clientStartTimeUs_ = clientStartTimeUs_;
    }
    
    public static /* synthetic */ m T() {
        return m.DEFAULT_INSTANCE;
    }
    
    private void d0(final Iterable iterable) {
        this.i0();
        com.google.protobuf.a.e(iterable, this.perfSessions_);
    }
    
    private void i0() {
        final t.e perfSessions_ = this.perfSessions_;
        if (!perfSessions_.p()) {
            this.perfSessions_ = r.M(perfSessions_);
        }
    }
    
    public static m n0() {
        return m.DEFAULT_INSTANCE;
    }
    
    private Map q0() {
        return this.y0();
    }
    
    private E y0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }
    
    public static b z0() {
        return (b)m.DEFAULT_INSTANCE.u();
    }
    
    public final void B0(final long durationUs_) {
        this.bitField0_ |= 0x8;
        this.durationUs_ = durationUs_;
    }
    
    public final void C0(final String name_) {
        name_.getClass();
        this.bitField0_ |= 0x1;
        this.name_ = name_;
    }
    
    public final void e0(final Iterable iterable) {
        this.j0();
        com.google.protobuf.a.e(iterable, this.subtraces_);
    }
    
    public final void f0(final k k) {
        k.getClass();
        this.i0();
        this.perfSessions_.add(k);
    }
    
    public final void g0(final m m) {
        m.getClass();
        this.j0();
        this.subtraces_.add(m);
    }
    
    public boolean h0(final String key) {
        key.getClass();
        return this.w0().containsKey(key);
    }
    
    public final void j0() {
        final t.e subtraces_ = this.subtraces_;
        if (!subtraces_.p()) {
            this.subtraces_ = r.M(subtraces_);
        }
    }
    
    public int k0() {
        return this.v0().size();
    }
    
    public Map l0() {
        return Collections.unmodifiableMap((Map<?, ?>)this.v0());
    }
    
    public Map m0() {
        return Collections.unmodifiableMap((Map<?, ?>)this.w0());
    }
    
    public long o0() {
        return this.durationUs_;
    }
    
    public final Map p0() {
        return this.x0();
    }
    
    public String r0() {
        return this.name_;
    }
    
    public List s0() {
        return this.perfSessions_;
    }
    
    public List t0() {
        return this.subtraces_;
    }
    
    public boolean u0() {
        return (this.bitField0_ & 0x4) != 0x0;
    }
    
    public final E v0() {
        return this.counters_;
    }
    
    public final E w0() {
        return this.customAttributes_;
    }
    
    @Override
    public final Object x(final r.c c, final Object o, final Object o2) {
        Label_0225: {
            switch (m$a.a[c.ordinal()]) {
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
                    final T parser = m.PARSER;
                    if (parser == null) {
                        break Label_0225;
                    }
                    return parser;
                }
                case 4: {
                    break Label_0225;
                }
                case 3: {
                    break Label_0225;
                }
                case 2: {
                    break Label_0225;
                }
                case 1: {
                    // monitorenter(m.class)
                    while (true) {
                        Label_0234: {
                            break Label_0234;
                            try {
                                T parser2;
                                if ((parser2 = m.PARSER) == null) {
                                    parser2 = (m.PARSER = new r.b(m.DEFAULT_INSTANCE));
                                }
                                // monitorexit(m.class)
                                return parser2;
                                return new m();
                                return r.O(m.DEFAULT_INSTANCE, "\u0001\b\u0000\u0001\u0001\t\b\u0002\u0002\u0000\u0001\u1008\u0000\u0002\u1007\u0001\u0004\u1002\u0002\u0005\u1002\u0003\u00062\u0007\u001b\b2\t\u001b", new Object[] { "bitField0_", "name_", "isAuto_", "clientStartTimeUs_", "durationUs_", "counters_", m.c.a, "subtraces_", m.class, "customAttributes_", d.a, "perfSessions_", k.class });
                                // monitorexit(m.class)
                                return m.DEFAULT_INSTANCE;
                                return new b((m$a)null);
                            }
                            finally {}
                        }
                        continue;
                    }
                }
            }
        }
    }
    
    public final E x0() {
        if (!this.counters_.n()) {
            this.counters_ = this.counters_.s();
        }
        return this.counters_;
    }
    
    public static final class b extends a implements L
    {
        public b() {
            super(m.T());
        }
        
        public b D(final Iterable iterable) {
            ((a)this).y();
            ((m)super.p).d0(iterable);
            return this;
        }
        
        public b E(final Iterable iterable) {
            ((a)this).y();
            ((m)super.p).e0(iterable);
            return this;
        }
        
        public b F(final k k) {
            ((a)this).y();
            ((m)super.p).f0(k);
            return this;
        }
        
        public b G(final m m) {
            ((a)this).y();
            ((m)super.p).g0(m);
            return this;
        }
        
        public b H(final Map map) {
            ((a)this).y();
            ((m)super.p).p0().putAll(map);
            return this;
        }
        
        public b I(final Map map) {
            ((a)this).y();
            ((m)super.p).q0().putAll(map);
            return this;
        }
        
        public b J(final String s, final long l) {
            s.getClass();
            ((a)this).y();
            ((m)super.p).p0().put(s, l);
            return this;
        }
        
        public b K(final String s, final String s2) {
            s.getClass();
            s2.getClass();
            ((a)this).y();
            ((m)super.p).q0().put(s, s2);
            return this;
        }
        
        public b L(final long n) {
            ((a)this).y();
            ((m)super.p).A0(n);
            return this;
        }
        
        public b M(final long n) {
            ((a)this).y();
            ((m)super.p).B0(n);
            return this;
        }
        
        public b N(final String s) {
            ((a)this).y();
            ((m)super.p).C0(s);
            return this;
        }
    }
    
    public abstract static final class c
    {
        public static final D a;
        
        static {
            a = D.d(m0.b.y, "", m0.b.s, 0L);
        }
    }
    
    public abstract static final class d
    {
        public static final D a;
        
        static {
            final m0.b y = m0.b.y;
            a = D.d(y, "", y, "");
        }
    }
}
