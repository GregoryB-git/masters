/*
 * Decompiled with CFR 0_124.
 * 
 * Could not load the following classes:
 *  java.lang.Class
 *  java.lang.Enum
 *  java.lang.Iterable
 *  java.lang.NoSuchFieldError
 *  java.lang.Object
 *  java.lang.String
 *  java.util.List
 *  java.util.Map
 */
package N4;

import com.google.protobuf.D;
import com.google.protobuf.E;
import com.google.protobuf.L;
import com.google.protobuf.T;
import com.google.protobuf.a;
import com.google.protobuf.m0;
import com.google.protobuf.r;
import com.google.protobuf.t;
import java.util.List;
import java.util.Map;

public final class h
extends r
implements L {
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

    static {
        h h8;
        DEFAULT_INSTANCE = h8 = new h();
        r.Q(h.class, h8);
    }

    private E G0() {
        if (!this.customAttributes_.n()) {
            this.customAttributes_ = this.customAttributes_.s();
        }
        return this.customAttributes_;
    }

    public static b H0() {
        return (b)DEFAULT_INSTANCE.u();
    }

    public static h m0() {
        return DEFAULT_INSTANCE;
    }

    private Map p0() {
        return this.G0();
    }

    public boolean A0() {
        if ((this.bitField0_ & 32) != 0) {
            return true;
        }
        return false;
    }

    public boolean B0() {
        if ((this.bitField0_ & 4) != 0) {
            return true;
        }
        return false;
    }

    public boolean C0() {
        if ((this.bitField0_ & 8) != 0) {
            return true;
        }
        return false;
    }

    public boolean D0() {
        if ((this.bitField0_ & 256) != 0) {
            return true;
        }
        return false;
    }

    public boolean E0() {
        if ((this.bitField0_ & 1024) != 0) {
            return true;
        }
        return false;
    }

    public boolean F0() {
        if ((this.bitField0_ & 512) != 0) {
            return true;
        }
        return false;
    }

    public final void I0(long l8) {
        this.bitField0_ |= 128;
        this.clientStartTimeUs_ = l8;
    }

    public final void J0(d d8) {
        this.httpMethod_ = d8.g();
        this.bitField0_ |= 2;
    }

    public final void K0(int n8) {
        this.bitField0_ |= 32;
        this.httpResponseCode_ = n8;
    }

    public final void L0(e e8) {
        this.networkClientErrorReason_ = e8.g();
        this.bitField0_ |= 16;
    }

    public final void M0(long l8) {
        this.bitField0_ |= 4;
        this.requestPayloadBytes_ = l8;
    }

    public final void N0(String string2) {
        string2.getClass();
        this.bitField0_ |= 64;
        this.responseContentType_ = string2;
    }

    public final void O0(long l8) {
        this.bitField0_ |= 8;
        this.responsePayloadBytes_ = l8;
    }

    public final void P0(long l8) {
        this.bitField0_ |= 256;
        this.timeToRequestCompletedUs_ = l8;
    }

    public final void Q0(long l8) {
        this.bitField0_ |= 1024;
        this.timeToResponseCompletedUs_ = l8;
    }

    public final void R0(long l8) {
        this.bitField0_ |= 512;
        this.timeToResponseInitiatedUs_ = l8;
    }

    public final void S0(String string2) {
        string2.getClass();
        this.bitField0_ |= 1;
        this.url_ = string2;
    }

    public final void i0(Iterable iterable) {
        this.k0();
        a.e(iterable, this.perfSessions_);
    }

    public final void j0() {
        this.bitField0_ &= -65;
        this.responseContentType_ = h.m0().s0();
    }

    public final void k0() {
        t.e e8 = this.perfSessions_;
        if (!e8.p()) {
            this.perfSessions_ = r.M(e8);
        }
    }

    public long l0() {
        return this.clientStartTimeUs_;
    }

    public d n0() {
        d d8;
        d d9 = d8 = d.c(this.httpMethod_);
        if (d8 == null) {
            d9 = d.p;
        }
        return d9;
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

    public String x0() {
        return this.url_;
    }

    public boolean y0() {
        if ((this.bitField0_ & 128) != 0) {
            return true;
        }
        return false;
    }

    public boolean z0() {
        if ((this.bitField0_ & 2) != 0) {
            return true;
        }
        return false;
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
            ((h)this.p).i0(iterable);
            return this;
        }

        public b E() {
            this.y();
            ((h)this.p).p0().clear();
            return this;
        }

        public b F() {
            this.y();
            ((h)this.p).j0();
            return this;
        }

        public long G() {
            return ((h)this.p).w0();
        }

        public String H() {
            return ((h)this.p).x0();
        }

        public boolean I() {
            return ((h)this.p).y0();
        }

        public boolean J() {
            return ((h)this.p).A0();
        }

        public boolean K() {
            return ((h)this.p).E0();
        }

        public b L(Map map) {
            this.y();
            ((h)this.p).p0().putAll(map);
            return this;
        }

        public b M(long l8) {
            this.y();
            ((h)this.p).I0(l8);
            return this;
        }

        public b N(d d8) {
            this.y();
            ((h)this.p).J0(d8);
            return this;
        }

        public b O(int n8) {
            this.y();
            ((h)this.p).K0(n8);
            return this;
        }

        public b P(e e8) {
            this.y();
            ((h)this.p).L0(e8);
            return this;
        }

        public b Q(long l8) {
            this.y();
            ((h)this.p).M0(l8);
            return this;
        }

        public b R(String string2) {
            this.y();
            ((h)this.p).N0(string2);
            return this;
        }

        public b S(long l8) {
            this.y();
            ((h)this.p).O0(l8);
            return this;
        }

        public b T(long l8) {
            this.y();
            ((h)this.p).P0(l8);
            return this;
        }

        public b U(long l8) {
            this.y();
            ((h)this.p).Q0(l8);
            return this;
        }

        public b V(long l8) {
            this.y();
            ((h)this.p).R0(l8);
            return this;
        }

        public b W(String string2) {
            this.y();
            ((h)this.p).S0(string2);
            return this;
        }
    }

    public static final abstract class c {
        public static final D a;

        static {
            m0.b b8 = m0.b.y;
            a = D.d(b8, "", b8, "");
        }
    }

    public static final class d
    extends Enum
    implements t.a {
        public static final /* synthetic */ d[] A;
        public static final /* enum */ d p;
        public static final /* enum */ d q;
        public static final /* enum */ d r;
        public static final /* enum */ d s;
        public static final /* enum */ d t;
        public static final /* enum */ d u;
        public static final /* enum */ d v;
        public static final /* enum */ d w;
        public static final /* enum */ d x;
        public static final /* enum */ d y;
        public static final t.b z;
        public final int o;

        static {
            d d8;
            d d9;
            d d10;
            d d11;
            d d12;
            d d13;
            d d14;
            d d15;
            d d16;
            d d17;
            p = d12 = new d(0);
            q = d10 = new d(1);
            r = d13 = new d(2);
            s = d9 = new d(3);
            t = d8 = new d(4);
            u = d16 = new d(5);
            v = d14 = new d(6);
            w = d17 = new d(7);
            x = d11 = new d(8);
            y = d15 = new d(9);
            A = new d[]{d12, d10, d13, d9, d8, d16, d14, d17, d11, d15};
            z = new t.b(){};
        }

        public d(int n9) {
            this.o = n9;
        }

        public static d c(int n8) {
            switch (n8) {
                default: {
                    return null;
                }
                case 9: {
                    return y;
                }
                case 8: {
                    return x;
                }
                case 7: {
                    return w;
                }
                case 6: {
                    return v;
                }
                case 5: {
                    return u;
                }
                case 4: {
                    return t;
                }
                case 3: {
                    return s;
                }
                case 2: {
                    return r;
                }
                case 1: {
                    return q;
                }
                case 0: 
            }
            return p;
        }

        public static t.c e() {
            return b.a;
        }

        public static d valueOf(String string2) {
            return (d)Enum.valueOf(d.class, (String)string2);
        }

        public static d[] values() {
            return (d[])A.clone();
        }

        @Override
        public final int g() {
            return this.o;
        }

        public static final class b
        implements t.c {
            public static final t.c a = new b();
        }

    }

    public static final class e
    extends Enum
    implements t.a {
        public static final /* enum */ e p;
        public static final /* enum */ e q;
        public static final t.b r;
        public static final /* synthetic */ e[] s;
        public final int o;

        static {
            e e8;
            e e9;
            p = e9 = new e(0);
            q = e8 = new e(1);
            s = new e[]{e9, e8};
            r = new t.b(){};
        }

        public e(int n9) {
            this.o = n9;
        }

        public static t.c c() {
            return b.a;
        }

        public static e valueOf(String string2) {
            return (e)Enum.valueOf(e.class, (String)string2);
        }

        public static e[] values() {
            return (e[])s.clone();
        }

        @Override
        public final int g() {
            return this.o;
        }

        public static final class b
        implements t.c {
            public static final t.c a = new b();
        }

    }

}

