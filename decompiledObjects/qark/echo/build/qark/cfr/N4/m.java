/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Iterable
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.Collections
 *  java.util.List
 *  java.util.Map
 */
package N4;

import N4.k;
import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import com.google.protobuf.t;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class m
extends r
implements L {
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

    static {
        m m8;
        DEFAULT_INSTANCE = m8 = new m();
        r.Q(m.class, m8);
    }

    private void A0(long l8) {
        this.bitField0_ |= 4;
        this.clientStartTimeUs_ = l8;
    }

    private void d0(Iterable iterable) {
        this.i0();
        a.e(iterable, this.perfSessions_);
    }

    private void i0() {
        t.e e8 = this.perfSessions_;
        if (!e8.p()) {
            this.perfSessions_ = r.M(e8);
        }
    }

    public static m n0() {
        return DEFAULT_INSTANCE;
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
        return (b)DEFAULT_INSTANCE.u();
    }

    public final void B0(long l8) {
        this.bitField0_ |= 8;
        this.durationUs_ = l8;
    }

    public final void C0(String string2) {
        string2.getClass();
        this.bitField0_ |= 1;
        this.name_ = string2;
    }

    public final void e0(Iterable iterable) {
        this.j0();
        a.e(iterable, this.subtraces_);
    }

    public final void f0(k k8) {
        k8.getClass();
        this.i0();
        this.perfSessions_.add((Object)k8);
    }

    public final void g0(m m8) {
        m8.getClass();
        this.j0();
        this.subtraces_.add((Object)m8);
    }

    public boolean h0(String string2) {
        string2.getClass();
        return this.w0().containsKey((Object)string2);
    }

    public final void j0() {
        t.e e8 = this.subtraces_;
        if (!e8.p()) {
            this.subtraces_ = r.M(e8);
        }
    }

    public int k0() {
        return this.v0().size();
    }

    public Map l0() {
        return Collections.unmodifiableMap((Map)this.v0());
    }

    public Map m0() {
        return Collections.unmodifiableMap((Map)this.w0());
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
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public final E v0() {
        return this.counters_;
    }

    public final E w0() {
        return this.customAttributes_;
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

    public final E x0() {
        if (!this.counters_.n()) {
            this.counters_ = this.counters_.s();
        }
        return this.counters_;
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

        public b D(Iterable iterable) {
            this.y();
            ((m)this.p).d0(iterable);
            return this;
        }

        public b E(Iterable iterable) {
            this.y();
            ((m)this.p).e0(iterable);
            return this;
        }

        public b F(k k8) {
            this.y();
            ((m)this.p).f0(k8);
            return this;
        }

        public b G(m m8) {
            this.y();
            ((m)this.p).g0(m8);
            return this;
        }

        public b H(Map map) {
            this.y();
            ((m)this.p).p0().putAll(map);
            return this;
        }

        public b I(Map map) {
            this.y();
            ((m)this.p).q0().putAll(map);
            return this;
        }

        public b J(String string2, long l8) {
            string2.getClass();
            this.y();
            ((m)this.p).p0().put((Object)string2, (Object)l8);
            return this;
        }

        public b K(String string2, String string3) {
            string2.getClass();
            string3.getClass();
            this.y();
            ((m)this.p).q0().put((Object)string2, (Object)string3);
            return this;
        }

        public b L(long l8) {
            this.y();
            ((m)this.p).A0(l8);
            return this;
        }

        public b M(long l8) {
            this.y();
            ((m)this.p).B0(l8);
            return this;
        }

        public b N(String string2) {
            this.y();
            ((m)this.p).C0(string2);
            return this;
        }
    }

    public static final abstract class c {
        public static final D a = D.d(m0.b.y, "", m0.b.s, 0L);
    }

    public static final abstract class d {
        public static final D a;

        static {
            m0.b b8 = m0.b.y;
            a = D.d(b8, "", b8, "");
        }
    }

}

