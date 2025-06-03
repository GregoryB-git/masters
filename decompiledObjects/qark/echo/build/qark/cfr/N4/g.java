/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 */
package N4;

import N4.e;
import N4.f;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.r;
import com.google.protobuf.t;

public final class g
extends r
implements L {
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

    static {
        g g8;
        DEFAULT_INSTANCE = g8 = new g();
        r.Q(g.class, g8);
    }

    public static g e0() {
        return DEFAULT_INSTANCE;
    }

    public static b i0() {
        return (b)DEFAULT_INSTANCE.u();
    }

    public final void Y(N4.b b8) {
        b8.getClass();
        this.a0();
        this.androidMemoryReadings_.add((Object)b8);
    }

    public final void Z(e e8) {
        e8.getClass();
        this.b0();
        this.cpuMetricReadings_.add((Object)e8);
    }

    public final void a0() {
        t.e e8 = this.androidMemoryReadings_;
        if (!e8.p()) {
            this.androidMemoryReadings_ = r.M(e8);
        }
    }

    public final void b0() {
        t.e e8 = this.cpuMetricReadings_;
        if (!e8.p()) {
            this.cpuMetricReadings_ = r.M(e8);
        }
    }

    public int c0() {
        return this.androidMemoryReadings_.size();
    }

    public int d0() {
        return this.cpuMetricReadings_.size();
    }

    public f f0() {
        f f8;
        f f9 = f8 = this.gaugeMetadata_;
        if (f8 == null) {
            f9 = f.X();
        }
        return f9;
    }

    public boolean g0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
    }

    public boolean h0() {
        if ((this.bitField0_ & 1) != 0) {
            return true;
        }
        return false;
    }

    public final void j0(f f8) {
        f8.getClass();
        this.gaugeMetadata_ = f8;
        this.bitField0_ |= 2;
    }

    public final void k0(String string2) {
        string2.getClass();
        this.bitField0_ |= 1;
        this.sessionId_ = string2;
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
    implements L {
        public b() {
            super(DEFAULT_INSTANCE);
        }

        public /* synthetic */ b( a8) {
            this();
        }

        public b D(N4.b b8) {
            this.y();
            ((g)this.p).Y(b8);
            return this;
        }

        public b E(e e8) {
            this.y();
            ((g)this.p).Z(e8);
            return this;
        }

        public b F(f f8) {
            this.y();
            ((g)this.p).j0(f8);
            return this;
        }

        public b G(String string2) {
            this.y();
            ((g)this.p).k0(string2);
            return this;
        }
    }

}

