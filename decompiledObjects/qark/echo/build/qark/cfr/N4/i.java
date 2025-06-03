/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 */
package N4;

import N4.c;
import N4.g;
import N4.h;
import N4.j;
import N4.m;
import N4.n;
import com.google.protobuf.T;
import com.google.protobuf.r;

public final class i
extends r
implements j {
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

    static {
        i i8;
        DEFAULT_INSTANCE = i8 = new i();
        r.Q(i.class, i8);
    }

    public static b a0() {
        return (b)DEFAULT_INSTANCE.u();
    }

    public c Y() {
        c c8;
        c c9 = c8 = this.applicationInfo_;
        if (c8 == null) {
            c9 = c.a0();
        }
        return c9;
    }

    public boolean Z() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void b0(c c8) {
        c8.getClass();
        this.applicationInfo_ = c8;
        this.bitField0_ |= 1;
    }

    public final void c0(g g8) {
        g8.getClass();
        this.gaugeMetric_ = g8;
        this.bitField0_ |= 8;
    }

    public final void d0(h h8) {
        h8.getClass();
        this.networkRequestMetric_ = h8;
        this.bitField0_ |= 4;
    }

    public final void e0(m m8) {
        m8.getClass();
        this.traceMetric_ = m8;
        this.bitField0_ |= 2;
    }

    @Override
    public boolean f() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public g g() {
        g g8;
        g g9 = g8 = this.gaugeMetric_;
        if (g8 == null) {
            g9 = g.e0();
        }
        return g9;
    }

    @Override
    public boolean l() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public m n() {
        m m8;
        m m9 = m8 = this.traceMetric_;
        if (m8 == null) {
            m9 = m.n0();
        }
        return m9;
    }

    @Override
    public boolean o() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    @Override
    public h p() {
        h h8;
        h h9 = h8 = this.networkRequestMetric_;
        if (h8 == null) {
            h9 = h.m0();
        }
        return h9;
    }

    /*
     * Exception decompiling
     */
    @Override
    public final Object x(r.c var1_1, Object var2_3, Object var3_4) {
        // This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
        // org.benf.cfr.reader.util.CannotPerformDecode: reachable test BLOCK was exited and re-entered.
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.getFarthestReachableInRange(Misc.java:143)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.examineSwitchContiguity(SwitchReplacer.java:385)
        // org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.SwitchReplacer.replaceRawSwitches(SwitchReplacer.java:65)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:423)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:217)
        // org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:162)
        // org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:95)
        // org.benf.cfr.reader.entities.Method.analyse(Method.java:357)
        // org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:769)
        // org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:701)
        // org.benf.cfr.reader.Main.doJar(Main.java:134)
        // org.benf.cfr.reader.Main.main(Main.java:189)
        throw new IllegalStateException("Decompilation failed");
    }

    public static final class b
    extends r.a
    implements j {
        public b() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public b D(c.b b8) {
            this.y();
            ((i)this.p).b0((c)b8.v());
            return this;
        }

        public b E(g g8) {
            this.y();
            ((i)this.p).c0(g8);
            return this;
        }

        public b F(h h8) {
            this.y();
            ((i)this.p).d0(h8);
            return this;
        }

        public b G(m m8) {
            this.y();
            ((i)this.p).e0(m8);
            return this;
        }

        @Override
        public boolean f() {
            return ((i)this.p).f();
        }

        @Override
        public g g() {
            return ((i)this.p).g();
        }

        @Override
        public boolean l() {
            return ((i)this.p).l();
        }

        @Override
        public m n() {
            return ((i)this.p).n();
        }

        @Override
        public boolean o() {
            return ((i)this.p).o();
        }

        @Override
        public h p() {
            return ((i)this.p).p();
        }
    }

}

